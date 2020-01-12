/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;


public class Method {
  public static int a,b ;
  public static void init (){
      a=3; b=5;
  }
  public static int tambah (){
      return (a+b);
  }
  public static int kurang (){
      return (a-b);
  }
  public static void cetak(int n){
      System.out.println(n);
  }

    
    public static void main(String[] args) {
     init ();
     System.out.println("a ="+a);
     System.out.println("b ="+b);
     a=3; b=5;
     System.out.println(tambah());
     System.out.println(kurang());
     cetak (4);
     cetak (7+tambah());
     cetak (7-kurang());
     
    }
    
}
