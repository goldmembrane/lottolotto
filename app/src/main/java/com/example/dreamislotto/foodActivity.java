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

        final Intent intent = new Intent(foodActivity.this, MainActivity.class);



        final Button buttonTofu = (Button) findViewById(R.id.tofu);
        buttonTofu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonTofu.isSelected()){
                    buttonTofu.setSelected(false);
                    intent.removeExtra("tofu");
                    intent.removeExtra("tofu2");
                }else{
                    intent.putExtra("tofu", 4);
                    intent.putExtra("tofu2", 5);
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
                    intent.removeExtra("banana");
                }else{
                    intent.putExtra("banana", 6);
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
                    intent.removeExtra("coffee");
                }else{
                    intent.putExtra("coffee", 7);
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
                    intent.removeExtra("egg");
                    intent.removeExtra("egg2");
                }else{
                    intent.putExtra("egg", 8);
                    intent.putExtra("egg2", 10);
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
                    intent.removeExtra("garlic");
                }else{
                    intent.putExtra("garlic", 14);
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
                    intent.removeExtra("orange");
                    intent.removeExtra("orange2");
                    intent.removeExtra("orange3");
                }else{
                    intent.putExtra("orange", 5);
                    intent.putExtra("orange2", 18);
                    intent.putExtra("orange3", 20);
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
                    intent.removeExtra("peach");
                }else{
                    intent.putExtra("peach", 28);
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
                    intent.removeExtra("chicken");
                    intent.removeExtra("chicken2");
                }else{
                    intent.putExtra("chicken", 10);
                    intent.putExtra("chicken2", 21);
                    buttonChicken.setSelected(true);
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
