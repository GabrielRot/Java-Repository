/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o Nome do Aluno: ");
        String nome = input.nextLine();
        System.out.print("Digite a Nota do Aluno: ");
        float nota = input.nextFloat();
        System.out.printf("A nota do %s é %.2f", nome, nota);
    }
    
}
