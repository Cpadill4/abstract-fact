public abstract class Sofa extends Mueble{

    public Sofa() {
    }

    public void mostrar()
    {
        System.out.println("Mostrar Sofa:"+ getNombre() + " precio: "+getPrecio());
    }
    public abstract void MostrarFormaDelSofa();
}

