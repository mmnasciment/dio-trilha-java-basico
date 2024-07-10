import java.util.Scanner;

public class ContaBancaria {
    public static String nome;
    public static String agencia;
    public static int numero;
    public static double saldo;



    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: \n");
        nome = scanner.next();

        System.out.println("Digite o numero da agencia: \n");
        agencia = scanner.next();

        System.out.println("Digite o numero da conta: \n");
        numero = scanner.nextInt();

        System.out.println("Digite seu saldo: \n");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+ conta.nome+ ". Obrigado por criar uma conta em nosso banco, sua agência é "+conta.agencia+", conta "+conta.numero+
                " e seu saldo "+conta.saldo+" já está disponível para saque.");

    }
}