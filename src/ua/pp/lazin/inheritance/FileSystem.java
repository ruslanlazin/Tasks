package ua.pp.lazin.inheritance;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ruslan on 11/15/2016.
 */
public class FileSystem extends HashMap<String, byte[]> {

    private static FileSystem ourInstance = new FileSystem();

    public static FileSystem getInstance() {
        return ourInstance;
    }

    private FileSystem() {
    }
}
