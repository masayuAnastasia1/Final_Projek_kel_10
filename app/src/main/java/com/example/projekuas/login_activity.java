package com.example.projekuas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.projekuas.MainActivity;
import com.example.projekuas.R;

public class login_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView kaliImageView = findViewById(R.id.kali);
        kaliImageView.setOnClickListener(v -> {
            // Saat gambar kali diklik, buat Intent untuk kembali ke MainActivity
            Intent intent = new Intent(login_activity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish(); // Menutup activity login_activity agar tidak kembali ke sini setelah kembali ke MainActivity
        });

        Button buttonL1 = findViewById(R.id.Button_L1);
        buttonL1.setOnClickListener(v -> {
            // Saat Button_L1 diklik, buat Intent untuk menuju activity_privacy
            Intent intentPrivacy = new Intent(login_activity.this, activity_privacy.class);
            startActivity(intentPrivacy);
        });
    }
}
