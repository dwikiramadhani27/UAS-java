/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

/**
 *
 * @author Endang
 */
public class objek {
    public static void main (String[]args){
        Class papa = new Class();
        papa.isiOperan1(5);
        papa.isiOperan2(2);
        
        System.out.println("Tambah ="+papa.tambah());
        System.out.println("Kurang ="+papa.kurang());
        System.out.println("Kali ="+papa.kali());
        System.out.println("Bagi ="+papa.bagi());
        System.out.println("Pangkat ="+papa.pangkat());
    }
    
}
