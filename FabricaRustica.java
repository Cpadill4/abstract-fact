public class FabricaRustica implements Fabrica{

    @Override
    public Comedor getComedor() {
        
        return new ComedorRustico();
    }

    @Override
    public Sofa getSofa() {
        return new SofaRustico();
    }
    
}
