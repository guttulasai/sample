package com.example.sai.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnClickMe;
    EditText etEnter;
    TextView tvView;

    String st;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClickMe=findViewById(R.id.btn);

        etEnter=findViewById(R.id.et);

        tvView=findViewById(R.id.tv);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st=etEnter.getText().toString();


                tvView.setText("hey "+st);
                tvView.append("\n Hie there");
            }
        });
    }
}
