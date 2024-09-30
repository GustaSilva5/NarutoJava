package Chunin.Repeticao;

public class PrimeiraRep {
    public static void main(String[] args){
        /*Imagine que o Naruto está treinando para melhorar seu Rasengan.
        E ele quer fazer o movimento 10 vezes para ficar mais forte.
        O laço for é ideal quando sabemos o número exato de repetições.*/

        //Naruto quer treinar o Rasengan 10 vezes
        //entendendo o codigo, int recebe o numero, que enquanto não seja maior que 10 ira repedir mais uma vez
        for (int i = 1; i <= 10; i++){
            System.out.println("Naruto treina Rasengan pela " + i + "° vez.");
        }
    }
}

 /*
 int i = 1: Inicializamos a variável i para começar a contagem.
 i <= 10: O laço se repetirá enquanto i for menor ou igual a 10.
 i++: Após cada repetição, i é incrementado.
*/

/*
For: Usado quando você sabe o número exato de repetições.
While: Usado quando você não sabe quantas vezes a repetição vai acontecer, mas repete enquanto a condição for verdadeira.
Do-while: Similar ao while, mas garante que o código será executado pelo menos uma vez, independentemente da condição.
*/