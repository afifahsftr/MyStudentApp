package com.afifahsftr.mystudentapp;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface StudentDao {

    @Insert
    void insert(Student student);

    @Query("SELECT * FROM students")
    List<Student> getAllStudents();
}