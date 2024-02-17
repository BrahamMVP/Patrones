package cel;
import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private Producto producto;
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    public void valuesChanged() {
        notifyObservers();
    }
    public void setNewProduct(Producto p) {
        this.producto = p;
        valuesChanged();
    }
}
