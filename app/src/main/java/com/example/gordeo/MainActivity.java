package com.example.gordeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnFoodPorn,btnRest,btnYa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFoodPorn =(Button)findViewById(R.id.btn);
        View.OnClickListener fd = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             mostrarFoodPorn();
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
        btnYa = (Button)findViewById(R.id.btn3);



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

       }else if(id == R.id.item2){

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
}
