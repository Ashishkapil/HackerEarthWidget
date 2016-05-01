package ashish.org.ashishwidget;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Laptop on 19-Mar-16.
 */
public interface ApiService {
    @GET("api/events/upcoming/?format=json")
    Call<WebServiceModel> getModel();
}
