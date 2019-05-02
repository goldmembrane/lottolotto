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
        final Intent intentByPrecious = getIntent();
        final Intent intentByAnimal = getIntent();
        final Intent intentFood = new Intent(foodActivity.this, MainActivity.class);



        final Button buttonTofu = (Button) findViewById(R.id.tofu);
        buttonTofu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonTofu.isSelected()){
                    buttonTofu.setSelected(false);
                    intentFood.removeExtra("tofu");
                    intentFood.removeExtra("tofu2");
                }else{
                    intentFood.putExtra("tofu", 4);
                    intentFood.putExtra("tofu2", 5);
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
                    intentFood.removeExtra("banana");
                }else{
                    intentFood.putExtra("banana", 6);
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
                    intentFood.removeExtra("coffee");
                }else{
                    intentFood.putExtra("coffee", 7);
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
                    intentFood.removeExtra("egg");
                    intentFood.removeExtra("egg2");
                }else{
                    intentFood.putExtra("egg", 8);
                    intentFood.putExtra("egg2", 10);
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
                    intentFood.removeExtra("garlic");
                }else{
                    intentFood.putExtra("garlic", 14);
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
                    intentFood.removeExtra("orange");
                    intentFood.removeExtra("orange2");
                    intentFood.removeExtra("orange3");
                }else{
                    intentFood.putExtra("orange", 5);
                    intentFood.putExtra("orange2", 18);
                    intentFood.putExtra("orange3", 20);
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
                    intentFood.removeExtra("peach");
                }else{
                    intentFood.putExtra("peach", 28);
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
                    intentFood.removeExtra("chicken");
                    intentFood.removeExtra("chicken2");
                }else{
                    intentFood.putExtra("chicken", 10);
                    intentFood.putExtra("chicken2", 21);
                    buttonChicken.setSelected(true);
                }
            }
        });

        Button buttonShowResult = (Button) findViewById(R.id.result);
        buttonShowResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentByAnimal);
                startActivity(intentByPrecious);
                startActivity(intentFood);
            }
        });
        Button buttonGoPrecious2 = (Button) findViewById(R.id.goPrecious2);
        buttonGoPrecious2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentFood);
                Intent intentGoPrecious2 = new Intent(getApplicationContext(), preciousActivity.class);
                startActivity(intentGoPrecious2);

            }
        });
        Button buttonGoAnimal2 = (Button) findViewById(R.id.goAnimal2);
        buttonGoAnimal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentFood);
                Intent intentGoAnimal2 = new Intent(getApplicationContext(), animalActivity.class);
                startActivity(intentGoAnimal2);

            }
        });
    }
}
