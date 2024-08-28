import javax.swing.JOptionPane;
class Usuario{
    public static void main(String[] args) {
        String login, senha;
        int tentativas = 3;

        while(tentativas > 0){
            login = JOptionPane.showInputDialog("Informe o login: ");
            senha = JOptionPane.showInputDialog("Informe a senha:");

            if (login.equals("java8") && senha.equals("java8")) {
                JOptionPane.showMessageDialog(null,"Acesso AUTORIZADO!\n login e senha corretos.");
                break;
            }else{
                tentativas--;
                JOptionPane.showMessageDialog(null, "Acesso NEGADO!\n login e/ou senha incorretos.\n Tentativas restantes: " + tentativas);

                if (tentativas == 0){
                    JOptionPane.showMessageDialog(null, "Número máximo de tentativas excedido! Acesso Bloqueado.");
                }
            }
        }
    }
}
