/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kvid.data;

/**
 * Object for holding addressing information about an element
 * referred to for visualization purposes.
 * 
 * @author jjc
 *
 */
public class KvidUri {
    
    /** The fragment or ptolemy uri of the referred element. */
    private String elementUri = null;
    
    /** The name of the port to use. */
    private String port = null;
    
    /** The scheduling priority of the data. */ 
    private int priority = -1;
    
    /**
     * Constructor from a ptolemy URI or fragment URI.
     * Should look like the following:
     * (fragment or ptolemy uri):(referred Port)<(priority)>
     * The priority determines when the animation will take place
     * if animation was selected.
     * 
     * @param uriString The URI string which shall be used to create this object
     */
    public KvidUri(final String uriString) {
        if (uriString.contains(":")) {
            String[] parts = uriString.split(":");
            elementUri = parts[0];
            if (parts[1].contains("<")) {
                port = parts[1].substring(0, parts[1].indexOf("<"));
                priority = Integer.valueOf(parts[1].substring(
                        parts[1].indexOf("<") + 1, parts[1].indexOf(">")));
            } else {
                port = parts[1];
            }
        } else {
            elementUri = uriString;
        }
    }
    
    /**
     * Getter for the element URI.
     * 
     * @return The URI for the element this object points to
     */
    public String getElementUri() {
        return elementUri;
    }
    
    /**
     * Getter for the port.
     * 
     * @return The port which is referred
     */
    public String getPort() {
        if (port != null) {
            return port;
        } else {
            throw new RuntimeException("No port part specified.");
        }
    }
    
    /**
     * Getter for the priority.
     * 
     * @return The priority of the referred data
     */
    public int getPriority() {
        return priority;
    }
    
    /**
     * Setter for the priority.
     * 
     * @param newPriority The new priority value
     */
    public void setPriority(final int newPriority) {
        priority = newPriority;
    }
    
    /**
     * Use this to find out whether this specifies a port.
     * 
     * @return True if a port is specified, false else
     */
    public boolean hasPort() {
        return port != null;
    }
    
    /**
     * Use this to find out whether this specifies a priority.
     * 
     * @return True if a priority is specified, false else
     */
    public boolean hasPriority() {
        return priority >= 0;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        if (port == null) {
            return elementUri.hashCode(); // + priority;
        } else {
            return elementUri.hashCode() + port.hashCode(); // + priority;
        }
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof KvidUri)) {
            return false;
        }
        KvidUri other = (KvidUri) obj;
        if (!(other.getElementUri().equals(elementUri))) {
            return false;
        }
        if (other.hasPort() == hasPort()) {
            if (other.hasPort()) {
                if (!(other.getPort().equals(getPort()))) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return elementUri + ":" + port + "<" + priority + ">";
    }

}
