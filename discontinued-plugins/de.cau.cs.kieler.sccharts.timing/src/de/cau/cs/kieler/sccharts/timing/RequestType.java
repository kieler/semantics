/**
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


package de.cau.cs.kieler.sccharts.timing;

/**
 * Enumeration of the possible types of timing requests.
 * 
 * @author: ima
 * @kieler.design
 * @kieler.rating
 */
public enum RequestType {
    WCP, BCP, LWCET, LBCET, FWCET, FBCET
}
