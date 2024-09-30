package Chunin.Condicional;

public class Switch {
    public static void main(String[] args){
    //Agora, vamos usar o switch para que o Naruto escolha uma técnica dependendo do adversário.
        String adversario = "Sasuke";

        switch (adversario){
            case "Madara":
                System.out.println("Naruto usa Rasenshuriken!");
                break;
            case "Sasuke":
                System.out.println("Naruto usa discurso nojutsu!");
                break;
            case "Kakashi":
                System.out.println("Naruto Usa Clones da Sombra");
                break;
            default:
                System.out.println("Naruto usa Rasengan");
                break;
        }


    }
}
