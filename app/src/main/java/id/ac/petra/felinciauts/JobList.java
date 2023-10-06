package id.ac.petra.felinciauts;

package com.example.uts;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class JobList extends AppCompatActivity {

    private ListView listView;
    private String[] jobTitles;
    private String[] jobDescriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_list);

        listView = findViewById(R.id.listView);

        // Data pekerjaan contoh (gantilah dengan data sesuai kebutuhan Anda)
        jobTitles = new String[]{"friendship counseling", "digital leadership", "app development"};
        jobDescriptions = new String[]{"pekerjaan menangani masalah health mental", "pekerjaan mencetuskan inovasi produk baru", "pekerjaan membuat dan mengembangkan aplikasi"};

        // Membuat adapter untuk menghubungkan data ke ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.activity_list_list, R.id.listView, jobTitles);
        listView.setAdapter(adapter);

        // Menambahkan listener untuk meng-handle klik item di ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedJobTitle = jobTitles[position];
                String selectedJobDescription = jobDescriptions[position];

                // Lakukan sesuatu ketika item di klik, misalnya menampilkan Toast dengan detail pekerjaan
                String message = "Pekerjaan: " + selectedJobTitle + "\nDeskripsi: " + selectedJobDescription;
                Toast.makeText(JobList.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

