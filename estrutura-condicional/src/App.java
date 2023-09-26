import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int n1 = -10;
        int n2 = 8;
        int n3 = 0;
        int n4 = 12;
        int n5 = -27;
        int A = 6;
        int B = 24;
        int C = 25;
        int D = 2;
        int E = 16;

        /*
         * Fazer um programa para ler um número inteiro, e depois dizer se este número é
         * negativo ou não.
         */
        imprimirSinal(n1);
        imprimirSinal(n2);
        imprimirSinal(n3);

        /*
         * Fazer um programa para ler um número inteiro e dizer se este número é par ou
         * ímpar.
         */
        verificarParOuImpar(n4);
        verificarParOuImpar(n5);
        verificarParOuImpar(n3);

        /*
         * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
         * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
         * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
         * crescente ou decrescente.
         */
        verificarMultiplos(A, B);
        verificarMultiplos(A, C);
        verificarMultiplos(B, A);

        /*
         * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
         * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro,
         * tendo
         * uma duração mínima de 1 hora e máxima de 24 horas.
         */
        duracaoJogo(E, D);
        duracaoJogo(n3, n3);
        duracaoJogo(D, E);

        /*
         * Com base em uma tabela, escreva um programa que leia o código de um item e a
         * quantidade deste item. A seguir, calcule e mostre o valor da conta a
         * pagar.
         */
        Item[] itens = {
                new Item(1, "Cachorro Quente", 4),
                new Item(2, "X-Salada", 4.5),
                new Item(3, "X-Bacon", 5),
                new Item(4, "Torrada Simples", 2),
                new Item(5, "Refrigerante", 1.5)
        };

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o código do item: ");
        int codigoItem = input.nextInt();

        System.out.println("Digite a quantidade: ");
        int quantidade = input.nextInt();

        input.close();

        double valorTotal = calcularValorTotal(itens, codigoItem, quantidade);

        if (valorTotal >= 0) {
            System.out.println("Valor total a pagar: R$ " + valorTotal);
        } else {
            System.out.println("Item não encontrado. Verifique o código do item.");
        }

    }

    public static void imprimirSinal(int numero) {
        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
    }

    public static void verificarParOuImpar(int number) {
        if (number % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }

    public static void verificarMultiplos(int n1, int n2) {
        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Não são Multiplos");
        }
    }

    public static void duracaoJogo(int horaInicial, int horaFinal) {
        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        if (duracao >= 1 && duracao <= 24) {
            System.out.println("A duração do jogo foi de " + duracao + " hora(s).");
        } else {
            System.out.println("Entrada inválida. A duração do jogo deve estar entre 1 e 24 horas.");
        }
    }

    public static double calcularValorTotal(Item[] itens, int codigoItem, int quantidade) {
        for (Item item : itens) {
            if (item.getCodigo() == codigoItem) {
                return item.getPreco() * quantidade;
            }
        }

        return -1;
    }
}

class Item {
    private int codigo;
    private String especificacao;
    private double preco;

    public Item(int codigo, String especificacao, double preco) {
        this.codigo = codigo;
        this.especificacao = especificacao;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public double getPreco() {
        return preco;
    }
}