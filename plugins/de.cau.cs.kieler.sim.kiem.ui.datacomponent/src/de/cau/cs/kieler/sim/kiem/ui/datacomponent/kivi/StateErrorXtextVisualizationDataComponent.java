/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.ui.datacomponent.kivi;

import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.RGB;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * The DataComponent for visualizing Xtext editor statements during simulation for a specific
 * language defined with the Xtext framework.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 yellow KI-28
 */
public abstract class StateErrorXtextVisualizationDataComponent extends
        JSONObjectXtextVisualizationDataComponent {

    /** The active (and selected) statements, needed to undo. */
    private HashMap<EObject, String> statementPrio = new HashMap<EObject, String>();

    /** The active (and selected) statements, needed to undo. */
    private LinkedList<EObject> activeStatements = new LinkedList<EObject>();

    /** The error statements, needed to undo. */
    private LinkedList<EObject> errorStatements = new LinkedList<EObject>();

    /** The Constant COLOR_HIGH. */
    protected static final int COLOR_HIGH = 255;

    /** The Constant COLOR_MED. */
    protected static final int COLOR_MED = 180;

    /** The default highlight background color. */
    public static final RGB DEFAULT_HIGHLIGHT_BACKGROUND_COLOR = new RGB(COLOR_HIGH, COLOR_MED,
            COLOR_MED); // light red

    /** The default error background color. */
    public static final RGB DEFAULT_ERROR_BACKGROUND_COLOR = new RGB(COLOR_HIGH, COLOR_MED,
            COLOR_HIGH); // light magenta

    // KIEM property constants
    private static final int KIEM_PROPERTY_NUMMAX = 2;
    private static final int KIEM_PROPRTY_STATEMENTNAME = 0;
    private static final int KIEM_PROPRTY_ERRORSTATEMENTNAME = 1;

    // -----------------------------------------------------------------------------

    /**
     * Instantiates a new data component.
     */
    public StateErrorXtextVisualizationDataComponent() {
    }

    // -----------------------------------------------------------------------------

    /**
     * Gets the highlight background color. Derived classes may override this method to provide a
     * different color.
     * 
     * @return the highlight background color
     */
    protected RGB getHighlightBackgroundColor() {
        return DEFAULT_HIGHLIGHT_BACKGROUND_COLOR;
    }

    // -----------------------------------------------------------------------------

    /**
     * Gets the error background color. Derived classes may override this method to provide a
     * different color.
     * 
     * @return the error background color
     */
    protected RGB getErrorBackgroundColor() {
        return DEFAULT_ERROR_BACKGROUND_COLOR;
    }

    // -----------------------------------------------------------------------------

    /**
     * Gets the Xtext Editor ID of the editor in question. Derived classes must implement this
     * method.
     * 
     * @return the Xtext editor id
     */
    protected abstract String getXtextEditorId();

    // -----------------------------------------------------------------------------

    /**
     * Gets the language name. This name is used in error messages.
     * 
     * @return the language name
     */
    protected abstract String getLanguageName();

    // -----------------------------------------------------------------------------

    /**
     * Gets the encoded id to compare objects to the ones produced by the simulation of the
     * corresponding Xtext editor. The names of the statements and error statements produced by the
     * simulator must match these IDs.
     * 
     * @param eObject
     *            the EObject
     * @return the encoded EObject ID
     */
    protected abstract String getEncodedEObjectId(final EObject eObject);

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        activeStatements.clear();
        errorStatements.clear();
        super.wrapup();
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isProducer() {
        return false;
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isObserver() {
        return true;
    }

    // -----------------------------------------------------------------------------

    /**
     * Gets the active S statements.
     * 
     * @param jSONObject
     *            the j son object
     * @param signalName
     *            the signal name
     * @return the statements
     * @throws KiemExecutionException
     *             the kiem execution exception
     */
    protected final LinkedList<EObject> getActiveStatements(final JSONObject jSONObject,
            final String signalName) throws KiemExecutionException {

        LinkedList<EObject> newActiveStatements = new LinkedList<EObject>();

        if (jSONObject.has(signalName)) {
            // Now extract the statements separated by a colon
            try {
                String activeStatementsString = jSONObject.getString(signalName);

                String[] activeStatementsArray = activeStatementsString.split(",");

                // Select statements for highlighting
                for (String activeStatementID : activeStatementsArray) {
                    String prio = null;
                    if (activeStatementID.contains("(") && activeStatementID.contains(")")) {
                        // find out optional prio (given in parentheses)
                        prio = activeStatementID.substring(activeStatementID.indexOf("(") + 1,
                                activeStatementID.lastIndexOf(")"));
                        activeStatementID = activeStatementID.substring(0,
                                activeStatementID.indexOf("("));
                    }
                    EObject activeStatement = this.getEObject(activeStatementID);
                    if (activeStatement != null) {
                        newActiveStatements.add(activeStatement);
                        if (prio != null) {
                            statementPrio.put(activeStatement, prio);
                        }
                    }
                }

            } catch (JSONException e) {
                throw new KiemExecutionException("Cannot parse statement data variable of active "
                        + getLanguageName() + " statements for visualization.", false, false, true,
                        e);
            }
        }
        return newActiveStatements;
    }

    // -----------------------------------------------------------------------------

    /**
     * Gets the statement name.
     * 
     * @return the statement name
     */
    public final String getStatementName() {
        return this.getProperties()[KIEM_PROPRTY_STATEMENTNAME + KIEM_PROPERTY_DIFF].getValue();
    }

    // -----------------------------------------------------------------------------

    /**
     * Gets the error statement name.
     * 
     * @return the error statement name
     */
    public final String getErrorStatementName() {
        return this.getProperties()[KIEM_PROPRTY_ERRORSTATEMENTNAME + KIEM_PROPERTY_DIFF]
                .getValue();
    }

    // -----------------------------------------------------------------------------

    /**
     * Compute highlighted EObjects.
     * 
     * @param jSONObject
     *            the j son object
     * @return the hash map
     */
    public HashMap<EObject, RGB> computeHighligthed(final JSONObject jSONObject) {
        HashMap<EObject, RGB> newSelection = new HashMap<EObject, RGB>();
        activeStatements.clear();
        errorStatements.clear();

        try {
            LinkedList<EObject> statements = getActiveStatements(jSONObject,
                    this.getProperties()[KIEM_PROPRTY_STATEMENTNAME + KIEM_PROPERTY_DIFF]
                            .getValue());
            for (EObject statement : statements) {
                newSelection.put(statement, DEFAULT_HIGHLIGHT_BACKGROUND_COLOR);
                activeStatements.add(statement);
            }
        } catch (KiemExecutionException e) {
            e.printStackTrace();
        }

        // Give priority to error statements (they possibly override active statements
        try {
            LinkedList<EObject> statements = getActiveStatements(jSONObject,
                    this.getProperties()[KIEM_PROPRTY_ERRORSTATEMENTNAME + KIEM_PROPERTY_DIFF]
                            .getValue());
            for (EObject statement : statements) {
                newSelection.put(statement, DEFAULT_ERROR_BACKGROUND_COLOR);
                errorStatements.add(statement);
            }
        } catch (KiemExecutionException e) {
            e.printStackTrace();
        }

        return newSelection;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public KiemProperty[] doProvideProperties() {
        KiemProperty[] properties = new KiemProperty[KIEM_PROPERTY_NUMMAX];
        properties[KIEM_PROPRTY_STATEMENTNAME] = new KiemProperty("Statement Name", "statement");
        properties[KIEM_PROPRTY_ERRORSTATEMENTNAME] = new KiemProperty("Error Statement Name",
                "errorStatement");

        return properties;
    }

    // -------------------------------------------------------------------------

    /**
     * Return the hash table for retrieving a priority of a statement (if one was given in
     * parentheses by the simulator).
     * 
     * @return the statement prio
     */
    public HashMap<EObject, String> getStatementPrio() {
        return statementPrio;
    }

    // -------------------------------------------------------------------------

    /**
     * Return the list of active statements.
     * 
     * @return the list of active statements
     */
    public LinkedList<EObject> getActiveStatements() {
        return activeStatements;
    }

    // -------------------------------------------------------------------------

    /**
     * Return the list of error statements.
     * 
     * @return the list of error statements
     */
    public LinkedList<EObject> getErrorStatements() {
        return errorStatements;
    }

    // -------------------------------------------------------------------------

}
