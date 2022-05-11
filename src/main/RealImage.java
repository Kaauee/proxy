package main;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        LoadFromDisk(fileName);
    }



    @Override
    public void Display() {
        System.out.println("Displaying: " + fileName);
    }

    public void LoadFromDisk(String FileName) {
        System.out.println("Loading: " + fileName);
    }

}
