package com.example.dreamislotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class placeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        final Button buttonPlayground = (Button) findViewById(R.id.playground);
        buttonPlayground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(buttonPlayground.isSelected()){
                    buttonPlayground.setSelected(false);
                }else{
                    buttonPlayground.setSelected(true);
                }
            }
        });
        final Button buttonCellar = (Button) findViewById(R.id.cellar);
        buttonCellar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonCellar.isSelected()){
                    buttonCellar.setSelected(false);
                }else{
                    buttonCellar.setSelected(true);
                }
            }
        });
        final Button buttonFuneral = (Button) findViewById(R.id.funeral);
        buttonFuneral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonFuneral.isSelected()){
                    buttonFuneral.setSelected(false);
                }else{
                    buttonFuneral.setSelected(true);
                }
            }
        });
        final Button buttonJungle = (Button) findViewById(R.id.jungle);
        buttonJungle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonJungle.isSelected()){
                    buttonJungle.setSelected(false);
                }else{
                    buttonJungle.setSelected(true);
                }
            }
        });
        final Button buttonPark = (Button) findViewById(R.id.park);
        buttonPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonPark.isSelected()){
                    buttonPark.setSelected(false);
                }else{
                    buttonPark.setSelected(true);
                }
            }
        });
        final Button buttonMarket = (Button) findViewById(R.id.market);
        buttonMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonMarket.isSelected()){
                    buttonMarket.setSelected(false);
                }else{
                    buttonMarket.setSelected(true);
                }
            }
        });
        final Button buttonJail = (Button) findViewById(R.id.jail);
        buttonJail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonJail.isSelected()){
                    buttonJail.setSelected(false);
                }else{
                    buttonJail.setSelected(true);
                }
            }
        }); final Button buttonSky = (Button) findViewById(R.id.sky);
        buttonSky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonSky.isSelected()){
                    buttonSky.setSelected(false);
                }else{
                    buttonSky.setSelected(true);
                }
            }
        });

    }
}
