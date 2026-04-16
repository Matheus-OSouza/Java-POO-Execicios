import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Você esta no sistema do seu banco!");

            System.out.println("Qual é o seu saldo atual?");
            double saldo = sc.nextDouble();


        System.out.println("o que deseja fazer?");
        System.out.println();
        int escolhaUsuario = sc.nextInt();




        switch (escolhaUsuario) {
            case 1: //ver saldo
                    System.out.printf("R$%.2f", saldo);
                    break;
            case 2: // depositar
                System.out.println("Digite o valor do deposito: ");
                double deposito = sc.nextDouble();

                if (deposito > 0) {
                    saldo = saldo + deposito;
                    System.out.println("Deposito realizado com sucesso!");
                } else {
                    System.out.println("Não foi possivel realizar o deposito");
                }
                break;

            case 3: // sacar
                System.out.println("Digite o valor do saque: ");
                double saque = sc.nextDouble();

                if (saque > saldo) {
                    System.out.println("saldo indisponivel");
                } else {
                    saldo = saldo - saque;
                }
                break;

        }

    }
}
