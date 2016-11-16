package ua.pp.lazin.inheritance;

import java.io.IOException;

/**
 * Created by Ruslan on 11/15/2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        File plainFile = new File("plain");
        plainFile.createNewFile();
        byte[] bytes ={6,8,9,99,77,55};
        plainFile.append(bytes);
        System.out.println(plainFile);

        TextFile textFile = new TextFile("text");
        textFile.createNewFile();
        textFile.append("la-la");
        System.out.println(textFile);


    }
}
