public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        inicio();

    }

    public static void inicio(){
        Seccion a = new Seccion();
        Listado sa = new Listado();
        a.setNombre("programacion");
        a.setAula("106");
        a.setHora("1600");
        a.setuV("5");
        sa.insertarPrimero("Pedro");
        sa.insertarPrimero("Juan");
        sa.insertarPrimero("maria");
        a.setCupos(10);
        sa.insertarPrimero("bety");

        System.out.println(a.getNombre());
        System.out.println(sa.toString());
        
    }
    
}
