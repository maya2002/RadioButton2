package com.example.radiobutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioButton rb1, rb2, rb3;
    Button btndefoult, btnchange;
    LinearLayout lin1;
    RadioGroup rg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        btndefoult = (Button) findViewById(R.id.buttondefoult);
        btnchange = (Button) findViewById(R.id.buttonchange);
        lin1 = (LinearLayout) findViewById(R.id.maya);
        rg1 = (RadioGroup) findViewById(R.id.rg);

    }

    public void change(View view) {
        if (rb1.isChecked()) lin1.setBackgroundColor(Color.RED);
        if (rb2.isChecked()) lin1.setBackgroundColor(Color.BLUE);
        if (rb3.isChecked()) lin1.setBackgroundColor(Color.GREEN);
    }

    public void defoult(View view) {
        rg1.clearCheck();
        lin1.setBackgroundColor(Color.WHITE);
    }
}
