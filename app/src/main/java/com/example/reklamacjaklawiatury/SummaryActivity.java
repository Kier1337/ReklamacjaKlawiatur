package com.example.reklamacjaklawiatury;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class SummaryActivity extends AppCompatActivity {

    TextView textSummary;
    Button buttonOk;
    Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        textSummary = findViewById(R.id.textSummary);
        buttonOk = findViewById(R.id.buttonOk);
        buttonCancel = findViewById(R.id.buttonCancel);

        Intent intent = getIntent();

        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String model = intent.getStringExtra(MainActivity.EXTRA_MODEL);
        boolean damage = intent.getBooleanExtra(MainActivity.EXTRA_DAMAGE,false);

        String summary = "Imię: " + name +
                "\nModel klawiatury: " + model +
                "\nUszkodzenie mechaniczne: " + (damage ? "TAK" : "NIE");

        textSummary.setText(summary);

        buttonOk.setOnClickListener(v -> {
            setResult(RESULT_OK);
            finish();
        });

        buttonCancel.setOnClickListener(v -> {
            setResult(RESULT_CANCELED);
            finish();
        });
    }
}