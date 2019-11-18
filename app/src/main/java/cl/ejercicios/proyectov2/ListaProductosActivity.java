package cl.ejercicios.proyectov2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import cl.ejercicios.proyectov2.modelo.ListaDeCompras;
import cl.ejercicios.proyectov2.modelo.Producto;

public class ListaProductosActivity extends ListActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cargarLista();
    }

    public void cargarLista()
    {
        lista=getListView();
        List<Producto> productoList= ListaDeCompras.getInstancia().getListaDeCompras();
        ArrayAdapter<Producto> listaAdapter= new ArrayAdapter<Producto>(this,
                android.R.layout.simple_expandable_list_item_1,productoList);
        lista.setAdapter(listaAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View view, int posicion, long id)
    {
        Intent intent=new Intent(ListaProductosActivity.this,DetallesActivity.class);
        intent.putExtra("idProducto",(int)id);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultcode, Intent data)
    {
        super.onActivityResult(requestCode,resultcode,data);
        if(requestCode==1)
        {
            if(resultcode==RESULT_OK)
            {
                cargarLista();
            }
        }

    }

}
