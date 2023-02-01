package com.firstapp.project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class bill_details extends AppCompatActivity {

    TextView name, address, phoneno, cash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_details);

        name = findViewById(R.id.per_name);
        address = findViewById(R.id.per_address);
        phoneno = findViewById(R.id.per_phoneno);
        cash = findViewById(R.id.cash_details);

        String bill_name = getIntent().getStringExtra("per_name");
        String bill_phone = getIntent().getStringExtra("per_phone");
        String bill_address = getIntent().getStringExtra("per_address");
        int bill_quantity = getIntent().getIntExtra("per_quantity",0);



        name.setText(bill_name);
        address.setText(bill_address);
        phoneno.setText(bill_phone);
        cash.setText("" + bill_quantity);
    }
}