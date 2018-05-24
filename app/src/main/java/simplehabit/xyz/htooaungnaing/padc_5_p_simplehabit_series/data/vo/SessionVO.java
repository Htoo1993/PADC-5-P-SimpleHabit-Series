package simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.data.vo;

import com.google.gson.annotations.SerializedName;

public class SessionVO {
    @SerializedName("session-id")
    private String sessionId;
    private String title;
    @SerializedName("length-in-seconds")
    private int lenghtInSeconds;
    @SerializedName("file-path")
    private String filePath;

    public String getSessionId() {
        return sessionId;
    }

    public String getTitle() {
        return title;
    }

    public int getLenghtInSeconds() {
        return lenghtInSeconds;
    }

    public String getFilePath() {
        return filePath;
    }
}
