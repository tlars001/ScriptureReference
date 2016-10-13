/**
 *  This program will prompt the user for a book, chapter, and a verse.
 *  When they hit the button "share" they will be taken to a new screen
 *  where their favorite scripture is displayed.
 *
 *  Author: Trevor Larson
 */
package com.example.trevor.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// This class will start up the program
public class MainActivity extends AppCompatActivity {

    public final static String MESSAGE = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = new Button(this);
    }

    // This class will save the data and change screens
    public void onClick(View v) {
        Intent intent = new Intent(this, Main2Activity.class);
        EditText theBook = (EditText) findViewById(R.id.editText7);
        EditText theChapter = (EditText) findViewById(R.id.editText8);
        EditText theVerse = (EditText)findViewById(R.id.editText9);
        String book = theBook.getText().toString();
        String chapter = theChapter.getText().toString();
        String verse = theVerse.getText().toString();
        String scripture = (book + " " + chapter + ":" + verse);
        intent.putExtra(MESSAGE, scripture);
        startActivity(intent);

    }
}
