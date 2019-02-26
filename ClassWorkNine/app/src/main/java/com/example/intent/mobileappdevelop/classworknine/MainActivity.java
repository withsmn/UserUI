package com.example.intent.mobileappdevelop.classworknine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText inputName,inputEmail,inputPhone,inputBio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputName = findViewById(R.id.inputNameET);
        inputEmail = findViewById(R.id.inputEmailET);
        inputPhone = findViewById(R.id.inputPhoneET);
        inputBio = findViewById(R.id.inputBioET);
    }

    public void submit(View view) {
        Intent intent = new Intent(this,HomeActivity.class);
        intent.putExtra("name",inputName.getText().toString());
        intent.putExtra("email",inputEmail.getText().toString());
        intent.putExtra("phone",inputPhone.getText().toString());
        intent.putExtra("bio",inputBio.getText().toString());
        startActivity(intent);
    }
}
