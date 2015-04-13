package com.avancebpo.solucionesoftalmicas;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;


public class MainActivity extends Activity {
    private ImageButton imageButtonPerfProf;
    private ImageButton imageButtonEspec;
    private ImageButton imageButtonSolCita;
    private Button buttonPerfProf, buttonEspec,buttonSolCita;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Botón perfil profesional
        buttonPerfProf = (Button) findViewById(R.id.buttonPerfProf );
        buttonPerfProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, PerfilProfActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_left);
            }

        });

        //Botón especialidades
        buttonEspec = (Button) findViewById(R.id.buttonEspec );
        buttonEspec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent2 = new Intent(MainActivity.this, EspecialidadesActivity.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_left);
            }

        });

        //Botón solicite cita
        buttonSolCita = (Button) findViewById(R.id.buttonSolCita );
        buttonSolCita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent3 = new Intent(MainActivity.this, SolCitaActivity.class);
                startActivity(intent3);
                overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_left);
            }

        });

    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
