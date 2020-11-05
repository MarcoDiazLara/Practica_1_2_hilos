
package practica1_20084;

import javax.swing.*;

public class hilo2 extends Thread {
    
    private JTextArea area;
    
    public hilo2(JTextArea area){
        this.area=area;
    }
    
    public void run(){
      int i=0;
        
        while(true){
            area.append(i+"\n");
            i++;
        }  
    }
}
