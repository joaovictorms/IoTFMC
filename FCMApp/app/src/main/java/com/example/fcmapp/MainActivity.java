package com.example.fcmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText idade;
    Button calcularFMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idade = (EditText) findViewById(R.id.txtIdade);
        calcularFMC = (Button) findViewById(R.id.btCalcular);

        calcularFMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FMC.class);
                Integer intIdade = Integer.parseInt(idade.getText().toString());
                String strIdade = Integer.toString(intIdade);

                intent.putExtra("idadeKey",strIdade);
                startActivity(intent);
            }
        });

    }

}
