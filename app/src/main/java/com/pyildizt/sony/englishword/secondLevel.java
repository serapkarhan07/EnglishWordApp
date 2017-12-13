package com.pyildizt.sony.englishword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secondLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_level);
    }

    public void anlam (View view) {
        Intent intent = new Intent(getApplicationContext(), meanSecond.class);
        startActivity(intent);
    }

    public void yaz (View view) {
        Intent intent = new Intent(getApplicationContext(), yazSecond.class);
        startActivity(intent);
    }

    public void test (View view) {
        Intent intent = new Intent(getApplicationContext(), testSecond.class);
        startActivity(intent);
    }



}
