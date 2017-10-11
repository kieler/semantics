/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.instructions;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.RGB;

/**
 * The Interface IJSONObjectDataComponent. If the DataComponent extends this extension point it can
 * handle JSON objects in String notation. A JSON implementation for Java that can be found on
 * {@link "www.json.org/java"}.
 * 
 * @author cmot
 * @kieler.design 2012-02-28 proposed
 * @kieler.rating 2012-02-28 proposed yellow
 * 
 */
public interface IInstructionsDataProvider {
    
    /**
     * Gets the instruction data displayed in the Instructions View table.
     *
     * @param statement the statement
     * @return the instruction data
     */
    public InstructionsData getInstructionsData(EObject statement);

    //-------------------------------------------------------------------------

    /**
     * Gets the list of standard highlighted, marked statements.
     *
     * @return the marked statements
     */
    public List<EObject> getMarkedStatements();
    
    //-------------------------------------------------------------------------

    /**
     * Gets the list of special highlighted statements.
     *
     * @return the highlighted statements
     */
    public List<EObject> getHighlightedStatements();
    
    //-------------------------------------------------------------------------

    /**
     * Called when a statement is selected. Implementation should update internal representation of marked and highlighted statements.
     *
     * @param statement the statement
     */
    public void selectStatement(EObject statement);
    
    //-------------------------------------------------------------------------

    /**
     * Gets the default color used to clear marked or highlighted color. This should be the background color of the editor.
     *
     * @return the default color
     */
    public RGB getDefaultColor();

    //-------------------------------------------------------------------------

    /**
     * Gets the marked color used to color the background of marked statements. 
     *
     * @return the marked color
     */
    public RGB getMarkedColor();

    //-------------------------------------------------------------------------
    
    /**
     * Gets the highlighted color used to color the background of highlighted statements. 
     *
     * @return the highlighted color
     */
    public RGB getHighlightedColor();
}
