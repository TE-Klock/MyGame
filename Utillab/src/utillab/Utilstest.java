/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Master Chu
 */
package utillab;
import java.util.*;

public class Utilstest {
    
    void Menu_user_input(){
        
        Scanner user_input = new Scanner(System.in);
        String Input = user_input.nextLine();
        Input = Input.toLowerCase();
        
        switch (Input){
            case "rng":
                RNG(50,20);
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;    
            case "7":
                break;
            case "exit":
                Utillab.running = false;
                break;
            default:
                System.out.println(Input + " Is an Invalid input.");
                
            }
    }
    
    
    void RNG(int max,int min){
    
        Random rndn = new Random();
        int loopval = 30;
        for(int i=0;i < loopval; i++){
            
            int result = rndn.nextInt((max - 1) + 1) + 1 - min;
            System.out.println(result);
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}