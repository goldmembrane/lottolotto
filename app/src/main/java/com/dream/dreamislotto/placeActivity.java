package com.dream.dreamislotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class placeActivity extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        MobileAds.initialize(this, "ca-app-pub-8799724102859231~7332614513");

        mAdView = findViewById(R.id.adViewPlace);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final Intent intentPlace = new Intent(placeActivity.this, MainActivity.class);



        final Button buttonPlayground = (Button) findViewById(R.id.playground);
        buttonPlayground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(buttonPlayground.isSelected()){
                    buttonPlayground.setSelected(false);
                    intentPlace.removeExtra("playground");
                    intentPlace.removeExtra("playground2");
                }else{
                    intentPlace.putExtra("playground", 32);
                    intentPlace.putExtra("playground2", 41);
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
                    intentPlace.removeExtra("cellar");
                }else{
                    intentPlace.putExtra("cellar", 39);
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
                    intentPlace.removeExtra("funeral");
                }else{
                    intentPlace.putExtra("funeral", 36);
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
                    intentPlace.removeExtra("jungle");
                }else{
                    intentPlace.putExtra("jungle", 23);
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
                    intentPlace.removeExtra("park");
                }else{
                    intentPlace.putExtra("park", 27);
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
                    intentPlace.removeExtra("market");
                }else{
                    intentPlace.putExtra("market", 27);
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
                    intentPlace.removeExtra("jail");
                    intentPlace.removeExtra("jail2");
                    intentPlace.removeExtra("jail3");
                }else{
                    intentPlace.putExtra("jail", 8);
                    intentPlace.putExtra("jail2", 11);
                    intentPlace.putExtra("jail3", 25);
                    buttonJail.setSelected(true);
                }
            }
        }); final Button buttonSky = (Button) findViewById(R.id.sky);
        buttonSky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonSky.isSelected()){
                    buttonSky.setSelected(false);
                    intentPlace.removeExtra("sky");
                    intentPlace.removeExtra("sky2");
                }else{
                    intentPlace.putExtra("sky", 1);
                    intentPlace.putExtra("sky2", 36);
                    buttonSky.setSelected(true);
                }
            }
        });
        Button buttonShowResult = (Button) findViewById(R.id.result);
        buttonShowResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentPlace);
                finish();
            }
        });

        Button buttonGoPrecious = (Button) findViewById(R.id.goPrecious);
        buttonGoPrecious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentGoPrecious = new Intent(getApplicationContext(), preciousActivity.class);
                startActivity(intentGoPrecious);
                finish();

            }
        });

        Button buttonGoColor = (Button) findViewById(R.id.goColor);
        buttonGoColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoColor = new Intent(getApplicationContext(), colorActivity2.class);
                startActivity(intentGoColor);
                finish();

            }
        });

    }
}
