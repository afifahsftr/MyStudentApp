package com.afifahsftr.mystudentapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    private List<Student> studentList;  // Gantilah tipe data menjadi Student

    // Konstruktor untuk menerima list Student
    public StudentAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }

    // Menyusun layout untuk setiap item RecyclerView
    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);  // Pastikan menggunakan item_student.xml
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
        Student student = studentList.get(position);  // Ambil data student
        holder.nimTextView.setText(student.getNim());  // Menampilkan NIM
        holder.nameTextView.setText(student.getName());
        holder.emailTextView.setText(student.getEmail());
        holder.dobTextView.setText(student.getDob());  // Menampilkan DOB
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    // ViewHolder untuk setiap item
    public static class StudentViewHolder extends RecyclerView.ViewHolder {

        TextView nimTextView;
        TextView nameTextView;
        TextView emailTextView;
        TextView dobTextView;

        public StudentViewHolder(View itemView) {
            super(itemView);
            nimTextView = itemView.findViewById(R.id.nimTextView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            emailTextView = itemView.findViewById(R.id.emailTextView);
            dobTextView = itemView.findViewById(R.id.dobTextView);
        }
    }
}