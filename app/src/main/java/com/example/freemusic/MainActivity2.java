package com.example.freemusic;

import android.content.Intent;
import android.support.v4.app.SupportActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button btnback;
    private TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnback=findViewById(R.id.btnback);
        txt2=findViewById(R.id.txt2);

        Intent i=getIntent();
        String st2= i.getStringExtra(MainActivity.st1);
        txt2.setText(st2);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}