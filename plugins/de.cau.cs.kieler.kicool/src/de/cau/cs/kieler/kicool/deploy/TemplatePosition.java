/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.deploy;

/**
 * 
 * Common template positions
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
public enum TemplatePosition {

    HEADER("header"),
    GLOBAL_DECLARATION("global-decl"),
    BODY("body"),
    LOCAL_DECLARATION("local-decl"),
    INIT("init"),
    INPUT("input"),
    PARAMETER("step-parameter"),
    OUTPUT("output"),
    PRE_TICK("pre-tick"), // Only for time measuring
    POST_TICK("post-tick"), // Only for time measuring
    START_LOOP("start-loop"),
    END_LOOP("end-loop"),
    END_MAIN("end-main") 
    ;
    
    final String position;
    
    TemplatePosition(String position) {
        this.position = position;
    }
}
