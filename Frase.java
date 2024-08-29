import javax.swing.JOptionPane;
class Frase{
    public static void main(String[] args) {

        String Frase = JOptionPane.showInputDialog(null,"Digite uma frase, por favor");

        String FraseInvertida = new StringBuilder(Frase).reverse().toString().replace(" ", "");

        JOptionPane.showMessageDialog(null, FraseInvertida,"Frase ao contrario e sem espaços",JOptionPane.INFORMATION_MESSAGE);

    }
}
