package com.example.testing.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.testing.R;
import com.example.testing.databinding.ActivityMainBinding;
import com.example.testing.model.Math;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding ui;
    private Math math = new Math();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        ui.addBtn.setOnClickListener(v -> {
            int num1 = Integer.valueOf(ui.input1.getText().toString());
            int num2 = Integer.valueOf(ui.input2.getText().toString());
            ui.resultText.setText(String.valueOf(math.add(num1, num2)));

        });

        ui.subtractBtn.setOnClickListener(v -> {
            int num1 = Integer.valueOf(ui.input1.getText().toString());
            int num2 = Integer.valueOf(ui.input2.getText().toString());
            ui.resultText.setText(String.valueOf(math.subtract(num1, num2)));

        });

        ui.multiplyBtn.setOnClickListener(v -> {
            int num1 = Integer.valueOf(ui.input1.getText().toString());
            int num2 = Integer.valueOf(ui.input1.getText().toString());
            ui.resultText.setText(String.valueOf(math.multiply(num1, num2)));
        });

        ui.divBtn.setOnClickListener(v -> {
            int num1 = Integer.valueOf(ui.input1.getText().toString());
            int num2 = Integer.valueOf(ui.input2.getText().toString());
            ui.resultText.setText(String.valueOf(math.div(num1, num2)));

        });

    }
}