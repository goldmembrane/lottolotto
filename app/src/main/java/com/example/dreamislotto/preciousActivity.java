package com.example.dreamislotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class preciousActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precious);

       final Intent intent = new Intent(preciousActivity.this, MainActivity.class);


        final Button buttonGod = (Button) findViewById(R.id.god);
        buttonGod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(buttonGod.isSelected()){
                    buttonGod.setSelected(false);
                }else{
                    intent.putExtra("god",1);
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
                }else{
                    intent.putExtra("dragon",7);
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
                }else{
                    intent.putExtra("pray",5);
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
                }else{

                    intent.putExtra("pastor",21);
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
                }else{
                    intent.putExtra("gold",11);
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
                }else{
                    intent.putExtra("prince",27);
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
                }else{
                    intent.putExtra("cross",10);
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
                }else{
                    intent.putExtra("diamond",28);
                    buttonDiamond.setSelected(true);
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






    }

}
