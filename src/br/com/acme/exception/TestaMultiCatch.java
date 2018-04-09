package br.com.acme.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestaMultiCatch {

    public static void main(String[] args) {
      
        String filename = args[0];
        try {
            System.out.println( filename.length() );
            
            File f = new File( filename );    // NullPointerException            
            FileWriter w = new FileWriter(f); // IOException
            
        }catch(NullPointerException | IOException ex) {
            System.out.println(ex);
        }        
        
    }
}
