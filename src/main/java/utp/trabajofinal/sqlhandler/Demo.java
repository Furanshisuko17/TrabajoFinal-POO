package utp.trabajofinal.sqlhandler;

import java.net.URL;


public class Demo {
    
    public URL url;
    
    public Demo(){
        url = getClass().getResource("/icons/exit.svg");
    }
    public void print(){
        System.out.println("Path: " + url.getFile());
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
        
    }
    
}
