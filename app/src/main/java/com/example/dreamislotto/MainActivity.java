package com.example.dreamislotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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


        for(Iterator<Integer> it = set.iterator() ; it.hasNext() ; )
        {
            Integer value = it.next();

            if(value == 0)
            {
                it.remove();
            }
        }



        textView.setText(String.valueOf(set));




        }
}
