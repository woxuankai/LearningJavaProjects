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
public class Virus {
    static int virusCount = 0;
    int ID;
    public static void Virus() {
        virusCount++;
    }
    
    public Virus() {
        virusCount++;
    }
        
        
    static int getVirusCount() {
        return virusCount;
    }
}
