package com.example.aimanizhar_mobile_app_1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;

   
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize editTextName
        editTextName = editTextName.findViewById(R.id.editTextName);
    }

    private void setContentView(int activityMain) {
    }

    public void saveData(View view) {
        String name = editTextName.getText().toString().trim();

        if (name.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please enter a name", Toast.LENGTH_SHORT).show();
            return; 
        }

       
        saveToDatabase(name);
    }

    private void saveToDatabase(String name) {
       
        Toast.makeText(getApplicationContext(), "Data saved successfully", Toast.LENGTH_SHORT).show();
    }

    private Context getApplicationContext() {
        return null;
    }
}


