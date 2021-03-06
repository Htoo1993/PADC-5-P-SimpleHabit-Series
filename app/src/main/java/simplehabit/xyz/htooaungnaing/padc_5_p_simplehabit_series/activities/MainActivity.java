package simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.R;
import simplehabit.xyz.htooaungnaing.padc_5_p_simplehabit_series.adapters.SimpleHabitAdapter;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private SimpleHabitAdapter mSimpleHabitAdapter;

    @BindView(R.id.rv_home_screen)
    RecyclerView rvHomeScreen;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this,this);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mSimpleHabitAdapter = new SimpleHabitAdapter(getApplicationContext());
        rvHomeScreen.setAdapter(mSimpleHabitAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        rvHomeScreen.setLayoutManager(linearLayoutManager);

    }

}
