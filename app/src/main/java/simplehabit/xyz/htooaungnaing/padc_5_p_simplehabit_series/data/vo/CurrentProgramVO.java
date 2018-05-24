package simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.data.vo;

import com.google.gson.annotations.SerializedName;

public class CurrentProgramVO {

    @SerializedName("program-id")
    private String programId;
    private String title;
    @SerializedName("current-period")
    private String currentPeriod;
    private String background;
    @SerializedName("average-lengths")
    private int[] averageLength;
    private String description;
    private SessionVO[] sessionVOS;

    public String getProgramId() {
        return programId;
    }

    public String getTitle() {
        return title;
    }

    public String getCurrentPeriod() {
        return currentPeriod;
    }

    public String getBackground() {
        return background;
    }

    public int[] getAverageLength() {
        return averageLength;
    }

    public String getDescription() {
        return description;
    }

    public SessionVO[] getSessionVOS() {
        return sessionVOS;
    }
}
