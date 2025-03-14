import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seus dados!");

        System.out.println("Numero da conta");
        int numConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Insira a agencia");
        String agencia = sc.nextLine();

        System.out.println("Insira o nome do cliente");
        String cliente = sc.nextLine();

        System.out.println("Insira o saldo");
        double saldo = sc.nextDouble();

        Conta ct = new Conta(numConta, agencia, cliente, saldo);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                        "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n",
                ct.getNomeCliente(), ct.getAgencia(), ct.getNumero(), ct.getSaldo());
    }
}