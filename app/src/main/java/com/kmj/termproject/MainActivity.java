package com.kmj.termproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView startBtn;
        startBtn = (ImageView)findViewById(R.id.startBtn);

        // >>시작하기<< 버튼을 누르면 manage 화면으로 넘어간다
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ManageActivity.class);
                startActivity(intent);
            }
        });
    }
}