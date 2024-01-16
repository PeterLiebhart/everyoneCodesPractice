package io.everyonecodes.java.t5_loops.set1.exercise6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<String> fileNames = getAllPhotoFileNames();

    public static void renameFile(String oldName, String newName){
//Dummy renaming function which just prints the names. Usually to rename you will need a function from the java.io.File class.
        System.out.println("File " + oldName + " has been renamed to " + newName);
    }

    public static List<String> getAllPhotoFileNames(){
        List<String> photoList = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            photoList.add("photo" + i + ".jpg");
        }
        return photoList;
    }


    public static String generateNewName(String fileName) {
        String withoutExtension = fileName.substring(0, fileName.length() - 3);
        return withoutExtension.concat("png");
    }

    public static void main(String[] args) {
        for (String names : fileNames) {
            renameFile(names, generateNewName(names));
        }
    }
}
