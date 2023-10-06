package com.example.uts;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameField;
    private EditText passwordField;
    private Button loginButton;
    private Button registerButton;

    // Daftar akun contoh (gantilah dengan daftar akun yang sesungguhnya)
    private String[] validUsernames = {"user1", "user2", "user3"};
    private String[] validPasswords = {"pass1", "pass2", "pass3"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameField = findViewById(R.id.usernameField);
        passwordField = findViewById(R.id.passwordField);
        loginButton = findViewById(R.id.loginbutton);
        registerButton = findViewById(R.id.registerButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameField.getText().toString();
                String password = passwordField.getText().toString();

                // Validasi username dan password
                boolean isValid = false;
                for (int i = 0; i < validUsernames.length; i++) {
                    if (username.equals(validUsernames[i]) && password.equals(validPasswords[i])) {
                        isValid = true;
                        break;
                    }
                }

                if (isValid) {
                    // Login berhasil, lakukan sesuatu di sini
                    // Misalnya, tampilkan pesan selamat datang atau navigasikan ke aktivitas lain
                    Toast.makeText(LoginActivity.this, "Login berhasil", Toast.LENGTH_SHORT).show();
                } else {
                    // Login gagal, tampilkan pesan kesalahan
                    Toast.makeText(LoginActivity.this, "Username atau password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman pendaftaran
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}