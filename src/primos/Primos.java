/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;

/**
 *
 * @author davin
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean aux = false;
        
        for(int i=2; i<=100;i++){
            for(int o=2;o<i;o++){
                if(i%o==0){
                    aux=true;
                }
            }
            if(aux==false){
                System.out.println(i);
            }
            aux=false;
        }
    }
}
