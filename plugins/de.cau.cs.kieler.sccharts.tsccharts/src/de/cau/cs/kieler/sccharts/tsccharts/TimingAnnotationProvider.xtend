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

import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.tsccharts.RequestType
import de.cau.cs.kieler.sccharts.tsccharts.TimingRequestResult
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException
import java.util.LinkedList
import java.util.List
import de.cau.cs.kieler.sccharts.ControlflowRegion
import java.util.StringTokenizer
import de.cau.cs.kieler.sccharts.tsccharts.TimingAnalysis.TimingValueRepresentation

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

    /*Returns a list of the child states that contain regions */
    def List<State> getMacroChildStates(State state) {
        var macroChildren = new LinkedList();
        val regionList = state.regions;
        val regionListIterator = regionList.iterator;
        while (regionListIterator.hasNext()) {
            val region = regionListIterator.next();
            val children = (region as ControlflowRegion).states;
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

//    /**
// * The Method annotates each region of a given State with a unique domainNumber. It also stores the 
// * information about region nesting in the threadTree HashMap, which can be used for hierarchical  
// * aggregation of timing values (for example in cases that involve the search of a maximum value among 
// * sibling regions). The method is recursive.
// * 
// * @param state
// *        The State. In most cases for the first call of this function this will be an SCChart.
// * @param currentDomainNumber
// *        The domain number to start with (domain numbers increment)
// * @param threadTree
// *        Hashmap to store the information about nesting of threads in, for every region there will be a 
// *        list of child regions, both identified by their timing domain numbers.
// * @param parentDomain
// *        The domain number of the parent region of state
// * @return Returns the highest domain number set during the recursion, incremented by 1.
// */
//    def Integer setTimingDomains(State state, Integer currentDomainNumber,
//        HashMap<Integer, LinkedList<Integer>> threadTree, Integer parentDomain) {
//        var domainNumber = currentDomainNumber;
//        val stateRegions = state.regions;
//        val stateRegionsIterator = stateRegions.iterator;
//        while (stateRegionsIterator.hasNext()) {
//            val region = stateRegionsIterator.next();
//
//            // set the time domain for this region
//            region.setTimeDomain(domainNumber);
//
//            // register this region as child of its parent region in the thread tree
//            if (parentDomain != null) {
//                threadTree.get(parentDomain).add(domainNumber);
//            }
//
//            // prepare descendant list for this region in the thread tree
//            threadTree.put(domainNumber, new LinkedList<Integer>);
//
//            // save this region's domain number for the registrations of its children in the thread tree
//            val regionDomain = domainNumber;
//            domainNumber = domainNumber + 1;
//            val childStates = region.states;
//            val childStatesIterator = childStates.iterator;
//            while (childStatesIterator.hasNext()) {
//                setTimingDomains(
//                    childStatesIterator.next(),
//                    domainNumber,
//                    threadTree,
//                    regionDomain
//                );
//            }
//        }
//        return domainNumber + 1;
//    }
//    /* Determines, whether the region contains states with regions (return true) 
//         * or not (return false)
//         */
//    def boolean hasChildRegions(Region region) {
//        var boolean retValue = false;
//        val stateList = region.states;
//        val stateListIterator = stateList.iterator;
//        while (stateListIterator.hasNext()) {
//            val State child = stateListIterator.next();
//            if (!child.regions.empty) {
//                retValue = true;
//            }
//        }
//        return retValue;
//    }
    /** Retrieves the timing information from the .ta.out file and stores them in a result 
     * map under the according requests.
     *  @param resultList 
     *            A list of TimingRequestResults, where the values are to be (re)set. The ordering 
     *            must correspond to the ordering of the timing requests that the specified file is 
     *            an answer to, as the values will be stored in reading order.
     *  @param uri
     *            Determines the timing analysis response file to be read.
     *  @param rep
     *            Specifies the way in which the timing values should be represented.
     *  @return
     *        returns 1 for file not found, 2 for IOExeption, 0 else.
     */
    def int getTimingInformation(LinkedList<TimingRequestResult> resultList, String uri, 
        TimingValueRepresentation rep) {
        var int ret = 0;
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
            return ret;
        } catch (FileNotFoundException e) {
            System.out.println("Timing information could not be found.");
            e.printStackTrace();
            ret = 1;
            return ret;
        } catch (IOException e) {
            e.printStackTrace();
            ret = 1;
            return ret;
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

//    /**
//         * The method extracts a TimeValueTable from a TimingRequestResult-List.
//         *  @param resultList:
//         *           A list of TimingRequestResults, from which the timing values (in contrast to the 
//         *           paths) are to be extracted.
//         *  @return: 
//         *           Returns a TimeValueTable, where all timing values are stored in the HashMap 
//         *           corresponding to their analysis type. The key is the timing domain of the model 
//         *           element the timing value is associated to.
//         */
//    def TimeValueTable extractTimeValueTable(LinkedList<TimingRequestResult> resultList) {
//        var String debugValue = null
//        // debug
//        val StringBuilder stringBuilder = new StringBuilder();
//        val resultListDebugIterator = resultList.iterator();
//        while(resultListDebugIterator.hasNext){
//            val debugResult = resultListDebugIterator.next;
//            val result = debugResult.result;
//            if (result != null){
//            debugValue = debugResult.result.get(0);
//            }
//            if(debugValue == null){
//                stringBuilder.append("null  ");
//            } else{
//                stringBuilder.append(Integer.parseInt(debugValue)+ "  ");
//            }
//        }
//        System.out.println(stringBuilder.toString);
//        // end debug
//        
//        val TimeValueTable timeValueTable = new TimeValueTable();
//        val resultListIterator = resultList.iterator;
//        while (resultListIterator.hasNext) {
//            val currentResult = resultListIterator.next;
//            switch currentResult.requestType {
//                case RequestType::LWCET: {
//                    timeValueTable.LWCETMap.put(
//                        currentResult.startPoint,
//                        Integer.parseInt(currentResult.result.get(0))
//                    );
//                }
//                case RequestType::LBCET: {
//                    timeValueTable.LBCETMap.put(currentResult.startPoint,
//                        Integer.parseInt(currentResult.result.get(0)))
//                }
//                case RequestType::FWCET: {
//                    timeValueTable.FWCETMap.put(currentResult.startPoint,
//                        Integer.parseInt(currentResult.result.get(0)))
//                }
//                case RequestType::FBCET: {
//                    timeValueTable.FBCETMap.put(currentResult.startPoint,
//                        Integer.parseInt(currentResult.result.get(0)))
//                }
//                case RequestType::WCP: {
//                    // do nothing, for the moment we are interested in timing values, not in paths
//                    // can be amended in future
//                }
//                case RequestType::BCP: {
//                    // do nothing, for the moment we are interested in timing values, not in paths
//                    // can be amended in future
//                }
//            }
//        }
//        return timeValueTable;
//    }
//    /* Method retrieves the timing information from file and stores them in a Hashmap. The WCRT between 
//     * annotations @T1 and @T2 will be stored with String key @T1. Method returns null, if no timing 
//     * information file can be found
//     * This method relates to an old version of the timing interface files.
//     */
//    def Map<Integer, Integer> getTimingInformation(String uri) {
//
//        val retMap = new HashMap<Integer, Integer>();
//
//        var BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader(uri));
//            var String line = null;
//            while ((line = br.readLine()) != null) {
//
//                var String[] parts = line.split(";");
//
//                // First tag in tag pair indicates the thread this value belongs to, used as key
//                val String tag1 = parts.get(0) as String;
//                var keyInt = Integer.parseInt(tag1);
//                val key = keyInt >> 8;
//                var Integer value = Integer.parseInt(parts.get(2));
//
//                // If we already had another value for this key, we want to add the values as they are
//                // partial timing values for the same region
//                val oldValue = retMap.get(key);
//                if (oldValue != null) {
//                    value = value + oldValue;
//                }
//
//                retMap.put(key, value);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Timing information could not be found.");
//            e.printStackTrace();
//            return null;
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return retMap;
//    }
    /**
     * Reads the assumptions for the interactive timing analysis timing request file from the 
     * assumptions file to a stringBuilder
     * 
     * @param uri
     *     The location of the assumptions file
     * @param stringBuilder
     *     The StringBuilder to which the content of the assumptions file will be appended
     * @return
     *     Returns true, if assumptions file could be found, false else.
     */
    def boolean getAssumptions(String uri, StringBuilder stringBuilder) {
        var BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(uri));
            var String line = null;

            // var Integer lineNumber = 0;
            while ((line = br.readLine()) != null) {
                stringBuilder.append("\n");
                stringBuilder.append(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Assumptions file could not be found.");
            e.printStackTrace();
            return false;
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
        return true;
    }

    /**
     * Generates stubs for called functions that are mentioned in the assumptions file.
     * 
     * @param uri
     *     The location of the assumptions file
     * @param stringBuilder
     *     The StringBuilder to which the content of the assumptions file will be appended
     * @return
     *     Returns true, if assumptions file could be found, false else.
     */
    def boolean writeStubs(String uri, StringBuilder stringBuilder) {
        var BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(uri));
            // as the file is given, we will need a dummy variable for the method stubs
            stringBuilder.append("\n\n/* Stub implementations of called functions for stand alone "
            +"testing " + "of this file */\nint dummy;");
            var String line = null;
            // var Integer lineNumber = 0;
            while ((line = br.readLine()) != null) {
                // Retrieve the function name
               var tokenizer = new StringTokenizer(line);
                while (tokenizer.hasMoreTokens()) {
                    var token = tokenizer.nextToken();
                    if (token.equals("FunctionWCET") && tokenizer.hasMoreTokens()) {
                        var nameToken = tokenizer.nextToken();
                        stringBuilder.append("\nvoid __attribute__ ((noinline)) " + nameToken 
                            +"(){dummy = 0;}")
                    }
                }
                stringBuilder.append("\n");
                stringBuilder.append("");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No timing assumptions file found - no function stubs generated.");
            e.printStackTrace();
            return false;
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
        return true;
    }

    /**
     * Appends Timing Requests for fractional and local WCET for each pair of consecutive 
     * Timing Program Points (1 and 2, 2 and 3...) to the String 
     * saved in the stringBuilder. This method is used to build a timing request file.
     * 
     * @param highestTTP
     *      highest TTP number used
     * @param stringBuilder
     *      A StringBuilder, will typically already contain the beginning of a .ta file
     */
    def LinkedList<TimingRequestResult> writeTimingRequests(int highestTPP, StringBuilder stringBuilder) {
        val returnList = new LinkedList<TimingRequestResult>();
        var i = 0 as int
        stringBuilder.append("\n\n# Analysis Requests");
        if (highestTPP > 0){
             appendFWCETAndLWCETRequest("entry", 1.toString(), returnList, stringBuilder);
        
        for (i = 1; i < highestTPP; i = i + 1) {
            // there is no TPP with the number 13 (as this has special meaning for prototype analysis 
            // tool)
            if (!(i == 12) && !(i == 13)) {
                appendFWCETAndLWCETRequest(i.toString(), (i + 1).toString(), returnList, stringBuilder);
            } else {
                if (i == 12) {
                    appendFWCETAndLWCETRequest(i.toString(), (i + 2).toString, returnList, stringBuilder);
                }
            }
        }
        if (i == 13) {
            i = (i + 1)
        };
        appendFWCETAndLWCETRequest(i.toString(), "exit", returnList, stringBuilder);
        } else {
            appendFWCETAndLWCETRequest("entry", "exit", returnList, stringBuilder);
        }
        // add request for WCET path
        stringBuilder.append("\nWCP entry exit")
        var timingRequestResult = new TimingRequestResult();
        timingRequestResult.setRequestType(RequestType.WCP);
        timingRequestResult.setStartPoint("entry");
        timingRequestResult.setEndPoint("exit");
        returnList.add(timingRequestResult);
        return returnList;
    }

    /**
     * Method adds FWCET and LWCET requests for a specific pair of Timing Program points 
     * (given as string representations of their TPP numbers) to a stringBuilder, which is part of 
     * building a timing analysis request file (.ta). Also, results for the requests are prepared in 
     * the result list, analysis values will be added later.
     * 
     * @param startPoint
     *       String representation of the TPP that starts the code part, for which the analysis is to 
     *       be requested.
     * @param endPoint
     *       String representation of the TPP that starts the code part, for which the analysis is to
     *       be requested.
     * @param resultList
     *       A list of TimingRequestResults, to which the prepared results for the requests are to be 
     *       stored.
     * @param stringBuilder
     *       The String Builder, to which the requests are appended.
     */
    def appendFWCETAndLWCETRequest(String startPoint, String endPoint, LinkedList<TimingRequestResult> resultList,
        StringBuilder stringBuilder) {
        var timingRequestResult1 = new TimingRequestResult();
        var timingRequestResult2 = new TimingRequestResult();
        stringBuilder.append("\n");
        stringBuilder.append("FWCET " + startPoint + " " + endPoint);
        // + "\nLWCET " + startPoint + " " + endPoint);
        timingRequestResult1.setRequestType(RequestType.FWCET);
        timingRequestResult1.setStartPoint(startPoint);
        timingRequestResult1.setEndPoint(endPoint);
        resultList.add(timingRequestResult1);
    // timingRequestResult2.setRequestType(RequestType.LWCET);
    // timingRequestResult2.setStartPoint(startPoint.toString());
    // timingRequestResult2.setEndPoint(endPoint.toString());
    // resultList.add(timingRequestResult2);
    }

}
