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
import java.io.FileNotFoundException
import java.io.IOException

import de.cau.cs.kieler.sccharts.tsccharts.annotation.extensions.TSCChartsAnnotationExtension
import de.cau.cs.kieler.sccharts.Region
import javax.inject.Inject
import java.util.List
import java.util.LinkedList
import de.cau.cs.kieler.sccharts.tsccharts.handler.TimingRequestResult
import de.cau.cs.kieler.sccharts.tsccharts.handler.TimeValueTable
import de.cau.cs.kieler.sccharts.tsccharts.handler.RequestType

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
    @Inject
    extension TSCChartsKTMExtension;
    @Inject
    extension TSCChartsAnnotationExtension;

    /* This method checks, whether we have timing information for this SCChart. If yes, it provides all 
     * regions of the SCChart with two timing value annotations, one including,
     * one excluding the WCRT for child regions. If no, the method checks whether SCChart and KTM have 
     * already been assigned with Timing Domains and handles this, if not.
     */
    def public doTimingAnnotations(State scchart, /* ModelWrapper KTMRoot,*/ String fileName) {

        //        // TimingDomains for test reasons
        //        var Integer domainNumber = 0;
        //        val regionList = scchart.regions;
        //        val regionListIterator = regionList.iterator;
        //        while (regionListIterator.hasNext()) {
        //            val childRegion = regionListIterator.next;
        //
        ////            // threadTree will be used to determine program point pairs for requests of local timing
        ////            val HashMap<Integer, LinkedList<Integer>> threadTree = new HashMap<Integer, LinkedList<Integer>>;
        ////            domainNumber = setTimingDomainsSimple(childRegion, domainNumber, threadTree, null);
        //        }
        val Map<Integer, Integer> timingInformation = getTimingInformation(fileName);
        if (timingInformation != null) {
            annotateStatesAndRegions(scchart, timingInformation);
        }
    }

    /*Annotates states and regions of the scchart with flat and hierarchical timing values.*/
    def void annotateStatesAndRegions(State state, Map<Integer, Integer> map) {

        // reset hierarchical time for the state
        state.setTimeHierarchical(0);
        val regionList = state.regions;
        val regionListIterator = regionList.iterator;
        val macroChildStates = state.getMacroChildStates;
        if (!macroChildStates.empty) {
            val macroChildStatesIterator = macroChildStates.iterator;
            while (macroChildStatesIterator.hasNext) {
                val macroChild = macroChildStatesIterator.next;
                annotateStatesAndRegions(macroChild, map);
            }
        }
        while (regionListIterator.hasNext) {
            val childRegion = regionListIterator.next;
            val Integer flatTiming = map.get(childRegion.getTimeDomain());
            childRegion.setTimeFlat(flatTiming);
            childRegion.sumUpHierarchicalTiming;
            childRegion.addToTimeHierarchical(flatTiming);
            state.addToTimeHierarchical(childRegion.timeHierarchical);
        }
    }

    /*Adds all hierarchical time values of macro child states to hierarchical value of the given 
     * region. val state = null
     */
    def void sumUpHierarchicalTiming(Region region) {

        // Reset timing before new calculation
        region.setTimeHierarchical(0);

        // Add the hierarchical WCET of every macro state this region contains
        region.states.forEach[s|
            if (!s.regions.empty) {
                region.addToTimeHierarchical(s.timeHierarchical)
            }]
    }

    /*Returns a list of the child states that contain regions */
    def List<State> getMacroChildStates(State state) {
        var macroChildren = new LinkedList();
        val regionList = state.regions;
        val regionListIterator = regionList.iterator;
        while (regionListIterator.hasNext()) {
            val region = regionListIterator.next();
            val children = region.states;
            val childrenIterator = children.iterator;
            while (childrenIterator.hasNext()) {
                val child = childrenIterator.next();
                if (!child.regions.empty) {
                    macroChildren.add(child);
                }
            }
        }
        return macroChildren;
    }

    /* This method assigns time domains for each region of a state chart and annotates the 
     * the corresponding S-Code-Objects in the KTM accordingly.
     */
    // old method, deprecated
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
            while (simpleStateListIterator.hasNext()) {
                var simpleState = simpleStateListIterator.next();
                simpleState.setTimingDomainForSElements("@T" + domainNumber, model);
            }
            val macroStateListIterator = macroStates.iterator;
            while (macroStateListIterator.hasNext()) {

                // If the state has regions of its own, they belong to a new time domain
                val childState = macroStateListIterator.next();

                // recursive call, retrieve the highest DomainNumber that is not free anymore
                domainNumber = setTimingDomains(childState, model, domainNumber + 1);
            }

            // Count up the DomainNumber for the next region, if there is one
            if (regionListIterator.hasNext()) {
                domainNumber = domainNumber + 1;
            }
        }

        // Return the highest DomainNumber assigned by the Method
        return domainNumber;
    }
