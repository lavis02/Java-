import javax.swing.JOptionPane;
public class Reajuste{
    public static void main(String[] args) {

        Double saldo = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o seu saldo: "));

        double reajuste = saldo * 0.01;
        double saldoComReajuste = saldo + reajuste;
        String saldoFormatado = String.format("%.2f",saldoComReajuste);

        JOptionPane.showMessageDialog(null, "Saldo com reajuste de 1% \nR$: "+saldoFormatado);

    }
}