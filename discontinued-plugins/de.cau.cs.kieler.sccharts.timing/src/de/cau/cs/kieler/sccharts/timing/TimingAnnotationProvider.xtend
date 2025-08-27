/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.timing

import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.timing.RequestType
import de.cau.cs.kieler.sccharts.timing.TimingRequestResult
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException
import java.util.LinkedList
import java.util.List
import de.cau.cs.kieler.sccharts.ControlflowRegion
import java.util.StringTokenizer
import de.cau.cs.kieler.sccharts.timing.TimingAnalysis.TimingValueRepresentation

/**
 * This class provides methods for requesting and getting timing information.
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
            while ((line = br.readLine()) != null) {
                stringBuilder.append("\n");
                stringBuilder.append(line);
            }
        } catch (FileNotFoundException e) {
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
             appendFWCETRequest("entry", 1.toString(), returnList, stringBuilder);
        
        for (i = 1; i < highestTPP; i = i + 1) {
            // there is no TPP with the number 13 (as this has special meaning for prototype analysis 
            // tool)
            if (!(i == 12) && !(i == 13)) {
                appendFWCETRequest(i.toString(), (i + 1).toString(), returnList, stringBuilder);
            } else {
                if (i == 12) {
                    appendFWCETRequest(i.toString(), (i + 2).toString, returnList, stringBuilder);
                }
            }
        }
        if (i == 13) {
            i = (i + 1)
        };
        appendFWCETRequest(i.toString(), "exit", returnList, stringBuilder);
        } else {
            appendFWCETRequest("entry", "exit", returnList, stringBuilder);
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
     * Method adds FWCET requests for a specific pair of Timing Program points 
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
    def appendFWCETRequest(String startPoint, String endPoint, LinkedList<TimingRequestResult> resultList,
        StringBuilder stringBuilder) {
        var timingRequestResult1 = new TimingRequestResult();
        stringBuilder.append("\n");
        stringBuilder.append("FWCET " + startPoint + " " + endPoint);
        timingRequestResult1.setRequestType(RequestType.FWCET);
        timingRequestResult1.setStartPoint(startPoint);
        timingRequestResult1.setEndPoint(endPoint);
        resultList.add(timingRequestResult1);
    }

}
