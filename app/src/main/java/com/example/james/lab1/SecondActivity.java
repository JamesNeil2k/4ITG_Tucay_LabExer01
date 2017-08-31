package com.example.james.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView yourrais;
    TextView yourfinalgradeis;
    Button btn_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        yourrais = (TextView) findViewById(R.id.rawaverage);
        yourfinalgradeis = (TextView) findViewById(R.id.finalgrade);

        btn_Back = (Button) findViewById(R.id.btnBack);
        String msg = getIntent().getStringExtra("rawaverage");
        String msg2 = getIntent().getStringExtra("finalgrade");
        yourrais.setText(msg);
        yourfinalgradeis.setText(msg2);
    }

    public void goBackToMain (View view) {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }

}
