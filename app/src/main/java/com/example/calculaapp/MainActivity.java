package com.example.calculaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        b = 2;

        sumar(a, b);
        restar(a, b);
        multiplicar(a, b);
        dividir(a, b);

        sumaTexto.setText("La suma es " + suma);
        restaTexto.setText("La resta es " + resta);
        multiplicacionTexto.setText("La multiplicación es " + multiplicacion);
        divisionTexto.setText("La división es " + division);
        Log.d("MisMensajes", "Se mostraron en pantalla los resultados de las operaciones");
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
        Log.d("MisMensajes", "La suma de a y b es " + sumaString);
    }

    private void restar(int x, int y){
        resta = x - y;
        String restaString;
        restaString = Integer.toString(resta);
        Log.d("MisMensajes", "La resta de a y b es " + restaString);
    }

    private void multiplicar(int x, int y){
        multiplicacion = x * y;
        String multiplicacionString;
        multiplicacionString = Integer.toString(multiplicacion);
        Log.d("MisMensajes", "El producto de a y b es " + multiplicacionString);
    }

    private void dividir(int x, int y){
        division = x / y;
        String divisionString;
        divisionString = Integer.toString(division);
        Log.d("MisMensajes", "La division de a y b es " + divisionString);
    }
}


