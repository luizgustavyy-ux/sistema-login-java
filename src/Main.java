import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int SENHA_CORRETA = 210;
        final int MAX_TENTATIVAS = 3;

        Scanner scanner = new Scanner(System.in);

        int senha = 0;
        int tentativas = 0;

        while (senha != SENHA_CORRETA && tentativas < MAX_TENTATIVAS) {
            System.out.print("Digite a senha: ");
            senha = scanner.nextInt();

            if (senha != SENHA_CORRETA) {
                tentativas++;
                System.out.println("Senha incorreta.");

                if (tentativas < MAX_TENTATIVAS) {
                    System.out.println("Tentativas restantes: " + (MAX_TENTATIVAS - tentativas));
                }
            }
        }

        if (senha == SENHA_CORRETA) {
            System.out.println("Acesso permitido.");
            System.out.println("Tentativas utilizadas: " + (tentativas + 1));
        } else {
            System.out.println("Acesso bloqueado.");
            System.out.println("Número máximo de tentativas atingido: " + MAX_TENTATIVAS);
        }

        scanner.close();
    }
}