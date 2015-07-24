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
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
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
    private XtextEditor xtextEditor;

    /** The model semantic resource editor. */
    private Resource semanticResource;

    /** The model root of the corresponding Xtext editor. */
    private EObject modelRoot;

    /** The recover text style range map to recover original style. */
    private HashMap<Integer, StyleRange> recoverStyleRangeMap = new HashMap<Integer, StyleRange>();

    /**
     * The highlighted memory to remember which eobject is highlighted in which color, null == not
     * highlighted.
     */
    private HashMap<EObject, RGB> currentHighlighted = new HashMap<EObject, RGB>();

    /** The Constant COLOR_MED. */
    protected static final int COLOR_HIGH = 255;

    /** The Constant CLEAR for clearing a selection. */
    protected static final RGB CLEAR_SELECTION = null; // new RGB(COLOR_HIGH, COLOR_HIGH,
                                                       // COLOR_HIGH); // white

    // -----------------------------------------------------------------------------

    /**
     * Instantiates a new data component.
     */
    public JSONObjectXtextVisualizationDataComponent() {
    }

    // -----------------------------------------------------------------------------

    /**
     * Gets a copy of the current highlighted statements map.
     * 
     * @return the current highlighted
     */
    public HashMap<EObject, RGB> getCurrentHighlighted() {
        HashMap<EObject, RGB> currentSelectionCopy = new HashMap<EObject, RGB>();
        currentSelectionCopy.putAll(this.currentHighlighted);
        return currentSelectionCopy;
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
     * Compute a new set of highlighted EObjects based on the simulator output given in jSONObject.
     * 
     * @param jSONObject
     *            the j son object
     * @return the hash map
     */
    abstract HashMap<EObject, RGB> computeHighligthed(final JSONObject jSONObject);

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
        try {
            refreshView(new HashMap<EObject, RGB>(), false, false, null);
        } catch (Exception e) {
            // Cannot occur here because called asynchronously
            e.printStackTrace();
        }
        eObjectMap.clear();
        //recoverStyleRangeMap.clear();
        semanticResource = null;
        modelRoot = null;
        xtextEditor = null;
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
    protected EObject getEObject(final String eObjectID) {
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
     * Refresh view with the current selection.
     * 
     * @param async
     *            the async
     * @param calledFromGuiThread
     *            the called from gui thread
     * @throws KiemExecutionException
     *             the kiem execution exception
     * @param scrollToObject
     *            the object to scroll to (or null if no such object)
     */
    public void refreshView(final boolean async, final boolean calledFromGuiThread,
            final EObject scrollToObject) throws KiemExecutionException {
        refreshView(currentHighlighted, async, calledFromGuiThread, scrollToObject);
    }

    // -----------------------------------------------------------------------------

    /**
     * Refresh the textual view and highlighting of active and error statements.
     * 
     * @param newSelection
     *            the new selection
     * @param async
     *            the async
     * @param calledFromGuiThread
     *            the called from gui thread
     * @param scrollToObject
     *            the object to scroll to (or null if no such object)
     * @throws KiemExecutionException
     *             the kiem execution exception
     */
    public void refreshView(final HashMap<EObject, RGB> newSelection, final boolean async,
            final boolean calledFromGuiThread, final EObject scrollToObject)
            throws KiemExecutionException {

        final HashMap<EObject, RGB> diffSelection = new HashMap<EObject, RGB>();

        // Undo Highlighting
        // Highlight the active statements
        for (EObject statement : currentHighlighted.keySet()) {
            // remove highlighting only if not again to highlight
            if (!newSelection.containsKey(statement)) {
                diffSelection.put(statement, CLEAR_SELECTION);
            }
        }

        // Highlight the active statements
        for (EObject statement : newSelection.keySet()) {
            RGB highlightColor = newSelection.get(statement);
            // highlight only if not highlighted before
            // give preference to error coloring

            boolean contains = currentHighlighted.containsKey(statement);
            RGB currentColor = currentHighlighted.get(statement);
            RGB newColor = highlightColor;

            if (!contains || (!currentColor.equals(newColor))) {
                diffSelection.put(statement, highlightColor);
            }
        }

        // Apply diff selection
        if (async || !calledFromGuiThread) {
            applyDiffSelectionAsync(diffSelection, scrollToObject, async);
        } else {
            applyDiffSelection(diffSelection, scrollToObject);
        }
    }

    // -----------------------------------------------------------------------------

    /**
     * Apply the differential selection including clears and new highlighting all at once if
     * possible.
     * 
     * @param diffSelection
     *            the diff selection
     * @param scrollToObject
     *            the object to scroll to (or null if no such object)
     * @param async
     *            the async
     */
    private void applyDiffSelectionAsync(final HashMap<EObject, RGB> diffSelection,
            final EObject scrollToObject, final boolean async) {
        if (async) {
            Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    try {
                        applyDiffSelection(diffSelection, scrollToObject);
                    } catch (KiemExecutionException e) {
                        // Report error
                        e.printStackTrace();
                    }
                }
            });
        } else {
            Display.getDefault().syncExec(new Runnable() {
                public void run() {
                    try {
                        applyDiffSelection(diffSelection, scrollToObject);
                    } catch (KiemExecutionException e) {
                        // Report error
                    }
                }
            });
        }
    }

    // -----------------------------------------------------------------------------

    /**
     * Apply the differential selection including clears and new highlighting all at once if
     * possible.
     * 
     * @param diffSelection
     *            the diff selection
     * @param scrollToObject
     *            the object to scroll to (or null if no such object)
     * @throws KiemExecutionException
     *             the kiem execution exception
     */
    private void applyDiffSelection(final HashMap<EObject, RGB> diffSelection,
            final EObject scrollToObject) throws KiemExecutionException {
        for (EObject statement : diffSelection.keySet()) {
            RGB highlightColor = diffSelection.get(statement);
            try {
                if (highlightColor == CLEAR_SELECTION) {
                    if (currentHighlighted.containsKey(statement)) {
                        currentHighlighted.remove(statement);
                    }
                    setXtextSelection(statement, null);
                } else {
                    currentHighlighted.put(statement, highlightColor);
                    setXtextSelection(statement, highlightColor);
                }
            } catch (KiemInitializationException e) {
                e.printStackTrace();
                throw new KiemExecutionException("No active " + this.getLanguageName()
                        + " editor for statement visualization.", false, false, true, e);
            }
        }
        // Finally scroll to an EObject if this is not null
        if (scrollToObject != null && currentHighlighted.containsKey(scrollToObject)) {
            try {
                setXtextSelection(scrollToObject, currentHighlighted.get(scrollToObject));
            } catch (KiemInitializationException e) {
                e.printStackTrace();
                throw new KiemExecutionException("No active " + this.getLanguageName()
                        + " editor for statement visualization.", false, false, true, e);
            }
        }
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONObject doStep(final JSONObject jSONObject) throws KiemExecutionException {
        // Compute the new selection
        HashMap<EObject, RGB> newSelection = computeHighligthed(jSONObject);

        // Silent repeat
        try {
            if (failSilentRecoveryFromUserEditorChange(newSelection.keySet())) {
                // silently repeat
                return doStep(jSONObject);
            }
        } catch (KiemInitializationException e) {
            throw new KiemExecutionException(
                    "Fail silent recovery from user editor change failed.", false, e);
        }

        // Refresh highlighting
        refreshView(newSelection, true, false, null);

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
     * Fail silent recovery from user editor change. If the user edits text in the editor during
     * visualization, the highlighting is invalidated but the next time he clicks on step (and has
     * focused the right editor) the refreshed editor input is used for visualization.
     * 
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    private boolean failSilentRecoveryFromUserEditorChange(final Set<EObject> activeStatements)
            throws KiemInitializationException {

        for (EObject statement : activeStatements) {
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

    /**
     * Sets the Xtext selection to have the last used background color.
     * 
     * @param semanticElement
     *            the new Xtext selection
     * @param specificBackgroundColor
     *            the specific background color
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    private void setXtextSelection(final EObject semanticElement, final RGB specificBackgroundColor)
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
            doSelection(specificBackgroundColor);
        }
    }

    // -----------------------------------------------------------------------------

    /**
     * Do the selection either synchronously (in UI thread) or asynchronously (not from UI thread).
     * 
     * @param specificBackgroundColor
     *            the specific background color
     */
    private void doSelection(final RGB specificBackgroundColor) {
        XtextEditor localXtextEditor;
        localXtextEditor = xtextEditor;

        // getOffset() and getLength() are trimming white spaces
        int offset = xtextNode.getOffset();

        // Find the next leaf node element (the actual Statement of the language)
        // and get its length
        if (NodeModelUtils.findLeafNodeAtOffset(xtextNode, offset) == null) {
            // Editor might be closed
            return;
        }
        int length = 0;
        try {
            length = NodeModelUtils.findLeafNodeAtOffset(xtextNode, offset).getLength();
        } catch (Exception e) {
            // Editor might be closed
            return;
        }
        if (localXtextEditor.getInternalSourceViewer() == null) {
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
            if (backupStyleRange == null) {
                if (recoverStyleRangeMap.containsKey(offset)) {
                    // try to recover
                    backupStyleRange = recoverStyleRangeMap.get(offset);
                }
            }
            if (backupStyleRange != null) {
                // Only if there not already exists a backup/recovery style
                if (!recoverStyleRangeMap.containsKey(offset)) {
                    recoverStyleRangeMap.put(offset, backupStyleRange);
                }
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
                //recoverStyleRangeMap.remove(offset);
            }
        }

        if (styleRange != null) {
            localXtextEditor.getInternalSourceViewer().getTextWidget().setStyleRange(styleRange);
        }
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
