package Chunin.Repeticao;

public class SegundaRep {
    public static void main(String[] args){
        /*
        * Agora imagine que o Naruto está treinando até que seu chakra acabe.
        * O laço while é útil quando não sabemos exatamente quantas repetições ocorrerão,
        * mas repetimos até uma condição ser falsa.*/

        int chakra = 100;

        while (chakra > 0){
            System.out.println("Naruto Usa Rasengan! Chakra Restante: " + chakra);
            chakra -= 20; //Cada Jutsu consome 20 de chakra
        }

        System.out.println("Naruto esta sem chakra");
    }
}

/*
O laço while vai continuar enquanto chakra for maior que 0.
A cada uso do Rasengan, o chakra é reduzido em 20.
*/