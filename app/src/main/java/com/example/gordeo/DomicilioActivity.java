package com.example.gordeo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DomicilioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domicilio);

        WebView miWeb = (WebView)findViewById(R.id.webDomicilio);
        miWeb.loadUrl("https://www.just-eat.es/");
    }
}
