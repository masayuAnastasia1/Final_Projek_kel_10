package com.example.projekuas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;

public class activity_tampilan extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);

        // Inisialisasi Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setActionBar(toolbar);

        // Data yang akan ditampilkan di ListView
        String[] data = {"Tasya", "Jay", "Dani", "Eva", "Sherly"};

        // Inisialisasi ListView dari layout
        ListView listView = findViewById(R.id.listView);

        // Buat ArrayAdapter untuk menampilkan data dalam ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, data);

        // Set adapter ke ListView
        listView.setAdapter(adapter);
    }

    private void setActionBar(Toolbar toolbar) {
    }
}
