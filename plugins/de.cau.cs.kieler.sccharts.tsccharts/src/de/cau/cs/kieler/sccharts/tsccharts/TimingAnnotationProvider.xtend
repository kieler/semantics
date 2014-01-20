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
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper
import java.util.Map
import java.util.HashMap
import java.io.BufferedReader
import java.io.FileReader
import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

import de.cau.cs.kieler.sccharts.tsccharts.annotation.extensions.TSCChartsAnnotationExtension
import de.cau.cs.kieler.sccharts.Region

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
    extension TSCChartsAnnotationExtension;

    /* This method checks, whether we have timing information for this SCChart. If yes, it provides all 
     * regions of the SCChart with two timing value annotations, one including,
     * one excluding the WCRT for child regions. If no, the method checks whether SCChart and KTM have 
     * already been assigned with Timing Domains and handels this, if not.
     */
    def public doTimingAnnotations(State scchart, ModelWrapper KTMRoot, String fileName) {
        val Map<Integer, Integer> timingInformation = getTimingInformation(fileName);
        if (timingInformation == null) {

            // We have no timing information, so we should check whether we have already set the timing
            // domains in the SCChart (and the KTM).
            if (scchart.getAnnotation("TimeDomain") == null) {
                setTimingDomains(scchart, KTMRoot, 1);
            }
        }
        annotateRegions(scchart, KTMRoot, timingInformation);
    }

    /* This method assigns time domains for each region of a state chart and annotates the 
     * the corresponding S-Code-Objects in the KTM accordingly.
     */
    def Integer setTimingDomains(State state, ModelWrapper model, Integer currentDomainNumber) {
        var domainNumber = currentDomainNumber;
        val regionList = state.regions;
        val regionListIterator = regionList.iterator;
        while (regionListIterator.hasNext()) {
            val region = regionListIterator.next();
            region.setTimeDomain(domainNumber);
            val stateList = region.states;
            val simpleStates = stateList.filter[it.regions.empty];
            val macroStates = stateList.filter[!(it.regions.empty)];
            val simpleStateListIterator = simpleStates.iterator;
            while (simpleStateListIterator.hasNext()){
                var simpleState = simpleStateListIterator.next();
                simpleState.setTimingDomainForSElements("@T" + domainNumber, model);
            }
            val macroStateListIterator = macroStates.iterator;
            while(macroStateListIterator.hasNext()){
                // If the state has regions of its own, they belong to a new time domain
                val childState = macroStateListIterator.next();
                    // recursive call, retrieve the highest DomainNumber that is not free anymore
                    domainNumber = setTimingDomains(childState, model, domainNumber + 1);
            }
            // Count up the DomainNumber for the next region, if there is one
            if (regionListIterator.hasNext()){
            domainNumber = domainNumber +1;
            }
        }
        // Return the highest DomainNumber assigned by the Method
        return domainNumber;
    }
    
    /* This method is a test method that sets the timing Domains for regions, but not for the 
     * elements of the according S model. To test the "upwards" timing information path*/
    def Integer setTimingDomainsSimple(Region region, Integer currentDomainNumber){
        var domainNumber = currentDomainNumber;
        if (!region.hasChildRegions){
            region.setTimeDomainHierarchical(domainNumber);
        } else {
            
        }
//        val stateListIterator = stateList.iterator;
//                while (stateListIterator.hasNext()) {
//                    val State child = stateListIterator.next();
//                    val childRegionList = 
//                }
//        if (!regionList.empty){
//            val regionListIterator = regionList.iterator;
//            while (regionListIterator.hasNext()){
//                val region = regionListIterator.next();
//                val stateList = region.states;
//                val stateListIterator = stateList.iterator;
//                while (stateListIterator.hasNext()) {
//                    val State child = stateListIterator.next();
//                    domainNumber = setTimingDomainsSimple(child, domainNumber);
//                }
//                
//                }
//            }
            return (domainNumber + 1);
    }
    
    def boolean hasChildRegions(Region region)

    /* This method recursively annotates all regions within the given state with timing values, flat 
     * as well as hierarchical.
     */
    def void annotateRegions(State state, ModelWrapper model, Map<Integer, Integer> map) {
        val regionList = state.regions;
        val regionListIterator = regionList.iterator;
        while (regionListIterator.hasNext()) {
            val region = regionListIterator.next();

            //Set TimeFlat to the Listvalue
            region.setTimeFlat(map.get(region.timeDomain));

            //Add own flat time to parent's hierarchical time
            val parentState = region.parentState;
            if (parentState != null) {
                val parentRegion = parentState.parentRegion;
                if (parentRegion != null) {
                    parentRegion.addToTimeHierarchical(region.getTimeFlat());
                }
            }
        }
    }

    /* Method retrieves the timing information from file and stores them in a Hashmap. The WCRT between 
     * annotations @T1 and @T2 will be stored with String key @T1. Method returns null, if no timing 
     * information file can be found
     */
    def Map<Integer, Integer> getTimingInformation(String filename) {

        val retMap = new HashMap<Integer, Integer>();

        var BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File(filename+".txt")));
            var String line = null;
            while ((line = br.readLine()) != null) {
         
                var String[] parts = line.split(";");

                // First tag in tag pair indicates the thread this value belongs to, used as key
                val String tag1 = parts.get(0) as String;
                var keyInt = Integer.parseInt(tag1);
                val key = keyInt >> 8;
                var Integer value = Integer.parseInt(parts.get(2));

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
            return null;
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
        }
        return retMap;
    }
}
