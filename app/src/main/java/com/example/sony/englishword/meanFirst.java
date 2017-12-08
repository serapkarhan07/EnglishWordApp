package com.example.sony.englishword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class meanFirst extends AppCompatActivity {


    Button ileri1;
    int sayac=0;
    TextView tv1;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    DatabaseReference oku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mean_first2);

        tv1=(TextView)findViewById(R.id.tv1);

        ileri1=(Button)findViewById(R.id.bt1);
        ileri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sayac==30)
                {
                    Toast.makeText(getApplicationContext(),"Kelimelerimiz tamamlandı", Toast.LENGTH_LONG).show();
                    sayac = 0;

                }
                ileri1.setText("Sonraki");

                sayac++;
                oku= FirebaseDatabase.getInstance().getReference().child("users").child(String.valueOf(sayac));
                ValueEventListener dinle=new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Words kelime=new Words();
                        kelime=dataSnapshot.getValue(Words.class);
                        tv1.setText(kelime.en+"\n"+kelime.tr);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                };
                oku.addValueEventListener(dinle);





            }
        });





    }
}
