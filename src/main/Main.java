package main;

public class Main {

    public static void main(String[] args) {

        Image image = new ProxyImage("test_1gb.png");
        
        //Imagem sera carregada no disco
        image.Display();
        System.out.println("");
        
        //Imagem nao sera carregada no disco
        image.Display();
        
    }

}
