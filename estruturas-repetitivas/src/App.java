import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;

        System.out.println("Digite um valor para somar, digite 1 para parar");
        int soma = 0;
        while (x != 1) {
            soma += x;
            System.out.println("A soma está em " + soma);
            x = sc.nextInt();
        }
        System.out.println("A soma ficou em " + soma);

        System.out.println("Digite 3 número para somar");
        int valor = 0;
        for (int i = 0; i < 3; i++) {
            y = sc.nextInt();
            valor += y;
            System.out.println("O valor está em " + valor);
        }
        System.out.println("O valor terminou em " + valor);

        int subtraindo;
        System.out.println("Precisamos zerar o valor acima, então digite um número para subtrairmos o valor acima:");
        do {
            subtraindo = sc.nextInt();
            valor -= subtraindo;
            System.out.println("Agora o valor está em: " + valor);
        } while (valor >= 1);
        System.out.println("Zeramos o valor, muito obrigado!");
        sc.close();
    }
}
