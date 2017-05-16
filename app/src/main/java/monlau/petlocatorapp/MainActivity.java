package monlau.petlocatorapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    LinearLayout ly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        logo = (ImageView) findViewById(R.id.imageView);
        logoAppAnimation();
        esperarYCerrar(7000);
    }

    private void logoAppAnimation() {
        //Variables
        Animation fadeIn, fadeOut;
        AnimationSet animset = new AnimationSet(true);
        //Igualamos las variables
        fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        //Ponemos la duración de cada animacion
        fadeIn.setDuration(5000);
        fadeOut.setDuration(3000);
        //Este sirve para que la animacion espere un tiempo
        fadeOut.setStartOffset(4500);
        //Añadir animaciones al Animation Set
        animset.addAnimation(fadeIn);
        animset.addAnimation(fadeOut);
        //Empezar
        logo.startAnimation(animset);;
    }

    private void logoMonlauAnimation(){
        ly.setBackgroundColor(Color.BLUE);

    }

    private void enviarLogin(){
        Intent intent = new Intent(MainActivity.this, login_register.class);
        startActivity(intent);
    }
    public void esperarYCerrar(int milisegundos) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // acciones que se ejecutan tras los milisegundos
                enviarLogin();
            }
        }, milisegundos);
    }
}
