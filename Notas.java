import javax.swing.JOptionPane;
class Notas{
    public static void main(String[] args) {
        String aux;
        float prova1, prova2, trabalho, media;
        try {
            aux = JOptionPane.showInputDialog("Informe a primeira nota: ");
            prova1 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Informe a segunda nota:");
            prova2 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Informa a nota do trabalho: ");
            trabalho = Float.parseFloat(aux);

            media = (prova1 + prova2 + trabalho)/3;
            
            if( media >= 6){
            JOptionPane.showMessageDialog(null,String.format("APROVADO!!\n Parabéns, sua média é: %.2f", media));
           }else{
            JOptionPane.showMessageDialog(null,String.format("REPROVADO :(\n Infelizmente você não atingiu a média mínima(6).\n sua média é: %.2f", media));
           }

        } catch (NumberFormatException erro) {
           System.out.println("Houve erro na conversão, digie apenas " + "caracteres numéricos: "+ erro.toString());
        }
        System.exit(0);
    }
}
