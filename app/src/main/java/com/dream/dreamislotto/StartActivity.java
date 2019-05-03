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
 *  액티비티 중 첫번째로 보여지는 화면으로 앱의 시작을 알리는 액티비티
 * @author ByeongHyun Hwang
 * @version 1.0.1
 */


public class StartActivity extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_start);
        MobileAds.initialize(this, "ca-app-pub-8799724102859231~7332614513");
        mAdView = findViewById(R.id.adViewStart);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
/**
 * preciousActivity로 이동하게 하여 본격적으로 앱을 시작하게 하는 버튼
 */
      Button button = (Button) findViewById(R.id.startBtn);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              /**
               * 클릭 시 귀중품관련 꿈 화면으로 넘어간다.
               */
              Intent intent = new Intent(getApplicationContext(),preciousActivity.class);
              startActivity(intent);
              finish();
          }
      });



    }


}
