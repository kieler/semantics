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
package de.cau.cs.kieler.krep.evalbench.program.kep;

public class Sub_Data extends RegisterDataInst {

    public Sub_Data(Register target, Data data, SCLine sc) {
        super(Constants.SUB_DATA.getOpcode(), Constants.SUB_DATA.getInfo(),
                target, data, sc);
    }

}
