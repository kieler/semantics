/**
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


package de.cau.cs.kieler.sccharts.tsccharts.handler;

import java.util.LinkedList;

/**
 * This class represents a timing request for the interface of interactive timing analysis. A request 
 * is a triple, of which the first part is the request type and the first and second part are numbers 
 * denoting program points (start of code section and end of code section).
 * 
 * @author: ima
 * @kieler.design
 * @kieler.rating
 */
class TimingRequestResult{
    public enum RequestType {WCP, BCP, LWCET, LBCET, FWCET, FBCET}
    
    private RequestType requestType;
    private Integer startPoint;
    private Integer endPoint;
    private LinkedList<Integer> result;
    
    TimingRequestResult
      (RequestType requestType, Integer startPoint, Integer endPoint, LinkedList<Integer> result){
        this.setRequestType(requestType);
        this.setStartPoint(startPoint);
        this.setEndPoint(endPoint);
        this.setResult(result);
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public Integer getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Integer startPoint) {
        this.startPoint = startPoint;
    }

    public Integer getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Integer endPoint) {
        this.endPoint = endPoint;
    }

    public LinkedList<Integer> getResult() {
        return result;
    }

    public void setResult(LinkedList<Integer> result) {
        this.result = result;
    }
    
}