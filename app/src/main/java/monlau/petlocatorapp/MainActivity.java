package monlau.petlocatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        logo = (ImageView) findViewById(R.id.imageView);
        aparecerLogo();
    }
    private void aparecerLogo() {
        Animation alpha, alpha2;
        alpha = AnimationUtils.loadAnimation(this, R.anim.logo);
        logo.startAnimation(alpha);
        //cambiarPantalla();

    }
}
