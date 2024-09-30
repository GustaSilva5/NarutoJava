package Chunin;

public class OperacaoAritmetica {
    public static void main(String[] args){
        /*
        * As operações aritméticas em Java são como golpes de taijutsu de um ninja, rápidas e diretas.
            +: Adição (como ganhar mais chakra).
            -: Subtração (usar chakra em uma técnica).
            *: Multiplicação (multiplicação de clones das sombras!).
            /: Divisão (usar metade do chakra em um golpe).
        * */

        int clone = 5; //Naruto Cria 5 Clones
        int JutsuPorClone = 3; //Cada Clone Faz 3 Jutsus
        int totalJutsu = clone * JutsuPorClone;

        System.out.println("Total de Jutsu " + totalJutsu);

        //Naruto usa metade do seu chakra

        double chakra = 9877.99;
        double chakraRestante = chakra / 2;

        System.out.println("Chakra Restante é " + chakraRestante);
    }
}
