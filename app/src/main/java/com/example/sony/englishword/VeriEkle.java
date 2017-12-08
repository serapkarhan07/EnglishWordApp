package com.example.sony.englishword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class VeriEkle extends AppCompatActivity {
    EditText tr,en;
    int id=31;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();


    private void writeNewWord(int wordId, String turkce, String english) {
        Words word = new Words(turkce,english);

        myRef.child("users").child(String.valueOf(wordId)).setValue(word);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veri_ekle);
        Button ek=(Button)findViewById(R.id.eklee);
       tr=(EditText)findViewById(R.id.tr);
        en=(EditText)findViewById(R.id.en);

        ek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id++;
                String EngVeriTabani=en.getText().toString();
                String TurkVeriTabani=tr.getText().toString();
                writeNewWord(id,EngVeriTabani,TurkVeriTabani);
            }
        });
    }
}
