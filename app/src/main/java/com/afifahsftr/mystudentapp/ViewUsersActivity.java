package com.afifahsftr.mystudentapp;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ViewUsersActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    StudentAdapter studentAdapter;
    List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_users);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Hardcoded list of students
        studentList = new ArrayList<>();
        studentList.add(new Student("123", "John Doe", "johndoe@gmail.com", "01/01/2000"));
        studentList.add(new Student("124", "Jane Smith", "janesmith@gmail.com", "02/02/2000"));
        studentList.add(new Student("125", "Michael Brown", "michaelbrown@gmail.com", "03/03/2000"));
        studentList.add(new Student("126", "Emily White", "emilywhite@gmail.com", "04/04/2000"));
        studentList.add(new Student("127", "David Green", "davidgreen@gmail.com", "05/05/2000"));

        // Menghubungkan RecyclerView dengan Adapter
        studentAdapter = new StudentAdapter(studentList);
        recyclerView.setAdapter(studentAdapter);

        // Menampilkan Toast untuk menunjukkan data ditampilkan
        Toast.makeText(this, "Displaying all students", Toast.LENGTH_SHORT).show();
    }
}