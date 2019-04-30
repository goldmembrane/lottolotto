package com.example.dreamislotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class animalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        Button button = (Button) findViewById(R.id.bear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(animalActivity.this, MainActivity.class);
                intent.putExtra("bear", 1);
                intent.putExtra("bear", 8);
                intent.putExtra("bear", 16);

                startActivity(intent);
            }
        });
    }
}
