package com.example.tugasfragment1.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tugasfragment1.R;
import com.example.tugasfragment1.fragment.FilmFragment;
import com.example.tugasfragment1.fragment.MusikFragment;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button btnmusik, btnfilm;

    MusikFragment musikFragment;
    FilmFragment filmFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmusik = findViewById(R.id.btn_musik);
        btnfilm = findViewById(R.id.btn_film);

        btnmusik.setOnClickListener(this);
        btnfilm.setOnClickListener(this);
    }

    void menuMusik() {
        musikFragment = new MusikFragment();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, musikFragment);
        ft.commit();
    }

    void menuFilm() {
        filmFragment = new FilmFragment();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, filmFragment);
        ft.commit();
    }

    @Override
    public void onClick(View v) {
        if (v == btnmusik){
            menuMusik();
        }
        if (v == btnfilm){
            menuFilm();
        }
    }
}