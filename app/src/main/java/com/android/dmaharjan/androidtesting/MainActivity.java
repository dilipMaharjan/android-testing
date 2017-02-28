package com.android.dmaharjan.androidtesting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.buttonSayHello).setOnClickListener(this);
        findViewById(R.id.buttonSayHi).setOnClickListener(this);
        textView = (TextView) findViewById(R.id.textView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonSayHello:
                textView.setText("Hello");
                break;
            case R.id.buttonSayHi:
                textView.setText("hi");
                break;
        }
    }
}
