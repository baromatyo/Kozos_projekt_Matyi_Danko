package com.example.kozos_projekt_matyi_danko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nev=findViewById(R.id.edit1);
        Button katt=findViewById(R.id.katt);


        katt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,  MasodikActivity.class);
                i.putExtra("nev",nev.getText().toString());
                
                startActivity(i);
            }
        });

    }
}