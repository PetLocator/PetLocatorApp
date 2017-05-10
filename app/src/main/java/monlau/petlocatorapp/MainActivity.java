package monlau.petlocatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    LinearLayout ly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        logo = (ImageView) findViewById(R.id.imageView);
        logoAppAnimation();

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
        logo.startAnimation(animset);
    }

    private void logoMonlauAnimation(){

    }
}
