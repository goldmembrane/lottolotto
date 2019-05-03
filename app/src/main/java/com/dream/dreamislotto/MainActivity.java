package com.dream.dreamislotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * 각각의 꿈들에 대해 넘어온 숫자(값)를 결과 창에 표시하는 화면(액티비티)이다.
 * @author ByeongHyun Hwang
 * @version 1.0.1
 */

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, "ca-app-pub-8799724102859231~7332614513");

        mAdView = findViewById(R.id.adViewMain);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        /**
         * 각각 화면에서 넘어온 숫자(값)을 받는 도구이다.
         */
        Intent intentPrecious = getIntent();
        Intent intentPlace = getIntent();
        Intent intentColor = getIntent();
        Intent intentFood = getIntent();
        Intent intentAnimal = getIntent();

        /**
         * 받아온 숫자들을 표시하는 TextView이다.
         */
        TextView textView = (TextView)findViewById(R.id.mainTextView);

        int no1 = intentPrecious.getIntExtra("god", 0);
        int no2 = intentPrecious.getIntExtra("dragon", 0);
        int no3 = intentPrecious.getIntExtra("dragon2", 0);
        int no4 = intentPrecious.getIntExtra("pray", 0);
        int no5 = intentPrecious.getIntExtra("pray2", 0);
        int no6 = intentPrecious.getIntExtra("pastor", 0);
        int no7 = intentPrecious.getIntExtra("gold", 0);
        int no8 = intentPrecious.getIntExtra("gold2", 0);
        int no9 = intentPrecious.getIntExtra("prince", 0);
        int no10 = intentPrecious.getIntExtra("prince2", 0);
        int no11 = intentPrecious.getIntExtra("cross", 0);
        int no12 = intentPrecious.getIntExtra("diamond", 0);
        int no13 = intentPrecious.getIntExtra("diamond2", 0);
        int no14 = intentPlace.getIntExtra("playground", 0);
        int no15 = intentPlace.getIntExtra("playground2", 0);
        int no16 = intentPlace.getIntExtra("cellar", 0);
        int no17 = intentPlace.getIntExtra("funeral", 0);
        int no18 = intentPlace.getIntExtra("jungle", 0);
        int no19 = intentPlace.getIntExtra("park", 0);
        int no20 = intentPlace.getIntExtra("market", 0);
        int no21 = intentPlace.getIntExtra("jail", 0);
        int no22 = intentPlace.getIntExtra("jail2", 0);
        int no23 = intentPlace.getIntExtra("jail3", 0);
        int no24 = intentPlace.getIntExtra("sky", 0);
        int no25 = intentPlace.getIntExtra("sky2", 0);
        int no26 = intentColor.getIntExtra("red", 0);
        int no27 = intentColor.getIntExtra("yellow", 0);
        int no28 = intentColor.getIntExtra("black", 0);
        int no29 = intentColor.getIntExtra("black2", 0);
        int no30 = intentColor.getIntExtra("black3", 0);
        int no31 = intentColor.getIntExtra("black4", 0);
        int no32 = intentColor.getIntExtra("blue", 0);
        int no33 = intentColor.getIntExtra("blue2", 0);
        int no34 = intentColor.getIntExtra("silver", 0);
        int no35 = intentColor.getIntExtra("white", 0);
        int no36 = intentColor.getIntExtra("white2", 0);
        int no37 = intentColor.getIntExtra("green", 0);
        int no38 = intentColor.getIntExtra("purple", 0);
        int no39 = intentFood.getIntExtra("tofu", 0);
        int no40 = intentFood.getIntExtra("tofu2", 0);
        int no41 = intentFood.getIntExtra("banana", 0);
        int no42 = intentFood.getIntExtra("coffee", 0);
        int no43 = intentFood.getIntExtra("egg", 0);
        int no44 = intentFood.getIntExtra("egg2", 0);
        int no45 = intentFood.getIntExtra("garlic", 0);
        int no46 = intentFood.getIntExtra("orange", 0);
        int no47 = intentFood.getIntExtra("orange2", 0);
        int no48 = intentFood.getIntExtra("orange3", 0);
        int no49 = intentFood.getIntExtra("peach", 0);
        int no50 = intentFood.getIntExtra("chicken", 0);
        int no51 = intentFood.getIntExtra("chicken2", 0);
        int no52 = intentAnimal.getIntExtra("tiger", 0);
        int no53 = intentAnimal.getIntExtra("tiger2", 0);
        int no54 = intentAnimal.getIntExtra("snake", 0);
        int no55 = intentAnimal.getIntExtra("snake2", 0);
        int no56 = intentAnimal.getIntExtra("monkey", 0);
        int no57 = intentAnimal.getIntExtra("monkey2", 0);
        int no58 = intentAnimal.getIntExtra("pig", 0);
        int no59 = intentAnimal.getIntExtra("pig2", 0);
        int no60 = intentAnimal.getIntExtra("bear", 0);
        int no61 = intentAnimal.getIntExtra("bear2", 0);
        int no62 = intentAnimal.getIntExtra("bear3", 0);
        int no63 = intentAnimal.getIntExtra("owl", 0);
        int no64 = intentAnimal.getIntExtra("turkey", 0);
        int no65 = intentAnimal.getIntExtra("turkey2", 0);
        int no66 = intentAnimal.getIntExtra("pigeon", 0);


        /**
         * 중복된 값들을 0 하나만 남기고 모두 제거한다.
         */
        Set<Integer> set = new HashSet<>();
        set.add(no1);
        set.add(no2);
        set.add(no3);
        set.add(no4);
        set.add(no5);
        set.add(no6);
        set.add(no7);
        set.add(no8);
        set.add(no9);
        set.add(no10);
        set.add(no11);
        set.add(no12);
        set.add(no13);
        set.add(no14);
        set.add(no15);
        set.add(no16);
        set.add(no17);
        set.add(no18);
        set.add(no19);
        set.add(no20);
        set.add(no21);
        set.add(no22);
        set.add(no23);
        set.add(no24);
        set.add(no25);
        set.add(no26);
        set.add(no27);
        set.add(no28);
        set.add(no29);
        set.add(no30);
        set.add(no31);
        set.add(no32);
        set.add(no33);
        set.add(no34);
        set.add(no35);
        set.add(no36);
        set.add(no37);
        set.add(no38);
        set.add(no39);
        set.add(no40);
        set.add(no41);
        set.add(no42);
        set.add(no43);
        set.add(no44);
        set.add(no45);
        set.add(no46);
        set.add(no47);
        set.add(no48);
        set.add(no49);
        set.add(no50);
        set.add(no51);
        set.add(no52);
        set.add(no53);
        set.add(no54);
        set.add(no55);
        set.add(no56);
        set.add(no57);
        set.add(no58);
        set.add(no59);
        set.add(no60);
        set.add(no61);
        set.add(no62);
        set.add(no63);
        set.add(no64);
        set.add(no65);
        set.add(no66);

        /**
         * 선택 안되서 불필요하게 넘어온 0값을 제거한다.
         */
        for(Iterator<Integer> it = set.iterator() ; it.hasNext() ; )
        {
            Integer value = it.next();

            if(value == 0)
            {
                it.remove();
            }
        }

        /**
         * textView에 위에서 일련의 처리과정을 마친 숫자들을 표시한다.
         */
        textView.setText(String.valueOf(set));

        /**
         * 다시 하고 싶으면 귀중품 화면으로 돌아가게 만드는 버튼이다.
         */
        Button buttonGoBack = (Button) findViewById(R.id.goBack);
        buttonGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * 클릭 시 귀중품관련 꿈 화면으로 돌아간다.
                 */
                Intent intentGoBack = new Intent(getApplicationContext(), preciousActivity.class);
                startActivity(intentGoBack);
                finish();
            }
        });



        }
}
