package ua.pp.lazin.inheritance;

import java.util.HashMap;

public class FileSystem extends HashMap<String, byte[]> {

    private static FileSystem fileSystem = new FileSystem();

    public static FileSystem getInstance() {
        return fileSystem;
    }

    private FileSystem() {
    }
}
