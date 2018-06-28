package com.ultron.sahilpratap.patanjalistore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class Add extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
        e3 = findViewById(R.id.editText3);
        e4 = findViewById(R.id.editText4);

        b1 = findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int productId = Integer.parseInt(e1.getText().toString());
                String name = e2.getText().toString();
                int quantity = Integer.parseInt(e3.getText().toString());
                double price = Double.parseDouble(e4.getText().toString());

                if(productId<6)
                    e1.setError("id must be 6 characters!");
                else if(name.equals(""))
                    e2.setError("Please enter the Name");
                else if(quantity<=0)
                    e3.setError("quantity should be greater then 0");
                else {
                    product.add(productId, name, quantity, price);
                    Toast.makeText(Add.this, "your product added successfully!", Toast.LENGTH_LONG).show();
                    e1.setText("");
                    e2.setText("");
                    e3.setText("");
                    e4.setText("");
                }
             /*
                Intent intent = new Intent(Add.this,show.class);
                intent.putExtra("obj",p.toString());
                intent.putExtra("id",productId);
                intent.putExtra("name",name);
                intent.putExtra("qnty",quantity);
                intent.putExtra("price",price);
                startActivity(intent);
              */
            }
        });



    }
}
