package monlau.petlocatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by miquelvidpor on 10/05/2017.
 */
public class login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        overridePendingTransition(R.anim.trans_fadein, R.anim.fade_out);

    }

}
