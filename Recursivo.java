/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivo;
import java.util.Scanner;
/**
 *
 * @author Julian
 */
public class Recursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=10;
        int [] vec= {123,22,33,45,66,77};
        int tam = vec.length-1;
        int datobuscar=22;
        String palabraE = "amorroma";
        int nN = 1023;
        
        variables r = new variables();
        r.impTribo(n);
        System.out.println(r.valorexistente(vec,datobuscar,tam));
        System.out.println(r.palabrapalindroma(palabraE));
        System.out.println(r.numerossumados(nN));
              
    }
    
}

