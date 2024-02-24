package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_todo);


        Spinner spinner = findViewById(R.id.spinner);
        String[] items = {"!!!Важно","Низкий","Нет"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        Switch switch1 = findViewById(R.id.switch1);
        TextView selectedDateTextView = findViewById(R.id.selectedDateTextView);
        String selectedDate = "2024-02-24";
        selectedDateTextView.setText(selectedDate);
    }
}