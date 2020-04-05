package com.sonacollegeotechnology.discountcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText amount,percent;
    TextView discount;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = findViewById(R.id.amount);
        percent = findViewById(R.id.percent);
        discount = findViewById(R.id.discount);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float a = Float.parseFloat(amount.getText().toString());
                Float p = Float.parseFloat(percent.getText().toString());

                Double d = (a*p)/100.0;

                discount.setText("Discounted Amount: Rs."+d+"\nAfter Discount: Rs."+(a-d));
            }
        });

    }
}
