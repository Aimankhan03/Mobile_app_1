package com.example.aimanizhar_mobile_app_1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayDataActivity extends AppCompatActivity {
    private TextView textViewData;
    private DatabaseHelper dbHelper;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);

        textViewData = textViewData.findViewById(R.id.textViewData);
        dbHelper = new DatabaseHelper(this);

        displayData();
    }

    private void setContentView(int activityDisplayData) {
    }
    private void onCreate() {
    }

    private void displayData() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String[] projection = {
                DatabaseContract.UserEntry.COLUMN_NAME,
                DatabaseContract.UserEntry.COLUMN_AGE
        };

        Cursor cursor = db.query(
                DatabaseContract.UserEntry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null
        );

        StringBuilder data = new StringBuilder();
        while (cursor.moveToNext()) {
            String name = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseContract.UserEntry.COLUMN_NAME));
            int age = cursor.getInt(cursor.getColumnIndexOrThrow(DatabaseContract.UserEntry.COLUMN_AGE));
            data.append("Name: ").append(name).append(", Age: ").append(age).append("\n");
        }
        cursor.close();

        textViewData.setText(data.toString());
    }
}
