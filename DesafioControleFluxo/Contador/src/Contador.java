import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite um segundo número inteiro: ");
        int parametroDois = terminal.nextInt();

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (Exception e) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws Exception {
        // validar se parametroUm é MAIOR que parametroDois e lancar a excecão
        if (parametroUm > parametroDois) {
            throw new Exception();
        }
        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int x = 1; contagem >= x; x++) {
            System.out.println("Repeticão número " + x + " :" + parametroUm + " " + parametroDois);
        }

    }
}
