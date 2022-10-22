import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float Grados, F, K;

        Scanner obxGrados = new Scanner(System.in);
        System.out.println("Teclea grados");
        Grados = obxGrados.nextFloat();

        F = (float) (Grados * 1.8) + 32;
        K = (float) (Grados + 273.15);

        System.out.println(+Grados + " grados centigrados son: \n" + F + " grados Fahrenheit \n" + K + " grados Kelvin");

    }
}