package org.techtown.paint_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSave(View view) { // 이미지 저장 버튼 눌렀을 때 인텐트 이동
        Intent intent = new Intent(MainActivity.this, AfterSaveActivity.class);

        startActivity(intent);
    }

}