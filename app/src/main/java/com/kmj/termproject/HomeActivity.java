package com.kmj.termproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class HomeActivity extends Activity {

    View dialogView;
    ImageView registerBtn, petImage,nameTag;
    TextView petName, petAge;
    EditText dlgPetName, dlgPetAge;
    RadioGroup RG1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        petAge = (TextView) findViewById(R.id.petAge);
        petName = (TextView) findViewById(R.id.petName);
        petImage = (ImageView) findViewById(R.id.petImage);
        nameTag =(ImageView)findViewById(R.id.nameTag);

        RG1 = (RadioGroup) findViewById(R.id.RG1);

        registerBtn = (ImageView) findViewById(R.id.registerBtn);



        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialogView = (View) View.inflate(HomeActivity.this, R.layout.dialog, null);

                AlertDialog.Builder dlg = new AlertDialog.Builder(HomeActivity.this);
                dlg.setView(dialogView);


                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        // 반려동물 이름, 나이 변수에 대입
                        dlgPetAge = (EditText) dialogView.findViewById(R.id.dlgAge);
                        dlgPetName = (EditText) dialogView.findViewById(R.id.dlgName);

                        //보이도록 visibility 바꾸기
                        petName.setVisibility(View.VISIBLE);
                        petAge.setVisibility(View.VISIBLE);
                        nameTag.setVisibility(View.VISIBLE);

                        petName.setText("♥ 이름 "+dlgPetName.getText().toString());
                        petAge.setText("♥ 나이 "+dlgPetAge.getText().toString()+"살");



                    }
                });

                dlg.show();


            }
        });

    }
}
