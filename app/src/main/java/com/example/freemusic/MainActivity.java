package com.example.freemusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String st1;
    private Button btnnext;
    private EditText edt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edt1= findViewById(R.id.edt1);
        btnnext=findViewById(R.id.btnnext);


        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this, MainActivity2.class);
                String st=edt1.getText().toString();
                i.putExtra("st1",st);
                startActivity(i);
            }
        });
    }
}