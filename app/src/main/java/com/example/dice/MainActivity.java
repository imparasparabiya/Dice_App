package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgdice;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgdice = findViewById(R.id.imgdice);

        imgdice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    public void rollDice() {

        int randomNumber = rnd.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imgdice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imgdice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imgdice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imgdice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imgdice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imgdice.setImageResource(R.drawable.dice6);
                break;
        }
    }
}