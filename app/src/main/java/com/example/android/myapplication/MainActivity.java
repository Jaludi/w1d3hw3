package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultTV;
    private EditText inputET;
    private Button submitBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTV = (TextView) findViewById(R.id.result_tv);
        inputET = (EditText) findViewById(R.id.input_et);
        submitBT = (Button) findViewById(R.id.submit_button);
    }
    private String setResult(String result){
        String r = "";
        if(result.equals("Hello World")){
            r = "lol no";
        }
        else{
            r = result;
        }
        return r;
    }
    private String retrieveText(){
        String Result = inputET.getText().toString();
        return Result;

    }

    public void doMagic(View view) {
        Intent myIntent = new Intent(MainActivity.this, Main2Activity.class );
        String X = retrieveText();
        myIntent.putExtra("BroText", X);
        startActivity(myIntent);


    }
}
