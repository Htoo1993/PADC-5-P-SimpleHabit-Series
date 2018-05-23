package simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.viewholders;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.R;
import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.adapters.EveningMeditationsAdapter;

public class EveningMeditationItemsViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.rv_evening_meditation)
    RecyclerView rvEveningMeditations;

    private EveningMeditationsAdapter mEveningMeditationsAdapter = new EveningMeditationsAdapter();

    public EveningMeditationItemsViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(itemView.getContext(),LinearLayoutManager.HORIZONTAL,false);
        rvEveningMeditations.setLayoutManager(layoutManager);
        rvEveningMeditations.setAdapter(mEveningMeditationsAdapter);
    }
}
