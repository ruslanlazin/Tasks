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

    @Override
    public boolean equals(Object obj) {
        if ((obj != null) && (obj instanceof TextFile)) {
            TextFile that = (TextFile) obj;
            return this.getFileName().equals(that.getFileName());
        }
        return false;
    }

    @Override
    public String toString() {
        return
                "TextFile{" +
                        " fileName='" + getFileName() + '\'' +
                        ", fileBody='" + new String(getBody()) +
                        "'}";
    }
}
