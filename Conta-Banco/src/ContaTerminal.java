import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome:");
        String nome = scanner.next();

        System.out.println("Digite sua Agencia:");
        String agencia = scanner.next();

        System.out.println("Digite sua Conta:");
        Integer conta = scanner.nextInt();

        System.out.println("Digite seu Saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Ola," + nome);
        System.out.println("Obrigado por criar uma conta em nosso banco");
        System.out.println("Agencia:" + agencia + ", Conta:" + conta + ", Saldo:" + saldo);
        

    }
}
