package com.dream.dreamislotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class preciousActivity extends AppCompatActivity {

    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precious);
        MobileAds.initialize(this, "ca-app-pub-8799724102859231~7332614513");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
       final Intent intentPrecious = new Intent(preciousActivity.this, MainActivity.class);






        final Button buttonGod = (Button) findViewById(R.id.god);
        buttonGod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(buttonGod.isSelected()){
                    buttonGod.setSelected(false);
                    intentPrecious.removeExtra("god");
                }else{
                    intentPrecious.putExtra("god",1);
                    buttonGod.setSelected(true);
                }



            }
        });

        final Button buttonDragon= (Button) findViewById(R.id.dragon);
        buttonDragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonDragon.isSelected()){
                    buttonDragon.setSelected(false);
                    intentPrecious.removeExtra("dragon");
                    intentPrecious.removeExtra("dragon2");
                }else{
                    intentPrecious.putExtra("dragon",7);
                    intentPrecious.putExtra("dragon2", 24);
                    buttonDragon.setSelected(true);
                }
            }
        });
        final Button buttonPray = (Button) findViewById(R.id.pray);
        buttonPray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonPray.isSelected()){
                    buttonPray.setSelected(false);
                    intentPrecious.removeExtra("pray");
                    intentPrecious.removeExtra("pray2");
                }else{
                    intentPrecious.putExtra("pray",5);
                    intentPrecious.putExtra("pray2", 11);
                    buttonPray.setSelected(true);
                }
            }
        });
        final Button buttonPastor = (Button) findViewById(R.id.pastor);
        buttonPastor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonPastor.isSelected()){
                    buttonPastor.setSelected(false);
                    intentPrecious.removeExtra("pastor");
                }else{

                    intentPrecious.putExtra("pastor",21);
                    buttonPastor.setSelected(true);
                }

            }
        });
        final Button buttonGold = (Button) findViewById(R.id.gold);
        buttonGold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonGold.isSelected()){
                    buttonGold.setSelected(false);
                    intentPrecious.removeExtra("gold");
                    intentPrecious.removeExtra("gold2");
                }else{
                    intentPrecious.putExtra("gold",11);
                    intentPrecious.putExtra("gold2", 12);
                    buttonGold.setSelected(true);
                }

            }
        });
        final Button buttonPrince = (Button) findViewById(R.id.prince);
        buttonPrince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonPrince.isSelected()){
                    buttonPrince.setSelected(false);
                    intentPrecious.removeExtra("prince");
                    intentPrecious.removeExtra("prince2");
                }else{
                    intentPrecious.putExtra("prince",27);
                    intentPrecious.putExtra("prince2", 3);
                    buttonPrince.setSelected(true);
                }

            }
        });
        final Button buttonCross = (Button) findViewById(R.id.cross);
        buttonCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonCross.isSelected()){
                    buttonCross.setSelected(false);
                    intentPrecious.removeExtra("cross");
                }else{
                    intentPrecious.putExtra("cross",10);
                    buttonCross.setSelected(true);
                }

            }
        });
        final Button buttonDiamond = (Button) findViewById(R.id.diamond);
        buttonDiamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonDiamond.isSelected()){
                    buttonDiamond.setSelected(false);
                    intentPrecious.removeExtra("diamond");
                    intentPrecious.removeExtra("diamond2");
                }else{
                    intentPrecious.putExtra("diamond2", 3);
                    intentPrecious.putExtra("diamond",28);
                    buttonDiamond.setSelected(true);
                }

            }
        });


        Button buttonShowResult = (Button) findViewById(R.id.result);
        buttonShowResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentPrecious);
            }
        });



        Button buttonGoPlace = (Button) findViewById(R.id.goPlace);
        buttonGoPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentPrecious);
                Intent intentGoPlace = new Intent(getApplicationContext(), placeActivity.class);
                startActivity(intentGoPlace);

            }
        });
        Button buttonGoFood = (Button) findViewById(R.id.goFood);
        buttonGoFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentPrecious);
                Intent intentGoFood = new Intent(getApplicationContext(), foodActivity.class);
                startActivity(intentGoFood);

            }
        });






    }



}
