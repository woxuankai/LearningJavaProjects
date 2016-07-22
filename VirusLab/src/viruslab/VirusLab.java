/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viruslab;

/**
 *
 * @author KayleXuan
 */
public class VirusLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numViruses = Integer.parseInt(args[0]);
        if(numViruses > 0) {
//            Virus[] virii = new Virus[numViruses];
            Virus[] virii = new Virus[numViruses];
            
//            virii[2].ID = 3;
            
            
            for(int i=0; i<numViruses; i++){
                virii[i] = new Virus();
            }
            virii[2].ID = 3;
            
            Virus myvir = new Virus();
            myvir.ID = 5;
            
//            Virus avir;
//            avir.ID =7;
            Virus.Virus();
            System.out.println("There are " + Virus.getVirusCount() + " Viruses.");
        }
    }
    
}
