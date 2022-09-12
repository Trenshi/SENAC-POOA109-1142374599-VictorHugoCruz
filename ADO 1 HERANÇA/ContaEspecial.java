/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
//
/*
 
 * Tarefas: 
 * 1) Faca com que a classe ContaEspecial estenda a classe Conta  ✓
 * 2) Adicione o atributo limite do tipo double e o encapsule  ✓
 * 3) Crie construtores da classe obrigando a passagem do valor do limite na criacao de objetos  ✓
 *  e todos os parametros necessarios anteriormente. 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima tambem o
 *  valor do limite alem do tipo da conta (CONTA ESPECIAL) ✓
 * 5) Faca override do metodo saque para que ele considere o limite na hora de 
 *    verificar se existe ou nao saldo disponivel. ✓
 *    Faca tambem com que este metodo acumule o CPMF devido. -> Já aplicado / ✓
 *
 */
public class ContaEspecial extends Conta {

    double limite;

    public ContaEspecial(double saldoInicial, String num, Cliente tit, Agencia ag, double limite) {
        super(saldoInicial, num, tit, ag);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void imprimeDados() {
        System.out.println("======================================");
        agencia.imprimeDados();
        System.out.println("Coonta de tipo especial.");
        System.out.println("Numero da conta: " + numero);
        titular.imprimeDados();
        System.out.println("Saldo  : R$" + saldo);
        System.out.println("CPMF devido: R$" + acumuladorCPMF);
        System.out.println("Valor do limite: " + limite);
        System.out.println("========================================");
    }

    @Override
    public void saque(double valor) {
        System.out.println("Realizando saque de R$ " + valor + " da conta " + numero);
        if (valor > 0) {
            if (saldo >= valor && limite >= valor) {
                saldo -= valor;
                acumularCPMF(valor);
            } else
                System.out.println("Saldo insuficiente ou limite estourado.");
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
    }

}
