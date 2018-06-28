package com.ultron.sahilpratap.patanjalistore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class show extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        listView = findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(show.this,product.getProductId(),product.productName,product.getProductQuantity(),product.productPrice);
        adapter.notifyDataSetChanged();
        listView.setAdapter(adapter);

  /*     product p = new product();

        ArrayList<Integer> productId = new ArrayList<Integer>();
        ArrayList<String> productName = new ArrayList<String>();
        ArrayList<Integer> quantity = new ArrayList<Integer>();
        ArrayList<Double> price = new ArrayList<Double>();

        Bundle bundle = getIntent().getExtras();
        product p = (product)(bundle.get("obj"));

        int id = Integer.parseInt(bundle.get("id").toString());
        productId.add(Integer.parseInt(bundle.get("id").toString()));
        String name = bundle.get("name").toString();
        productName.add(bundle.get("name").toString());
        int quantity = Integer.parseInt(bundle.get("qnty").toString());
        quantity.add(Integer.parseInt(bundle.get("qnty").toString()));
        double price = Double.parseDouble(bundle.get("price").toString());
        price.add(Double.parseDouble(bundle.get("price").toString()));
    */


    }
}

/*

    ListView list;

    Integer images[] = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f};

    String text[] =  {"Alpha","Beta","Cupcake","Donot","Eclears","Foryo"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.listView);

        customAdapter adapter = new customAdapter(this,text,images);
        list.setAdapter(adapter);



    }
}
*/