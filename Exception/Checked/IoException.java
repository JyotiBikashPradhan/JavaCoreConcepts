package com.company.Learnjava.Exception.Checked;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IoException {

        public static void main(String[] args) {
            try {
                // Create a new File object representing the file to read
//                File file = new File("C:\\Users\\hp\\IdeaProjects\\untitled\\src\\com\\company\\Learnjava\\Exception\\Checked\\mySQl.txt");
                File file= new File ("mySQl.txt");

                // Create a new FileReader object to read the file
                FileReader reader = new FileReader(file);

                // Create a character array to hold the contents of the file
                char[] buffer = new char[1024];

                // Read from the file into the buffer and print to console
                int length;
                while ((length = reader.read(buffer)) != -1) {
                    String data = new String(buffer, 0, length);
                    System.out.println(data);
                }

                // Close the FileReader object
                reader.close();
            } catch (IOException e) {
                // Handle any IOException that may occur
                System.out.println("Error reading file: " + e.getMessage());
            }
        }


}
