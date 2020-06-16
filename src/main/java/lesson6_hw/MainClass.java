package lesson6_hw;

import java.io.IOException;

public class MainClass {



    public static void main(String[] args) throws IOException {

        WorkWithFiles.writeToFile("firstFile.txt", 50);
        WorkWithFiles.writeToFile("secondFile.txt", 70);
        WorkWithFiles.uniteFiles("firstFile.txt", "secondFile.txt", "fileOut.txt");
        WorkWithFiles.putWordInFile("fileOut.txt", "Yesterday");
        if (WorkWithFiles.searchWorldInFile("fileOut.txt", "Yesterday"))
            System.out.println("Слово найдено");
        else System.out.println("Слово не найдено");




    }
}
