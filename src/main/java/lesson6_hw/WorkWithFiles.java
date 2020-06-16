package lesson6_hw;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class WorkWithFiles {
    private static final Random rnd = new Random();
    private static final int a = 65;
    private static final int b = 90;

    private static String symbolGen(int amount){
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < amount; i++)
            string.append((char) (a + rnd.nextInt(b - a)));
        return string.toString();
    }

    public static void writeToFile(String fileName, int lenght) throws IOException {
        FileOutputStream os = new FileOutputStream(fileName);
        os.write(symbolGen(lenght).getBytes());
        os.flush();
        os.close();
    }

    public static void uniteFiles(String file1, String file2, String fileOut) throws IOException {
        FileOutputStream os = new FileOutputStream(fileOut);
        int x;
        FileInputStream is = new FileInputStream(file1);
        while ((x = is.read()) != -1)
            os.write(x);
        is.close();

        is = new FileInputStream(file2);
        while ((x = is.read()) != -1)
            os.write(x);
        is.close();
        os.flush();
        os.close();
    }

    public static void putWordInFile(String fileName, String word) throws IOException{
        FileOutputStream os = new FileOutputStream(fileName, true) ;
        os.write(word.getBytes());
        os.flush();
        os.close();
    }

    public static boolean searchWorldInFile(String fileName, String search) throws IOException {
        FileInputStream is = new FileInputStream(fileName);
        byte[] searchWord = search.getBytes();
        int x;
        int i = 0;
        while ((x = is.read()) != -1) {
            if (x == searchWord[i])
                i++;
            else {
                i = 0;
                if (x == searchWord[i]) i++;
            }
            if (i == searchWord.length) {
                is.close();
                return true;
            }
        }
        is.close();
        return false;
    }

}
