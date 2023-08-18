package services;

import java.math.BigDecimal;
import java.util.Scanner;

import entities.Cliente;
import entities.Conta;

public class AberturaDeContaService {
    private static Scanner sc = new Scanner(System.in);

  


    public static void abrirConta() {
        System.out.println();
        System.out.println("******Bem Vindo Ao DIO-BANK******");
       
        
        System.out.print("Insira o número da conta: ");
        var numero = sc.nextInt();
        System.out.print("Insira o código da Agência: ");
        var agencia = sc.next();
        System.out.print("Digite o nome do Cliente: ");
        var nome = sc.next();
        sc.nextLine();
        System.out.print("Saldo: ");
        var saldoStr = sc.next();

        var saldo = new BigDecimal(saldoStr);
        var cliente = new Cliente(nome);
        var conta = new Conta(numero, agencia,cliente,saldo);

        System.out.println();
        System.out.println("Olá " + cliente.getNome() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + 
        " conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque");

    }




}
