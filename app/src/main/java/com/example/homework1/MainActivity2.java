package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {
    private TextView selectedDateTextView;
    private EditText editTextDate2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_todo);

        Spinner spinner = findViewById(R.id.spinner);
        String[] items = {"!!!Важно", "Низкий", "Нет"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        TextView saveTextView = findViewById(R.id.textView2);
        saveTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedItem = spinner.getSelectedItem().toString();
                EditText editText1 = findViewById(R.id.editTextText);
                String textFromEditText1 = editText1.getText().toString();

                String message = "Saved: " + selectedItem + "\n"
                        + "EditText : " + textFromEditText1 + "\n";

                Toast.makeText(MainActivity2.this, message, Toast.LENGTH_SHORT).show();

            }
        });

        ImageView closeButton = findViewById(R.id.imageViewClose);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        selectedDateTextView = findViewById(R.id.selectedDateTextView);
        editTextDate2 = findViewById(R.id.editTextDate2);
        SwitchCompat switch1 = findViewById(R.id.switch1);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    showDatePicker();
                }
            }
        });
    }
    private void showDatePicker() {
        // Get current date
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        // Create DatePickerDialog
        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity2.this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        // Set selected date to selectedDateTextView
                        String selectedDate = year + "-" + (monthOfYear + 1) + "-" + dayOfMonth;
                        selectedDateTextView.setText(selectedDate);
                    }
                }, year, month, dayOfMonth);

        datePickerDialog.show();
    }
}

