package com.example.calories_burnt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button rbtn;
    private TextView txv;
    private double mcounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        rbtn = (Button) findViewById(R.id.button5);
        txv = (TextView) findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mcounter = mcounter + 0.69;
                txv.setText(String.format("%.2f",mcounter));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mcounter = mcounter + 41.60;
                txv.setText(String.format("%.2f",mcounter));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mcounter = mcounter + 4.10;
                txv.setText(String.format("%.2f",mcounter));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mcounter = mcounter + 20.80;
                txv.setText(String.format("%.2f",mcounter));
            }
        });

        rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mcounter = 0;
                txv.setText(String.format("%.0f",mcounter));
            }
        });

    }
}
