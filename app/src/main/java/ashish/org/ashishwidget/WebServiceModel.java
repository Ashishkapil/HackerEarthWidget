package ashish.org.ashishwidget;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class WebServiceModel {

    @SerializedName("response")
    @Expose
    private ArrayList<Response> response = new ArrayList<Response>();

    /**
     * @return The response
     */
    public ArrayList<Response> getResponse() {
        return response;
    }

    /**
     * @param response The response
     */
    public void setResponse(ArrayList<Response> response) {
        this.response = response;
    }

    public class Response {

        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("challenge_type")
        @Expose
        private String challengeType;
        @SerializedName("start_timestamp")
        @Expose
        private String startTimestamp;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("end_date")
        @Expose
        private String endDate;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("is_hackerearth")
        @Expose
        private Boolean isHackerearth;
        @SerializedName("end_tz")
        @Expose
        private String endTz;
        @SerializedName("end_utc_tz")
        @Expose
        private String endUtcTz;
        @SerializedName("subscribe")
        @Expose
        private String subscribe;
        @SerializedName("college")
        @Expose
        private Boolean college;
        @SerializedName("end_time")
        @Expose
        private String endTime;
        @SerializedName("time")
        @Expose
        private String time;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("start_utc_tz")
        @Expose
        private String startUtcTz;
        @SerializedName("start_tz")
        @Expose
        private String startTz;
        @SerializedName("end_timestamp")
        @Expose
        private String endTimestamp;
        @SerializedName("thumbnail")
        @Expose
        private String thumbnail;
        @SerializedName("cover_image")
        @Expose
        private String coverImage;

        /**
         * @return The status
         */
        public String getStatus() {
            return status;
        }

        /**
         * @param status The status
         */
        public void setStatus(String status) {
            this.status = status;
        }

        /**
         * @return The challengeType
         */
        public String getChallengeType() {
            return challengeType;
        }

        /**
         * @param challengeType The challenge_type
         */
        public void setChallengeType(String challengeType) {
            this.challengeType = challengeType;
        }

        /**
         * @return The startTimestamp
         */
        public String getStartTimestamp() {
            return startTimestamp;
        }

        /**
         * @param startTimestamp The start_timestamp
         */
        public void setStartTimestamp(String startTimestamp) {
            this.startTimestamp = startTimestamp;
        }

        /**
         * @return The description
         */
        public String getDescription() {
            return description;
        }

        /**
         * @param description The description
         */
        public void setDescription(String description) {
            this.description = description;
        }

        /**
         * @return The endDate
         */
        public String getEndDate() {
            return endDate;
        }

        /**
         * @param endDate The end_date
         */
        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        /**
         * @return The title
         */
        public String getTitle() {
            return title;
        }

        /**
         * @param title The title
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         * @return The url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

        /**
         * @return The isHackerearth
         */
        public Boolean getIsHackerearth() {
            return isHackerearth;
        }

        /**
         * @param isHackerearth The is_hackerearth
         */
        public void setIsHackerearth(Boolean isHackerearth) {
            this.isHackerearth = isHackerearth;
        }

        /**
         * @return The endTz
         */
        public String getEndTz() {
            return endTz;
        }

        /**
         * @param endTz The end_tz
         */
        public void setEndTz(String endTz) {
            this.endTz = endTz;
        }

        /**
         * @return The endUtcTz
         */
        public String getEndUtcTz() {
            return endUtcTz;
        }

        /**
         * @param endUtcTz The end_utc_tz
         */
        public void setEndUtcTz(String endUtcTz) {
            this.endUtcTz = endUtcTz;
        }

        /**
         * @return The subscribe
         */
        public String getSubscribe() {
            return subscribe;
        }

        /**
         * @param subscribe The subscribe
         */
        public void setSubscribe(String subscribe) {
            this.subscribe = subscribe;
        }

        /**
         * @return The college
         */
        public Boolean getCollege() {
            return college;
        }

        /**
         * @param college The college
         */
        public void setCollege(Boolean college) {
            this.college = college;
        }

        /**
         * @return The endTime
         */
        public String getEndTime() {
            return endTime;
        }

        /**
         * @param endTime The end_time
         */
        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        /**
         * @return The time
         */
        public String getTime() {
            return time;
        }

        /**
         * @param time The time
         */
        public void setTime(String time) {
            this.time = time;
        }

        /**
         * @return The date
         */
        public String getDate() {
            return date;
        }

        /**
         * @param date The date
         */
        public void setDate(String date) {
            this.date = date;
        }

        /**
         * @return The startUtcTz
         */
        public String getStartUtcTz() {
            return startUtcTz;
        }

        /**
         * @param startUtcTz The start_utc_tz
         */
        public void setStartUtcTz(String startUtcTz) {
            this.startUtcTz = startUtcTz;
        }

        /**
         * @return The startTz
         */
        public String getStartTz() {
            return startTz;
        }

        /**
         * @param startTz The start_tz
         */
        public void setStartTz(String startTz) {
            this.startTz = startTz;
        }

        /**
         * @return The endTimestamp
         */
        public String getEndTimestamp() {
            return endTimestamp;
        }

        /**
         * @param endTimestamp The end_timestamp
         */
        public void setEndTimestamp(String endTimestamp) {
            this.endTimestamp = endTimestamp;
        }

        /**
         * @return The thumbnail
         */
        public String getThumbnail() {
            return thumbnail;
        }

        /**
         * @param thumbnail The thumbnail
         */
        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        /**
         * @return The coverImage
         */
        public String getCoverImage() {
            return coverImage;
        }

        /**
         * @param coverImage The cover_image
         */
        public void setCoverImage(String coverImage) {
            this.coverImage = coverImage;
        }

    }
}