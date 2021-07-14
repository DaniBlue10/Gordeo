package com.example.gordeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FoodPornActivity extends AppCompatActivity {

    private ImageButton botonPizza,botonHamburguesa,botonCostillas,botonNachos,
    botonSushi,botonPerrito,botonTaco,botonSandwich,botonPadthai,botonArroz,botonTarta,
    botonHelado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_porn);

        botonPizza = (ImageButton)findViewById(R.id.buttonpizza);
        botonHamburguesa = (ImageButton)findViewById(R.id.buttonHamburguesa);
        botonCostillas = (ImageButton)findViewById(R.id.buttonCostillas);
        botonNachos = (ImageButton)findViewById(R.id.buttonNachos);
        botonSushi = (ImageButton)findViewById(R.id.buttonSushi);
        botonPerrito = (ImageButton)findViewById(R.id.buttonPerrito);
        botonTaco = (ImageButton)findViewById(R.id.buttonTaco);
        botonSandwich = (ImageButton)findViewById(R.id.buttonSandwich);
        botonPadthai = (ImageButton)findViewById(R.id.buttonPadthai);
        botonArroz = (ImageButton)findViewById(R.id.buttonArroz);
        botonTarta = (ImageButton)findViewById(R.id.buttonTarta);
        botonHelado = (ImageButton)findViewById(R.id.buttonHeladoyGofre);


    }

}
