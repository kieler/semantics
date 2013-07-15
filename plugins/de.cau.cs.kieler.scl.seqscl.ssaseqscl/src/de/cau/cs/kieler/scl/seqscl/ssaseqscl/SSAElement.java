/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.seqscl.ssaseqscl;

//import java.util.LinkedList;

/**
 * @author gjohannsen
 *
 */
public class SSAElement {

    private String name;
    //private LinkedList<String> ssaElements;
    private int counter; 
  
    public SSAElement(String name){
        this.name = name;
        //this.ssaElements = new LinkedList<String>();
        counter = 0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

//    /**
//     * @return the ssaElements
//     */
//    public LinkedList<String> getSsaElements() {
//        return ssaElements;
//    }

//    /**
//     * @param ssaElements the ssaElements to set
//     */
//    public void addSsaElements() {
//        counter = counter + 1;
//        ssaElements.add(name + counter );
//    }
    
    /**
     * Returns the last ssaElement
     */
    public void incSsaIndex() {
        counter++;
    }
    
    /**
     * Returns the last ssaElement
     */
    public int getLastSsaIndex() {
//        return ssaElements.getLast();
        return counter;
    }
    
//    /**
//     *  Returns an SSA Element given by an index. If the index is too big null will be returned.
//     * @param number the number of the ssaElement
//     * @return an ssaElement
//     */
//    public String getSSAElement(int number){
//        
//        if(number < ssaElements.size()){
//            return ssaElements.get(number);
//        }
//        else{
//            return null;
//        }
//    }
    
}
