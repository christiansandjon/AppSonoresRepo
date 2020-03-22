package com.example.christiansandjon.appsonores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.christiansandjon.appsonores.Models.DataModel;
import com.example.christiansandjon.appsonores.Tools.SonorAdapter;

import java.security.Key;

import static com.example.christiansandjon.appsonores.Tools.SonorAdapter.KEY;

public class DetailsActivity extends AppCompatActivity {

    private TextView ville,adresse,date,decibel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        initialize();
        DataModel dataModel = getIntent().getParcelableExtra(SonorAdapter.KEY);
        ville.setText(dataModel.getVille());
        adresse.setText(dataModel.getAdresse());
        date.setText(dataModel.getDate());
        decibel.setText(""+dataModel.getDb());

    }

    public void initialize(){
        ville = findViewById(R.id.ville);
        adresse = findViewById(R.id.adresse);
        date = findViewById(R.id.date);
        decibel = findViewById(R.id.decibel);




    }
}
