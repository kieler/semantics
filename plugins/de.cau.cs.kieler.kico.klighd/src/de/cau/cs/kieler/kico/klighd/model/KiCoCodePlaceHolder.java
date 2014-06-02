/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.model;

/**
 * Placeholder of KiCoModelView to represent code
 * 
 * @author als
 * 
 */
public class KiCoCodePlaceHolder {

    /** Code content */
    private final String code;
    /** name of program represented by code */
    private final String name;

    /**
     * Creates a CodePlaceHolder for given code.
     * 
     * @param code
     */
    public KiCoCodePlaceHolder(String name, String code) {
        super();
        this.name = name;
        this.code = code;
    }

    /**
     * @return the code string
     */
    public String getCode() {
        return code;
    }

    /**
     * @return name of program represented by code
     */
    public String getName() {
        return name;
    }
}
