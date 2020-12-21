package com.example.roomexample;


import androidx.room.Insert;

@androidx.room.Dao

public interface DAO {
    @Insert
    public void addCustomer(Customer cust);
}
