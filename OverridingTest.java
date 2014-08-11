/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ovverriding;

/**
 *
 * @author aerdy
 */
public class OverridingTest {
    String nama;
    String jenkel;
    
    void setNilai(String param1){
        nama=param1;
    
    }
    void setNilai(String param1,String param2){
        nama=param1;
        jenkel=param2;
    }
    void cetak(){
        System.out.println(nama+"andalah"+jenkel);
    }
    
    
}
