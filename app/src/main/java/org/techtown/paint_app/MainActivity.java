 package org.techtown.paint_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        switch(view.getId()){ // 텍스트뷰를 누를 때마다 switch - case 문으로 버튼 누를 때마다 글자 색이 toast 메세지로 출력됨
            case R.id.red:
                Toast.makeText(getApplicationContext(), "click red", Toast.LENGTH_SHORT).show();
                break;
            case R.id.orange:
                Toast.makeText(getApplicationContext(), "click orange", Toast.LENGTH_SHORT).show();
                break;
            case R.id.yellow:
                Toast.makeText(getApplicationContext(), "click yellow", Toast.LENGTH_SHORT).show();;
                break;
            case R.id.green:
                Toast.makeText(getApplicationContext(), "click green", Toast.LENGTH_SHORT).show();
                break;
            case R.id.blue:
                Toast.makeText(getApplicationContext(), "click blue", Toast.LENGTH_SHORT).show();
                break;
            case R.id.indigo:
                Toast.makeText(getApplicationContext(), "click indigo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.purple:
                Toast.makeText(getApplicationContext(), "click purple", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pink:
                Toast.makeText(getApplicationContext(), "click pink", Toast.LENGTH_SHORT).show();
                break;
            case R.id.white:
                Toast.makeText(getApplicationContext(), "click white", Toast.LENGTH_SHORT).show();
                break;
            case R.id.black:
                Toast.makeText(getApplicationContext(), "click black", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void onClickSave(View view) { // 이미지 저장 버튼 눌렀을 때 인텐트 이동
        Intent intent = new Intent(MainActivity.this, AfterSaveActivity.class);

        startActivity(intent);
    }

}