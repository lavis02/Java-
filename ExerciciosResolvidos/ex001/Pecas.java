/*Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */
import javax.swing.*;
public class Pecas{
    public static void main(String[] args) {
        
        double ipi = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem do IPI: "));

        int cod1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da peça 1: "));
        double valorPeca1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da peça 1 R$: "));
        int quant1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade da peça 1: "));

        int cod2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da peça 2: "));
        double valorPeca2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da peça 2 R$: "));
        int quant2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade da peça 2: "));


        double formula = ((valorPeca1*quant1) + (valorPeca2*quant2)) * (ipi/100+1);

        JOptionPane.showMessageDialog(null,"Total a ser pago R$ " + formula);

        
    }
}