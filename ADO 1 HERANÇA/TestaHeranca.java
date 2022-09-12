/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
 //
 /*
 * 
 * Esta classe e responsavel pelo teste das Herancas desenvolvidas nas classes 
 *  Conta e ContaEspecial
 * 
 * Altere o metodo main fazendo com que sejam criadas 02 contas especiais e 01 conta poupanca.  ✓
 * Realize 1 saque na 1a. conta especial cujo valor exceda o saldo mas nao ultrapasse o limite. ✓
 * Realize 1 saque na 2a. conta especial cujo valor ultrapasse o saldo e o limite. ✓
 * Realize 1 saque na conta poupanca que exceda o saldo. ✓
 * Imprima os dados das contas para conferir se estao corretas. ✓
 * 
 * Dica: Para obter a data do sistema e transformar em String: 
 *  String strData = new java.util.Date().toString();
 * 
 */
public class TestaHeranca {

    public static void main(String args[]) {
        Banco banco = new Banco("POO Bank", 1000);
        Agencia ag1 = new Agencia("001", banco);
        
        Cliente cliente1 = new Cliente("Cliente 1", "1232323");
        Cliente cliente2 = new Cliente("Cliente 2", "987789");
        Cliente cliente3 = new Cliente("Cliente 3", "483953");
        
        ContaEspecial conta1 = new ContaEspecial(500, "741852", cliente1, ag1, 3000); 
        ContaEspecial conta2 = new ContaEspecial(1000,"493850", cliente2, ag1, 5000);
        ContaPoupanca conta3 = new ContaPoupanca(700, "937593", cliente3, ag1, "27/02/2003");
        conta1.saque(1000);
        conta2.saque(6000);
        conta3.saque(1000);
        conta1.imprimeDados();
        conta2.imprimeDados();
        conta3.imprimeDados();

        //Eu fiz as contas requisitadas e saques por cima do código original.
        
        
        
    }
}
