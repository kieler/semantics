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
package de.cau.cs.kieler.synccharts.dsl.kits.menu.actions;

/**
 * This action initializes a KITS file from an XMI file. This is done by getting
 * the XMI resource from the active editor, parsing it with KitsParser and
 * serializing it using the KitsSerializer. Note that we are extracting the
 * parser and the serializer from the injector thus changing their
 * implementation is very easy to do.
 * 
 * @author oba
 * 
 */
public class InitializeXtextResource {
    /**
     * Constructor for InitializeXtextResource.
     */
    public InitializeXtextResource() {
        super();
    }

}
