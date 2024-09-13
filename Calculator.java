package com.example.mylove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtCount;
    private Button btnPlus, btnMinus, btnReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCount = findViewById(R.id.txt1);
        btnPlus = findViewById(R.id.btn1);
        btnMinus = findViewById(R.id.btn2);
        btnReset = findViewById(R.id.btn3);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int counter = Integer.parseInt(txtCount.getText().toString());
                counter++;
                txtCount.setText(counter + "");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int minus = Integer.parseInt(txtCount.getText().toString());
                if(minus != 0)
                minus--;
                txtCount.setText(minus + "");
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtCount.setText("0");
            }
        });
    }
}