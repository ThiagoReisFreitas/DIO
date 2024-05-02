import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o numero da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor digite o numero da Agencia; ");
        String agencia = scanner.next();

        System.out.println("Por favor digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor digite o saldo da conta: ");
        Double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s , conta %d e seu saldo %.2f, já esta disponivel para saque.",nomeCliente,agencia,numero,saldo);

    }
}
