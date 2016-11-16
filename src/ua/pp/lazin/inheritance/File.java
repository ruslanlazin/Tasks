package ua.pp.lazin.inheritance;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Создать объект класса Текстовый файл, используя класс Файл. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить.
 *
 * @author Ruslan Lazin
 */
public class File {

    FileSystem fileSystem = FileSystem.getInstance();
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public boolean createNewFile() throws IOException {
        if (fileSystem.containsKey(fileName)) {
            throw new IOException("file already exist!");
        }
        fileSystem.put(fileName, new byte[0]);
        return true;
    }

    public boolean renameTo(String newFileName) {
        byte[] body = fileSystem.remove(fileName);
        this.fileName = newFileName;
        fileSystem.put(fileName, body);
        return true;
    }

    public void printBody() {
        System.out.println(this);
    }

    public byte[] getBody() {
        return fileSystem.get(fileName);
    }

    public byte[] append(byte[] bytes) {
        byte[] body = getBody();
        byte[] newBody = new byte[body.length + bytes.length];
        System.arraycopy(body, 0, newBody, 0, body.length);
        System.arraycopy(bytes, 0, newBody, body.length, bytes.length);
        fileSystem.put(fileName, newBody);
        return newBody;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj != null) && (obj instanceof File)) {
            File that = (File) obj;
            return this.fileName.equals(that.getFileName());
        }
        return false;
    }

    @Override
    public String toString() {
        return "File{" +
                " fileName='" + fileName + '\'' +
                ", fileBody='" + Arrays.toString(getBody()) + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = fileName.hashCode();
        return result;
    }
}
