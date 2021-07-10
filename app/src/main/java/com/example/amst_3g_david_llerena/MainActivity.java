package com.example.amst_3g_david_llerena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {
    Volley a = new Volley();
    String token = "4226697297377091"; //token traido de facebook por medio de la app

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void buscarHeroe(View view){
        EditText heros_all = (EditText)findViewById(R.id.editText);
        String nombreHeroe = heros_all.getText().toString();
        String url = "https://www.superheroapi.com/api.php/" + token + "/search/" + nombreHeroe;
        Intent toResultado = new Intent(getApplicationContext(), Resultado_Heroe.class);
        toResultado.putExtra("url",url );
        startActivity(toResultado);
    }

}
