package com.example.dreamislotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class colorActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color2);
        final Intent intentByAnimal = getIntent();
        final Intent intentByPlace = getIntent();
        final Intent intentColor = new Intent(colorActivity2.this, MainActivity.class);



        final Button buttonRed = (Button) findViewById(R.id.red);
        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonRed.isSelected()){
                    buttonRed.setSelected(false);
                    intentColor.removeExtra("red");
                }else{
                    intentColor.putExtra("red", 1);
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
                    intentColor.removeExtra("yellow");
                }else{
                    intentColor.putExtra("yellow", 3);
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
                    intentColor.removeExtra("black");
                    intentColor.removeExtra("black2");
                    intentColor.removeExtra("black3");
                    intentColor.removeExtra("black4");
                }else{
                    intentColor.putExtra("black", 8);
                    intentColor.putExtra("black2", 9);
                    intentColor.putExtra("black3", 32);
                    intentColor.putExtra("black4", 33);
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
                    intentColor.removeExtra("blue");
                    intentColor.removeExtra("blue2");
                }else{
                    intentColor.putExtra("blue", 5);
                    intentColor.putExtra("blue2", 32);
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
                    intentColor.removeExtra("silver");
                }else{
                    intentColor.putExtra("silver", 17);
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
                    intentColor.removeExtra("white");
                    intentColor.removeExtra("white2");
                }else{
                    intentColor.putExtra("white", 38);
                    intentColor.putExtra("white2", 39);
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
                    intentColor.removeExtra("green");
                }else{
                    intentColor.putExtra("green", 4);
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
                    intentColor.removeExtra("purple");
                }else{
                    intentColor.putExtra("purple", 7);
                    buttonPurple.setSelected(true);
                }
            }
        });
        Button buttonShowResult = (Button) findViewById(R.id.result);
        buttonShowResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentByAnimal);
                startActivity(intentByPlace);
                startActivity(intentColor);
            }
        });

        Button buttonGoPlace2 = (Button) findViewById(R.id.goPlace2);
        buttonGoPlace2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentColor);
                Intent intentGoPlace2 = new Intent(getApplicationContext(), placeActivity.class);
                startActivity(intentGoPlace2);

            }
        });
        Button buttonGoAnimal = (Button) findViewById(R.id.goAnimal);
        buttonGoAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentColor);
                Intent intentGoAnimal = new Intent(getApplicationContext(), animalActivity.class);
                startActivity(intentGoAnimal);

            }
        });
    }
}
