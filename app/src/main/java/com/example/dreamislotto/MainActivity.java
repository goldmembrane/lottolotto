package com.example.dreamislotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
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
        int no3 = intent.getIntExtra("pray", 0);
        int no4 = intent.getIntExtra("pastor", 0);
        int no5 = intent.getIntExtra("gold", 0);
        int no6 = intent.getIntExtra("prince", 0);
        int no7 = intent.getIntExtra("cross", 0);
        int no8 = intent.getIntExtra("diamond", 0);

        Set<Integer> set = new HashSet<>();
        set.add(no1);
        set.add(no2);
        set.add(no3);
        set.add(no4);
        set.add(no5);
        set.add(no6);
        set.add(no7);
        set.add(no8);



        textView.setText(String.valueOf(set));




        }
}
