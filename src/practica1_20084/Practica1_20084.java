package practica1_20084;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Practica1_20084 extends JFrame {

    private JButton brun,bstop,bdet;
    private JLabel et1,et2;
    private JTextArea area1,area2;
    private JScrollPane jsp1,jsp2;
    
    
    public Practica1_20084(){
        setSize(400,400);
        setTitle("Condiciones de competencia");
        Miscomponentes();
    }
    
    private void Miscomponentes(){
        brun = new JButton("Correr");
        bstop = new JButton("Pausa");
        bdet = new JButton("Detener");
        area1= new JTextArea();
        area2=new JTextArea();
        jsp1= new JScrollPane(area1);
        jsp2= new JScrollPane(area2);
        et1 = new JLabel("Hilo 1");
        et2 = new JLabel("Hilo 2");
        setLayout(null);
        
        brun.setBounds(10, 100, 100, 25);
        bstop.setBounds(10, 150, 100, 25);
        bdet.setBounds(10, 200, 100, 25);
        et1.setBounds(150,10,100,25);
        et2.setBounds(250,10,100,25);
        jsp1.setBounds(150,50,100,300);
        jsp2.setBounds(250,50,100,300);
        add(brun);
        add(bstop);
        add(bdet);
        add(et1);
        add(et2);
        add(jsp1);
        add(jsp2);
        
        
        brun.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                hilo1 t1 = new hilo1(area1);
                hilo2 t2 = new hilo2(area2);
                
                t1.start();
                t2.start();
            }
        });
        
        bstop.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                hilo1 t1 = new hilo1(area1);
                hilo2 t2 = new hilo2(area2);
                
                t1.stop();
                t2.stop();
            }
        });
    }
    
    
    public static void main(String[] args) {
      Practica1_20084 fr = new Practica1_20084();
      fr.setVisible(true);
      fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
