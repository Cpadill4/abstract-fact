public class FabricaModerna implements Fabrica{

    @Override
    public Comedor getComedor() {
        
        return new ComedorModerno();
    }

    @Override
    public Sofa getSofa() {
        return new SofaModerno();
    }
    
}
