package com.example.reklamacjaklawiatury;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "EXTRA_NAME";
    public static final String EXTRA_MODEL = "EXTRA_MODEL";
    public static final String EXTRA_DAMAGE = "EXTRA_DAMAGE";

    EditText editName;
    Spinner spinnerModel;
    CheckBox checkDamage;
    Button buttonNext;

    ActivityResultLauncher<Intent> launcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        spinnerModel = findViewById(R.id.spinnerModel);
        checkDamage = findViewById(R.id.checkDamage);
        buttonNext = findViewById(R.id.buttonNext);

        launcher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if(result.getResultCode() == RESULT_OK){
                        Toast.makeText(this,"Reklamacja potwierdzona",Toast.LENGTH_LONG).show();
                    } else if(result.getResultCode() == RESULT_CANCELED){
                        Toast.makeText(this,"Reklamacja anulowana",Toast.LENGTH_LONG).show();
                    }
                }
        );

        buttonNext.setOnClickListener(v -> {

            String name = editName.getText().toString();

            if(name.isEmpty()){
                editName.setError("Podaj imię");
                return;
            }

            String model = spinnerModel.getSelectedItem().toString();
            boolean damage = checkDamage.isChecked();

            Intent intent = new Intent(MainActivity.this, SummaryActivity.class);

            intent.putExtra(EXTRA_NAME, name);
            intent.putExtra(EXTRA_MODEL, model);
            intent.putExtra(EXTRA_DAMAGE, damage);

            launcher.launch(intent);
        });
    }
}