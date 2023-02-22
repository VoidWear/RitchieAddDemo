package com.example.myapplicationaddnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;

    private Button add;

    private TextView result;

    private Button sub;

    public MainActivity() {
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.txtNum1);
        num2 = (EditText)findViewById(R.id.txtNum2);
        add = (Button)findViewById(R.id.btnAdd);
        result = (TextView)findViewById(R.id.txtResult);
        sub = (Button) findViewById(R.id.btnSub);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get Value form Activity
                int myNumber1 = Integer.parseInt(num1.getText().toString());
                int myNumber2 = Integer.parseInt(num2.getText().toString());

                //add operation
                int sum = myNumber1 + myNumber2;

                result.setText("Answer is "+sum);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get Value form Activity
                int myNumber1 = Integer.parseInt(num1.getText().toString());
                int myNumber2 = Integer.parseInt(num2.getText().toString());

                //add operation
                int ans = myNumber1 - myNumber2;

                result.setText("Answer is "+ans);
            }
        });

    }
}