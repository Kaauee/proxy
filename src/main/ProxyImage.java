package main;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String FileName) {
        this.fileName = FileName;
    }

 
    @Override
    public void Display() {

        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.Display();
    }

}
