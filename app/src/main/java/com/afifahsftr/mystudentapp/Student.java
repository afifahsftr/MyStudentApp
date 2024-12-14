package com.afifahsftr.mystudentapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "students") // Menyatakan bahwa kelas ini adalah entitas Room
public class Student {

    @PrimaryKey(autoGenerate = true) // Menandakan bahwa id akan otomatis dibuat oleh Room
    private int id;

    private String nim;
    private String name;
    private String email;
    private String dob;

    // Konstruktor
    public Student(String nim, String name, String email, String dob) {
        this.nim = nim;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nim='" + nim + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}