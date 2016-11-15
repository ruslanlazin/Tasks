package ua.pp.lazin.inheritance;

/**
 * @author Ruslan Lazin
 */
public class TextFile extends File {

    public TextFile(String fileName) {
        super(fileName);
    }

    public String append(String text) {
        byte[] bytes = super.append(text.getBytes());
        return new String(bytes);
    }




}
