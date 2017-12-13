package com.pyildizt.sony.englishword;

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

public class meanThird extends AppCompatActivity {

    Button ileri3;
    int sayac1=60;
    TextView tv3;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    DatabaseReference oku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mean_third);

        tv3=(TextView)findViewById(R.id.tv3);

        ileri3=(Button)findViewById(R.id.ileri3);
        ileri3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(sayac1==90)
                {
                    Toast.makeText(getApplicationContext(),"Kelimelerimiz tamamlandı", Toast.LENGTH_LONG).show();
                    sayac1 = 60;

                }
                ileri3.setText("Sonraki");

                sayac1++;
                oku= FirebaseDatabase.getInstance().getReference().child("users").child(String.valueOf(sayac1));
                ValueEventListener dinle=new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Words kelime=new Words();
                        kelime=dataSnapshot.getValue(Words.class);
                        tv3.setText(kelime.en+"\n"+kelime.tr);
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
