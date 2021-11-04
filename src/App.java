import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double nmr;
        double ant = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um númerro inteiro positivo maior ou igual a 0: ");
        nmr = scanner.nextDouble();

        System.out.println("");
        if (nmr >= 0) {

            while (nmr>0){
                ant= ant +1/nmr;

                nmr--;
            }


        } else {
            System.out.println("Número negativo");
        }
        System.out.println("O enésimo termo da serie harmônica é: " + ant);

        scanner.close();
    }
}