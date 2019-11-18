package cl.ejercicios.proyectov2.modelo;

public class Producto {

    private int cantidad;
    private String forma;
    private boolean estado; //true si está en el carrito de compras - false si se va a eliminar
    private static final boolean PENDIENTE=true;

    //Arreglo de productos para probar la lista

    public static final Producto[] productos={
            new Producto(1,"Pomada"),
            new Producto(1,"Leche"),
            new Producto(1,"Crema"),
            new Producto (1,"Fruto"),
            new Producto(1,"Aceite"),
            new Producto(1,"Hoja"),


    };

    //Constructor

    public Producto(int cantidad, String forma) {

        this.cantidad = cantidad;
        this.forma = forma;
        this.estado=PENDIENTE;
    }

    //Getters y setters




    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado){
        this.estado=estado;
    }




    //toString para mostrar en la lista

    @Override
    public String toString() {
        //Devuelve el nombre del producto y si está comprado o pendiente
        String enCarrito;
        if(estado) enCarrito="En carrito de compras";
        else enCarrito="Preparado para eliminar de la lista";
        return forma + " cantidad: "+cantidad+". " + enCarrito ;
    }


}

