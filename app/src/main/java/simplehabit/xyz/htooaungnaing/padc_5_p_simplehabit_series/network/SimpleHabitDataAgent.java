package simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.network;

public interface SimpleHabitDataAgent {
    void getTopics(String access_token, String page);

    void getCategoryAndPrograms(String access_token, String page);

    void getCurrentProgram(String access_token, String page);
}
