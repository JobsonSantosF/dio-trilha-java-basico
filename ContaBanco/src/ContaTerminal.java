import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta:");
        numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o número da agencia:");
        agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o saldo da conta");
        saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
