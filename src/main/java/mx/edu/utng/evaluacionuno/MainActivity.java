package mx.edu.utng.evaluacionuno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void EnviarOperacionUno (View view){
        Intent i = new Intent(this,Operacion1Activity.class);
        startActivity(i);

    }

    public void EnviarOperacionDos (View view){
        Intent i = new Intent(this,Operacion2Activity.class);
        startActivity(i);

    }
}
