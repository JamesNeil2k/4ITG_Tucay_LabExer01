package com.example.james.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_Quiz1;
    EditText et_Quiz2;
    EditText et_Seatworks;
    EditText et_LabExam;
    EditText et_MajorExam;
    Button BtnCompute;

    String finalgradeeq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_Quiz1 = (EditText) findViewById(R.id.quiz1);
        et_Quiz2 = (EditText) findViewById(R.id.quiz2);
        et_Seatworks = (EditText) findViewById(R.id.seatworks);
        et_LabExam = (EditText) findViewById(R.id.labex);
        et_MajorExam = (EditText) findViewById(R.id.majorexam);
        BtnCompute = (Button) findViewById(R.id.btncompute);
    }

    public void callSecondActivity (View view) {
        Intent intent = new Intent(this,SecondActivity.class);

        double quiz1 = Double.parseDouble(et_Quiz1.getText().toString());
        double quiz2 = Double.parseDouble(et_Quiz2.getText().toString());
        double seatworks = Double.parseDouble(et_Seatworks.getText().toString());
        double labex = Double.parseDouble(et_LabExam.getText().toString());
        double majorexam = Double.parseDouble(et_MajorExam.getText().toString());

        double rawave = (quiz1 * .10) + (quiz2 * .10) + (seatworks * .10) + (labex * .40) + (majorexam * .30);
        String finalrawgradeeq = String.valueOf(rawave);
        intent.putExtra("raw", finalrawgradeeq);



        if (rawave<60) {
            finalgradeeq = "Failed";
        } else if (rawave>=60 && rawave<=65){
            finalgradeeq = "3.0";
        } else if (rawave>=66 && rawave<=70) {
            finalgradeeq = "2.75";
        } else if (rawave>=71 && rawave<=75) {
            finalgradeeq = "2.5";
        } else if (rawave>=76 && rawave<=80) {
            finalgradeeq = "2.25";
        } else if (rawave>=81 && rawave<=85) {
            finalgradeeq = "2.0";
        } else if (rawave>=86 && rawave<=90) {
            finalgradeeq = "1.75";
        } else if (rawave>=91 && rawave<=92) {
            finalgradeeq = "1.5";
        } else if (rawave>=93 && rawave<=94) {
            finalgradeeq = "1.25";
        } else  if (rawave>95){
            finalgradeeq = "5.0";
        }

        intent.putExtra("rawaverage", Double.toString(rawave));
        intent.putExtra("finalgrade", finalgradeeq);



        startActivity(intent);

    }
}