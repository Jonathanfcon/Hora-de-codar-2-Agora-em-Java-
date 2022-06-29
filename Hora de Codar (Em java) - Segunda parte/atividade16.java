import java.util.Scanner;

public class atividade16 {
    //16 - As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas (considere que o usuário informará a quantidade), e calcule e escreva o valor total da compra.
    public static void main(String [] args){
        int quant;
        double conta;
        Scanner in = new Scanner(System.in);

        System.out.print("Quantas maças vai levar?");
        quant = in.nextInt();

        if (quant < 12){
            conta = quant * 0.30;
            System.out.println("Voce vai levar " + quant + ", maças e tera que pagar: R$ " + conta);
        }
        if (quant >= 12){
            conta = quant * 0.25;
            System.out.println("Voce vai levar " + quant + ", maças e tera que pagar: R$ " + conta);
        }
    }
}