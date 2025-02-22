import java.util.Scanner;

public class ContaBanco {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();
        

        System.out.print("Por favor, digitar o numero da conta: ");
        conta.setNumero(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Por favor, digitar o numero da agencia: ");
        conta.setAgencia(scanner.nextLine());

        System.out.print("Por favor, digitar o Nome do cliente: ");
        conta.setNomeCliente(scanner.nextLine());

        System.out.print("Por favor, digitar o saldo: ");
        conta.setSaldo(scanner.nextDouble());

        
        System.out.println("Conta criada com sucesso!");
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Nome do cliente: " + conta.getNomeCliente());
        System.out.println("Saldo: R$ " + conta.getSaldo());
        


        scanner.close();
    }
}