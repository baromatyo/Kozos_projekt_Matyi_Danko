package com.example.kozos_projekt_matyi_danko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MasodikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masodik);

        TextView tv = findViewById(R.id.NevView);

        Bundle extras = getIntent().getExtras();

        if (extras !=null) {
            tv.setText(extras.getString("nev"));
        }
    }
}
