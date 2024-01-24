package com.example.biodata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class displaydetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displaydetails);

        // Retrieve data from the Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        int age = intent.getIntExtra("AGE", 0);
        String gender = intent.getStringExtra("GENDER");
        String address = intent.getStringExtra("ADDRESS");

        // Display the details in TextViews
        TextView textViewName = findViewById(R.id.textViewDisplayName);
        textViewName.setText("Name: " + name);

        TextView textViewAge = findViewById(R.id.textViewDisplayAge);
        textViewAge.setText("Age: " + age);

        TextView textViewGender = findViewById(R.id.textViewDisplayGender);
        textViewGender.setText("Gender: " + gender);

        TextView textViewAddress = findViewById(R.id.textViewDisplayAddress);
        textViewAddress.setText("Address: " + address);
    }
}
