package simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.R;
import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.viewholders.SimpleHabitViewHolder;

public class SimpleHabitAdapter extends RecyclerView.Adapter {

    private LayoutInflater inflater;

    public SimpleHabitAdapter(Context context){
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
//        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.simple_habit_starter_item,parent,false);
        SimpleHabitViewHolder viewHolder = new SimpleHabitViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
