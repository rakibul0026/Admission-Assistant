package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.widget.ViewFlipper;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView home, login, study_abroad, native_ad, notification, calender, download, chatbot, setting;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        viewFlipper=findViewById(R.id.viewFlipper);
        viewFlipper.startFlipping();

        View root = findViewById(R.id.main);
        ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Use class variables, not local
        home = findViewById(R.id.home);
        login = findViewById(R.id.login);
        study_abroad = findViewById(R.id.abroad);
        native_ad = findViewById(R.id.natived);
        notification = findViewById(R.id.notification);
        calender = findViewById(R.id.Calendar);
        download = findViewById(R.id.Downloads);
        chatbot = findViewById(R.id.Chatbot);
        setting = findViewById(R.id.Settings);

        // Set click listeners
        home.setOnClickListener(this);
        login.setOnClickListener(this);
        study_abroad.setOnClickListener(this);
        native_ad.setOnClickListener(this);
        notification.setOnClickListener(this);
        calender.setOnClickListener(this);
        download.setOnClickListener(this);
        chatbot.setOnClickListener(this);
        setting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.home) {
            startActivity(new Intent(this, homeActivity2.class));
        } else if (id == R.id.login) {
            startActivity(new Intent(this, loginActivity.class));
        }
        else if (id == R.id.abroad) {
            startActivity(new Intent(this, loginActivity.class));
        }
        else if (id == R.id.natived) {
            startActivity(new Intent(this, loginActivity.class));
        }
        else if (id == R.id.notification) {
            startActivity(new Intent(this, loginActivity.class));
        }
        else if (id == R.id.Calendar) {
            startActivity(new Intent(this, loginActivity.class));
        }
        else if (id == R.id.Downloads) {
            startActivity(new Intent(this, loginActivity.class));
        }
        else if (id == R.id.Chatbot) {
            startActivity(new Intent(this, loginActivity.class));
        }
        else if (id == R.id.Settings) {
            startActivity(new Intent(this, loginActivity.class));
        }

    }
}
