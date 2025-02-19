import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        String nombre ;
        int edad ;
        String hobby ;
        System.out.println("escribe tu nombre");
        nombre = entrada.next();
        System.out.println("escribe tu edad");
        edad= entrada.nextInt();
        System.out.println("¿Cual es tu hobby?");
        hobby = entrada.next();
        System.out.println("tu nombre es  " + nombre );
        System.out.println("tu edad es de  "+ edad+"   "+"años");
        if (edad <= 17)  {
            System.out.println("eres menor de edad ");
        } else {
            System.out.println("eres mayor de edad ");

        }
        System.out.println("tu hobby es "+ hobby );
        System.out.println("KAREN CASTILLO HIZO CAMBIOS");
    }
}