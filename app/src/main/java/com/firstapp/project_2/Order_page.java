package com.firstapp.project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Order_page extends AppCompatActivity {

    EditText name,phoneno, address, quantity;
    Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);

        name = findViewById(R.id.order_name);
        phoneno = findViewById(R.id.order_phone);
        address = findViewById(R.id.order_address);
        quantity = findViewById(R.id.order_quantity);


        button = findViewById(R.id.buttonone);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String per_name = name.getText().toString();
                String per_phone = phoneno.getText().toString();
                String per_address = address.getText().toString();
                String per_quantity = quantity.getText().toString();

                int number = Integer.parseInt(per_quantity);
                Intent intent = new Intent(getApplicationContext(), bill_details.class);
                intent.putExtra("per_name", per_name);
                intent.putExtra("per_phone", per_phone);
                intent.putExtra("per_address", per_address);
                intent.putExtra("per_quantity", number);
                startActivity(intent);
            }
        });
    }
}