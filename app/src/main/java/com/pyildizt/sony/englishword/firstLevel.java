package com.pyildizt.sony.englishword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class firstLevel extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_level);
        String a;

    }

    public void meanfirst (View view) {
        Intent intent = new Intent(getApplicationContext(), meanFirst.class);
        startActivity(intent);
    }

    public void yaz (View view) {
        Intent intent = new Intent(getApplicationContext(), yazFirst.class);
        startActivity(intent);
    }

    public void test (View view) {
        Intent intent = new Intent(getApplicationContext(), testFirst.class);
        startActivity(intent);
    }
}
