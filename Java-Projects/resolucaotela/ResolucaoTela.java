/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;





/**
 *
 * @author admin
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Toolkit tela = Toolkit.getDefaultToolkit();
         Dimension dm = tela.getScreenSize();
         System.out.println("Sua Resolução É");
         System.out.print(dm.width);
         System.out.print("x");
         System.out.println(dm.height);
        // TODO code application logic here
    }
    
}
