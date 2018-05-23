package simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.R;
import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.viewholders.HealthyMindViewHolder;

public class HealthyMindAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.healthy_mind_item_view,parent,false);
        HealthyMindViewHolder viewHolder = new HealthyMindViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
