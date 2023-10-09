package com.example.logowanie;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView loginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        loginTextView = findViewById(R.id.loginTextView);

        String login = getIntent().getStringExtra("LOGIN");

        loginTextView.setText("Login: " + login);
    }
}

