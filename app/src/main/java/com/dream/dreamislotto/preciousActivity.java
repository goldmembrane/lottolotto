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
 * 시작하기 버튼을 누르면 맨 처음으로 나오는 화면
 * 귀중품 관련 꿈들에 대한 각각의 숫자를 버튼을 클릭하여 선택할 수 있다.
 * @author ByeongHyun Hwang
 * @version 1.0.1
 */
public class preciousActivity extends AppCompatActivity {

    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precious);
        MobileAds.initialize(this, "ca-app-pub-8799724102859231~7332614513");

        mAdView = findViewById(R.id.adViewPrecious);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        /**
         * 결과 화면에 값을 전달하기 위한 인텐트 설정
         */
       final Intent intentPrecious = new Intent(preciousActivity.this, MainActivity.class);

        /**
         * 클릭하면 하느님에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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
        /**
        * 클릭하면 용에 해당하는 숫자(값)를 넘겨주는 버튼
        * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
        */
        final Button buttonDragon= (Button) findViewById(R.id.dragon);
        buttonDragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(buttonDragon.isSelected()){
                    buttonDragon.setSelected(false);
                    intentPrecious.removeExtra("dragon");
                    intentPrecious.removeExtra("dragon2");
                }
                else{
                    intentPrecious.putExtra("dragon",7);
                    intentPrecious.putExtra("dragon2", 24);
                    buttonDragon.setSelected(true);
                }
            }
        });
        /**
         * 클릭하면 기도에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonPray = (Button) findViewById(R.id.pray);
        buttonPray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(buttonPray.isSelected()){
                    buttonPray.setSelected(false);
                    intentPrecious.removeExtra("pray");
                    intentPrecious.removeExtra("pray2");
                }
                else{
                    intentPrecious.putExtra("pray",5);
                    intentPrecious.putExtra("pray2", 11);
                    buttonPray.setSelected(true);
                }
            }
        });
        /**
         * 클릭하면 목사님에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonPastor = (Button) findViewById(R.id.pastor);
        buttonPastor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(buttonPastor.isSelected()){
                    buttonPastor.setSelected(false);
                    intentPrecious.removeExtra("pastor");
                }
                else{
                    intentPrecious.putExtra("pastor",21);
                    buttonPastor.setSelected(true);
                }

            }
        });
        /**
         * 클릭하면 금에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonGold = (Button) findViewById(R.id.gold);
        buttonGold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(buttonGold.isSelected()){
                    buttonGold.setSelected(false);
                    intentPrecious.removeExtra("gold");
                    intentPrecious.removeExtra("gold2");
                }
                else{
                    intentPrecious.putExtra("gold",11);
                    intentPrecious.putExtra("gold2", 12);
                    buttonGold.setSelected(true);
                }

            }
        });
        /**
         * 클릭하면 왕자에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonPrince = (Button) findViewById(R.id.prince);
        buttonPrince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(buttonPrince.isSelected()){
                    buttonPrince.setSelected(false);
                    intentPrecious.removeExtra("prince");
                    intentPrecious.removeExtra("prince2");
                }
                else{
                    intentPrecious.putExtra("prince",27);
                    intentPrecious.putExtra("prince2", 3);
                    buttonPrince.setSelected(true);
                }

            }
        });
        /**
         * 클릭하면 십자가에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonCross = (Button) findViewById(R.id.cross);
        buttonCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(buttonCross.isSelected()){
                    buttonCross.setSelected(false);
                    intentPrecious.removeExtra("cross");
                }
                else{
                    intentPrecious.putExtra("cross",10);
                    buttonCross.setSelected(true);
                }

            }
        });
        /**
         * 클릭하면 다이아몬드에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonDiamond = (Button) findViewById(R.id.diamond);
        buttonDiamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(buttonDiamond.isSelected()){
                    buttonDiamond.setSelected(false);
                    intentPrecious.removeExtra("diamond");
                    intentPrecious.removeExtra("diamond2");
                }
                else{
                    intentPrecious.putExtra("diamond2", 3);
                    intentPrecious.putExtra("diamond",28);
                    buttonDiamond.setSelected(true);
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

                startActivity(intentPrecious);
                finish();
            }
        });

        /**
        * 클릭 시 장소관련 꿈 화면으로 넘어가는 버튼
        */
        Button buttonGoPlace = (Button) findViewById(R.id.goPlace);
        buttonGoPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * 클릭 시 장소관련 꿈 화면으로 넘어간다
                 */
                Intent intentGoPlace = new Intent(getApplicationContext(), placeActivity.class);
                startActivity(intentGoPlace);
                finish();
            }
        });

        /**
         * 클릭 시 음식관련 꿈 화면으로 넘어가는 버튼
         */
        Button buttonGoFood = (Button) findViewById(R.id.goFood);
        buttonGoFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * 클릭 시 음식관련 꿈 화면으로 넘어간다
                 */
                Intent intentGoFood = new Intent(getApplicationContext(), foodActivity.class);
                startActivity(intentGoFood);
                finish();
            }
        });






    }



}
