/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;
import java.util.Scanner ;

/**
 *
 * @author Endang
 */
public class Looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int i,n,total;  
        Scanner Baca = new Scanner(System.in);
        System.out.print("Banyaknya suku= ");n=Baca.nextInt();
        System.out.println("for:");
        total=0;
        for(i=1;i<n;i++) {
            total+=i;//total=total+i
            System.out.print(i+"+");
        } 
        total+=i;
        System.out.println(i+"="+total+"\n");
        System.out.println("while:");
        i=1;total=0;
        while (i<n){
            total+=i;//total=total+i
            System.out.print(i+"+");
            i++;
        } 
        total+=i;
        System.out.println(i+"="+total+"\n");
        
        System.out.println("do while:");
        i=1;total=0;
        do {
            total+=i;//total=total+i
            System.out.print(i+"+");
            i++;
        } while(i<n) ;  
        total+=i;
        System.out.println(i+"="+total+"\n");   
    }
    
}
