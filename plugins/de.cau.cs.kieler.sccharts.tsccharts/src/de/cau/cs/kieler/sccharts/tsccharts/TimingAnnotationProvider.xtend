/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sccharts.tsccharts

import de.cau.cs.kieler.sccharts.tscharts.ktm.extensions.TSCChartsKTMExtension
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.ktm.transformationtree.Model
import java.util.Map
import java.util.HashMap
import java.io.BufferedReader
import java.io.FileReader
import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

/**
 * This class provides an SCChart with WCRT information by annotating all regions with two values: The
 * WCRT for the region including and not including the depth (WCRT for child regions). Those timing 
 * informations are to be optionally displayed in the SCChart for the developer.
 * 
 * @author: ima
 * @kieler.design
 * @kieler.rating  
 */
class TimingAnnotationProvider {
    extension TSCChartsKTMExtension;
    
    def public doTimingAnnotations(State scchart, Model KTMRoot){
        val Map<String, Integer> timingInformation = getTimingInformation();
        
        
        
    }
    
    /* Method retrieves the timing information from file and stores them in a Hashmap. The WCRT between 
     * annotations @T1 and @T2 will be stored with String key @T1
     */
    def Map<String, Integer> getTimingInformation() {
        
        val retMap = new HashMap<String, Integer>();
        
        var BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("timing.txt")));
            var String line = null;
            while((line = br.readLine()) != null) {
                // Ganze Zeile:
                // System.out.println(line);                
                var String[] parts = line.split(";");
                
                val String key = parts.get(0) as String;
                val Integer value = Integer.parseInt(parts.get(1));
                
                retMap.put(key, value);
            }
        } catch(FileNotFoundException e) {
            System.out.println("Timing information could not be found.");
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return retMap;
    }
        
    
    
    
    
}