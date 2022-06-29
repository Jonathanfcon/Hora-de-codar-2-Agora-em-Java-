import java.util.Scanner;
        
public class atividade5 {
    //5. Faça um programa que leia dois valores informados pelo usuário e exiba uma das três mensagens a seguir: ‘Números iguais’, caso os números sejam iguais ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; ‘Segundo maior’, caso o segundo seja maior que o primeiro.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeiro;
        int segundo;
        
        System.out.print("Digite o primeiro número inteiro: ");
        primeiro = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        segundo = input.nextInt();
        
        if (primeiro == segundo)
        System.out.println("Os dois valores informados são iguais");
        else if (primeiro > segundo) System.out.println("O primeiro valor é maior");
        else if (primeiro < segundo)System.out.println("O segundo valor é maior");
        
    }
}