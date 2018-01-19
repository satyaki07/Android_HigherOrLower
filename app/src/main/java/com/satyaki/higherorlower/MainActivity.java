package com.satyaki.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public  void makeToast(String str) {
        Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
    }

    public void guess(View view) {

        EditText guessEditText = (EditText)findViewById(R.id.guessEditText);
        int guessedNumber = Integer.parseInt(guessEditText.getText().toString());
        if(guessedNumber > randomNumber)
            makeToast("LOWER!!");
        else if(guessedNumber < randomNumber)
            makeToast("HIGHER!!");
        else{
            makeToast("That's Right!! Try Again!!");
            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;


    }
}
