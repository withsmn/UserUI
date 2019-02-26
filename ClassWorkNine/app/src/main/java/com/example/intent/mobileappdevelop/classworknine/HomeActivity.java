package com.example.intent.mobileappdevelop.classworknine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView outName,outEmail,outPhone,outBioData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        outName = findViewById(R.id.nameOut);
        outEmail = findViewById(R.id.emailOut);
        outPhone = findViewById(R.id.phoneOut);
        outBioData = findViewById(R.id.bioOut);

        Intent intent = getIntent();
        outName.setText(intent.getStringExtra("name"));
        outEmail.setText(intent.getStringExtra("email"));
        outPhone.setText(intent.getStringExtra("phone"));
        outBioData.setText(intent.getStringExtra("bio"));
    }
}
