/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utillab;

/**
 *
 * @author Master Chu
 */
public class Utillab {
    
    static boolean running;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        running = true;
        
        Utilstest util = new Utilstest();
        
        do {
            util.Menu_user_input();
        }
        while(running == true);
        
        
    }
        
    
    
}
