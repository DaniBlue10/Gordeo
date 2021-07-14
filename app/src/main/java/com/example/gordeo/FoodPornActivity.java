package com.example.gordeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class FoodPornActivity extends AppCompatActivity {

    private ImageButton botonPizza,botonHamburguesa,botonCostillas,botonNachos,
    botonSushi,botonPerrito,botonTaco,botonSandwich,botonPadthai,botonArroz,botonTarta,
    botonHelado;
    String texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_porn);


        botonPizza = (ImageButton)findViewById(R.id.buttonpizza);
        View.OnClickListener cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             pizza();
            }
        };
        botonPizza.setOnClickListener(cl);
        botonHamburguesa = (ImageButton)findViewById(R.id.buttonHamburguesa);
        View.OnClickListener cli = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              hamburguesa();
            }
        };
        botonHamburguesa.setOnClickListener(cli);
        botonCostillas = (ImageButton)findViewById(R.id.buttonCostillas);
        View.OnClickListener clic = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                costillas();
            }
        };
        botonCostillas.setOnClickListener(clic);
        botonNachos = (ImageButton)findViewById(R.id.buttonNachos);
        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nachos();
            }
        };;
        botonNachos.setOnClickListener(click);
        botonSushi = (ImageButton)findViewById(R.id.buttonSushi);
        View.OnClickListener clickl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              sushi();
            }
        };
        botonSushi.setOnClickListener(clickl);
        botonPerrito = (ImageButton)findViewById(R.id.buttonPerrito);
        View.OnClickListener clickli = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perrito();
            }
        };
        botonPerrito.setOnClickListener(clickli);
        botonTaco = (ImageButton)findViewById(R.id.buttonTaco);
        View.OnClickListener clicklis = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             taco();
            }
        };
        botonTaco.setOnClickListener(clicklis);
        botonSandwich = (ImageButton)findViewById(R.id.buttonSandwich);
        View.OnClickListener clicklist = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             sandwich();
            }
        };
        botonSandwich.setOnClickListener(clicklist);
        botonPadthai = (ImageButton)findViewById(R.id.buttonPadthai);
        View.OnClickListener clickliste = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             padthai();
            }
        };
        botonArroz = (ImageButton)findViewById(R.id.buttonArroz);
        View.OnClickListener clicklisten = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             arroz();
            }
        };
        botonTarta = (ImageButton)findViewById(R.id.buttonTarta);
        View.OnClickListener clicklistene = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              tarta();
            }
        };
        botonTarta.setOnClickListener(clicklistene);
        botonHelado = (ImageButton)findViewById(R.id.buttonHeladoyGofre);
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             helado();
            }
        };
        botonHelado.setOnClickListener(clickListener);

    }
    private void pizza (){
        if(botonPizza.isSelected()){
            

        }
    }
    private void hamburguesa(){}
    private void costillas(){}
    private void nachos(){}
    private void sushi(){}
    private void perrito(){}
    private void taco(){}
    private void sandwich(){}
    private void padthai(){}
    private void arroz(){}
    private void tarta (){}
    private void helado(){}

}
