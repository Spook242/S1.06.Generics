package nivel1Ejercicio;

public class NoGenericMethods {
    private Object first;
    private Object second;
    private Object third;

    // Constructor que inicialitza els tres valors
    public NoGenericMethods(Object first, Object second, Object third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // Mètodes per posar els valors
    public void setFirst(Object first) {
        this.first = first;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    public void setThird(Object third) {
        this.third = third;
    }

    // Mètodes per obtenir els valors
    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }

    public Object getThird() {
        return third;
    }
}
