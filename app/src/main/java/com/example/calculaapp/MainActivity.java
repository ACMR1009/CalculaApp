package com.example.calculaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int a;
    int b;

    EditText texto;
    Button boton;

    TextView sumaTexto;
    TextView restaTexto;
    TextView multiplicacionTexto;
    TextView divisionTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializa();

        a = 10;
        b = 3;

        suma(a, b);
        resta(a, b);
        multiplicacion(a, b);
        division(a, b);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), texto.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        String suma = Integer.toString(suma);
        String resta = Integer.toString(resta);
        String multiplicacion = Integer.toString(multiplicacion);
        String division = Integer.toString(division);

        sumaTexto.setText("La suma es " suma);
        restaTexto.setText("La resta es " resta);
        multiplicacionTexto.setText("La multiplicación es " multiplicacion);
        divisionTexto.setText("La división es " division);
    }

    private void inicializa(){
        texto = findViewById(R.id.editText);
        boton = findViewById(R.id.button);

        sumaTexto = (TextView) findViewById(R.id.textView);
        restaTexto = (TextView) findViewById(R.id.textView2);
        multiplicacionTexto = (TextView) findViewById(R.id.textView3);
        divisionTexto = (TextView) findViewById(R.id.textView4);
    }

    private int suma(int x, int y){
        int suma;
        suma = x + y;

        return suma;
    }

    private int resta(int x, int y){
        int resta;
        resta = x - y;

        return resta;
    }

    private int multiplicacion(int x, int y){
        int multiplicacion;
        multiplicacion = x * y;

        return multiplicacion;
    }

    private int division(int x, int y){
        int division;
        division = x / y;

        return division;
    }
}


