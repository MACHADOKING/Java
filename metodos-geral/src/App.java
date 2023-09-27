public class App {
    public static void main(String[] args) throws Exception {

        /* Funções para Strings */

        String original = "abcde FGHIJ ABC abc DEFG";
        // Transformar caracteres em minúsculos
        String s01 = original.toLowerCase();

        // Transformar ccaracteres em maiusculas.
        String s02 = original.toUpperCase();

        // Remover os espaços nos cantos das strings
        String s03 = original.trim();

        // Exibir/capturar apenas as strings a partir da alocação da mesma. (Sem limite)
        String s04 = original.substring(2);

        // Exibir/capturar apenas as strings a partir da alocação da mesma. (Com limite)
        String s05 = original.substring(2, 9);

        // Trocar o caractere por outro
        String s06 = original.replace("a", "x");

        // Também funciona com substrings
        String s07 = original.replace("abc", "xy");

        // Delata a primeira ocorrência explicita no parâmetro
        int i = original.indexOf("bc");

        // Delata a ultima ocorrência explicita no parâmetro
        int j = original.lastIndexOf("bc");

        // Recorta a string e aloca em um Vetor
        String s = "potato apple lemon";
        String[] vect = s.split(" ");

        System.out.println("Original: - " + original + " -");
        System.out.println("toLowerCase: - " + s01 + " -");
        System.out.println("toUpperCase: - " + s02 + " -");
        System.out.println("Trim: - " + s03 + " -");
        System.out.println("Substring (Sem limite): - " + s04 + " -");
        System.out.println("Substring (Com limite): - " + s05 + " -");
        System.out.println("Replace: - " + s06 + " -");
        System.out.println("Replace (Substring): - " + s07 + " -");
        System.out.println("IndexOf: - " + i + " -");
        System.out.println("LastIndexOf: - " + j + " -");
        System.out.println("Split: - " + vect[0] + " -");

        /*-----------------------------------------------------------------------------*/
    }
}
