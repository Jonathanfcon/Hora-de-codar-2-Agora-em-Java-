import java.util.Scanner;
        
public class atividade7 {
    //7. Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, o último e o maior de todos eles (considere que todos os números informados serão diferentes)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeiro;
        int segundo;
        int terceiro;
        int quarto;
        
        System.out.print("Digite o primeiro número inteiro: ");
        primeiro = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        segundo = input.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        terceiro = input.nextInt();

        System.out.print("Digite o quarto número inteiro: ");
        quarto = input.nextInt();

        System.out.println("O primeiro número informado foi " + primeiro + " e o último número informado foi " + quarto);

        if (primeiro > segundo && primeiro > terceiro && primeiro > quarto)
        System.out.println(" O maior número entre todos informados é " + primeiro);

        if (primeiro < segundo && segundo > terceiro && segundo > quarto)
        System.out.println(" O maior número entre todos informados é " + segundo);

        if (terceiro > segundo && primeiro < terceiro && terceiro > quarto)
        System.out.println(" O maior número entre todos informados é " + terceiro);

        if (quarto > segundo && quarto > terceiro && primeiro < quarto)
        System.out.println(" O maior número entre todos informados é " + quarto);

        
    }
}