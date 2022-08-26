import javax.swing.JOptionPane;

public class pegarCod

{
    public static void imprimirCod() {

        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: "));

        if (cod > 0 && cod <= 10) {
         System.out.print(ArrayProdutos.lista[cod-1]);
        }
        else {
            System.out.print("Código inválido");
        }

    }
}