package com.nana.mengenalalatmusik;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView serunai,tifa,gambus,kolintang,sasando,kendang,rindik,gong,sape,angklung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serunai = (ImageView) findViewById(R.id.serunai);
        tifa = (ImageView) findViewById(R.id.tifa);
        gambus = (ImageView) findViewById(R.id.gambus);
        kolintang = (ImageView) findViewById(R.id.kolintang);
        sasando = (ImageView) findViewById(R.id.sasando);
        kendang = (ImageView) findViewById(R.id.kendang);
        rindik = (ImageView) findViewById(R.id.rindik);
        gong = (ImageView) findViewById(R.id.gong);
        sape = (ImageView) findViewById(R.id.sampe);
        angklung = (ImageView) findViewById(R.id.angklung);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.a);
        serunai.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp.start();

            }
        });

        final MediaPlayer mp0 = MediaPlayer.create(this, R.raw.b);
        tifa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp0.start();

            }
        });

        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.c);
        gambus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp1.start();

            }
        });

        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.d);
        kolintang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp2.start();

            }
        });

        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.e);
        sasando.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp3.start();

            }
        });

        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.i);
        sape.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp4.start();

            }
        });

        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.g);
        rindik.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp5.start();

            }
        });

        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.f);
        kendang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp6.start();

            }
        });

        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.h);
        gong.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp7.start();

            }
        });

        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.j);
        angklung.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp8.start();
            }
        });
    }

}