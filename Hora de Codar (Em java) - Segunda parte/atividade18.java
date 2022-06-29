import java.util.Scanner;

public class atividade18 {
        //18 - Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double peso1;
        double peso2;


        System.out.println("Por favor, informe de acordo com seu sexo: Digite 1 para feminino,ou, 2 para masculino");
        int sexo = in.nextInt();

        System.out.println("Por favor, informe sua altura ");
        double altura = in.nextDouble();


        if (sexo == 1) {
            peso1 = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é: " + peso1);
        } else if (sexo == 2) {
            peso2 = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é: " + peso2);
        } else {
            System.out.println("Resposta invalida!");
        }
    }
}