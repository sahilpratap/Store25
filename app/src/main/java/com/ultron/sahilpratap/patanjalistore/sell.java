package com.ultron.sahilpratap.patanjalistore;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class sell extends AppCompatActivity {


    EditText e1,e2,e3,e4;
    Button b1,b2,b3;
    ConstraintLayout cl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);

        e1 = findViewById(R.id.editText);
        b1 = findViewById(R.id.button);
        e2 = findViewById(R.id.editText2);
        e3 = findViewById(R.id.editText3);
        e4 = findViewById(R.id.editText4);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        cl = findViewById(R.id.layout);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = Integer.parseInt(e1.getText().toString());

                if((product.getProductId()).contains(id)) {
                     int position = (product.getProductId()).indexOf(id);
                    cl.setVisibility(View.VISIBLE);
                    e2.setText((product.getProductName()).get(position));
                    e3.setHint(((product.getProductQuantity()).get(position)).toString());
                    e4.setText((product.getProductPrice()).get(position).toString());
                }
                else
                {
                    Toast.makeText(sell.this,"This item is not available in the store",Toast.LENGTH_LONG).show();
                }

            }
        });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int id = Integer.parseInt(e1.getText().toString());
                    int position = (product.getProductId()).indexOf(id);

                    int q = Integer.parseInt(e3.getText().toString());
                    Double price = q*(product.getProductPrice().get(position));
                    e4.setText(price.toString());
                }
            });


            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int q = Integer.parseInt(e3.getText().toString());
                    int id = Integer.parseInt(e1.getText().toString());
                    int position = (product.getProductId()).indexOf(id);

                    ArrayList<Integer> qnty = product.getProductQuantity();
                    int n = qnty.get(position);
                    qnty.set(position,(n-q));
                    if(product.getProductQuantity().get(position)==0)
                    {
                        product.getProductQuantity().remove(position);
                        product.getProductName().remove(position);
                        product.getProductPrice().remove(position);
                        product.getProductId().remove(position);
                    }


                    Toast.makeText(sell.this,"Your item succesfully sold!",Toast.LENGTH_LONG).show();



                }
            });



    }
}
