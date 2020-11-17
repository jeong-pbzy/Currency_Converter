package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        Log.i("Info","Button pressed!");
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);
        String amountInYens = editText.getText().toString();
        double amountInYensDouble = Double.parseDouble(amountInYens);
        double amountInDollorsDouble = amountInYensDouble * 0.0096;
        String amountInDollorsString = String.format("%.2f",amountInDollorsDouble);

        Log.i("Amount in dollors", amountInDollorsString);
        Toast.makeText(this, "¥"+amountInYens+" is $"+amountInDollorsString,Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}