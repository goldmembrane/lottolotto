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


        final Intent intent = new Intent(placeActivity.this, MainActivity.class);


        final Button buttonPlayground = (Button) findViewById(R.id.playground);
        buttonPlayground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(buttonPlayground.isSelected()){
                    buttonPlayground.setSelected(false);
                }else{
                    intent.putExtra("playground", 32);
                    intent.putExtra("playground2", 41);
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
                    intent.putExtra("cellar", 39);
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
                    intent.putExtra("funeral", 36);
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
                    intent.putExtra("jungle", 23);
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
                    intent.putExtra("park", 27);
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
                    intent.putExtra("market", 27);
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
                    intent.putExtra("jail", 8);
                    intent.putExtra("jail2", 11);
                    intent.putExtra("jail3", 25);
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
                    intent.putExtra("sky", 1);
                    intent.putExtra("sky2", 36);
                    buttonSky.setSelected(true);
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

        Button buttonGoPrecious = (Button) findViewById(R.id.goPrecious);
        buttonGoPrecious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoPrecious = new Intent(getApplicationContext(), preciousActivity.class);
                startActivity(intentGoPrecious);
            }
        });

        Button buttonGoColor = (Button) findViewById(R.id.goColor);
        buttonGoColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoColor = new Intent(getApplicationContext(), colorActivity2.class);
                startActivity(intentGoColor);
            }
        });

    }
}
