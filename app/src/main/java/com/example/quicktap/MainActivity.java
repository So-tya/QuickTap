package com.example.quicktap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.title);

        ((Button)findViewById(R.id.start)).setOnClickListener(this);
        ((Button)findViewById(R.id.score)).setOnClickListener(this);


    }

    private static final int START_GAME_BUTTON_ID = R.id.start;
    private static final int VIEW_HIGH_SCORE_BUTTON_ID = R.id.score;

    @Override
    public void onClick(View view){
        if (view.getId() == START_GAME_BUTTON_ID){
            title.setText("Hello World");
        }else if(view.getId() == VIEW_HIGH_SCORE_BUTTON_ID){
            title.setText("Hello");
        }
    }
}