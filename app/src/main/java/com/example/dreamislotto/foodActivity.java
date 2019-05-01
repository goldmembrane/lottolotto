package com.example.dreamislotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class foodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        final Button buttonTofu = (Button) findViewById(R.id.tofu);
        buttonTofu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonTofu.isSelected()){
                    buttonTofu.setSelected(false);
                }else{
                    buttonTofu.setSelected(true);
                }
            }
        });
        final Button buttonBanana = (Button) findViewById(R.id.banana);
        buttonBanana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonBanana.isSelected()){
                    buttonBanana.setSelected(false);
                }else{
                    buttonBanana.setSelected(true);
                }
            }
        });
        final Button buttonCoffee = (Button) findViewById(R.id.coffee);
        buttonCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonCoffee.isSelected()){
                    buttonCoffee.setSelected(false);
                }else{
                    buttonCoffee.setSelected(true);
                }
            }
        });
        final Button buttonEgg = (Button) findViewById(R.id.egg);
        buttonEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonEgg.isSelected()){
                    buttonEgg.setSelected(false);
                }else{
                    buttonEgg.setSelected(true);
                }
            }
        });
        final Button buttonGarlic = (Button) findViewById(R.id.garlic);
        buttonGarlic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonGarlic.isSelected()){
                    buttonGarlic.setSelected(false);
                }else{
                    buttonGarlic.setSelected(true);
                }
            }
        });
        final Button buttonOrange = (Button) findViewById(R.id.orange);
        buttonOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonOrange.isSelected()){
                    buttonOrange.setSelected(false);
                }else{
                    buttonOrange.setSelected(true);
                }
            }
        });
        final Button buttonPeach = (Button) findViewById(R.id.peach);
        buttonPeach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonPeach.isSelected()){
                    buttonPeach.setSelected(false);
                }else{
                    buttonPeach.setSelected(true);
                }
            }
        });
        final Button buttonChicken = (Button) findViewById(R.id.chicken);
        buttonChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonChicken.isSelected()){
                    buttonChicken.setSelected(false);
                }else{
                    buttonChicken.setSelected(true);
                }
            }
        });
        Button buttonGoPrecious2 = (Button) findViewById(R.id.goPrecious2);
        buttonGoPrecious2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoPrecious2 = new Intent(getApplicationContext(), preciousActivity.class);
                startActivity(intentGoPrecious2);
            }
        });
        Button buttonGoAnimal2 = (Button) findViewById(R.id.goAnimal2);
        buttonGoAnimal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoAnimal2 = new Intent(getApplicationContext(), animalActivity.class);
                startActivity(intentGoAnimal2);
            }
        });
    }
}
