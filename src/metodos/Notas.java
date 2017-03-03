/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodos;

import clases.Estudiante; 
import java.util.Date;

/**
 *
 * @author anunez12
 */
public class Notas {    
    public static void main(String[] args) {
      Estudiante estudiante_uno = new Estudiante("Maria Luisa",123333, "Hoteleria", new Date(76,02,18));   
      
      estudiante_uno.adiccionar_nota(0.0); 
      estudiante_uno.adiccionar_nota(2.0);
      estudiante_uno.adiccionar_nota(4.5);     
      
        System.out.println(estudiante_uno);    
        System.out.println("La mayor nota de la estudiante Maria Luisa es:"+estudiante_uno.Mayor_Nota()); 
        System.out.println("La menor nota de la estudiante Maria Luisa es"+estudiante_uno.Menor_Nota());      
       
       
        
    }
    
}
