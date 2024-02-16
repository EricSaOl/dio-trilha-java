import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String name, agency;
        double firstDeposit;
        int clientNumber = 1021;

        System.out.println("Bem-vindo ao banco DIO!");
        System.out.println("Digite o numero da agencia:");
        agency = sc.nextLine();
        System.out.println("Digite seu nome completo:");
        name = sc.nextLine();
        System.out.println("Digite o valor do primeiro deposito:");
        firstDeposit = sc.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$%.2f já está disponível para saque.",
                name, agency, clientNumber, firstDeposit);
        // new
        sc.close();
    }
}
