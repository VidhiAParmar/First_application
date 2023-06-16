package com.example.first_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText height;
    EditText weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height=(EditText) findViewById(R.id.height);
        weight=(EditText) findViewById(R.id.weight);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(v -> {
            String h=height.getText().toString();
            String w=weight.getText().toString();
            Intent intent=new Intent(getApplicationContext(), Activity2.class);
            intent.putExtra("height",h);
            intent.putExtra("weight",w);
            startActivity(intent);
        });

    }

    public void onClickBtn(View view) {
    }
}