import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //

        System.out.print("Informe o número: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // limpa o ENTER pendente

        System.out.print("Informe o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Informe o nome do titular: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Informe o saldo que deseja depositar: ");
        String saldoStr = scanner.next().replace(",", ".");
        double saldo = Double.parseDouble(saldoStr);

        System.out.println("Olá " + nomeCliente
                + "! Obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia + ", conta " + numero
                + " e seu saldo " + saldo + " já está disponível para saque!");

        scanner.close();
    }
}