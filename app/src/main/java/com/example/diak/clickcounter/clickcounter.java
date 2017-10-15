package com.example.diak.clickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class clickcounter extends AppCompatActivity {

    //válzotók létrehozása
    //private gomb (3db)
    //private textview (1db)
    //private integer változó

    private Button novel,reset,csokkent;
    private TextView szam;
    private int number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clickcounter);


//változók összekapcsolása Layouton taláűlható widge

        novel = (Button) findViewById(R.id.button_novel);
        reset = (Button) findViewById(R.id.button_reset);
        csokkent = (Button) findViewById(R.id.button_csokkent);
        szam = (TextView) findViewById(R.id.szam);

        novel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number ++;
                szam.setText("" + number);

            }
        });

                csokkent.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number--;
                        szam.setText("" + number);
                    }
                });

                        reset.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                number = 0;
                                szam.setText("" + number);
                            }
                        });



                    }
                }

