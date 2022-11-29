import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        try (FileWriter fileWriter=new FileWriter("inputText.txt")){
            fileWriter.write("\n Shape of my heart");
            fileWriter.write("\n Sting");
            fileWriter.write("\n He deals the cards as a meditation\n" +
                    "And those he plays never suspect\n" +
                    "He doesn't play for the money he wins\n" +
                    "He don't play for respect");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fileReader=new FileReader("inputText.txt");
            Song song =new Song("Classic","Sting","Shape of my heart");
            System.out.println(song);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}