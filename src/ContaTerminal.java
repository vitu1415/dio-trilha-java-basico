import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = sc.nextInt();
        
        String agencia = "067-8";
        String nome = "Mario Andrade";
        double saldo = 237.48;

        System.out.println("Olá"+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
    }
}
