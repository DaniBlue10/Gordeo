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
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_porn);

        tv1 = (TextView)findViewById(R.id.textViewdescripcion);

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
        botonPadthai.setOnClickListener(clickliste);
        botonArroz = (ImageButton)findViewById(R.id.buttonArroz);
        View.OnClickListener clicklisten = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             arroz();
            }
        };
        botonArroz.setOnClickListener(clicklisten);

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
        if(botonPizza.isClickable()){
            String text =("La pizza es deliciosa,de origen italiano," +
                    " es uno de los platos más conocidos y demandados en el mundo hoy en día. Su aparición se remonta a miles de años atrás.la " +
                    "diversidad de ingredientes la hace atractiva para niños y adultos");
            tv1.setText(text);

        }
    }
    private void hamburguesa(){
        if(botonHamburguesa.isClickable()){
            String text = ("La hamburguesa es tipico plato de américa se pueden encontrar con huevo,bacon,queso,carnes variadas,etc");
            tv1.setText(text);
        }
    }
    private void costillas(){
        if(botonCostillas.isClickable()){
            String text = ("Las costillas tienen un gran sabor,se deshace en la boca, a la barbacoa o con miel,pruebalas!! ");
            tv1.setText(text);
        }
    }
    private void nachos(){
        if(botonNachos.isClickable()){
            String text = ("los nachos como no sean de buena calidad no son dignos de comer,plato mejicano con mucho sabor a queso y guacamole");
            tv1.setText(text);
        }
    }
    private void sushi(){
        if(botonSushi.isClickable()){
            String text = ("El sushi es pescado crudo,un plato japones para los más sibaritas");
            tv1.setText(text);
        }
    }
    private void perrito(){
        if(botonPerrito.isClickable()){
            String text = ("Salchicha en pan blando con tomate o mostaza,los perritos han decaido por su baja demanda");
            tv1.setText(text);
        }
    }
    private void taco(){
        if(botonTaco.isClickable()){
            String text = ("Los tacos son un plato tradicional Mexicano que puede hacerse con tortillas tiernas o crujientes,rellënalos con lo que te apetzca");
            tv1.setText(text);
        }
    }
    private void sandwich(){
        if(botonSandwich.isClickable()){
            String text = ("El sandwich es muy recurrido y de mucha variedad,su pan blando se acompaña de infinidad de ingredientes");
            tv1.setText(text);
        }
    }
    private void padthai(){
        if(botonPadthai.isClickable()){
            String text = ("Fideos con gambas tipico de tailandia,el Pad Thai está muy bueno para cualquier ocasión");
            tv1.setText(text);
        }
    }
    private void arroz(){
        if(botonArroz.isClickable()){
            String text = ("El arroz tres delicias es un plato muy apetitoso suele estar acompañado de jamón de york,tortillay guisantes");
            tv1.setText(text);
        }
    }
    private void tarta (){
        if(botonTarta.isClickable()){
            String text = ("La tarta es un postre riquísimo para darle al cerebro una recompensa placentera");
            tv1.setText(text);
        }
    }
    private void helado(){
        if(botonHelado.isClickable()){
            String text = ("El helado es refrescante y sabroso de muchos sabores y texturas,el helado es un placer al que pocos pueden resistirse");
            tv1.setText(text);
        }
    }

}
