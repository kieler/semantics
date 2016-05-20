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


package de.cau.cs.kieler.sccharts.timing;

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
public class TimingRequestResult{
    
    private RequestType requestType;
    //labels of program points that mark start and end of the code section that is subject to analysis
    private String startPoint;
    private String endPoint;
    private LinkedList<String> result;
    
    public TimingRequestResult
      (RequestType requestType, String startPoint, String endPoint, LinkedList<String> result){
        this.setRequestType(requestType);
        this.setStartPoint(startPoint);
        this.setEndPoint(endPoint);
        this.setResult(result);
    }
    
    public TimingRequestResult(){
        
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint2) {
        this.startPoint = startPoint2;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint2) {
        this.endPoint = endPoint2;
    }

    public LinkedList<String> getResult() {
        return result;
    }

    public void setResult(LinkedList<String> result2) {
        this.result = result2;
    }
    
}