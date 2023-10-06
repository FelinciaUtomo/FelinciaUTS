
package com.example.uts;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText usernameField;
    private EditText passwordField;
    private Button registerButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeractivity);

        usernameField = findViewById(R.id.usernameField);
        passwordField = findViewById(R.id.passwordField);
        registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameField.getText().toString();
                String password = passwordField.getText().toString();
                String register = registerButton.getText().toString();

                // Validasi data pendaftaran (misalnya, pastikan username dan password tidak kosong)
                if (!username.isEmpty() && !password.isEmpty()) {
                    // Lakukan proses pendaftaran (sesuaikan dengan kebutuhan Anda)
                    // Misalnya, simpan data pengguna ke database atau server

                    // Tampilkan pesan pendaftaran berhasil
                    Toast.makeText(RegisterActivity.this, "Pendaftaran berhasil", Toast.LENGTH_SHORT).show();

                    // Kembali ke halaman login atau halaman lain sesuai dengan kebutuhan Anda
                    finish(); // Menutup aktivitas pendaftaran
                } else {
                    // Tampilkan pesan kesalahan jika ada data yang kurang
                    Toast.makeText(RegisterActivity.this, "Isi semua bidang", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}