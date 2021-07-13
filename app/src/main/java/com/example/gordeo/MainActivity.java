package com.example.gordeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
    public void mostrarFoodPorn (){
        Intent i = new Intent(this,FoodPornActivity.class);
        startActivity(i);
    }
    public  void mostraRestaurante() {
        Intent i = new Intent(this,Rest_Activity.class);
        startActivity(i);
    }
}
