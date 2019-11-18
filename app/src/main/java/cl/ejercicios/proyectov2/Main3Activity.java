package cl.ejercicios.proyectov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import cl.ejercicios.proyectov2.modelo.ListaDeCompras;
import cl.ejercicios.proyectov2.modelo.Producto;

public class Main3Activity extends AppCompatActivity {
    private ListaDeCompras lista=ListaDeCompras.getInstancia();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void verLista(View view)
    {
        ArrayList<Producto> productos=lista.getListaDeCompras();
        if(productos.size()>0) {
            Intent intent = new Intent(this, ListaProductosActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"La lista de compras esta vacia",Toast.LENGTH_SHORT).show();
        }
    }

    public void ingresarNuevo(View view)
    {
        Intent intent=new Intent(this, NuevoProductoActivity.class);
        startActivity(intent);
    }

    public void eliminarProductos(View view)
    {
        lista.eliminarProductos();
        Toast.makeText(this,"Se eliminaron los productos seleccionados",Toast.LENGTH_SHORT).show();
    }

    public void verProductos(View view)
    {
        Intent intent=new Intent(this,PreciosActivity.class);
        startActivity(intent);
    }
}
