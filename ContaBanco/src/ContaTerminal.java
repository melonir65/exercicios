import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor digite o número da agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Digite o seu nome: ");
        String nomeDoCliente = scanner.nextLine();
        System.out.print("Digite o número da conta: ");
        Integer conta = scanner.nextInt();
        System.out.print("Digite o saldo da conta: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeDoCliente + ", Obrigado por criar uma conta em nosso banco, " +
                "sua agência é : " + agencia + ", conta " + conta + " e seu saldo " + saldo +
                " já está disponível para saque.");



    }
}
