package com.pyildizt.sony.englishword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


public void birinciseviye (View view){
    Intent intent = new Intent(getApplicationContext(), firstLevel.class);
    startActivity(intent);
}
    public void ekleme (View view){
        Intent intent = new Intent(getApplicationContext(), VeriEkle.class);
        startActivity(intent);
    }

public void ikinciSeviye (View view){

    Intent intent = new Intent(getApplicationContext(), secondLevel.class);
    startActivity(intent);

}

    public void ucuncuSeviye (View view){

        Intent intent = new Intent(getApplicationContext(), thirdLevel.class);
        startActivity(intent);

    }



}

