package de.cau.cs.kieler.esterel.cec.sim.kivi;

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
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.esterel.cec.sim.EsterelCECSimPlugin;
import de.cau.cs.kieler.esterel.esterel.Program;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;

public class DataComponent extends JSONObjectSimulationDataComponent {

    /** The Esterel editor. */
    private XtextEditor esterelEditor;

    /** The Esterel semantic resource editor. */
    Resource semanticResource;

    /** The Esterel program. */
    private Program esterelProgram;

    /** The active (and selected) statements, needed to undo. */
    private LinkedList<EObject> activeStatements = new LinkedList<EObject>();

    /** The error statements, needed to undo. */
    private LinkedList<EObject> errorStatements = new LinkedList<EObject>();

    /** The recover style range map to recover original style. */
    private Hashtable<Integer, StyleRange> recoverStyleRangeMap = new Hashtable<Integer, StyleRange>();

    /** The highlight background color. */
    RGB highlightBackgroundColor = new RGB(255, 180, 180); // light red

    /** The error background color. */
    RGB errorBackgroundColor = new RGB(255, 180, 255); // light magenta

    /**
     * The highlight background color is used internally and set NULL for original.
     */
    RGB specificBackgroundColor = null;

    // -----------------------------------------------------------------------------

    /**
     * Instantiates a new data component.
     */
    public DataComponent() {
    }

    // -----------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
     * #initialize()
     */
    @Override
    public void initialize() throws KiemInitializationException {
        this.esterelEditor = this.getEsterelEditor();
        this.esterelProgram = this.getEsterelProgram(this.esterelEditor);
        refreshEObjectMap();
        this.semanticResource = this.getEsterelSemanticResource(esterelProgram);
        semanticResource.getResourceSet();
    }

    // -----------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.IDataComponent#wrapup()
     */
    public void wrapup() throws KiemInitializationException {
        // Undo Highlighting
        // Highlight the active statements
        for (EObject statement : activeStatements) {
            try {
                // null == original background
                setXtextSelection(statement, null);
            } catch (KiemInitializationException e) {
                // Hide any errors
            }
        }
        for (EObject statement : errorStatements) {
            try {
                // null == original background
                setXtextSelection(statement, null);
            } catch (KiemInitializationException e) {
                // Hide any errors
            }
        }
        eObjectMap.clear();
        activeStatements.clear();
        errorStatements.clear();
        recoverStyleRangeMap.clear();
        semanticResource = null;
        esterelProgram = null;
        esterelEditor = null;
        specificBackgroundColor = null;
    }

    // -----------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
     * #isProducer()
     */
    @Override
    public boolean isProducer() {
        return false;
    }

    // -----------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
     * #isObserver()
     */
    @Override
    public boolean isObserver() {
        return true;
    }

    // -----------------------------------------------------------------------------

    /**
     * Gets the encoded emf id to compare objects to the ones produced by the Esterel simulation in
     * Esterel2Simulation.xtend.
     * 
     * @param eObject
     *            the e object
     * @return the encoded emf id
     */
    String getEncodedEMFId(EObject eObject) {
        if (eObject.eResource() != null) {
            String uri = eObject.eResource().getURIFragment(eObject);
            // uri = uri.replaceAll("/", "x");
            // uri = uri.replaceAll("@", "");
            // // FIXME: Why does replaceAll not work for "."?!
            // while (uri.indexOf(".") > 0) {
            // String test = uri.substring(0, uri.indexOf("."));
            // String test2 = uri
            // .substring(uri.indexOf(".") + 1, uri.length());
            // uri = test + test2;
            // }
            uri = (uri.hashCode() + "").replace("-", "M");
            return uri;
        }
        return null;

    }

    // -----------------------------------------------------------------------------

    private HashMap<String, EObject> eObjectMap = new HashMap<String, EObject>();

