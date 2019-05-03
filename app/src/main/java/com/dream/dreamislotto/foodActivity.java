package com.dream.dreamislotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * 음식 관련 꿈들에 대한 각각의 숫자를 버튼을 클릭하여 선택할 수 있다.
 * @author ByeongHyun Hwang
 * @version 1.0.1
 */
public class foodActivity extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        MobileAds.initialize(this, "ca-app-pub-8799724102859231~7332614513");

        mAdView = findViewById(R.id.adViewFood);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        /**
         * 결과 화면에 값을 전달하기 위한 인텐트 설정
         */
        final Intent intentFood = new Intent(foodActivity.this, MainActivity.class);

        /**
         * 클릭하면 두부에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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

        /**
         * 클릭하면 바나나에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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

        /**
         * 클릭하면 커피에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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

        /**
         * 클릭하면 달걀에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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

        /**
         * 클릭하면 마늘에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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

        /**
         * 클릭하면 귤에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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

        /**
         * 클릭하면 복숭아에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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

        /**
         * 클릭하면 닭고기에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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

        /**
         * 클릭하면 각각 속성에서 받은 숫자(값)를 결과 화면에 표시되도록 넘겨주는 버튼
         * 클릭 시 결과 화면으로 이동한다.
         */
        Button buttonShowResult = (Button) findViewById(R.id.result);
        buttonShowResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentFood);
                finish();
            }
        });

        /**
         * 클릭 시 귀중품관련 꿈 화면으로 넘어가는 버튼
         */
        Button buttonGoPrecious2 = (Button) findViewById(R.id.goPrecious2);
        buttonGoPrecious2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * 클릭 시 귀중품관련 꿈 화면으로 넘어간다
                 */
                Intent intentGoPrecious2 = new Intent(getApplicationContext(), preciousActivity.class);
                startActivity(intentGoPrecious2);
                finish();

            }
        });

        /**
         * 클릭 시 동물관련 꿈 화면으로 넘어가는 버튼
         */
        Button buttonGoAnimal2 = (Button) findViewById(R.id.goAnimal2);
        buttonGoAnimal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * 클릭 시 동물관련 꿈 화면으로 넘어간다
                 */
                Intent intentGoAnimal2 = new Intent(getApplicationContext(), animalActivity.class);
                startActivity(intentGoAnimal2);
                finish();
            }
        });
    }
}
