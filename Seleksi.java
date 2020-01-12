/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleksi;
import java.util.Scanner;
import static java.lang.System.in ;
import static java.lang.System.out ;

public class Seleksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int umur ;
        String grade ;
        Scanner Baca = new Scanner (in);
        out.print ("umur :");
        umur = Baca.nextInt();
        
        if (umur >17 ){
            grade = "dewasa";
        }
        else if (umur <17) {
            grade = "anak anak";
            
        }
        else {
            grade = "kk";
            
        }
        
        out.print("Grade ="+ grade);
        
        
       
    }
    
}