    /**
     * Gets the eObject to an eObjectID cached by the hashmap. With a first call of this function
     * the hashmap is lazily filled.
     * 
     * @param eObjectID
     *            the e object id
     * @return the e object
     */
    EObject getEObject(String eObjectID) {
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
     * Refreshes and totally rebuilds the eObject hashmap.
     */
    void refreshEObjectMap() {
        eObjectMap.clear();
        refreshEObjectMap(this.esterelProgram);
    }

    // -----------------------------------------------------------------------------

    /**
     * Recursivly calls itsfelf on eObjects that contain children to rebuild the eObject hashmap.
     * 
     * @param baseObj
     *            the base obj
     */
    void refreshEObjectMap(EObject baseObj) {
        // Add this item
        String baseObjID = this.getEncodedEMFId(baseObj);
        if (!eObjectMap.containsKey(baseObjID)) {
            eObjectMap.put(baseObjID, baseObj);

            // Add all children
            TreeIterator<EObject> treeIterator = baseObj.eAllContents();
            while (treeIterator.hasNext()) {
                EObject treeIteratorObject = treeIterator.next();
                refreshEObjectMap(treeIteratorObject);
                // for (EObject treeIteratorObjectChild :
                // treeIteratorObject.eContents()) {
                // }
            }
        }

    }

    // -----------------------------------------------------------------------------

    LinkedList<EObject> getStatements(JSONObject jSONObject, String signalName)
            throws KiemExecutionException {

        LinkedList<EObject> newActiveStatements = new LinkedList<EObject>();

        if (jSONObject.has(signalName)) {
            // Now extract the statements separated by a colon
            try {
                String activeStatementsString = jSONObject.getString(signalName);

                String[] activeStatementsArray = activeStatementsString.split(",");

                // Select statements for highlighting
                for (String activeStatementID : activeStatementsArray) {
                    EObject activeStatement = this.getEObject(activeStatementID);
                    if (activeStatement != null) {
                        newActiveStatements.add(activeStatement);
                    }
                }

            } catch (JSONException e) {
                throw new KiemExecutionException(
                        "Cannot parse statement data variable of active Esterel statements for visualization.",
                        false, false, true, e);
            }
        }
        return newActiveStatements;
    }

    // -----------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
     * #doStep(org.json.JSONObject)
     */
    @Override
    public JSONObject doStep(JSONObject jSONObject) throws KiemExecutionException {
        String statementName = this.getProperties()[1].getValue();
        String errorStatementName = this.getProperties()[2].getValue();

        LinkedList<EObject> newActiveStatements = getStatements(jSONObject, statementName);
        LinkedList<EObject> newErrorStatements = getStatements(jSONObject, errorStatementName);
        LinkedList<EObject> newActiveErrorStatements = new LinkedList<EObject>();
        newActiveErrorStatements.addAll(newActiveStatements);
        newActiveErrorStatements.addAll(newErrorStatements);

        // Silent repeat
        try {
            if (failSilentRecoveryFromUserEditorChange(newActiveStatements)) {
                // silently repeat
                return doStep(jSONObject);
            }
        } catch (KiemInitializationException e) {
            new KiemExecutionException("fail silent recovery from user editor change failed.",
                    false, e);
        }

        // Undo Highlighting
        // Highlight the active statements
        LinkedList<EObject> oldActiveErrorStatements = new LinkedList<EObject>();
        oldActiveErrorStatements.addAll(activeStatements);
        oldActiveErrorStatements.addAll(errorStatements);
        for (EObject statement : oldActiveErrorStatements) {
            // remove highlighting only if not again to highlight
            if (!newActiveErrorStatements.contains(statement)) {
                try {
                    setXtextSelection(statement, null);
                } catch (KiemInitializationException e) {
                    throw new KiemExecutionException(
                            "No active Esterel editor for statement visualization.", false, false,
                            true, e);
                }
            }
        }

        // New active statements
        LinkedList<EObject> oldActiveStatements = activeStatements;
        LinkedList<EObject> oldErrorStatements = errorStatements;
        activeStatements = newActiveStatements;
        errorStatements = newErrorStatements;

        // Highlight the active statements
        for (EObject statement : newActiveErrorStatements) {
            // highlight only if not highlighted before
            if (!oldActiveErrorStatements.contains(statement)
                    || oldActiveStatements.contains(statement)
                    && newErrorStatements.contains(statement)
                    || oldErrorStatements.contains(statement)
                    && newActiveStatements.contains(statement)) {
                try {
                    // give preference to error coloring
                    if (errorStatements.contains(statement)) {
                        setXtextSelection(statement, this.errorBackgroundColor);
                    } else {
                        setXtextSelection(statement, this.highlightBackgroundColor);
                    }
                } catch (KiemInitializationException e) {
                    throw new KiemExecutionException(
                            "No active Esterel editor for statement visualization.", false, false,
                            true, e);
                }
            }
        }

        // This is just an observer component
        return null;
    }

    // -----------------------------------------------------------------------------

    private Resource getEsterelSemanticResource(EObject semanticElement) {
        return semanticElement.eResource();
    }

    ICompositeNode xtextNode;
    boolean selectionDone;

    // -----------------------------------------------------------------------------

    /**
     * Sets the xtext selection to have a specific background color.
     * 
     * @param semanticElement
     *            the semantic element
     * @param highlight
     *            the highlight
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    private void setXtextSelection(EObject semanticElement, RGB specificBackgroundColor)
            throws KiemInitializationException {
        this.specificBackgroundColor = specificBackgroundColor;
        setXtextSelection(semanticElement);
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
    private boolean failSilentRecoveryFromUserEditorChange(LinkedList<EObject> activeStatements)
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

    /**
     * Sets the xtext selection to have the last used background color.
     * 
     * @param semanticElement
     *            the new xtext selection
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    private void setXtextSelection(EObject semanticElement) throws KiemInitializationException {
        Resource semanticResource = this.semanticResource;
        if (semanticResource == null) {
            return;
        }
        String semanticElementFragment = semanticResource.getURIFragment(semanticElement);
        XtextResource xtextResource = (XtextResource) semanticResource;
        EObject semanticElementInDocument = xtextResource.getEObject(semanticElementFragment);
        xtextNode = NodeModelUtils.findActualNodeFor(semanticElementInDocument);

        if (xtextNode != null) {
            selectionDone = false;
            Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    XtextEditor xtextEditor;
                    xtextEditor = esterelEditor;

                    // getOffset() and getLength() are trimming whitespaces
                    int offset = xtextNode.getOffset();

                    // Find the next leaf node element (the actual Esterel
                    // Statement)
                    // and get its legth
                    int length = NodeModelUtils.findLeafNodeAtOffset(xtextNode, offset).getLength();

                    xtextEditor.getInternalSourceViewer().setRangeIndication(offset, length, true);
                    xtextEditor.getInternalSourceViewer().revealRange(offset, length);

                    StyleRange styleRange = null;
                    // if any background color is set, then use this
                    if (specificBackgroundColor != null) {
                        // Save the current style before
                        StyleRange backupStyleRange = xtextEditor.getInternalSourceViewer()
                                .getTextWidget().getStyleRangeAtOffset(offset);
                        recoverStyleRangeMap.put(offset, backupStyleRange);
                        Color highlightColor = new Color(Display.getCurrent(),
                                specificBackgroundColor);
                        styleRange = new StyleRange(offset, length, backupStyleRange.foreground,
                                highlightColor);
                    } else {
                        // Recover the old style
                        StyleRange recoverStyleRange = recoverStyleRangeMap.get(offset);
                        if (recoverStyleRange != null) {
                            styleRange = new StyleRange(offset, length,
                                    recoverStyleRange.foreground, recoverStyleRange.background,
                                    recoverStyleRange.fontStyle);
                            recoverStyleRangeMap.remove(offset);
                        }
                    }

                    if (styleRange != null) {
                        xtextEditor.getInternalSourceViewer().getTextWidget()
                                .setStyleRange(styleRange);
                    }

                    selectionDone = true;
                }
            });
            while (!selectionDone) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // No error behavior
                }
            }
        }
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent#isHistoryObserver ()
     */
    @Override
    public boolean isHistoryObserver() {
        return true;
    }

    // -----------------------------------------------------------------------------

    /**
     * Gets the Esterel editor.
     * 
     * @return the Esterel editor
     * @throws KiemInitializationException
     */
    private XtextEditor getEsterelEditor() throws KiemInitializationException {
        IEditorPart editorPart = this.getInputEditor();

        if (editorPart instanceof XtextEditor) {
            XtextEditor xtextEditor = (XtextEditor) editorPart;

            if (xtextEditor.getDocument() instanceof XtextDocument
                    && xtextEditor.getLanguageName().equals(EsterelCECSimPlugin.ESTEREL_EDITOR_ID)) {

                return xtextEditor;
            }
        }

        // In this case no adequate editor was found
        throw new KiemInitializationException(
                "No opened Esterel editor found for simulation visualization.", true, null);
    }

    // -----------------------------------------------------------------------------

    @Override
    public KiemProperty[] doProvideProperties() {
        final int nProperties = 2;
        KiemProperty[] properties = new KiemProperty[nProperties];
        properties[0] = new KiemProperty("Statement Name", "statement");
        properties[1] = new KiemProperty("Error Statement Name", "errorStatement");

        return properties;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the Esterel program.
     * 
     * @param esterelEditor
     *            the esterel editor
     * @return the esterel program
     */
    private Program getEsterelProgram(XtextEditor esterelEditor) {
        IParseResult result = null;

        IUnitOfWork<IParseResult, XtextResource> work = new IUnitOfWork<IParseResult, XtextResource>() {

            public IParseResult exec(final XtextResource state) throws Exception {
                return state.getParseResult();
            }
        };
        result = esterelEditor.getDocument().readOnly(work);

        return ((Program) result.getRootASTElement());
    }

    // -----------------------------------------------------------------------------

}
