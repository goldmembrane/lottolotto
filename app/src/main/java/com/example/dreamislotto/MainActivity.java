package com.example.dreamislotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        TextView textView = (TextView)findViewById(R.id.mainTextView);

        int no1 = intent.getIntExtra("god", 0);
        int no2 = intent.getIntExtra("dragon", 0);
        int no3 = intent.getIntExtra("dragon2", 0);
        int no4 = intent.getIntExtra("pray", 0);
        int no5 = intent.getIntExtra("pray2", 0);
        int no6 = intent.getIntExtra("pastor", 0);
        int no7 = intent.getIntExtra("gold", 0);
        int no8 = intent.getIntExtra("gold2", 0);
        int no9 = intent.getIntExtra("prince", 0);
        int no10 = intent.getIntExtra("prince2", 0);
        int no11 = intent.getIntExtra("cross", 0);
        int no12 = intent.getIntExtra("diamond", 0);
        int no13 = intent.getIntExtra("diamond2", 0);
        int no14 = intent.getIntExtra("playground", 0);
        int no15 = intent.getIntExtra("playground2", 0);
        int no16 = intent.getIntExtra("cellar", 0);
        int no17 = intent.getIntExtra("funeral", 0);
        int no18 = intent.getIntExtra("jungle", 0);
        int no19 = intent.getIntExtra("park", 0);
        int no20 = intent.getIntExtra("market", 0);
        int no21 = intent.getIntExtra("jail", 0);
        int no22 = intent.getIntExtra("jail2", 0);
        int no23 = intent.getIntExtra("jail3", 0);
        int no24 = intent.getIntExtra("sky", 0);
        int no25 = intent.getIntExtra("sky2", 0);
        int no26 = intent.getIntExtra("red", 0);
        int no27 = intent.getIntExtra("yellow", 0);
        int no28 = intent.getIntExtra("black", 0);
        int no29 = intent.getIntExtra("black2", 0);
        int no30 = intent.getIntExtra("black3", 0);
        int no31 = intent.getIntExtra("black4", 0);
        int no32 = intent.getIntExtra("blue", 0);
        int no33 = intent.getIntExtra("blue2", 0);
        int no34 = intent.getIntExtra("silver", 0);
        int no35 = intent.getIntExtra("white", 0);
        int no36 = intent.getIntExtra("white2", 0);
        int no37 = intent.getIntExtra("green", 0);
        int no38 = intent.getIntExtra("purple", 0);
        int no39 = intent.getIntExtra("tofu", 0);
        int no40 = intent.getIntExtra("tofu2", 0);
        int no41 = intent.getIntExtra("banana", 0);
        int no42 = intent.getIntExtra("coffee", 0);
        int no43 = intent.getIntExtra("egg", 0);
        int no44 = intent.getIntExtra("egg2", 0);
        int no45 = intent.getIntExtra("garlic", 0);
        int no46 = intent.getIntExtra("orange", 0);
        int no47 = intent.getIntExtra("orange2", 0);
        int no48 = intent.getIntExtra("orange3", 0);
        int no49 = intent.getIntExtra("peach", 0);
        int no50 = intent.getIntExtra("chicken", 0);
        int no51 = intent.getIntExtra("chicken2", 0);
        int no52 = intent.getIntExtra("tiger", 0);
        int no53 = intent.getIntExtra("tiger2", 0);
        int no54 = intent.getIntExtra("snake", 0);
        int no55 = intent.getIntExtra("snake2", 0);
        int no56 = intent.getIntExtra("monkey", 0);
        int no57 = intent.getIntExtra("monkey2", 0);
        int no58 = intent.getIntExtra("pig", 0);
        int no59 = intent.getIntExtra("pig2", 0);
        int no60 = intent.getIntExtra("bear", 0);
        int no61 = intent.getIntExtra("bear2", 0);
        int no62 = intent.getIntExtra("bear3", 0);
        int no63 = intent.getIntExtra("owl", 0);
        int no64 = intent.getIntExtra("turkey", 0);
        int no65 = intent.getIntExtra("turkey2", 0);
        int no66 = intent.getIntExtra("pigeon", 0);







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




        for(Iterator<Integer> it = set.iterator() ; it.hasNext() ; )
        {
            Integer value = it.next();

            if(value == 0)
            {
                it.remove();
            }
        }



        textView.setText(String.valueOf(set));


        Button buttonGoBack = (Button) findViewById(R.id.goBack);
        buttonGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoBack = new Intent(getApplicationContext(), preciousActivity.class);

                startActivity(intentGoBack);
            }
        });



        }
}
