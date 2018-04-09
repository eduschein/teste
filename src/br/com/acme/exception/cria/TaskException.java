package br.com.acme.exception.cria;

import java.util.Date;

public class TaskException extends RuntimeException {
            
    public TaskException() {
        this("Unknown message");
    }

    public TaskException(String message) {               
        super("Date: "+new Date()+"\n"+message);
    }    
    
}
