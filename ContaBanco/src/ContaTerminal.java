import java.util.*;

public class ContaTerminal {

    /* Função main para um sisples programa em java que 
     * simulará uma "Conta bancaria, solicitando os dados
     * do usuario e os mostrando no terminal"
    */
    public static void main(String[] args) throws Exception {
        
        //Criação do Scanner para entrada de dados
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);;

        //Variavel num recebe o numero da conta (variavel tipo Integer)
        System.out.print("Por favor, insira o número de sua conta: ");
        var num = sc.nextInt();

        //Variavel agen recebe o código da agencia (variavel tipo String)
        System.out.print("Por favor, insira o código de sua agencia bancária: ");
        var agen = sc.next();
        sc.nextLine(); // para consumir a quebra de linha

        //Variavel nome recebe o nome do usuario (variavel tipo String)
        System.out.print("Por favor, insira se nome: ");
        var nome = sc.nextLine();

        //Variavel saldo recebe o saldo do usuario (variavel tipo Float)
        System.out.print("Por favor, insira seu saldo: ");
        var saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %i e seu saldo %f já está disponível para saque", nome, agen, num, saldo);

        sc.close();
    }
}
