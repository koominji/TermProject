package com.kmj.termproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ManageActivity extends Activity {

    ImageView tab1, tab2, tab3;
    TextView manageTab, homeTab;
    View calenderView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage);


        tab1 = (ImageView) findViewById(R.id.tab1);
        tab2 = (ImageView) findViewById(R.id.tab2);
        tab3 = (ImageView) findViewById(R.id.tab3);

        manageTab = (TextView) findViewById(R.id.manageTabBtn);
        homeTab = (TextView) findViewById(R.id.homeTabBtn);

        //산책 지수 버튼 클릭하면 날씨 정보 페이지로 연결됨
        tab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.weather.naver.com/"));
                startActivity(mIntent);
            }
        });


        //캘린더 버튼 클릭하면 캘린더 어플로 넘어감
        tab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManageActivity.this, CalenderActivity.class);
                startActivity(intent);

            }
        });


        // 전문가 상담 버튼 누르면 전문강아지 교육 사이트로 연결
        tab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bodeum.co.kr/html/edu_movie/"));
                startActivity(mIntent);
            }
        });

        // 클릭하면 Manage탭으로 넘어감
        manageTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManageActivity.this, ManageActivity.class);
                startActivity(intent);
            }
        });

        // 클릭하면 내 동물 정보 볼 수 있는 탭으로 넘어감
        homeTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManageActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });


    }
}
