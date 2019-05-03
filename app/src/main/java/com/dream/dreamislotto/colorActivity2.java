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
 * 색깔 관련 꿈들에 대한 각각의 숫자를 버튼을 클릭하여 선택할 수 있다.
 * @author ByeongHyun Hwang
 * @version 1.0.1
 */
public class colorActivity2 extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color2);
        MobileAds.initialize(this, "ca-app-pub-8799724102859231~7332614513");

        mAdView = findViewById(R.id.adViewColor);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        /**
         * 결과 화면에 값을 전달하기 위한 인텐트 설정
         */
        final Intent intentColor = new Intent(colorActivity2.this, MainActivity.class);

        /**
         * 클릭하면 붉은색에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonRed = (Button) findViewById(R.id.red);
        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonRed.isSelected()){
                    buttonRed.setSelected(false);
                    intentColor.removeExtra("red");
                }else{
                    intentColor.putExtra("red", 1);
                    buttonRed.setSelected(true);
                }
            }
        });

        /**
         * 클릭하면 노란색에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonYellow = (Button) findViewById(R.id.yellow);
        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonYellow.isSelected()){
                    buttonYellow.setSelected(false);
                    intentColor.removeExtra("yellow");
                }else{
                    intentColor.putExtra("yellow", 3);
                    buttonYellow.setSelected(true);
                }
            }
        });

        /**
         * 클릭하면 검은색에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonBlack = (Button) findViewById(R.id.black);
        buttonBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonBlack.isSelected()){
                    buttonBlack.setSelected(false);
                    intentColor.removeExtra("black");
                    intentColor.removeExtra("black2");
                    intentColor.removeExtra("black3");
                    intentColor.removeExtra("black4");
                }else{
                    intentColor.putExtra("black", 8);
                    intentColor.putExtra("black2", 9);
                    intentColor.putExtra("black3", 32);
                    intentColor.putExtra("black4", 33);
                    buttonBlack.setSelected(true);
                }
            }
        });

        /**
         * 클릭하면 파란색에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonBlue = (Button) findViewById(R.id.blue);
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonBlue.isSelected()){
                    buttonBlue.setSelected(false);
                    intentColor.removeExtra("blue");
                    intentColor.removeExtra("blue2");
                }else{
                    intentColor.putExtra("blue", 5);
                    intentColor.putExtra("blue2", 32);
                    buttonBlue.setSelected(true);
                }
            }
        });

        /**
         * 클릭하면 은색에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonSilver = (Button) findViewById(R.id.silver);
        buttonSilver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonSilver.isSelected()){
                    buttonSilver.setSelected(false);
                    intentColor.removeExtra("silver");
                }else{
                    intentColor.putExtra("silver", 17);
                    buttonSilver.setSelected(true);
                }
            }
        });

        /**
         * 클릭하면 흰색에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonWhite = (Button) findViewById(R.id.white);
        buttonWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonWhite.isSelected()){
                    buttonWhite.setSelected(false);
                    intentColor.removeExtra("white");
                    intentColor.removeExtra("white2");
                }else{
                    intentColor.putExtra("white", 38);
                    intentColor.putExtra("white2", 39);
                    buttonWhite.setSelected(true);
                }
            }
        });

        /**
         * 클릭하면 녹색에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonGreen = (Button) findViewById(R.id.green);
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonGreen.isSelected()){
                    buttonGreen.setSelected(false);
                    intentColor.removeExtra("green");
                }else{
                    intentColor.putExtra("green", 4);
                    buttonGreen.setSelected(true);
                }
            }
        });

        /**
         * 클릭하면 보라색에 해당하는 숫자(값)를 넘겨주는 버튼
         * 눌린 상태에서 한번 더 클릭하면 해제되면서 넘겨줄 숫자(값)를 지운다.
         */
        final Button buttonPurple = (Button) findViewById(R.id.purple);
        buttonPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonPurple.isSelected()){
                    buttonPurple.setSelected(false);
                    intentColor.removeExtra("purple");
                }else{
                    intentColor.putExtra("purple", 7);
                    buttonPurple.setSelected(true);
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
                startActivity(intentColor);
                finish();
            }
        });

        /**
         * 클릭 시 장소관련 꿈 화면으로 넘어가는 버튼
         */
        Button buttonGoPlace2 = (Button) findViewById(R.id.goPlace2);
        buttonGoPlace2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * 클릭 시 장소관련 꿈 화면으로 넘어간다
                 */
                Intent intentGoPlace2 = new Intent(getApplicationContext(), placeActivity.class);
                startActivity(intentGoPlace2);
                finish();

            }
        });

        /**
         * 클릭 시 동물관련 꿈 화면으로 넘어가는 버튼
         */
        Button buttonGoAnimal = (Button) findViewById(R.id.goAnimal);
        buttonGoAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * 클릭 시 동물관련 꿈 화면으로 넘어간다
                 */
                Intent intentGoAnimal = new Intent(getApplicationContext(), animalActivity.class);
                startActivity(intentGoAnimal);
                finish();

            }
        });
    }
}
