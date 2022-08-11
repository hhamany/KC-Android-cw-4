package com.example.myapplication11;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView caculator = findViewById(R.id.calculator);
        EditText num1 = findViewById(R.id.number1);
        EditText num2 = findViewById(R.id.number2);
        TextView total = findViewById(R.id.total);
        Button plus = findViewById(R.id.plus);
        Button sub = findViewById(R.id.sub);
        Button multi = findViewById(R.id.multi);
        Button divi = findViewById(R.id.divi);



        plus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("RestrictedApi")
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int x = a+b;
                total.setText(Integer.toString(x));

                System.out.println(x);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int x = a-b;

                total.setText(Integer.toString(x));

                System.out.println(x);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int x = a*b;

                total.setText(Integer.toString(x));

                System.out.println(x);
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int x = a/b;

                total.setText(Integer.toString(x));

                System.out.println(x);
            }
        });

    }
}

