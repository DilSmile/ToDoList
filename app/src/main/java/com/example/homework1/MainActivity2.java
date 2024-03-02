package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
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
                        + "Text from EditText 1: " + textFromEditText1 + "\n";

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
    }
}


