package Chunin.Condicional;

public class if_Else {
    public static void main(String[] args){
        //Agora, se o Naruto não tiver chakra suficiente para o Modo Sábio, ele vai usar taijutsu.

        int chakra = 60;

        if (chakra >= 50) {
            System.out.println("Naruto Ativa seu Modo Sábio!");
        } else {
            System.out.println("Naruto Usa Taijutsu igual Rock Lee");
        }
    }
}
