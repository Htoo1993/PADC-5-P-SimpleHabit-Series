package simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.network.responses;

import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.data.vo.AllTopicVO;

public class AllTopicResonse {
    private int code;
    private String message;
    private String apiVersion;
    private String page;
    private AllTopicVO[] allTopicVOS;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public AllTopicVO[] getAllTopicVOS() {
        return allTopicVOS;
    }
}
