/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ovverriding;

import com.sun.org.apache.xml.internal.resolver.helpers.Debug;

/**
 *
 * @author aerdy
 */
public class DemoOverroding {
    public static void main(String[] args) {
        OverridingTest dm1=new OverridingTest();
        OverridingTest dm2 =new OverridingTest();
        
        dm1.setNilai("anna arthdi putra ");
        dm2.setNilai("anna "," Laki laki");
        
        dm1.cetak();
        dm2.cetak();
        
    }
}
