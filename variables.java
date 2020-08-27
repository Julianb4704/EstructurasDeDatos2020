/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivo;

/**
 *
 * @author Julian
 */
public class variables {
    
    static int tribo(int n){
            if (n==0 || n==1){
                return 0;
            }
            if (n == 2){
                return 1;
            
            }
            else{
                return tribo(n-1)+tribo(n-2)+tribo(n-3);
            
            }
        
                
        }
    public void impTribo(int n){
        for (int i = 0; i<n ; i++)
            System.out.print(tribo(i)+ " ");
        
    
    }
    
    public boolean valorexistente(int [] a, int d, int pos){
        if (pos==0){
            if(a[pos]==d){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(a[pos]!=d){
                return valorexistente(a,d,pos-1);
            }
            else{
                return true;
            }
        }
    }
    
    public boolean palabrapalindroma(String word){
        if(word.length()== 0 || word.length()==1){
            return true;
        }
        if(word.charAt(0)== word.charAt(word.length()-1)){
            return palabrapalindroma(word.substring(1, word.length()-1));
        }
        return false;
    }
    
    public String numerossumados(int num){
        String numero = String.valueOf(num);
        if(numero.length()==1){
            return numero;
        }
        else{
            char[] b = numero.toCharArray();
            int sum=0;
            int nI = 0;
            for(int i=0; i<b.length; i++){
                nI= Character.getNumericValue(b[i]);
                sum= sum+nI;
            }
            return numerossumados(sum);
                
            
        }
    }
    
}
