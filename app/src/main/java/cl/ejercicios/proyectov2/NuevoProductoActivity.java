package cl.ejercicios.proyectov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import cl.ejercicios.proyectov2.modelo.ListaDeCompras;
import cl.ejercicios.proyectov2.modelo.Producto;

public class NuevoProductoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_producto);
    }
    public void ingresarProducto(View view)
    {
        String cantidadStr=((TextView)findViewById(R.id.ingresarCantidad)).getText().toString();
        String forma=((Spinner)findViewById(R.id.Forma)).getSelectedItem().toString();
        int cantidad=0;
        try{
            cantidad=Integer.parseInt(cantidadStr);
        }catch (NumberFormatException ex)
        {
            Toast.makeText(this,"Debe ingresar un numero en la cantidad",
            Toast.LENGTH_SHORT).show();
        }
        if (cantidad>0)
        {
            if(forma.equals("Forma")){

            }
            Producto producto=new Producto(cantidad,forma);
            ListaDeCompras listaDeCompras=ListaDeCompras.getInstancia();
            listaDeCompras.agregarProducto(producto);
            finish();
        }
        else{
            Toast.makeText(this,"Ingrese una cantidar mayor a cero",
            Toast.LENGTH_SHORT).show();
        }
    }
}
