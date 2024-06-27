package com.example.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CustomerActivity extends Activity {

    private EditText nameEditText;
    private EditText ageEditText;
    private EditText phoneEditText;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        nameEditText = findViewById(R.id.editTextName);
        ageEditText = findViewById(R.id.editTextAge);
        phoneEditText = findViewById(R.id.editTextPhone);
        saveButton = findViewById(R.id.buttonSave);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("name", nameEditText.getText().toString());
                intent.putExtra("age", ageEditText.getText().toString());
                intent.putExtra("phone", phoneEditText.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }
}