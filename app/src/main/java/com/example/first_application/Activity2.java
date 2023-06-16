package com.example.first_application;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    TextView textView;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView=findViewById(R.id.textView1);
        Intent intent=getIntent();
        String he= intent.getStringExtra("height");
        String we= intent.getStringExtra("weight");
        float h=Float.parseFloat(he);
        float w=Float.parseFloat(we);
        float bmi=(w/(h*h));
        if(bmi<18.5){
            textView.setText("BMI: "+bmi+"\n\nou are underweight");
            //underweight
        }
        else if(bmi<24.9){
            textView.setText("BMI: "+bmi+"\n\nYou are normal");
            //normal
        } else if (bmi<29.9) {
            textView.setText("BMI: "+bmi+"\n\nYou are overweight");
            //overweight
        } else{
            textView.setText("BMI: "+bmi+"\n\nYou are obese");
            //obese
        }
    }
}