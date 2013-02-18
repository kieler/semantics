/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.ui.datacomponent.kivi;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.internal.UISynchronizer;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;

/**
 * The DataComponent for visualizing Xtext editor statements during simulation for a specific
 * language defined with the Xtext framework.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 yellow KI-28
 */
public abstract class JSONObjectXtextVisualizationDataComponent extends
        JSONObjectSimulationDataComponent {

    /** The Xtext editor. */
    protected XtextEditor xtextEditor;

    /** The model semantic resource editor. */
    protected Resource semanticResource;

    /** The model root of the corresponding Xtext editor. */
    protected EObject modelRoot;

    /** The active (and selected) statements, needed to undo. */
    protected HashMap<EObject, String> statementPrio = new HashMap<EObject, String>();

    /** The active (and selected) statements, needed to undo. */
    protected LinkedList<EObject> activeStatements = new LinkedList<EObject>();

    /** The active (and selected) statements, needed to undo. */
    protected LinkedList<EObject> activeStatements2 = new LinkedList<EObject>();

    /** The error statements, needed to undo. */
    protected LinkedList<EObject> errorStatements = new LinkedList<EObject>();

    /** The recover text style range map to recover original style. */
    protected Hashtable<Integer, StyleRange> recoverStyleRangeMap = new Hashtable<Integer, StyleRange>();

    /** The Constant COLOR_HIGH. */
    protected static final int COLOR_HIGH = 255;

    /** The Constant COLOR_MED. */
    protected static final int COLOR_MED = 180;

    /** The default highlight background color. */
    protected static final RGB DEFAULT_HIGHLIGHT_BACKGROUND_COLOR = new RGB(COLOR_HIGH, COLOR_MED,
            COLOR_MED); // light red

    /** The default highlight background color. */
    protected static final RGB DEFAULT_HIGHLIGHT_BACKGROUND_COLOR2 = new RGB(COLOR_MED, COLOR_HIGH,
            COLOR_MED); // light green

    /** The default error background color. */
    protected static final RGB DEFAULT_ERROR_BACKGROUND_COLOR = new RGB(COLOR_HIGH, COLOR_MED,
            COLOR_HIGH); // light magenta

    /** The Constant SLEEP_TIME for the thread to sleep. */
    protected static final int SLEEP_TIME = 1;

    /**
     * The highlighted memory to remember which eobject is highlighted in which color, null == not
     * highlighted.
     */
    protected Hashtable<EObject, RGB> highlighted = new Hashtable<EObject, RGB>();

    /**
     * The highlight background color is used internally for setting a specific background color and
     * set NULL for original.
     */
    private RGB specificBackgroundColor = null;

    // KIEM property constants
    private static final int KIEM_PROPERTY_NUMMAX = 2;
    private static final int KIEM_PROPRTY_STATEMENTNAME = 0;
    private static final int KIEM_PROPRTY_ERRORSTATEMENTNAME = 1;

    // -----------------------------------------------------------------------------

    /**
     * Instantiates a new data component.
     */
    public JSONObjectXtextVisualizationDataComponent() {
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
     * Gets the highlight background color. Derived classes may override this method to provide a
     * different color.
     * 
     * @return the highlight background color
     */
    protected RGB getHighlightBackgroundColor2() {
        return DEFAULT_HIGHLIGHT_BACKGROUND_COLOR2;
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
    @Override
    public void initialize() throws KiemInitializationException {
        this.xtextEditor = this.getXtextEditor();
        this.modelRoot = this.getModelRoot(this.xtextEditor);
        refreshEObjectMap();
        this.semanticResource = this.getSSemanticResource(modelRoot);
        semanticResource.getResourceSet();
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        // Undo Highlighting
        // Highlight the active statements
        for (EObject statement : activeStatements) {
            try {
                // null == original background
                setXtextSelection(statement, null, false);
            } catch (KiemInitializationException e) {
                // Hide any errors
            }
        }
        for (EObject statement : activeStatements2) {
            try {
                // null == original background
                setXtextSelection(statement, null, false);
            } catch (KiemInitializationException e) {
                // Hide any errors
            }
        }
        for (EObject statement : errorStatements) {
            try {
                // null == original background
                setXtextSelection(statement, null, false);
            } catch (KiemInitializationException e) {
                // Hide any errors
            }
        }
        highlighted.clear();
        eObjectMap.clear();
        activeStatements.clear();
        activeStatements2.clear();
        errorStatements.clear();
        recoverStyleRangeMap.clear();
        semanticResource = null;
        modelRoot = null;
        xtextEditor = null;
        specificBackgroundColor = null;
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

    /** A map to cache EObject and eObjectID (String) mappings. */
    private HashMap<String, EObject> eObjectMap = new HashMap<String, EObject>();

    /**
     * Gets the eObject to an eObjectID cached by the hash map. With a first call of this function
     * the hash map is lazily filled.
     * 
     * @param eObjectID
     *            the EObject ID
     * @return the EObject
     */
    private EObject getEObject(final String eObjectID) {
        if ((eObjectID == null) || eObjectID.equals("")) {
            return null;
        } else if (eObjectMap.containsKey(eObjectID)) {
            // only do this if editor input has not changed
            return eObjectMap.get(eObjectID);
        } else {
            // Refresh the map and try again
            refreshEObjectMap();
            if (eObjectMap.containsKey(eObjectID)) {
                return eObjectMap.get(eObjectID);
            }
        }

        return null;
    }

    // -----------------------------------------------------------------------------

    /**
     * Refreshes and totally rebuilds the eObject hash map.
     */
    protected final void refreshEObjectMap() {
        eObjectMap.clear();
        refreshEObjectMap(this.modelRoot);
    }

    // -----------------------------------------------------------------------------

    /**
     * Recursively calls itself on eObjects that contain children to rebuild the eObject hash map.
     * 
     * @param baseObj
     *            the base EObject
     */
    private void refreshEObjectMap(final EObject baseObj) {
        // Add this item
        String baseObjID = this.getEncodedEObjectId(baseObj);
        if (!eObjectMap.containsKey(baseObjID)) {
            eObjectMap.put(baseObjID, baseObj);

            // Add all children
            TreeIterator<EObject> treeIterator = baseObj.eAllContents();
            while (treeIterator.hasNext()) {
                EObject treeIteratorObject = treeIterator.next();
                refreshEObjectMap(treeIteratorObject);
            }
        }

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
     * Refresh the textual view and highlighting of active and error statements.
     * 
     * @param newActiveStatements
     *            the new active statements
     * @param newActiveStatements2
     *            the new active statements2
     * @param newErrorStatements
     *            the new error statements
     * @throws KiemExecutionException
     *             the kiem execution exception
     */
    public void refreshView(final LinkedList<EObject> newActiveStatements,
            final LinkedList<EObject> newActiveStatements2,
            final LinkedList<EObject> newErrorStatements, final boolean async)
            throws KiemExecutionException {
        LinkedList<EObject> newActiveErrorStatements = new LinkedList<EObject>();
        newActiveErrorStatements.addAll(newActiveStatements);
        newActiveErrorStatements.addAll(newActiveStatements2);
        newActiveErrorStatements.addAll(newErrorStatements);

        // Undo Highlighting
        // Highlight the active statements
        LinkedList<EObject> oldActiveErrorStatements = new LinkedList<EObject>();
        oldActiveErrorStatements.addAll(activeStatements);
        oldActiveErrorStatements.addAll(activeStatements2);
        oldActiveErrorStatements.addAll(errorStatements);
        for (EObject statement : oldActiveErrorStatements) {
            // remove highlighting only if not again to highlight
            if (!newActiveErrorStatements.contains(statement)) {
                try {
                    if (highlighted.contains(statement)) {
                        highlighted.remove(statement);
                    }
                    setXtextSelection(statement, null, async);
                } catch (KiemInitializationException e) {
                    throw new KiemExecutionException("No active " + getLanguageName()
                            + " editor for statement visualization.", false, false, true, e);
                }
            }
        }

        // New active statements
        activeStatements = newActiveStatements;
        errorStatements = newErrorStatements;

        // Highlight the active statements
        for (EObject statement : newActiveErrorStatements) {
            // highlight only if not highlighted before
            try {
                // give preference to error coloring
                if (errorStatements.contains(statement)) {
                    if (highlighted.get(statement) != this.getErrorBackgroundColor()) {
                        setXtextSelection(statement, this.getErrorBackgroundColor(), async);
                    }
                } else {
                    if (activeStatements.contains(statement)) {
                        if (highlighted.get(statement) != this.getHighlightBackgroundColor()) {
                            setXtextSelection(statement, this.getHighlightBackgroundColor(), async);
                        }
                    } else {
                        if (highlighted.get(statement) != this.getHighlightBackgroundColor2()) {
                            setXtextSelection(statement, this.getHighlightBackgroundColor2(), async);
                        }
                    }
                }
            } catch (KiemInitializationException e) {
                throw new KiemExecutionException("No active " + this.getLanguageName()
                        + " editor for statement visualization.", false, false, true, e);
            }
        }
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
     * {@inheritDoc}
     */
    @Override
    public final JSONObject doStep(final JSONObject jSONObject) throws KiemExecutionException {
        String statementName = getStatementName();
        String errorStatementName = getErrorStatementName();

        LinkedList<EObject> newActiveStatements = getActiveStatements(jSONObject, statementName);
        LinkedList<EObject> newErrorStatements = getActiveStatements(jSONObject, errorStatementName);

        // Silent repeat
        try {
            if (failSilentRecoveryFromUserEditorChange(newActiveStatements)) {
                // silently repeat
                return doStep(jSONObject);
            }
        } catch (KiemInitializationException e) {
            throw new KiemExecutionException(
                    "Fail silent recovery from user editor change failed.", false, e);
        }

        // Repaint
        refreshView(newActiveStatements, new LinkedList<EObject>(), newErrorStatements, true);

        // This is just an observer component
        return null;
    }

    // -----------------------------------------------------------------------------

    /**
     * Gets the s semantic resource.
     * 
     * @param semanticElement
     *            the semantic element
     * @return the s semantic resource
     */
    private Resource getSSemanticResource(final EObject semanticElement) {
        return semanticElement.eResource();
    }

    // -----------------------------------------------------------------------------

    /**
     * Sets the xtext selection to have a specific background color.
     * 
     * @param semanticElement
     *            the semantic element
     * @param specificBackgroundColorParam
     *            the specific background color param
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    private void setXtextSelection(final EObject semanticElement,
            final RGB specificBackgroundColorParam, final boolean async)
            throws KiemInitializationException {
        this.specificBackgroundColor = specificBackgroundColorParam;
        setXtextSelection(semanticElement, async);
    }

    // -----------------------------------------------------------------------------

    /**
     * Fail silent recovery from user editor change. If the user edits text in the editor during
     * visualization, the highlighting is invalidated but the next time he clicks on step (and has
     * focused the right editor) the refreshed editor input is used for visualization.
     * 
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    private boolean failSilentRecoveryFromUserEditorChange(
            final LinkedList<EObject> activeStatementsParam) throws KiemInitializationException {

        for (EObject statement : activeStatementsParam) {
            String semanticElementFragment = semanticResource.getURIFragment(statement);
            if (semanticElementFragment.equals("/-1")) {
                initialize();
                // recovery action
                return true;
            }
        }
        // NO recovery action
        return false;
    }

    // -----------------------------------------------------------------------------

    /** The Xtext node. */
    private ICompositeNode xtextNode;

    /** The selection done. */
    private boolean selectionDone;

    /**
     * Sets the Xtext selection to have the last used background color.
     * 
     * @param semanticElement
     *            the new Xtext selection
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    private void setXtextSelection(final EObject semanticElement, final boolean async)
            throws KiemInitializationException {
        Resource localSemanticResource = this.semanticResource;
        if (localSemanticResource == null) {
            return;
        }
        String semanticElementFragment = localSemanticResource.getURIFragment(semanticElement);
        XtextResource xtextResource = (XtextResource) localSemanticResource;
        EObject semanticElementInDocument = xtextResource.getEObject(semanticElementFragment);
        xtextNode = NodeModelUtils.findActualNodeFor(semanticElementInDocument);

        if (xtextNode != null) {
            selectionDone = false;

            if (async) {
                Display.getDefault().asyncExec(new Runnable() {
                    public void run() {
                    }
                });
                while (!selectionDone) {
                    try {
                        Thread.sleep(SLEEP_TIME);
                    } catch (InterruptedException e) {
                        // No error behavior
                    }
                }
            } else {
                doSelection();
            }
        }
    }

    // -----------------------------------------------------------------------------

    /**
     * Do the selection either synchronously (in UI thread) or asynchronously (not from UI thread).
     */
    private void doSelection() {
        XtextEditor localXtextEditor;
        localXtextEditor = xtextEditor;

        // getOffset() and getLength() are trimming white spaces
        int offset = xtextNode.getOffset();

        // Find the next leaf node element (the actual Statement of the language)
        // and get its length
        if (NodeModelUtils.findLeafNodeAtOffset(xtextNode, offset) == null) {
            selectionDone = true;
            // Editor might be closed
            return;
        }
        int length = 0;
        try {
            length = NodeModelUtils.findLeafNodeAtOffset(xtextNode, offset).getLength();
        } catch (Exception e) {
            selectionDone = true;
            // Editor might be closed
            return;
        }
        if (localXtextEditor.getInternalSourceViewer() == null) {
            selectionDone = true;
            // Editor might be closed
            return;
        }

        localXtextEditor.getInternalSourceViewer().setRangeIndication(offset, length, true);
        localXtextEditor.getInternalSourceViewer().revealRange(offset, length);

        StyleRange styleRange = null;
        // if any background color is set, then use this
        if (specificBackgroundColor != null) {
            // Save the current style before
            StyleRange backupStyleRange = localXtextEditor.getInternalSourceViewer()
                    .getTextWidget().getStyleRangeAtOffset(offset);
            if (backupStyleRange != null) {
                recoverStyleRangeMap.put(offset, backupStyleRange);
                Color highlightColor = new Color(Display.getCurrent(), specificBackgroundColor);
                styleRange = new StyleRange(offset, length, backupStyleRange.foreground,
                        highlightColor);
            }
        } else {
            // Recover the old style
            StyleRange recoverStyleRange = recoverStyleRangeMap.get(offset);
            if (recoverStyleRange != null) {
                styleRange = new StyleRange(offset, length, recoverStyleRange.foreground,
                        recoverStyleRange.background, recoverStyleRange.fontStyle);
                recoverStyleRangeMap.remove(offset);
            }
        }

        if (styleRange != null) {
            localXtextEditor.getInternalSourceViewer().getTextWidget().setStyleRange(styleRange);
        }

        selectionDone = true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isHistoryObserver() {
        return true;
    }

    // -----------------------------------------------------------------------------

    /**
     * Gets the Xtext editor corresponding to the provided getXtedtEditorId().
     * 
     * @return the Xtext editor
     * @throws KiemInitializationException
     */
    private XtextEditor getXtextEditor() throws KiemInitializationException {
        IEditorPart editorPart = this.getModelEditor();
        if ((editorPart != null) && (editorPart instanceof XtextEditor)) {
            XtextEditor localXtextEditor = (XtextEditor) editorPart;

            if (localXtextEditor.getDocument() instanceof XtextDocument
                    && localXtextEditor.getLanguageName().equals(getXtextEditorId())) {

                return localXtextEditor;
            }
        }

        // In this case no adequate editor was found
        throw new KiemInitializationException("No opened " + getLanguageName()
                + " editor found for simulation visualization.", true, null);
    }

    // -----------------------------------------------------------------------------

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
     * Gets the root model program.
     * 
     * @param xTextEditor
     *            the Xtext editor
     * @return the root EObject of the Xtext editor
     */
    private EObject getModelRoot(final XtextEditor xTextEditor) {
        IParseResult result = null;

        IUnitOfWork<IParseResult, XtextResource> work = new IUnitOfWork<IParseResult, XtextResource>() {

            public IParseResult exec(final XtextResource state) throws Exception {
                return state.getParseResult();
            }
        };
        result = xTextEditor.getDocument().readOnly(work);

        return ((EObject) result.getRootASTElement());
    }

    // -----------------------------------------------------------------------------

}
