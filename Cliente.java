public class Cliente {
    public Cliente( Fabrica producto )
    {
        Comedor comedor = producto.getComedor();
        comedor.setNombre("de 4 puestos");
        comedor.setPrecio(5000.0);         
        comedor.MostrarFormaDelComedor();
        comedor.mostrar();

        Sofa sofa = producto.getSofa();
        sofa.setNombre("sofacama");
        sofa.setPrecio(16000.0);        
        sofa.MostrarFormaDelSofa();  
        
        sofa.mostrar();   
    }
}
