package com.afifahsftr.mystudentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextNim, editTextName, editTextEmail, editTextPassword;
    Button buttonRegister, buttonViewUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi Views
        editTextNim = findViewById(R.id.editTextNim);  // Inisialisasi NIM
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);
        buttonViewUsers = findViewById(R.id.buttonViewUsers);

        // Set listener untuk tombol Register
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nim = editTextNim.getText().toString().trim();  // Ambil NIM
                String name = editTextName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Cek apakah semua field sudah diisi
                if (!nim.isEmpty() && !name.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
                    // Simpan data user (gunakan database atau list untuk menyimpan)
                    User user = new User(nim, name, email, password);
                    // Simpan data ke database atau shared preferences jika perlu
                    Toast.makeText(MainActivity.this, "User registered successfully!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Please fill all fields!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set listener untuk tombol View Users
        buttonViewUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pindah ke activity untuk menampilkan daftar mahasiswa
                Intent intent = new Intent(MainActivity.this, ViewUsersActivity.class);
                startActivity(intent);
            }
        });
    }
}