import java.util.Scanner;

public class atividade2 {
    //2. Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;
        
        System.out.print("Digite um número inteiro: ");
        valor = input.nextInt();

        if (valor > 0) {
            System.out.println("Seu número é positivo!");
        }

        if (valor < 0) {
            System.out.println("Seu número é negativo!");
        }

        if (valor == 0) {
            System.out.println("Seu número é zero!");
        }
        
        
    }
}