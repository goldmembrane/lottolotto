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
 * 장소 관련 꿈들에 대한 각각의 숫자를 버튼을 클릭하여 선택할 수 있다.
 * @author ByeongHyun Hwang
 * @version 1.0.1
 */
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

        /**
         * 결과 화면에 값을 전달하기 위한 인텐트 설정
         */
        final Intent intentPlace = new Intent(placeActivity.this, MainActivity.class);


        /**
        * 클릭하면 운동장에 해당하는 숫자(값)를 넘겨주는 버튼
        * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
        */
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

        /**
         * 클릭하면 지하실에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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

        /**
         * 클릭하면 장례식장에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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

        /**
         * 클릭하면 정글에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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

        /**
         * 클릭하면 공원에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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

        /**
         * 클릭하면 시장에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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

        /**
         * 클릭하면 감옥에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
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
        });

        /**
         * 클릭하면 하늘에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonSky = (Button) findViewById(R.id.sky);
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

        /**
         * 클릭하면 각각 속성에서 받은 숫자(값)를 결과 화면에 표시되도록 넘겨주는 버튼
         * 클릭 시 결과 화면으로 이동한다.
         */
        Button buttonShowResult = (Button) findViewById(R.id.result);
        buttonShowResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentPlace);
                finish();
            }
        });

        /**
         * 클릭 시 귀중품관련 꿈 화면으로 넘어가는 버튼
         */
        Button buttonGoPrecious = (Button) findViewById(R.id.goPrecious);
        buttonGoPrecious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * 클릭 시 귀중품관련 꿈 화면으로 넘어간다
                 */
                Intent intentGoPrecious = new Intent(getApplicationContext(), preciousActivity.class);
                startActivity(intentGoPrecious);
                finish();

            }
        });

        /**
         * 클릭 시 색깔관련 꿈 화면으로 넘어가는 버튼
         */
        Button buttonGoColor = (Button) findViewById(R.id.goColor);
        buttonGoColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * 클릭 시 색깔관련 꿈 화면으로 넘어간다
                 */
                Intent intentGoColor = new Intent(getApplicationContext(), colorActivity2.class);
                startActivity(intentGoColor);
                finish();

            }
        });

    }
}
