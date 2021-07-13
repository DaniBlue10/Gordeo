package com.example.gordeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodPornActivity extends AppCompatActivity {

    private Button btnmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_porn);

        btnmenu = (Button)findViewById(R.id.buttonmenu);
    }
    public void mostrarMenu(View v){
        Intent x = new Intent (this,MainActivity.class);
        startActivity(x);
    }
}
