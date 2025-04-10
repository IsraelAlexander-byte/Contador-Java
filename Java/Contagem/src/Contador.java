import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o número inicial: ");
            int inicio = scanner.nextInt();

            System.out.print("Digite o número final: ");
            int fim = scanner.nextInt();

            System.out.print("Digite o passo: ");
            int passo = scanner.nextInt();

            // Validando passo
            if (passo == 0) {
                System.out.println("O passo não pode ser zero. Usando passo 1 por padrão.");
                passo = 1;
            }

            System.out.println("\nContagem:");

            if (inicio < fim) {
                for (int i = inicio; i <= fim; i += passo) {
                    System.out.print(i + " ");
                }
            } else {
                for (int i = inicio; i >= fim; i -= Math.abs(passo)) {
                    System.out.print(i + " ");
                }
            }

        } catch (Exception e) {
            System.out.println("Entrada inválida! Certifique-se de digitar apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}
