/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.*/
public class Medias{
    public static void main(String[] args) {
        double media1 = (8+9+7)/3;
        double media2 = (4+5+6)/3;
        double somaMedias = media1 + media2;
        double medias = (media1 + media2)/2;

        System.out.println("A média de 8, 9, e 7 é: "+media1+"\nE a média de 4, 5 e 6 é: "+media2+"\nA soma das médias: "+somaMedias+"\nE a média das médias: "+medias);
    }
}