package com.example.gordeo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnFoodPorn,btnRest,btnDomicilio;
    int sonidoDeReproduccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFoodPorn =(Button)findViewById(R.id.btn);
        View.OnClickListener fd = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mostrarFoodPorn();
               mostrarsoundPool();
            }
        };
        btnFoodPorn.setOnClickListener(fd);
        btnRest = (Button)findViewById(R.id.btn2);
        View.OnClickListener CL = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostraRestaurante();
            }


        };
        btnRest.setOnClickListener(CL);
        btnDomicilio = (Button)findViewById(R.id.btn3);
        View.OnClickListener hl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              domicilio();
            }
        };
        btnDomicilio.setOnClickListener(hl);





    }
    //metodo para mostrar y ocultar el menu
    public boolean onCreateOptionsMenu(Menu menu){
      getMenuInflater().inflate(R.menu.menugordeo, menu);
      return true;
    }
    //metodo para asignar las funciones correspondientes a las opciones
    public boolean onOptionsItemSelected(MenuItem item){
       int id = item.getItemId();

       if(id == R.id.item1){
           Toast.makeText(this,"No pedimos datos",Toast.LENGTH_LONG).show();

       }else if(id == R.id.item2){
           AlertDialog alert = new AlertDialog.Builder(this).create();
           alert.setTitle("Desarrollador");
           alert.setMessage("dani blue");
           alert.show();

       }
       return super.onOptionsItemSelected(item);
    }
    public void mostrarFoodPorn (){
        Intent i = new Intent(this,FoodPornActivity.class);
        startActivity(i);
    }
    public  void mostraRestaurante() {
        Intent i = new Intent(this,Rest_Activity.class);
        startActivity(i);
    }
    public void domicilio(){
        Intent i = new Intent (this,DomicilioActivity.class);
        startActivity(i);
    }
    public void mostrarsoundPool(){

        MediaPlayer mp =  MediaPlayer.create(this,R.raw.cow);
        mp.start();
    }
}
