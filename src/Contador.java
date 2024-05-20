import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número : ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número : ");
        int n2 = scanner.nextInt();
        contar(n1, n2);

    }
    public static void contar(int n1, int n2) throws ParametrosInvalidosException {
        if (n2 > n1) {
            int contagem  = n2 - n1;
            for(int i = 0; i < contagem; i++ ){
                System.out.printf("\n imprimindo o número:  %d" , i + 1);
            }
        } else {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro número.");
        }
    }
}