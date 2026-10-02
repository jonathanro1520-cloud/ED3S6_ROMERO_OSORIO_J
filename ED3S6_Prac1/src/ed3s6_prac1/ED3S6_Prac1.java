package ed3s6_prac1;

public class ED3S6_Prac1 {

    public static void main(String[] args) {
        DetectaTipo<Integer, Integer> obj1 = new DetectaTipo<>(5, 3);
        DetectaTipo<Double, Double> obj2 = new DetectaTipo<>(5.5, 3.2);
        DetectaTipo<String, String> obj3 = new DetectaTipo<>("Hola", "Mundo");
    }
}