//TODO: Conhecer e importar a classe Scanner
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Exibir as mensagens para o usuário
        System.out.println("Bem-vindo ao sistema de criação de contas bancárias!");
        System.out.println("Por favor, preencha as informações solicitadas abaixo:");
        
        //Obter pelo scanner os valores digitados no terminal
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Digite o número da agência (formato XXX-X):");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble();
        
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}