import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class projeto8{
    public static void main(String[] args) {
        String personagem = JOptionPane.showInputDialog("Digite um personagem:");
        String origem = "";
        String nomeImagem = "";

        switch (personagem){
            case "vegeta":
                origem ="planeta sayajin";
                nomeImagem = "vegeta-icone";
                break;
            case "goku"  :
                origem = "planeta sayajin";
                nomeImagem ="goku-icone";
                break;
            case "bulma" :
                origem = "planeta terra";
                nomeImagem ="bulma-icone";
                break;
            case "piccolo":
                origem = "planeta Namekuseijin";
                nomeImagem ="piccolo-icone";
                break;
            case "kuririn":
                origem = "planeta terra";
                nomeImagem ="kuririn-icone";
                break;
            default:
               origem = "origem desconhecida";
               nomeImagem ="default";
                    
        }
        String caminhoImagem = String.format("C:/Users/EMBREAGEM/OneDrive/Área de Trabalho/DevJava/projeto08/img/%s.png",nomeImagem);
        ImageIcon icone = new ImageIcon(caminhoImagem);


        String informacoesPersonagem = String.format("Personagem: %s\nOrigem: %s", personagem, origem);
        JOptionPane.showConfirmDialog(null, informacoesPersonagem, "Descrição", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icone);

    }
}