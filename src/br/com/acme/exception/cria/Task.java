
package br.com.acme.exception.cria;


public class Task {
    
    public void doWork(int[] data) throws TaskException {
        
        if (data.length > 100) {
            throw new TaskException("Too much data. Please, split it and try again!");
        }
        
    }    
    
}
