package pruebas;

public class Test {
    public static void main(String[] args) {
        String s1 = "Hola";
        String s2 = "Hola";
        String s3 = new String("Hola");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
