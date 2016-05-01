package ashish.org.ashishwidget;

/**
 * Created by Ashish Kapil on 19-Mar-16.
 */

import android.app.PendingIntent;
import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.RemoteViews;

import java.util.ArrayList;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class UpdateWidgetService extends Service {
    ArrayList<WebServiceModel.Response> info;
    ArrayList<WebServiceModel.Response> request_team;
   WebServiceModel.Response info2;
    private static final String LOG = "widget.example";
    public ArrayList<WebServiceModel.Response> q = new ArrayList<>();
    UpdateWidgetService updateWidgetService;
    public static String WIDGET_BUTTON = "MY_PACKAGE_NAME.WIDGET_BUTTON";
    static int i = 0;
    @Override
    public void onStart(final Intent intent, int startId) {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.hackerearth.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService service = retrofit.create(ApiService.class);
        //service.getGateway();
        Call<WebServiceModel> callUser = service.getModel();
        Log.v("test","reached1");

        callUser.enqueue(new Callback<WebServiceModel>() {

            @Override
            public void onResponse(Response<WebServiceModel> response) {
                WebServiceModel user = response.body();
                try {
                    Log.v("test", "reached2");
                    request_team = user.getResponse();
                    setCreateTeam(intent,request_team);
                    Log.v("abc", request_team.get(0).toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Throwable t) {
                t.printStackTrace();
            }
        });

        Log.v("test", "reached5");
        stopSelf();

        super.onStart(intent, startId);

    }
   /* @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
         onStart(intent, startId);
        return START_NOT_STICKY;
    }*/

    @Override
    public IBinder onBind(Intent intent) {
        return null;

    }



    public  void setCreateTeam(Intent intent,ArrayList<WebServiceModel.Response> request_team)
    {


        int[] allWidgetIds = intent
                .getIntArrayExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS);
        for (int widgetId : allWidgetIds) {
            Log.v("test", "reached3");

            if(i == request_team.size())
                     i=0;


            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this
                    .getApplicationContext());
            RemoteViews remoteViews = new RemoteViews(this
                    .getApplicationContext().getPackageName(),
                    R.layout.my_widget);

                info2 = request_team.get(i);
                Log.v("test12", "called"+info2.getTitle());
                remoteViews.setTextViewText(R.id.title,
                        info2.getTitle());
                remoteViews.setTextViewText(R.id.desc,
                        info2.getDescription());
                remoteViews.setTextViewText(R.id.startTime,
                        info2.getStartTimestamp());
                remoteViews.setTextViewText(R.id.endTime,
                        info2.getEndTimestamp());
                remoteViews.setTextViewText(R.id.type,
                        info2.getChallengeType());
            remoteViews.setTextViewText(R.id.textView,
                    info2.getStatus());
                    ++i;

                Intent clickIntent = new Intent(this.getApplicationContext(),
                        MyWidget.class);

                clickIntent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
                clickIntent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS,
                        allWidgetIds);

                //Intent intent2 = new Intent(WIDGET_BUTTON);
                PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(), 0, clickIntent,
                        PendingIntent.FLAG_UPDATE_CURRENT);


           // PendingIntent pendingIntent2 = PendingIntent.getBroadcast(getApplicationContext(), 0, intent2,
             //       PendingIntent.FLAG_UPDATE_CURRENT);
                remoteViews.setOnClickPendingIntent(R.id.imageButton2, pendingIntent);
                remoteViews.setOnClickPendingIntent(R.id.imageButton, pendingIntent);
               // remoteViews.setOnClickPendingIntent(R.id.button, pendingIntent2);
                appWidgetManager.updateAppWidget(widgetId, remoteViews);


          /*  if (WIDGET_BUTTON.equals(intent2.getAction())) {
                    Log.v("comom","hi");
                String url = "https://www.google.co.in/";
                if (!url.startsWith("http://") && !url.startsWith("https://"))
                    url = "http://" + url;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);*/
               // Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hackerearth.com/challenges/"));
                //startActivity(browserIntent);
            //}

        }

    }



}

