package com.example.application4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Button 1",Toast.LENGTH_LONG).show();

            }
        });
        button2=findViewById(R.id.button2);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Toast.makeText(MainActivity.this, "Button 2", Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(MainActivity.this, "Button 3", Toast.LENGTH_LONG).show();
                break;

        }
    }

    public void showToastMessage(View view) {
        Toast.makeText(this,"Button 4",Toast.LENGTH_LONG).show();
    }

    public void openSpinner(View view) {
        startActivity(new Intent(this,SpinnerActivity.class));
    }

    public void openAutoComplete(View view) {
        startActivity(new Intent(this,AutoCompleteActivity.class));
    }


    public void openInputTypeControl(View view) {
        startActivity(new Intent(this,InputTypeControlActivity.class));   
    }
}