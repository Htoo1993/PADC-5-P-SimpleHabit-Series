package simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.viewholders;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.R;
import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.adapters.AllTopicsAdapter;

public class AllTopicsItemViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.rv_all_topics)
    RecyclerView rvAllTopics;

    private AllTopicsAdapter mAllTopicsAdapter = new AllTopicsAdapter();

    public AllTopicsItemViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this,itemView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.VERTICAL, false);
        rvAllTopics.setLayoutManager(layoutManager);
        rvAllTopics.setAdapter(mAllTopicsAdapter);
    }
}
