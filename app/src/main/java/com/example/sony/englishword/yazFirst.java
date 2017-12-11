package com.example.sony.englishword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class yazFirst extends AppCompatActivity {

    DatabaseReference oku,okuu;
    TextView t1;
    EditText e1;
    Button b1;
    String Englih="";
    int sayac=0,id=0;
    boolean dogru=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yaz_first);


        t1=(TextView)findViewById(R.id.t1);
        e1=(EditText)findViewById(R.id.e1);
        b1=(Button)findViewById(R.id.onay);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){


                if(Englih.equals(e1.getText().toString())){
                    dogru=true;
                    e1.setText("");
                }
                if(dogru==true) {
                    sayac++;
                    oku = FirebaseDatabase.getInstance().getReference().child("users").child(String.valueOf(sayac));
                    ValueEventListener dinle = new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            Users kullanici = new Users();
                            kullanici = dataSnapshot.getValue(Users.class);
                            t1.setText(kullanici.tr);
                            Englih=kullanici.en;

                        }
                        @Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    };
                    oku.addValueEventListener(dinle);
                    dogru=false;
                }

            }
        });

    }
}
