package com.pyildizt.sony.englishword;

import android.content.Intent;
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

import java.util.Random;

public class testFirst extends AppCompatActivity {
    Boolean dogru=true;
    int sayac=0,dongu,sayac1=1,rasgele=0,deneme=0,sinir=2,Bitis=0;
    DatabaseReference oku;
    String kelime,kelimeK,kelimeK1,kelimeK2,kelimeK3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_first);
        final Button tst1=(Button)findViewById(R.id.test1);
        final Button tst2=(Button)findViewById(R.id.test2);
        final Button tst3=(Button)findViewById(R.id.test3);
        final Button tst4=(Button)findViewById(R.id.test4);
        final TextView txt= (TextView)findViewById(R.id.testview);

        for (dongu=1;dongu<5;dongu++) {
            oku = FirebaseDatabase.getInstance().getReference().child("users").child(String.valueOf(dongu));
            ValueEventListener dinle = new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Words kullanici = new Words();
                    kullanici = dataSnapshot.getValue(Words.class);
                    kelime=kullanici.en;
                    sayac++;
                    if(sayac==1) {
                        txt.setText(kullanici.tr);
                        tst1.setText(kelime);
                        kelimeK=kullanici.tr;
                    }
                    if(sayac==2)
                    {
                        tst2.setText(kelime);
                        kelimeK1=kullanici.tr;
                    }
                    if(sayac==3)
                    {
                        tst3.setText(kelime);
                        kelimeK2=kullanici.tr;
                    }
                    if(sayac==4)
                    {
                        tst4.setText(kelime);
                        kelimeK3=kullanici.tr;
                    }
                }
                @Override
                public void onCancelled(DatabaseError databaseError) {
                }
            };
            oku.addValueEventListener(dinle);

        }
        tst1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Bitis > 10){
                    Intent ıntent = new Intent(testFirst.this, MainActivity.class);
                    startActivity(ıntent);
                }
                if(kelimeK.equals(txt.getText().toString()))
                {
                    Bitis++;
                    deneme++;
                    final Random r=new Random(); //random sınıfı
                    int a=r.nextInt(4)+1;
                    rasgele=a;//random sayı.
                    sayac=0;//ifler için kullanılıyor
                    Toast.makeText(getApplicationContext(),"True", Toast.LENGTH_LONG).show();
                    sayac1++;//Sayac ilk olarak burada 1
                    for (dongu=sayac1;dongu<=6+sayac1;dongu+=2) {
                        oku = FirebaseDatabase.getInstance().getReference().child("users").child(String.valueOf(dongu));
                        ValueEventListener dinle = new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                Words kullanici = new Words();
                                kullanici = dataSnapshot.getValue(Words.class);
                                kelime=kullanici.en;
                                sayac++;//İflerin için kullanılıyor
                                if(sayac==1) {
                                    txt.setText(kullanici.tr);
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }
                                if(sayac==2)
                                {
                                    rasgele++;
                                    if(rasgele>4)
                                        rasgele=1;
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }
                                if(sayac==3)
                                {
                                    rasgele++;
                                    if(rasgele>4)
                                        rasgele=1;
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }
                                if(sayac==4)
                                {
                                    rasgele++;
                                    if(rasgele>4)
                                        rasgele=1;
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }




                            }
                            @Override
                            public void onCancelled(DatabaseError databaseError) {
                            }
                        };
                        oku.addValueEventListener(dinle);
                    }}else {
                    Toast.makeText(getApplicationContext(),"False", Toast.LENGTH_LONG).show();
                }
                sinir+=2;
            }
        });
        tst2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Bitis>10)
                {
                    Intent ıntent=new Intent(testFirst.this,MainActivity.class);
                    startActivity(ıntent);
                }
                if(kelimeK1.equals(txt.getText().toString()))
                {
                    Bitis++;

                    deneme++;
                    final Random r=new Random(); //random sınıfı
                    int a=r.nextInt(4)+1;
                    rasgele=a;//random sayı.
                    sayac=0;//ifler için kullanılıyor
                    Toast.makeText(getApplicationContext(),"True", Toast.LENGTH_LONG).show();
                    sayac1++;//Sayac ilk olarak burada 1
                    for (dongu=sayac1;dongu<=6+sayac1;dongu+=2) {
                        oku = FirebaseDatabase.getInstance().getReference().child("users").child(String.valueOf(dongu));
                        ValueEventListener dinle = new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                Words kullanici = new Words();
                                kullanici = dataSnapshot.getValue(Words.class);
                                kelime=kullanici.en;
                                sayac++;//İflerin için kullanılıyor
                                if(sayac==1) {
                                    txt.setText(kullanici.tr);
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }
                                if(sayac==2)
                                {
                                    rasgele++;
                                    if(rasgele>4)
                                        rasgele=1;
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }
                                if(sayac==3)
                                {
                                    rasgele++;
                                    if(rasgele>4)
                                        rasgele=1;
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }
                                if(sayac==4)
                                {
                                    rasgele++;
                                    if(rasgele>4)
                                        rasgele=1;
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }




                            }
                            @Override
                            public void onCancelled(DatabaseError databaseError) {
                            }
                        };
                        oku.addValueEventListener(dinle);
                    }}else {
                    Toast.makeText(getApplicationContext(),"False", Toast.LENGTH_LONG).show();
                }
                sinir+=2;
            }


        });
        tst3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Bitis>10)
                {
                    Intent ıntent=new Intent(testFirst.this,MainActivity.class);
                    startActivity(ıntent);
                }
                if(kelimeK2.equals(txt.getText().toString()))
                {
                    Bitis++;

                    deneme++;
                    final Random r=new Random(); //random sınıfı
                    int a=r.nextInt(4)+1;
                    rasgele=a;//random sayı.
                    sayac=0;//ifler için kullanılıyor
                    Toast.makeText(getApplicationContext(),"True", Toast.LENGTH_LONG).show();
                    sayac1++;//Sayac ilk olarak burada 1
                    for (dongu=sayac1;dongu<=6+sayac1;dongu+=2) {
                        oku = FirebaseDatabase.getInstance().getReference().child("users").child(String.valueOf(dongu));
                        ValueEventListener dinle = new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                Words kullanici = new Words();
                                kullanici = dataSnapshot.getValue(Words.class);
                                kelime=kullanici.en;
                                sayac++;//İflerin için kullanılıyor
                                if(sayac==1) {
                                    txt.setText(kullanici.tr);
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }
                                if(sayac==2)
                                {
                                    rasgele++;
                                    if(rasgele>4)
                                        rasgele=1;
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }
                                if(sayac==3)
                                {
                                    rasgele++;
                                    if(rasgele>4)
                                        rasgele=1;
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }
                                if(sayac==4)
                                {
                                    rasgele++;
                                    if(rasgele>4)
                                        rasgele=1;
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }




                            }
                            @Override
                            public void onCancelled(DatabaseError databaseError) {
                            }
                        };
                        oku.addValueEventListener(dinle);
                    }}else {
                    Toast.makeText(getApplicationContext(),"False", Toast.LENGTH_LONG).show();
                }
                sinir+=2;
            }
        });
        tst4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Bitis>10)
                {
                    Intent ıntent=new Intent(testFirst.this,MainActivity.class);
                    startActivity(ıntent);
                }
                if(kelimeK3.equals(txt.getText().toString()))
                {
                    Bitis++;

                    deneme++;
                    final Random r=new Random(); //random sınıfı
                    int a=r.nextInt(4)+1;
                    rasgele=a;//random sayı.
                    sayac=0;//ifler için kullanılıyor
                    Toast.makeText(getApplicationContext(),"True", Toast.LENGTH_LONG).show();
                    sayac1++;//Sayac ilk olarak burada 1
                    for (dongu=sayac1;dongu<=6+sayac1;dongu+=2) {
                        oku = FirebaseDatabase.getInstance().getReference().child("users").child(String.valueOf(dongu));
                        ValueEventListener dinle = new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                Words kullanici = new Words();
                                kullanici = dataSnapshot.getValue(Words.class);
                                kelime=kullanici.en;
                                sayac++;//İflerin için kullanılıyor
                                if(sayac==1) {
                                    txt.setText(kullanici.tr);
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }
                                if(sayac==2)
                                {
                                    rasgele++;
                                    if(rasgele>4)
                                        rasgele=1;
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }
                                if(sayac==3)
                                {
                                    rasgele++;
                                    if(rasgele>4)
                                        rasgele=1;
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }
                                if(sayac==4)
                                {
                                    rasgele++;
                                    if(rasgele>4)
                                        rasgele=1;
                                    if(rasgele==1)
                                    {
                                        tst1.setText(kelime);
                                        kelimeK=kullanici.tr;
                                    }
                                    if(rasgele==2)
                                    {
                                        tst2.setText(kelime);
                                        kelimeK1=kullanici.tr;
                                    }
                                    if(rasgele==3)
                                    {
                                        tst3.setText(kelime);
                                        kelimeK2=kullanici.tr;
                                    }
                                    if(rasgele==4)
                                    {
                                        tst4.setText(kelime);
                                        kelimeK3=kullanici.tr;
                                    }
                                }




                            }
                            @Override
                            public void onCancelled(DatabaseError databaseError) {
                            }
                        };
                        oku.addValueEventListener(dinle);
                    }}else {
                    Toast.makeText(getApplicationContext(),"False", Toast.LENGTH_LONG).show();
                }
                sinir+=2;
            }
        });

    }
}