/**
 * The Method annotates each region of a given State with a unique domainNumber. It also stores the 
 * information about region nesting in the threadTree HashMap, which can be used for hierarchical  
 * aggregation of timing values (for example in cases that involve the search of a maximum value among 
 * sibling regions). The method is recursive.
 * 
 * @param state
 *        The State. In most cases for the first call of this function this will be an SCChart.
 * @param currentDomainNumber
 *        The domain number to start with (domain numbers increment)
 * @param threadTree
 *        Hashmap to store the information about nesting of threads in, for every region there will be a 
 *        list of child regions, both identified by their timing domain numbers.
 * @param parentDomain
 *        The domain number of the parent region of state
 * @return Returns the highest domain number set during the recursion, incremented by 1.
 */
    def Integer setTimingDomainsWithS(State state, Integer currentDomainNumber,
        HashMap<Integer, LinkedList<Integer>> threadTree, Integer parentDomain) {
        var domainNumber = currentDomainNumber;
        val stateRegions = state.regions;
        val stateRegionsIterator = stateRegions.iterator;
        while (stateRegionsIterator.hasNext()) {
            val region = stateRegionsIterator.next();

            // set the time domain for this region
            region.setTimeDomain(domainNumber);

            // register this region as child of its parent region in the thread tree
            if (parentDomain != null) {
                threadTree.get(parentDomain).add(domainNumber);
            }

            // prepare descendant list for this region in the thread tree
            threadTree.put(domainNumber, new LinkedList<Integer>);

            // save this region's domain number for the registrations of its children in the thread tree
            val regionDomain = domainNumber;
            domainNumber = domainNumber + 1;
            val childStates = region.states;
            val childStatesIterator = childStates.iterator;
            while (childStatesIterator.hasNext()) {
                setTimingDomainsWithS(
                    childStatesIterator.next(),
                    domainNumber,
                    threadTree,
                    regionDomain
                );
            }
        }
        return domainNumber + 1;
    }

