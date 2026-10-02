package ed3s6_ejem3;

public class TipoDato<T> {

    T dato;

    public TipoDato(T dato) {
        this.dato = dato;
    }

    public void MostrarDato() {
        System.out.println("El tipo de dato es " + dato.getClass().getName());
        System.out.println("El valor contenido es " + dato);
    }
}