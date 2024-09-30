package Chunin.Condicional;

public class If_else_if_else {
    public static void main(String[] args){
        /*Se o Naruto puder entrar no Modo Kurama, Modo Sábio, ou usar taijutsu,
        de acordo com a quantidade de chakra, ficaria assim:*/

        int chakra = 80;

        if (chakra > 90){
            System.out.println("Naruto entra em Modo Kurama!");
        } else if (chakra >= 50) {
            System.out.println("Naruto Ativa o Modo Sábio!");
        } else {
            System.out.println("Naruto sai na mão no Taijutsu!");
        }
    }
}
