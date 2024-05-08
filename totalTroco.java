package A1;

import java.util.Scanner; 

public class totalTroco {
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        String nome;
        double valorCompra,valorPago,trocoCompra;


        System.out.println("==========MERCADO PAIVA==========");
        System.out.println("Bem vindo, por favor inisira seu nome: ");
        nome = ler.next();
        System.out.println("Por favor, insira o valor de sua compra: ");
        valorCompra = ler.nextDouble();
        System.out.println("Por favor, insira o valor pago: ");
        valorPago = ler.nextDouble();
        System.out.println("==========MERCADO PAIVA==========");

        trocoCompra = valorPago - valorCompra;


        System.out.println("==========PAGAMENTOS PAIVA==========");
        int notas100 = (int) (trocoCompra / 100);
        trocoCompra %= 100;

        int notas50 = (int) (trocoCompra / 50);
        trocoCompra %= 50;

        int notas20 = (int) (trocoCompra / 20);
        trocoCompra %= 20;

        int notas10 = (int) (trocoCompra / 10);
        trocoCompra %= 10;

        int notas5 = (int) (trocoCompra / 5);
        trocoCompra %= 5;

        int notas2 = (int) (trocoCompra / 2);
        trocoCompra %= 2;

        int notas1 = (int) trocoCompra;

        System.out.println("Nome do cliente: " + nome);
        System.out.println("Valor total da compra: R$" + valorCompra);
        System.out.println("Valor pago pelo cliente: R$" + valorPago);
        
        if (valorCompra > valorPago){
            System.out.println("Valor insuficiente para realizar a compra.");
            System.out.println("==========PAGAMENTOS PAIVA==========");
        }
        else {
            trocoCompra = valorPago - valorCompra;
            System.out.println("Troco:");
            System.out.println("Valor total do troco: R$"+ trocoCompra);
            System.out.println("R$100: " + notas100);
            System.out.println("R$50: " + notas50);
            System.out.println("R$20: " + notas20);
            System.out.println("R$10: " + notas10);
            System.out.println("R$5: " + notas5);
            System.out.println("R$2: " + notas2);
            System.out.println("R$1: " + notas1);    
            System.out.println("==========PAGAMENTOS PAIVA==========");
        }

        

    }




}
