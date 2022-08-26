import javax.swing.JOptionPane;

//@author Victor Hugo Cruz
//Objetivo: Busca e produto
//Descrição: Fazer busca do produto e seu preço pelo seu respectivo código.

public class POO2608 {
    public static void main(String[] args) {
    int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: "));

    String produto[] = new String[10];
    float preço[] = new float[10];

    produto[0] = "Celular";
    produto[1] = "Computador";
    produto[2] = "Ventilador";
    produto[3] = "Teclado";
    produto[4] = "Geladeira";
    produto[5] = "Microondas";
    produto[6] = "Arcondicionado";
    produto[7] = "Aquecedor";
    produto[8] = "Furadeira";
    produto[9] = "Fogão";

    preço[0] = 1500;
    preço[1] = 3500;
    preço[2] = 200;
    preço[3] = 300;
    preço[4] = 999.99f;
    preço[5] = 700;
    preço[6] = 1999.99f;
    preço[7] = 300;
    preço[8] = 500;
    preço[9] = 1199.99f;

    if (cod > 0 && cod <= 10) {
        System.out.print("Seu produto é: " + produto[cod-1] + ", com preço de: " + preço[cod-1] + "!");
    }
    else {
        System.out.print("Código de produto inválido.");
    }

    }
}