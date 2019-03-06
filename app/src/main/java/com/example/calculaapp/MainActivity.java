package com.example.calculaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a;
    int b;

    TextView sumaTexto;
    TextView restaTexto;
    TextView multiplicacionTexto;
    TextView divisionTexto;

    int suma;
    int resta;
    int multiplicacion;
    int division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializa();

        a = 10;
        b = 3;

        sumar(a, b);
        restar(a, b);
        multiplicar(a, b);
        dividir(a, b);

        sumaTexto.setText("La suma es " + suma);
        restaTexto.setText("La resta es " + resta);
        multiplicacionTexto.setText("La multiplicación es " + multiplicacion);
        divisionTexto.setText("La división es " + division);
    }

    private void inicializa(){
        sumaTexto = (TextView) findViewById(R.id.textView);
        restaTexto = (TextView) findViewById(R.id.textView2);
        multiplicacionTexto = (TextView) findViewById(R.id.textView3);
        divisionTexto = (TextView) findViewById(R.id.textView4);
    }

    private void sumar(int x, int y){
        suma = x + y;
        String sumaString;
        sumaString = Integer.toString(suma);
    }

    private int restar(int x, int y){
        resta = x - y;
        String restaString;
        restaString = Integer.toString(resta);
    }

    private int multiplicar(int x, int y){
        multiplicacion = x * y;
        String multiplicacionString;
        multiplicacionString = Integer.toString(multiplicacion);
    }

    private int dividir(int x, int y){
        division = x / y;
        String divisionString;
        divisionString = Integer.toString(division);
    }
}


