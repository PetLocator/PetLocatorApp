package monlau.petlocatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by davidmatrui on 16/05/2017.
 */
public class menuprincipal extends AppCompatActivity {

    ImageButton btRegistro, btRastrear;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuprincipal);
    }

    private void traerReferencias() {
        btRegistro = (ImageButton) findViewById(R.id.registrar);
        btRastrear = (ImageButton) findViewById(R.id.rastrear);
    }
    public void irRegistro(View view){
        irAotroActivity();
    }
    public void irRastrear(View view){
        irAotroActivity2();
    }
    private void irAotroActivity() {
        Intent intent = new Intent(menuprincipal.this, registro_mascota.class);
        //La clase Bundle sirve para contener tipos primitivos y objetos de otras clases
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void irAotroActivity2() {
        Intent intent = new Intent(menuprincipal.this, rastrear.class);
        //La clase Bundle sirve para contener tipos primitivos y objetos de otras clases
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
