package com.ultron.sahilpratap.patanjalistore;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<String> {

    ArrayList<Integer> productId;
    Activity activity;
    ArrayList<String> productName;
    ArrayList<Integer> quantity;
    ArrayList<Double> price;


    public CustomAdapter(Activity activity, ArrayList<Integer> productId, ArrayList<String> productName,ArrayList<Integer> quantity, ArrayList<Double> price){

        super(activity,R.layout.custom,productName);
        //  super(activity,R.layout.custom,text1);
        this.activity=activity;
        this.productId=productId;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;

    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {

        LayoutInflater inflater = activity.getLayoutInflater();

        View v = inflater.inflate(R.layout.custom,null);

        TextView tv1 = v.findViewById(R.id.textView);
        TextView tv2 = v.findViewById(R.id.textView2);
        TextView tv3 = v.findViewById(R.id.textView3);
        TextView tv4 = v.findViewById(R.id.textView4);
        tv1.setText(""+productName.get(position));
        tv2.setText("Id: "+productId.get(position));
        tv3.setText("\u20B9 "+price.get(position));
        tv4.setText("qnty: "+quantity.get(position));
        return v;

    }
}