/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package realestateproject;

/**
 *
 * @author Sumaduri 123
 */
public interface Listable {
    
    
        public abstract String compareTo(Listable comparison);
        
        public abstract Listable copy();
    
}
