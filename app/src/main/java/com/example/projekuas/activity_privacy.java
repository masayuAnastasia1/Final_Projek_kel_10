package com.example.projekuas;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_privacy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);

        // ... kode lainnya ...

        ImageView kali3 = findViewById(R.id.kali3);
        kali3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kembali ke activity_signup
                Intent intent = new Intent(activity_privacy.this, activity_signup.class);
                startActivity(intent);
            }
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Menuju ke activity_tampilan
                Intent intent = new Intent(activity_privacy.this, activity_tampilan.class);
                startActivity(intent);
            }
        });
    }
}
