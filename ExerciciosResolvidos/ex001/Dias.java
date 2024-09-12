/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/
import java.util.*;

public class Dias{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe sua idade, meses e dias separados por espaço: ");
        String entrada = sc.nextLine();

        String [] valores = entrada.split(" ");

        int idade = Integer.parseInt(valores[0]);
        int meses = Integer.parseInt(valores[1]);
        int dias = Integer.parseInt(valores[2]);

        int resultadoIdade = idade * 365;
        int resultadoMeses = meses * 30;
        int resultadoFinal = resultadoIdade + resultadoMeses + dias;

        System.out.println("Sua idade expressa em dias é: " + resultadoFinal + " dias.");



        


        
    }
}