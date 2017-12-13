package com.pyildizt.sony.englishword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class thirdLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_level);
    }

    public void anlam (View view) {
        Intent intent = new Intent(getApplicationContext(), meanThird.class);
        startActivity(intent);
    }

    public void yaz (View view) {
        Intent intent = new Intent(getApplicationContext(), yazThird.class);
        startActivity(intent);
    }

    public void test (View view) {
        Intent intent = new Intent(getApplicationContext(), testThird.class);
        startActivity(intent);
    }




}
