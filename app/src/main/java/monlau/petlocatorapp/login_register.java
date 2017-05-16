package monlau.petlocatorapp;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login_register extends FragmentActivity {

        private FragmentTabHost tabHost;
            private  EditText etnombre, etapellido, etuser, etpass, etrepass, etmail, etphone, etdir;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_login_register);
                    tabHost= (FragmentTabHost) findViewById(android.R.id.tabhost);
                    tabHost.setup(this, getSupportFragmentManager(),android.R.id.tabcontent);
                    tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Login"), Tab1_Login.class, null);
                    tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Registro"), Tab2_Registro.class, null);
                    }
            private void regerencias(){
               etnombre = (EditText) findViewById(R.id.et_nombre);
               etapellido = (EditText) findViewById(R.id.et_apellido);
               etuser = (EditText) findViewById(R.id.et_user);
               etpass = (EditText) findViewById(R.id.et_pass);
               etrepass = (EditText) findViewById(R.id.et_repass);
               etmail = (EditText) findViewById(R.id.et_mail);
               etphone = (EditText) findViewById(R.id.et_phone);
                etdir = (EditText) findViewById(R.id.et_dir);
            }
             public void registro(View view){
                 DBConnection con = new DBConnection();
                 con.conectar();
               String nombre, apellido, user, pass, repass, mail, tlfno, dir;
               nombre = etnombre.getText().toString();
               apellido = etapellido.getText().toString();
               user = etuser.getText().toString();
               pass = etpass.getText().toString();
               repass = etrepass.getText().toString();
               mail = etmail.getText().toString();
               tlfno = etphone.getText().toString();
               dir = etdir.getText().toString();

               String cadena = "INSERT INTO registro_cliente VALUES ('1','" + nombre + "', '" + apellido + "', '" + user + "', '"+ pass + "', '"+mail+"', '"+tlfno+"', '"+dir+"'";

             }
        }