package cel;

public class Main {
    public static void main(String[] args) throws Exception {
         Subject subject = new Subject();

         Observer cliente1 = new Cliente("Abraham");
         Observer cliente2 = new Cliente("Osvaldo");
         Observer cliente3 = new Cliente("Mariana");
 
         subject.registerObserver(cliente1);
         subject.registerObserver(cliente2);
         subject.registerObserver(cliente3);
 
         Producto nuevoProducto = new Producto("iPhone", 30000.00);
         subject.setNewProduct(nuevoProducto);
 
    }
}

