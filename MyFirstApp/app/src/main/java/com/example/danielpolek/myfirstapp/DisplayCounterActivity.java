package com.example.danielpolek.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class DisplayCounterActivity extends AppCompatActivity {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_content);
        Log.d("msg", "Created");


        passValueToCounter(counter);
    }

    private void passValueToCounter (int a){
        TextView licznik = (TextView) findViewById(R.id.counter_value);
        licznik.setTextSize(40);
        licznik.setText(String.valueOf(a));
    }



    public void addOne(View view) {
        counter++;
        passValueToCounter(counter);
    }
    public void subtractOne(View view) {
        counter--;
        passValueToCounter(counter);
    }

    public void resetCounter(View view) {
        counter = 0;
        passValueToCounter(counter);
    }

    public void setValueCounter(View view) {

    }

}
