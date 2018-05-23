package simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.viewholders;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.R;
import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.adapters.HealthyMindAdapter;

public class HealthyMindItemsViewHolder extends RecyclerView.ViewHolder{

    private HealthyMindAdapter mHealthyMindAdapter = new HealthyMindAdapter();

    @BindView(R.id.rv_healthy_mind)
    RecyclerView rvHealthyMind;

    public HealthyMindItemsViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this,itemView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false);
        rvHealthyMind.setLayoutManager(layoutManager);
        rvHealthyMind.setAdapter(mHealthyMindAdapter);
    }
}
