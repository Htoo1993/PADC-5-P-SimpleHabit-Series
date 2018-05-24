package simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.R;
import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.viewholders.AllTopicsItemViewHolder;
import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.viewholders.EveningMeditationItemsViewHolder;
import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.viewholders.HealthyMindItemsViewHolder;
import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.viewholders.SimpleHabitViewHolder;

public class SimpleHabitAdapter extends RecyclerView.Adapter {

    private static final int VT_STARTER = 0;
    private static final int VT_EVENING_MEDITATIONS = 1;
    private static final int VT_HEALTHY_MIND = 2;
    private static final int VT_ALL_TOPICS = 3;


    private LayoutInflater mLayoutInflater;

    public SimpleHabitAdapter(Context context){
        mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == VT_STARTER) {
            View view = mLayoutInflater.inflate(R.layout.simple_habit_starter_item,parent,false);
            return new SimpleHabitViewHolder(view);
        } else if (viewType == VT_EVENING_MEDITATIONS){
            View view = mLayoutInflater.inflate(R.layout.evening_meditation_items, parent, false);
            return new EveningMeditationItemsViewHolder(view);
        } else if (viewType == VT_HEALTHY_MIND){
            View view = mLayoutInflater.inflate(R.layout.healthy_mind_items, parent , false);
            return  new HealthyMindItemsViewHolder(view);
        } else if (viewType == VT_ALL_TOPICS){
            View view = mLayoutInflater.inflate(R.layout.all_topics_items, parent, false);
            return new AllTopicsItemViewHolder(view);
        }

        return null;
    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0){
            return VT_STARTER;
        }else if (position == 1){
            return VT_EVENING_MEDITATIONS;
        } else if (position == 2){
            return VT_HEALTHY_MIND;
        } else if (position == 3){
            return VT_ALL_TOPICS;
        }
        return VT_STARTER;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
