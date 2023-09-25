public class Matematica {
    public static void main(String[] args) throws Exception {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        // .sqrt() é uma função para transfomar em Raiz Quadrada.
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        // .pow() é uma função para Elevar ao Quadrado.
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        B = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        // .abs() é uma função para chamar o valor absoluto do parâmetro
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

        // Realizando a expressão do famoso "Delta"
        int a = 5;
        int b = 8;
        int c = 2;
        double delta = Math.pow(b, 2.0) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        System.out.println("O resultado de x1 é: " + x1);
        System.out.println("O resultado de x2 é: " + x2);

    }
}
