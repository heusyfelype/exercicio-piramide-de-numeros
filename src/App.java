import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Digite o numero para formar a piramide: ");
        int number = inputNumber.nextInt();
        String piramide = "\n\n";

        for(int i = 1; i<=number; i++){
            for(int j = 1; j<=i; j++){
                piramide += i;
            }
            piramide += "\n";
        }
        System.out.println(piramide);
    }
}
