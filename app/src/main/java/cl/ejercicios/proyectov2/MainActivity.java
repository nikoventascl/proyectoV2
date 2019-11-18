package cl.ejercicios.proyectov2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private EditText etx1,etx2;
    private Button btn;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etx1=(EditText)findViewById(R.id.editText);
        etx2=(EditText)findViewById(R.id.editText2);
        btn=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String correo = etx1.getText().toString();
        String contraseña = etx2.getText().toString();

        switch (v.getId()) {
            case R.id.button:
                if (correo.equals("WeedForU@gmail.com") && contraseña.equals("123456")) {
                    Toast.makeText(this, "Sesion iniciada ", Toast.LENGTH_LONG).show();
                    Intent principal = new Intent(this,Main3Activity.class);
                    startActivity(principal);
                } else {
                    Toast.makeText(this, "Datos incorrectos ", Toast.LENGTH_LONG).show();
                }
            default:
                break;

            case R.id.button2:
                Intent principal2= new Intent(this,Main2Activity.class);
                startActivity(principal2);
                break;

        }







    }
}
