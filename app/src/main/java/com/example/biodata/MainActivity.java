 package com.example.biodata;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve entered details
                EditText editTextName = findViewById(R.id.editTextName);
                String name = editTextName.getText().toString();

                EditText editTextAge = findViewById(R.id.editTextAge);
                int age = Integer.parseInt(editTextAge.getText().toString());

                Spinner spinnerGender = findViewById(R.id.spinnerGender);
                String gender = spinnerGender.getSelectedItem().toString();

                EditText editTextAddress = findViewById(R.id.editTextAddress);
                String address = editTextAddress.getText().toString();

                // Create an Intent to launch DisplayDetailsActivity
                Intent intent = new Intent(MainActivity.this, displaydetails.class);

                // Pass the entered details as extras
                intent.putExtra("NAME", name);
                intent.putExtra("AGE", age);
                intent.putExtra("GENDER", gender);
                intent.putExtra("ADDRESS", address);

                // Start the DisplayDetailsActivity
                startActivity(intent);
            }
        });
    }
}