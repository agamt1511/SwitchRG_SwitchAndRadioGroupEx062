package com.example.switchrg_switchandradiogroupex062;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    View screenView;
    Switch swDN;
    RadioGroup rg;
    Button btn;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    boolean chSwitch;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screenView = (View) findViewById(R.id.screenView);
        swDN = (Switch) findViewById(R.id.swDN);
        rg =(RadioGroup) findViewById(R.id.rg);
        btn = (Button) findViewById(R.id.btn);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
    }

    private void restart() {
        if (chSwitch==true) {
            if (x == 1) screenView.setBackgroundColor(Color.rgb(255, 0, 0));
            if (x == 2) screenView.setBackgroundColor(Color.rgb(0, 255, 51));
            if (x == 3) screenView.setBackgroundColor(Color.rgb(255, 255, 0));
            if (x == 4) screenView.setBackgroundColor(Color.rgb(9, 0, 255));
        }
    }


    public void onSwitch(View view) {
        if (swDN.isChecked()){
            chSwitch = true;
        }
        else{
            chSwitch = false;
        }
    }

    public void clickMe(View view) {
        if(rb1.isChecked()) screenView.setBackgroundColor(Color.rgb(255,0,0));
        if(rb2.isChecked()) screenView.setBackgroundColor(Color.rgb(0,255,51));
        if(rb3.isChecked()) screenView.setBackgroundColor(Color.rgb(255,255,0));
        if(rb4.isChecked()) screenView.setBackgroundColor(Color.rgb(9,0,255));
    }

    public void click1(View view) {
        x=1;
        restart();
    }

    public void click2(View view) {
        x=2;
        restart();
    }

    public void click3(View view) {
        x=3;
        restart();
    }

    public void click4(View view) {
        x=4;
        restart();
    }
}