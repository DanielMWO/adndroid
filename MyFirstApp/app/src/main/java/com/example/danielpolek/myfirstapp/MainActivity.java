package com.example.danielpolek.myfirstapp;

import android.content.Intent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.danielpolem.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /** Calle on button press */
    public void sendMessage(View view) {

            Intent intent = new Intent(this, DisplayMessageActivity.class);
            EditText editText = (EditText) findViewById(R.id.edit_message);
            String message = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);


        }


    public void gotoCounter(View view) {
        Intent intent =  new Intent(this, DisplayCounterActivity.class);
        startActivity(intent);

    }
}
