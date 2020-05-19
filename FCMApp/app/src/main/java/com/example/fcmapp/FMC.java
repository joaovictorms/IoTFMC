package com.example.fcmapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class FMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fmc);

        String strIdade = getIntent().getStringExtra("idadeKey");
        Integer intIdade = Integer.parseInt(strIdade);

        Integer intFMC = 220-intIdade;
        String strFMC = Integer.toString(intFMC);

        TextView opFMC = (TextView) findViewById(R.id.txtFMC);
        opFMC.setText(strFMC + " bpm");

        Double caminhadaMin = intFMC*0.55;
        Double caminhadaMax = intFMC*0.60;
        TextView opCaminhada = (TextView) findViewById(R.id.txtCaminhadaRap);
        opCaminhada.setText(String.format("Caminhada Rapida: %.2f a %.2f", caminhadaMin, caminhadaMax));

        Double troteMin = intFMC*0.65;
        Double troteMax = intFMC*0.70;
        TextView opTrote = (TextView) findViewById(R.id.txtTrote);
        opTrote.setText(String.format("Trote: %.2f a %.2f", troteMin, troteMax));

        Double corridaLeveMin = intFMC*0.75;
        Double corridaLeveMax = intFMC*0.80;
        TextView opCorridaLeve = (TextView) findViewById(R.id.txtCorridaLeve);
        opCorridaLeve.setText(String.format("Corrida Leve: %.2f a %.2f", corridaLeveMin, corridaLeveMax));

        Double corridaModMin = intFMC*0.85;
        Double corridaModMax = intFMC*0.90;
        TextView opCorridaMod = (TextView) findViewById(R.id.txtCorridaModerada);
        opCorridaMod.setText(String.format("Corrida Moderada: %.2f a %.2f", corridaModMin, corridaModMax));

        Double corridaIntensa = intFMC*0.95;
        TextView opCorridaIntensa = (TextView) findViewById(R.id.txtCorridaIntensa);
        opCorridaIntensa.setText(String.format("Corrida Intensa: acima de %.2f", corridaIntensa));
    }

}
