package mx.edu.utng.evaluacionuno;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Operacion1Activity extends AppCompatActivity {
        private EditText edtY;
        private EditText edtX;
        private Button btnCalcula;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_operacion1);

            edtY= (EditText)findViewById(R.id.edt_y);
            btnCalcula= (Button)findViewById(R.id.btn_calcula);
            edtX= (EditText)findViewById(R.id.edt_x);
            btnCalcula= (Button)findViewById(R.id.btn_calcula);

            btnCalcula.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OperacionUno operacionUno = OperacionUno.getOperacionUno();
                    operacionUno.setValY(Integer.parseInt(edtY.getText().toString()));
                    operacionUno.setValX(Integer.parseInt(edtX.getText().toString()));


                    Toast.makeText(Operacion1Activity.this,"El resultado es: "
                                    +"\nnumero Y: "+ operacionUno.getValY()
                                    +"\nnumero X: "+ operacionUno.getValX()
                                    +"\nResultado: "+ operacionUno.getResult()
                            ,

                            Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
