package com.avancebpo.solucionesoftalmicas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;


public class SolCitaActivity extends Activity {
    private Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sol_cita);

        //Botón solicitar cita Autoagendamieanto
        button1 = (Button) findViewById(R.id.buttonSS );
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent1 = new Intent(SolCitaActivity.this, AutoAgActivity.class);
                startActivity(intent1);
                overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_left);
            }

        });

        //Botón solicitar llamando
        button2 = (Button) findViewById(R.id.buttonCall );
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:3123798752"));
                startActivity(callIntent);
                overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_left);
            }

        });

        //Botón solicitar por chat twnel
        button3 = (Button) findViewById(R.id.buttonChat );
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //start navigation to avancebpo chat room in Twnel app
                com.avancebpo.solucionesoftalmicas.TwnelUtils.navigateToChat(SolCitaActivity.this, "avancebpo", "com.avancebpo.solucionesoftalmicas", "com.avancebpo.solucionesoftalmicas.MainActivity", true, "Chatea gratis descargando Twnel", "1.) Da click en \"Siguiente\".\n" +
                        "2.) Inicia Descarga Twnel en PlayStore\n" +
                        "3.) Comunicate con nosotros 24 horas al dias 7 dias a la semana.", "Siguiente");
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sol_cita, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //animation for back
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
