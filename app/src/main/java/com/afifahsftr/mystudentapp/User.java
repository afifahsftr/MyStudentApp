package com.afifahsftr.mystudentapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "users")  // Nama tabel di Room adalah "users"
public class User {

    @PrimaryKey
    private String nim;  // NIM sebagai Primary Key
    private String name;
    private String email;
    private String password;

    // Constructor
    public User(String nim, String name, String email, String password) {
        this.nim = nim;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getter and Setter Methods
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{nim='" + nim + "', name='" + name + "', email='" + email + "'}";
    }
}