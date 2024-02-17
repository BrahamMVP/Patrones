package cel;

public class Cliente implements Observer {
    private String nombre;
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public void update() {
        System.out.println( nombre + " fue notificado con exito ");
    }
}

