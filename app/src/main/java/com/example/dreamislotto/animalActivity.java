package com.example.dreamislotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class animalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        final Intent intent = new Intent(animalActivity.this, MainActivity.class);

        final Button buttonTiger = (Button) findViewById(R.id.Tiger);
        buttonTiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonTiger.isSelected()){
                    buttonTiger.setSelected(false);
                }else{
                    intent.putExtra("tiger", 3);
                    intent.putExtra("tiger2", 13);
                    buttonTiger.setSelected(true);
                }
            }
        });
        final Button buttonSnake = (Button) findViewById(R.id.snake);
        buttonSnake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonSnake.isSelected()){
                    buttonSnake.setSelected(false);
                }else{
                    intent.putExtra("snake", 4);
                    intent.putExtra("snake2", 10);
                    buttonSnake.setSelected(true);
                }
            }
        });
        final Button buttonMonkey = (Button) findViewById(R.id.monkey);
        buttonMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonMonkey.isSelected()){
                    buttonMonkey.setSelected(false);
                }else{
                    intent.putExtra("monkey", 9);
                    intent.putExtra("monkey2", 39);
                    buttonMonkey.setSelected(true);
                }
            }
        });
        final Button buttonPig = (Button) findViewById(R.id.pig);
        buttonPig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonPig.isSelected()){
                    buttonPig.setSelected(false);
                }else{
                    intent.putExtra("pig", 8);
                    intent.putExtra("pig2", 12);
                    buttonPig.setSelected(true);
                }
            }
        });
        final Button buttonBear = (Button) findViewById(R.id.bear);
        buttonBear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonBear.isSelected()){
                    buttonBear.setSelected(false);
                }else{
                    intent.putExtra("bear", 1);
                    intent.putExtra("bear2", 8);
                    intent.putExtra("bear3", 16);
                    buttonBear.setSelected(true);
                }
            }
        });
        final Button buttonOwl = (Button) findViewById(R.id.owl);
        buttonOwl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonOwl.isSelected()){
                    buttonOwl.setSelected(false);
                }else{
                    intent.putExtra("owl", 37);
                    buttonOwl.setSelected(true);
                }
            }
        });
        final Button buttonTurkey = (Button) findViewById(R.id.turkey);
        buttonTurkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonTurkey.isSelected()){
                    buttonTurkey.setSelected(false);
                }else{
                    intent.putExtra("turkey", 7);
                    intent.putExtra("turkey2", 26);
                    buttonTurkey.setSelected(true);
                }
            }
        });
        final Button buttonPigeon = (Button) findViewById(R.id.pigeon);
        buttonTurkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonPigeon.isSelected()){
                    buttonPigeon.setSelected(false);
                }else{
                    intent.putExtra("pigeon", 9);
                    buttonPigeon.setSelected(true);
                }
            }
        });
        Button buttonShowResult = (Button) findViewById(R.id.result);
        buttonShowResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        Button buttonGoColor2 = (Button) findViewById(R.id.goColor2);
        buttonGoColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoColor2 = new Intent(getApplicationContext(), colorActivity2.class);
                startActivity(intentGoColor2);
            }
        });
        Button buttonGoFood2 = (Button) findViewById(R.id.goFood2);
        buttonGoFood2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoFood2 = new Intent(getApplicationContext(), foodActivity.class);
                startActivity(intentGoFood2);
            }
        });

    }
}
