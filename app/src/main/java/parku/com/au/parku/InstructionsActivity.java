package parku.com.au.parku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import parku.com.au.parku.R;
import parku.com.au.parku.adapters.StepsViewPageAdapters;

public class InstructionsActivity extends AppCompatActivity {
    private ViewPager vpSteps;
    private StepsViewPageAdapters vpAdapterSteps;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_instructions);

        vpAdapterSteps = new StepsViewPageAdapters(this);

        vpSteps = (ViewPager) findViewById(R.id.steps_viewpager);
        vpSteps.setAdapter(vpAdapterSteps);


    }

    public void onClickInstructionsLoginButton (View view){
        Intent intent = new Intent(InstructionsActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
