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
 * 동물 관련 꿈들에 대한 각각의 숫자를 버튼을 클릭하여 선택할 수 있다.
 * @author ByeongHyun Hwang
 * @version 1.0.1
 */
public class animalActivity extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        MobileAds.initialize(this, "ca-app-pub-8799724102859231~7332614513");

        /**
         * 결과 화면에 값을 전달하기 위한 인텐트 설정
         */
        final Intent intentAnimal = new Intent(animalActivity.this, MainActivity.class);

        mAdView = findViewById(R.id.adViewAnimal);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        /**
         * 클릭하면 호랑이에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonTiger = (Button) findViewById(R.id.Tiger);
        buttonTiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonTiger.isSelected()){
                    buttonTiger.setSelected(false);
                    intentAnimal.removeExtra("tiger");
                    intentAnimal.removeExtra("tiger2");
                }else{
                    intentAnimal.putExtra("tiger", 3);
                    intentAnimal.putExtra("tiger2", 13);
                    buttonTiger.setSelected(true);
                }
            }
        });

        /**
         * 클릭하면 뱀에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonSnake = (Button) findViewById(R.id.snake);
        buttonSnake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonSnake.isSelected()){
                    buttonSnake.setSelected(false);
                    intentAnimal.removeExtra("snake");
                    intentAnimal.removeExtra("snake2");
                }else{
                    intentAnimal.putExtra("snake", 4);
                    intentAnimal.putExtra("snake2", 10);
                    buttonSnake.setSelected(true);
                }
            }
        });

        /**
         * 클릭하면 원숭이에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonMonkey = (Button) findViewById(R.id.monkey);
        buttonMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonMonkey.isSelected()){
                    buttonMonkey.setSelected(false);
                    intentAnimal.removeExtra("monkey");
                    intentAnimal.removeExtra("monkey2");
                }else{
                    intentAnimal.putExtra("monkey", 9);
                    intentAnimal.putExtra("monkey2", 39);
                    buttonMonkey.setSelected(true);
                }
            }
        });

        /**
         * 클릭하면 돼지에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonPig = (Button) findViewById(R.id.pig);
        buttonPig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonPig.isSelected()){
                    buttonPig.setSelected(false);
                    intentAnimal.removeExtra("pig");
                    intentAnimal.removeExtra("pig2");
                }else{
                    intentAnimal.putExtra("pig", 8);
                    intentAnimal.putExtra("pig2", 12);
                    buttonPig.setSelected(true);
                }
            }
        });

        /**
         * 클릭하면 곰에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonBear = (Button) findViewById(R.id.bear);
        buttonBear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonBear.isSelected()){
                    buttonBear.setSelected(false);
                    intentAnimal.removeExtra("bear");
                    intentAnimal.removeExtra("bear2");
                    intentAnimal.removeExtra("bear3");
                }else{
                    intentAnimal.putExtra("bear", 1);
                    intentAnimal.putExtra("bear2", 8);
                    intentAnimal.putExtra("bear3", 16);
                    buttonBear.setSelected(true);
                }
            }
        });

        /**
         * 클릭하면 부엉이에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonOwl = (Button) findViewById(R.id.owl);
        buttonOwl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonOwl.isSelected()){
                    buttonOwl.setSelected(false);
                    intentAnimal.removeExtra("owl");
                }else{
                    intentAnimal.putExtra("owl", 37);
                    buttonOwl.setSelected(true);
                }
            }
        });

        /**
         * 클릭하면 칠면조에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonTurkey = (Button) findViewById(R.id.turkey);
        buttonTurkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonTurkey.isSelected()){
                    buttonTurkey.setSelected(false);
                    intentAnimal.removeExtra("turkey");
                    intentAnimal.removeExtra("turkey2");
                }else{
                    intentAnimal.putExtra("turkey", 7);
                    intentAnimal.putExtra("turkey2", 26);
                    buttonTurkey.setSelected(true);
                }
            }
        });

        /**
         * 클릭하면 비둘기에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonPigeon = (Button) findViewById(R.id.pigeon);
        buttonPigeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonPigeon.isSelected()){
                    buttonPigeon.setSelected(false);
                    intentAnimal.removeExtra("pigeon");
                }else{
                    intentAnimal.putExtra("pigeon", 9);
                    buttonPigeon.setSelected(true);
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
                startActivity(intentAnimal);
                finish();
            }
        });

        /**
         * 클릭 시 색깔관련 꿈 화면으로 넘어가는 버튼
         */
        Button buttonGoColor2 = (Button) findViewById(R.id.goColor2);
        buttonGoColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * 클릭 시 색깔관련 꿈 화면으로 넘어간다
                 */
                Intent intentGoColor2 = new Intent(getApplicationContext(), colorActivity2.class);
                startActivity(intentGoColor2);
                finish();

            }
        });

        /**
         * 클릭 시 음식관련 꿈 화면으로 넘어가는 버튼
         */
        Button buttonGoFood2 = (Button) findViewById(R.id.goFood2);
        buttonGoFood2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * 클릭 시 음식관련 꿈 화면으로 넘어간다
                 */
                Intent intentGoFood2 = new Intent(getApplicationContext(), foodActivity.class);
                startActivity(intentGoFood2);
                finish();

            }
        });

    }
}
