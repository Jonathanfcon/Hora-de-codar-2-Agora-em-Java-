import java.util.Scanner;

public class atividade3 {
    //3. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1;
        int valor2;
        int valor3;
        
        System.out.print("Digite o primeiro número inteiro: ");
        valor1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        valor2 = input.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        valor3 = input.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("O primeiro valor informado foi o maior.");
        }

        if (valor1 < valor2 && valor2 > valor3) {
            System.out.println("O segundo valor informado foi o maior.");
        }

        if (valor3 > valor2 && valor1 < valor3) {
            System.out.println("O terceiro valor informado foi o maior.");
        }

        if (valor1 == valor2 && valor1 == valor3) {
            System.out.println("Todos valores informados são iguais.");
        }
               
    }
}