import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da Agência!");
        String agencia = scanner.nextLine();
        System.out.println("Digite o nome do Cliente !");
        String nomeDoCliente = scanner.nextLine();
        System.out.println("Digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("digite o Saldo inicial !");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        String mensagemFinal = "Olá, " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagemFinal);
    }
}