// Start 21.1.2015 remove?
//    /*  This method is a test method that sets the timing Domains for regions, but not for the 
//     * elements of the according S model. To test the "upwards" timing information path*/
//    def Integer setTimingDomainsWithS(Region region, Integer currentDomainNumber,
//        HashMap<Integer, LinkedList<Integer>> threadTree, Integer parentDomain) {
//        var domainNumber = currentDomainNumber;
//        if (!region.hasChildRegions) {
//            region.setTimeDomain(domainNumber);
//
//            // Save this region in the threadTree in the List of its parent
//            if (parentDomain != null) {
//                threadTree.get(parentDomain).add(domainNumber);
//            }
//        } else {
//            region.setTimeDomain(domainNumber);
//
//            // Prepare descendant list for this region and add it to the thread tree
//            threadTree.put(domainNumber, new LinkedList<Integer>);
//            val regionDomain = domainNumber;
//            domainNumber = domainNumber + 1;
//            val stateList = region.states;
//            val stateListIterator = stateList.iterator;
//            while (stateListIterator.hasNext()) {
//                val State child = stateListIterator.next();
//                val childRegionList = child.regions;
//                val childRegionListIterator = childRegionList.iterator;
//                while (childRegionListIterator.hasNext()) {
//                    val childRegion = childRegionListIterator.next();
//                    domainNumber = setTimingDomainsWithS(childRegion, domainNumber, threadTree, regionDomain);
//                }
//            }
//        }
//        return (domainNumber + 1);
//    }
// end 21.1.2015 remove?

    /* Determines, whether the region contains states with regions (return true) 
         * or not (return false)
         */
    def boolean hasChildRegions(Region region) {
        var boolean retValue = false;
        val stateList = region.states;
        val stateListIterator = stateList.iterator;
        while (stateListIterator.hasNext()) {
            val State child = stateListIterator.next();
            if (!child.regions.empty) {
                retValue = true;
            }
        }
        return retValue;
    }

    /** Retrieves the timing information from the .ta.out file and stores them in a result 
         * map under the according requests.
         *  @param resultList 
         *            A list of TimingRequestResults, where the values are to be (re)set. The ordering 
         *            must correspond to the ordering of the timing requests that the specified file is 
         *            an answer to, as the values will be stored in reading order.
         *  @param uri
         *            Determines the timing analysis response file to be read.
         */
    def void getTimingInformation(LinkedList<TimingRequestResult> resultList, String uri) {
        var BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(uri));
            var String line = null;
            var Integer lineNumber = 0;

            // each line will be a new timing analysis result
            while ((line = br.readLine()) != null) {

                // the result may consist of more than one element, comma-separated, store them in 
                // list and write the list back to the corresponding timing request. This 
                // correspondence is determined by the ordering.
                var String[] parts = line.split(",");
                val resultIterator = parts.iterator;
                val results = new LinkedList<String>;
                while (resultIterator.hasNext) {
                    val nextNumber = resultIterator.next;
                    results.add(nextNumber);
                }
                resultList.get(lineNumber).setResult(results);
                lineNumber = lineNumber + 1;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Timing information could not be found.");
            e.printStackTrace();
            return;
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
    }

    /**
         * The method extracts a TimeValueTable from a TimingRequestResult-List.
         *  @param resultList:
         *           A list of TimingRequestResults, from which the timing values (in contrast to the 
         *           paths) are to be extracted.
         *  @return: 
         *           Returns a TimeValueTable, where all timing values are stored in the HashMap 
         *           corresponding to their analysis type. The key is the timing domain of the model 
         *           element the timing value is associated to.
         */
    def TimeValueTable extractTimeValueTable(LinkedList<TimingRequestResult> resultList) {
        val TimeValueTable timeValueTable = new TimeValueTable();
        val resultListIterator = resultList.iterator;
        while (resultListIterator.hasNext) {
            val currentResult = resultListIterator.next;
            switch currentResult.requestType {
                case RequestType::LWCET: {
                    timeValueTable.LWCETMap.put(
                        currentResult.startPoint,
                        Integer.parseInt(currentResult.result.get(0))
                    );
                }
                case RequestType::LBCET: {
                    timeValueTable.LBCETMap.put(currentResult.startPoint,
                        Integer.parseInt(currentResult.result.get(0)))
                }
                case RequestType::FWCET: {
                    timeValueTable.FWCETMap.put(currentResult.startPoint,
                        Integer.parseInt(currentResult.result.get(0)))
                }
                case RequestType::FBCET: {
                    timeValueTable.FBCETMap.put(currentResult.startPoint,
                        Integer.parseInt(currentResult.result.get(0)))
                }
                case RequestType::WCP: {
                    // do nothing, for the moment we are interested in timing values, not in paths
                    // can be amended in future
                }
                case RequestType::BCP: {
                    // do nothing, for the moment we are interested in timing values, not in paths
                    // can be amended in future
                }
            }
        }
        return timeValueTable;
    }

    /* Method retrieves the timing information from file and stores them in a Hashmap. The WCRT between 
     * annotations @T1 and @T2 will be stored with String key @T1. Method returns null, if no timing 
     * information file can be found
     * This method relates to an old version of the timing interface files.
     */
    def Map<Integer, Integer> getTimingInformation(String uri) {

        val retMap = new HashMap<Integer, Integer>();

        var BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(uri));
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
