import java.util.Scanner;
        
public class atividade1 {
    // 1. Escreva um programa em que o usuário informe dois números utilizando o "prompt". Então escreva em tela o maior deles.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int primeiro;
        int segundo;
        
        System.out.print("Digite o primeiro número inteiro: ");
        primeiro = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        segundo = input.nextInt();
        
        if (primeiro > segundo)
        System.out.println("O maior número é " + primeiro);
        else System.out.println("O maior número é " + segundo);
        
    }
}