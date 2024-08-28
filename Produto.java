import java.io.*;
public class Produto{
    public static void main(String[] args){
       String s;
       Float valor, desconto, valorComDesconto;
       BufferedReader dado;

        try { 
        System.out.println("Informe o preço do produto R$:");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();

        valor = Float.parseFloat(s);

        System.out.println("Informe o valor de desconto(valor em %): ");
        s = dado.readLine();

        desconto = Float.parseFloat(s);

        valorComDesconto = valor - (valor*(desconto/100));

        System.out.printf("Valor do desconto é de: %.2f%%\n", desconto);
        System.out.printf("Valor do Produto após o desconto R$: %.2f\n", valorComDesconto);
            
        } catch (IOException erro) {
           System.out.println("Houve erro na entrada de dados: "+ erro.toString());
        }catch (NumberFormatException erro){
            System.out.println("Houve erro na conversão, digite apenas"+"caracteres numéricos: "+erro.toString());
        }
        
    }
}