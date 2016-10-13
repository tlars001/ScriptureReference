package com.example.trevor.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    // This class will display the saved data
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String scripture = intent.getStringExtra(MainActivity.MESSAGE);
        TextView textView = (TextView)findViewById(R.id.textView2);
        textView.setText(scripture);
    }
}
