import java.util.Scanner;

public class ContaTerminal {
    private String titular;
    private int agencia;
    private int numero;
    private float saldo;

    public ContaTerminal() {
    }

    public ContaTerminal(String titular, int agencia, int numero) {
        this.titular = titular;
        this.saldo = 0.0F;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Valor mais alto que o saldo da conta! Tente um valor menor");
            return;
        }
        saldo -= valor;
        System.out.println(String.format("Saldo realizado com sucesso valor restante %.2f", saldo));
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println(String.format("Valor depositado com sucesso novo saldo %.2f", saldo));
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite o número da Agência:");
        conta.agencia = Integer.parseInt(scanner.nextLine());

        System.out.println("Agora, digite o número da Conta:");
        conta.numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número da conta

        System.out.println("Por favor, digite o nome do Cliente:");
        conta.titular = scanner.nextLine();


        System.out.println("Olá " + conta.titular + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.agencia + ", conta " + conta.numero + " e seu saldo R$" + conta.saldo + " já está disponível para saque.");

        scanner.close();
    }
}
