package contaBancaria;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.println("Qual numero da conta?");
        int numeroConta = scan.nextInt();


        System.out.println("Qual o titular da conta? ");
        scan.nextLine();
        String titular = scan.nextLine();




        System.out.println("Qual saldo inicial da conta? ");
        double saldoInicial = scan.nextDouble();


        System.out.println("Qual sera o limite de saque?");
        double limiteSaque = scan.nextDouble();


        Account c1 = new Account(numeroConta, titular, saldoInicial, limiteSaque);

        System.out.println("Dados da conta");
        System.out.println("Número: " + c1.getNumber());
        System.out.println("Titular: " + c1.getHolder());
        System.out.println("Saldo inicial: " + c1.getBalance());
        System.out.println("Limite de saque: " + c1.getWithdrawLimit());

        System.out.println("Informe uma quantia para sacar: ");
        double saque = scan.nextDouble();



           try {
               c1.withdraw(saque);
               System.out.println("Saldo atual, apos transacao: " + c1.getBalance());
           }
           catch(BusinessException e) {
               System.out.print(e.getMessage());
        }




        scan.close();
    }

}
