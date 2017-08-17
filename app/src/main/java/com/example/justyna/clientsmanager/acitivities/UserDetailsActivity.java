package com.example.justyna.clientsmanager.acitivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.justyna.clientsmanager.R;

public class UserDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdetails);


        getSupportActionBar().setTitle("User details");


    }
}
