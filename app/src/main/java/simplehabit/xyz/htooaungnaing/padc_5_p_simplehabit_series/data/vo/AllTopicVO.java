package simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.data.vo;

import com.google.gson.annotations.SerializedName;

public class AllTopicVO {

    @SerializedName("topic-name")
    private String topicName;

    @SerializedName("topic-desc")
    private String topicDesc;
    private String icon;
    private String background;

    public String getTopicName() {
        return topicName;
    }

    public String getTopicDesc() {
        return topicDesc;
    }

    public String getIcon() {
        return icon;
    }

    public String getBackground() {
        return background;
    }
}

