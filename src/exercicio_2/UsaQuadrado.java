/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_2;

import model.Quadrado;

/**
 *
 * @author Luis
 */
public class UsaQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado(4);
        Quadrado quadrado2 = new Quadrado(2);
        Quadrado quadrado3 = new Quadrado(6);
        
        System.out.println("A área do primeiro quadrado é " + quadrado1.calcularArea() + 
        " e seu perímetro é " + quadrado1.calcularPerimetro());
        
        System.out.println("A área do segundo quadrado é " + quadrado2.calcularArea() + 
        " e seu perímetro é " + quadrado2.calcularPerimetro());
        
        System.out.println("A área do terceiro quadrado é " + quadrado3.calcularArea() + 
        " e seu perímetro é " + quadrado3.calcularPerimetro());
    }
    
}
