package com.example.dreamislotto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.mainTextView);

        Bundle extras = getIntent().getExtras();
        int i = extras.getInt("god");

        String str = Integer.toString(i);
        textView.setText(str);

    }
}
