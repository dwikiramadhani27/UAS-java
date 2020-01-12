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
public class Class {
    double operan1;
    double operan2;
    
    void isiOperan1(double x){
        operan1 = x;
    }
    void isiOperan2 (double y){
        operan2 = y;
    }
    
    double tambah(){
        return operan1+operan2;
    }
    double kurang(){
        return operan1-operan2;
    }
    double kali(){
        return operan1*operan2;
    }
    double bagi(){
        return operan1/operan2;
    }
     double pangkat(){
        return Math.pow(operan1,operan2);
    }
   
    
}
