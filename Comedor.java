import javax.print.DocFlavor.STRING;

public abstract class Comedor extends Mueble{

    public Comedor() {
    }

    public void mostrar()
    {
        System.out.println("Mostrar comedor:"+ getNombre() + " precio: "+getPrecio());
    }
    public abstract void MostrarFormaDelComedor();
}

