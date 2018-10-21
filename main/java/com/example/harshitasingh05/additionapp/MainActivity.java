package com.example.harshitasingh05.additionapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }


    public void onButtonClick(View v)
    {
        EditText e1 = (EditText)findViewById(R.id.editText1);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView t1 = (TextView)findViewById(R.id.textView);

        Double num1 = Double.parseDouble(e1.getText().toString());
        Double num2 = Double.parseDouble(e2.getText().toString()) ;
        Double sum = num1 + num2 ;
        t1.setText(Double.toString(sum));
    }


}
