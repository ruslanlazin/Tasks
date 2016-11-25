package ua.pp.lazin.inheritance;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        File plainFile = new File("plain");
        plainFile.createNewFile();
        byte[] bytes = {6, 8, 9, 99, 77, 55};
        plainFile.append(bytes);
        System.out.println(plainFile);

        TextFile textFile = new TextFile("text");
        textFile.createNewFile();
        textFile.append("la-la");
        System.out.println("\n File text as textFile");
        textFile.printBody();
        File file = new File("text");
        System.out.println("\n File text as File of any type");
        file.printBody();


        System.out.println("\n File the same, but has references of different type ");
        System.out.println("Is File 'text' equals TextFile 'text' ? " + file.equals(textFile));

        System.out.println("\n" + file.hashCode());
        System.out.println(textFile.hashCode());
        System.out.println(plainFile.hashCode());
    }
}
