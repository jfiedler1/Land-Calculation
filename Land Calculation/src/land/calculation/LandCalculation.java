/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package land.calculation;

/**
 *
 * @author Joshua Fiedler
 */
public class LandCalculation 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        float acre = 43560;    // acre in square feet
        float tract = 389767;  // lot size
        float acresInTract;
        
        acresInTract = tract / acre;
        
        System.out.println("The number of area in " + tract +
                " is " + acresInTract);
     
    }
    
}
