package cl.ejercicios.proyectov2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends Activity implements View.OnClickListener {

    public EditText em,con1,con2;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        em=(EditText) findViewById(R.id.editText3);
        con1=(EditText)findViewById(R.id.editText4);
        con2=(EditText)findViewById(R.id.editText5);
        btn=(Button)findViewById(R.id.button3);
        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String email=em.getText().toString();
        String contra=con1.getText().toString();
        String contra2=con2.getText().toString();

        switch (v.getId()) {
            case R.id.button3:
                Toast.makeText(this, "Usuario Registrado", Toast.LENGTH_LONG).show();
                Intent principal = new Intent(this,MainActivity.class);
                startActivity(principal);
            default:
                break;
        }


    }
}
