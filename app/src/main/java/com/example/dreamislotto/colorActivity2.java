package com.example.dreamislotto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class colorActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color2);


        final Button buttonRed = (Button) findViewById(R.id.red);
        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonRed.isSelected()){
                    buttonRed.setSelected(false);
                }else{
                    buttonRed.setSelected(true);
                }
            }
        });
        final Button buttonYellow = (Button) findViewById(R.id.yellow);
        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonYellow.isSelected()){
                    buttonYellow.setSelected(false);
                }else{
                    buttonYellow.setSelected(true);
                }
            }
        });
        final Button buttonBlack = (Button) findViewById(R.id.black);
        buttonBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonBlack.isSelected()){
                    buttonBlack.setSelected(false);
                }else{
                    buttonBlack.setSelected(true);
                }
            }
        });
        final Button buttonBlue = (Button) findViewById(R.id.blue);
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonBlue.isSelected()){
                    buttonBlue.setSelected(false);
                }else{
                    buttonBlue.setSelected(true);
                }
            }
        });
        final Button buttonSilver = (Button) findViewById(R.id.silver);
        buttonSilver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonSilver.isSelected()){
                    buttonSilver.setSelected(false);
                }else{
                    buttonSilver.setSelected(true);
                }
            }
        });
        final Button buttonWhite = (Button) findViewById(R.id.white);
        buttonWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonWhite.isSelected()){
                    buttonWhite.setSelected(false);
                }else{
                    buttonWhite.setSelected(true);
                }
            }
        });
        final Button buttonGreen = (Button) findViewById(R.id.green);
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonGreen.isSelected()){
                    buttonGreen.setSelected(false);
                }else{
                    buttonGreen.setSelected(true);
                }
            }
        });
        final Button buttonPurple = (Button) findViewById(R.id.purple);
        buttonPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonPurple.isSelected()){
                    buttonPurple.setSelected(false);
                }else{
                    buttonPurple.setSelected(true);
                }
            }
        });
    }
}
