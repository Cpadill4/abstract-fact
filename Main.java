public class Main{
    public static void main(String []args){
        System.out.println("Ejecutando aplicación de Cristhell"); 
     
        Cliente cliente = new Cliente( new FabricaRustica() );

        System.out.println("----------------------------");

        cliente = new Cliente( new FabricaModerna() );
    }

}