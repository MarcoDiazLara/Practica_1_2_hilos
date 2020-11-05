package practica1_20084;
import javax.swing.*;


public class hilo1 extends Thread {
    
    private JTextArea area;
    
    public hilo1(JTextArea area){
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
