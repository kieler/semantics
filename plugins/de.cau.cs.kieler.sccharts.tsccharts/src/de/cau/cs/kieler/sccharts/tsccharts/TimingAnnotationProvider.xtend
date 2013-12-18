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
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.annotations.IntAnnotation

/**
 * This class provides an SCChart with WCRT information by annotating all regions with two values: The
 * WCRT for the region including and not including the WCRT for child regions. Those timing 
 * informations are to be optionally displayed in the SCChart for the developer.
 * 
 * @author: ima
 * @kieler.design
 * @kieler.rating  
 */
class TimingAnnotationProvider {
    extension TSCChartsKTMExtension;

    /* This method checks, whether we have timing information for this SCChart. If yes, it provides all 
     * regions of the SCChart with two timing value annotations, one including,
     * one excluding the WCRT for child regions. If no, the method checks whether SCChart and KTM have 
     * already been assigned with Timing Domains and handels this, if not.
     */
    def public doTimingAnnotations(State scchart, Model KTMRoot) {
        val Map<String, Integer> timingInformation = getTimingInformation();
        if (timingInformation == null) {

            // We have no timing information, so we should check whether we have already set the timing
            // domains in the SCChart (and the KTM).
            if (scchart.getAnnotation("TimeDomain") == null) {
                setTimingDomains(scchart, KTMRoot, 1);
            }
        }
        annotateRegions(scchart, KTMRoot, timingInformation);
    }

    /* This message assigns time domains for each region of a state chart and annotates all Objects in
     * the KTM accordingly.
     */
    def setTimingDomains(State state, Model model, Integer i) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }

    /* This method recursively annotates all regions within the given state with timing values
     */
    def void annotateRegions(State state, Model model, Map<String, Integer> map) {
        var Integer regionFlatValue = 0;
        var Integer regionHierachicalValue = 0;
        val regionList = state.regions;
        val regionListIterator = regionList.iterator;
        while (regionListIterator.hasNext()){
            val region = regionListIterator.next();
            val stateList = region.states;
            val stateListIterator = stateList.iterator;
            while(stateListIterator.hasNext()){
                val childstate = stateListIterator.next();
                if (!(childstate.regions.empty)){
                    childstate.annotateRegions(model, map, RunningId + 1);
                    regionHierarchicalValue = regionHierarchicalValue + 
                    (childstate.getAnnotation("TimeHierarchical") as IntAnnotation).getValue();
                } else {
                    val Integer timeValue = map.get(
                        (childstate.getAnnotation("TimeDomain") as StringAnnotation).getValue());
                    regionValue = regionValue + timeValue;
                }
            }
        }
        
        
         

    }

    /* Method retrieves the timing information from file and stores them in a Hashmap. The WCRT between 
     * annotations @T1 and @T2 will be stored with String key @T1. Method returns null, if no timing 
     * information file can be found
     */
    def Map<String, Integer> getTimingInformation() {

        val retMap = new HashMap<String, Integer>();

        var BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("timing.txt")));
            var String line = null;
            while ((line = br.readLine()) != null) {

                // Ganze Zeile:
                // System.out.println(line);                
                var String[] parts = line.split(";");

                val String key = parts.get(0) as String;
                var Integer value = Integer.parseInt(parts.get(1));

                // If we already had another value for this key, we want to add the values as they are
                // partial timing values for the same region
                val oldValue = retMap.get(key);
                if (oldValue != null) {
                    value = value + oldValue;
                }

                retMap.put(key, value);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Timing information could not be found.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
        return retMap;
    }
}
