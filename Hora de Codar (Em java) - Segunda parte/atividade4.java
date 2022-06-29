import java.util.Scanner;

public class atividade4 {
    //4. Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
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

            if (valor1 < valor2 && valor2 < valor3 || valor1 > valor2 && valor2 > valor3) {
            int resultado = valor1 + valor2;
            System.out.print("A soma entre os dois maiores valores corresponde a: " + resultado);
            }

            if (valor3 > valor2 && valor1 < valor3 || valor3 < valor2 && valor1 > valor3) {
            int resultado = valor1 + valor3;
            System.out.print("A soma entre os dois maiores valores corresponde a: " + resultado);
            }
            
        }

        if (valor1 < valor2 && valor2 > valor3) {

            if (valor1 > valor2 && valor1 < valor3 || valor1 < valor2 && valor1 > valor3) {
            int resultado = valor2 + valor1;
            System.out.print("A soma entre os dois maiores valores corresponde a: " + resultado);
            }

            if (valor3 > valor2 && valor1 < valor3 || valor3 < valor2 && valor1 > valor3) {
            int resultado = valor2 + valor3;
            System.out.print("A soma entre os dois maiores valores corresponde a: " + resultado);
            }
        }

        if (valor3 > valor2 && valor1 < valor3) {
            
            if (valor1 > valor2 && valor1 < valor3 || valor1 < valor2 && valor1 > valor3) {
            int resultado = valor3 + valor1;
            System.out.print("A soma entre os dois maiores valores corresponde a: " + resultado);
            }

            if (valor1 < valor2 && valor2 < valor3 || valor1 > valor2 && valor2 > valor3) {
            int resultado = valor3 + valor2;
            System.out.print("A soma entre os dois maiores valores corresponde a: " + resultado);
            }

        }

               
    }
}