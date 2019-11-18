package cl.ejercicios.proyectov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cl.ejercicios.proyectov2.modelo.ListaDeCompras;
import cl.ejercicios.proyectov2.modelo.Producto;

public class DetallesActivity extends AppCompatActivity {

    private Producto producto;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        //Obtener el producto
        intent=getIntent();
        int id=(Integer) intent.getExtras().get("idProducto");
        producto= ListaDeCompras.getInstancia().getProducto(id);

        //Mostrar la información del producto

        TextView txtForma=(TextView)findViewById(R.id.forma);
        txtForma.setText("Nombre: "+producto.getForma()+" Cantidad: "+producto.getCantidad());

        TextView txtEstado=(TextView)findViewById(R.id.estado);
        Button cambiar=(Button) findViewById(R.id.estado);
        if(producto.isEstado())
        {

            cambiar.setText("Quitar");
        }
        else {

            cambiar.setText("Agregar");
        }

    }

    public void cambiarEstado(View view)
    {
        producto.setEstado(!producto.isEstado());
        setResult(RESULT_OK,intent);
        finish();
    }
}
