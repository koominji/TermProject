package com.kmj.termproject;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalenderActivity extends AppCompatActivity {

    LinearLayout calenderLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender);
        calenderLayout = (LinearLayout)findViewById(R.id.calenderLayout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemRed:
                calenderLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemGreen:
                calenderLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.itemYellow:
                calenderLayout.setBackgroundColor(Color.YELLOW);
                return true;

        }
        return false;
    }
}
