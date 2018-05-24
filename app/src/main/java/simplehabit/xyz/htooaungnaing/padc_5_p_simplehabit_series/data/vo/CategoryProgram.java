package simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.data.vo;

import com.google.gson.annotations.SerializedName;

public class CategoryProgram {

    @SerializedName("category-id")
    private String categoryId;
    private String title;
    private ProgramVO[] programVOS;

    public String getCategoryId() {
        return categoryId;
    }

    public String getTitle() {
        return title;
    }

    public ProgramVO[] getProgramVOS() {
        return programVOS;
    }
}
