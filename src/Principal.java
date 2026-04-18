import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite  o primeiro valor. ");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor.");
        double valor2 = scanner.nextDouble();

        System.out.println("Digite o terceiro valor. ");
        double valor3 = scanner.nextDouble();

        double media = (valor1 + valor2 + valor3) / 3;
        System.out.printf("a media e:", media);

        scanner.close();

    }

}
