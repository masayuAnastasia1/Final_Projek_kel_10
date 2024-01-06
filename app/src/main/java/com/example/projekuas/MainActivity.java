package com.example.projekuas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projekuas.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Button loginButton = findViewById(R.id.ButtonLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Saat tombol login diklik, buat Intent untuk memulai Activity_Login
                Intent intent = new Intent(MainActivity.this, login_activity.class);
                startActivity(intent);
            }
        });

        // Tambahkan kode untuk tombol lainnya yang mengarahkan ke activity_signup
        Button buttonToSignup = findViewById(R.id.button2);
        buttonToSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Saat tombol untuk signup diklik, buat Intent untuk memulai activity_signup
                Intent intentSignup = new Intent(MainActivity.this, activity_signup.class);
                startActivity(intentSignup);
            }
        });
    }
}
