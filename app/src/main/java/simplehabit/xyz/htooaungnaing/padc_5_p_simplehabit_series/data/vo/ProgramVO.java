package simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.data.vo;

import com.google.gson.annotations.SerializedName;

public class ProgramVO {

    @SerializedName("program-id")
    private String programId;
    private String title;
    private String image;

    @SerializedName("average-lengths")
    private int[] averageLength;
    private String description;

    public SessionVO[] getSessionVO() {
        return sessionVO;
    }

    private SessionVO[] sessionVO;

    public String getProgramId() {
        return programId;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public int[] getAverageLength() {
        return averageLength;
    }

    public String getDescription() {
        return description;
    }

}
