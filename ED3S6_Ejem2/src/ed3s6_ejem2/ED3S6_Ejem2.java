package ed3s6_ejem2;

public class ED3S6_Ejem2 {

    int a;

    public void suma() {
        int a = 3;
        int b = 7;
        int c = a + b;
        System.out.println("La suma de a + b es " + c);
        mensaje();
    }

    private void mensaje() {
        System.out.println("Bienvenidos a Estructura de datos");
    }

    public static void main(String[] args) {
        ED3S6_Ejem2 obj = new ED3S6_Ejem2();
        obj.suma();
        obj.mensaje();
    }
}