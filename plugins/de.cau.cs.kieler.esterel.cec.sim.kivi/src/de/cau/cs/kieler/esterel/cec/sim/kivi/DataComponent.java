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
import de.cau.cs.kieler.kies.esterel.Program;
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
	
	/** The recover style range map to recover original style. */
	private Hashtable<Integer, StyleRange>  recoverStyleRangeMap = new Hashtable<Integer, StyleRange>();
	
	/** The highlight background color. */
	RGB highlightBackgroundColor =  new RGB(255,180, 180); // light red
	
    /** The highlight flag is used internally. */
    boolean highlight = false;

	// -----------------------------------------------------------------------------
	
	/**
	 * Instantiates a new data component.
	 */
	public DataComponent() {
		// TODO Auto-generated constructor stub
	}

	// -----------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
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
				setXtextSelection(statement, false);
			} catch (KiemInitializationException e) {
				// Hide any errors
			}
		}
	}

	// -----------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
	 * #isProducer()
	 */
	@Override
	public boolean isProducer() {
		// TODO Auto-generated method stub
		return false;
	}

	// -----------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
	 * #isObserver()
	 */
	@Override
	public boolean isObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	// -----------------------------------------------------------------------------

	/**
	 * Gets the encoded emf id to compare objects to the ones produced by the
	 * Esterel simulation in Esterel2Simulation.xtend.
	 * 
	 * @param eObject
	 *            the e object
	 * @return the encoded emf id
	 */
	String getEncodedEMFId(EObject eObject) {
		if (eObject.eResource() != null) {
			String uri = eObject.eResource().getURIFragment(eObject);
			uri = uri.replaceAll("/", "x");
			uri = uri.replaceAll("@", "");
			// FIXME: Why does replaceAll not work for "."?!
			while (uri.indexOf(".") > 0) {
				String test = uri.substring(0, uri.indexOf("."));
				String test2 = uri
						.substring(uri.indexOf(".") + 1, uri.length());
				uri = test + test2;
			}
			return uri;
		}
		return null;

	}

	// -----------------------------------------------------------------------------

	private HashMap<String, EObject> eObjectMap = new HashMap<String, EObject>();

	/**
	 * Gets the eObject to an eObjectID cached by the hashmap. With a first call
	 * of this function the hashmap is lazily filled.
	 * 
	 * @param eObjectID
	 *            the e object id
	 * @return the e object
	 */
	EObject getEObject(String eObjectID) {
		if ((eObjectID == null) || eObjectID.equals("")) {
			return null;
		}
		if (eObjectMap.containsKey(eObjectID)) {
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
	 * Recursivly calls itsfelf on eObjects that contain children to rebuild the
	 * eObject hashmap.
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
	 * #doStep(org.json.JSONObject)
	 */
	@Override
	public JSONObject doStep(JSONObject jSONObject)
			throws KiemExecutionException {

		String statementName = this.getProperties()[1].getValue();
		LinkedList<EObject> newActiveStatements = new LinkedList<EObject>();

		if (jSONObject.has(statementName)) {
			// Now extract the statements separated by a colon
			try {
				String activeStatementsString = jSONObject
						.getString(statementName);

				String[] activeStatementsArray = activeStatementsString
						.split(",");

				// Select statements for highlighting
				for (String activeStatementID : activeStatementsArray) {
					EObject activeStatement = this
							.getEObject(activeStatementID);
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

		// Undo Highlighting
		// Highlight the active statements
		for (EObject statement : activeStatements) {
			// remove highlighting only if not again to highlight 
			if (!newActiveStatements.contains(statement)) {
				try {
					setXtextSelection(statement, false);
				} catch (KiemInitializationException e) {
					throw new KiemExecutionException(
							"No active Esterel editor for statement visualization.",
							false, false, true, e);
				}
			}
		}
		
		LinkedList<EObject> oldActiveStatements = activeStatements;
		// New active statements
		activeStatements = newActiveStatements;
		
		// Highlight the active statements
		for (EObject statement : activeStatements) {
			// highlight only if not highlighted before
			if (!oldActiveStatements.contains(statement)) {
				try {
					setXtextSelection(statement, true);
				} catch (KiemInitializationException e) {
					throw new KiemExecutionException(
							"No active Esterel editor for statement visualization.",
							false, false, true, e);
				}
			}
		}

		// This is just an observer component
		return null;
	}

	private Resource getEsterelSemanticResource(EObject semanticElement) {
		return semanticElement.eResource();
	}

	ICompositeNode xtextNode;
	boolean selectionDone;
	
	// -----------------------------------------------------------------------------
	
	/**
	 * Compute the length of the Esterel statement up to the first space or line break.
	 *
	 * @param statement the statement
	 * @return the statement end
	 */
	int getStatementLength(String statement) {
		String tmpStatement = statement;
		while (tmpStatement.length() > 0 && ( tmpStatement.startsWith("\n") || tmpStatement.startsWith("\r") || tmpStatement.startsWith(" "))) {
			tmpStatement = tmpStatement.substring(1);
		}
		
		int len1 = tmpStatement.indexOf("\r");
		int len2 = tmpStatement.indexOf("\n");
		int len3 = tmpStatement.indexOf(" ");
		
		if (len1 == -1) {
			len1 = tmpStatement.length();
		}
		if (len2 == -1) {
			len2 = tmpStatement.length();
		}
		if (len3 == -1) {
			len3 = tmpStatement.length();
		}
		
		int len = Math.min(Math.min(len1, len2) , len3);
		if (len == -1) {
			return statement.length();
		}
		return len;
	}
	
	// -----------------------------------------------------------------------------
	
	/**
	 * Sets the xtext selection to have a specific background color.
	 *
	 * @param semanticElement the semantic element
	 * @param highlight the highlight
	 * @throws KiemInitializationException the kiem initialization exception
	 */
	private void setXtextSelection(EObject semanticElement, boolean highlight) throws KiemInitializationException {
			this.highlight = highlight;
			setXtextSelection(semanticElement);
	}

	// -----------------------------------------------------------------------------
	
	/**
	 * Sets the xtext selection to have the last used background color.
	 *
	 * @param semanticElement the new xtext selection
	 * @throws KiemInitializationException the kiem initialization exception
	 */
	private void setXtextSelection(EObject semanticElement)
			throws KiemInitializationException {
		Resource semanticResource = this.semanticResource;
		if (semanticResource == null) {
			return;
		}
		String semanticElementFragment = semanticResource
				.getURIFragment(semanticElement);
		XtextResource xtextResource = (XtextResource) semanticResource;
		EObject semanticElementInDocument = xtextResource
				.getEObject(semanticElementFragment);
		xtextNode = NodeModelUtils.findActualNodeFor(semanticElementInDocument);
		
		if (xtextNode != null) {
			selectionDone = false;
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					XtextEditor xtextEditor;
					xtextEditor = esterelEditor;

					// getOffset() and getLength() are trimming whitespaces
					int offset = xtextNode.getOffset();
					String xtextNodeText = xtextNode.getText();
					int length  = getStatementLength(xtextNodeText);

					xtextEditor.getInternalSourceViewer().setRangeIndication(
							offset, length, true);
					xtextEditor.getInternalSourceViewer().revealRange(
							offset, length);

					
					StyleRange styleRange = null;
					if (highlight) {
						// Save the current style before
						StyleRange backupStyleRange = xtextEditor.getInternalSourceViewer().getTextWidget().getStyleRangeAtOffset(offset);
						recoverStyleRangeMap.put(offset, backupStyleRange);
						Color highlightColor = new Color(Display.getCurrent(), highlightBackgroundColor);
						styleRange = new StyleRange(offset, length, backupStyleRange.foreground, highlightColor);
					} else {
						// Recover the old style
						StyleRange recoverStyleRange = recoverStyleRangeMap.get(offset);
						if (recoverStyleRange != null) {
							styleRange = new StyleRange(offset, length, recoverStyleRange.foreground, recoverStyleRange.background, recoverStyleRange.fontStyle);
							recoverStyleRangeMap.remove(offset);
						}
					}
					
					if (styleRange != null) {
						xtextEditor.getInternalSourceViewer().getTextWidget().setStyleRange(styleRange);
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
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent#isHistoryObserver()
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
					&& xtextEditor.getLanguageName().equals(
							EsterelCECSimPlugin.ESTEREL_LANGUAGE)) {

				return xtextEditor;
			}
		}

		// In this case no adequate editor was found
		throw new KiemInitializationException(
				"No opened Esterel editor found for simulation visualization.",
				true, null);
	}

	// -----------------------------------------------------------------------------

	@Override
	public KiemProperty[] doProvideProperties() {
		final int nProperties = 1;
		KiemProperty[] properties = new KiemProperty[nProperties];
		properties[0] = new KiemProperty("Statement Name", "statement");

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

			public IParseResult exec(final XtextResource state)
					throws Exception {
				return state.getParseResult();
			}
		};
		result = esterelEditor.getDocument().readOnly(work);

		return ((Program) result.getRootASTElement());
	}

	// -----------------------------------------------------------------------------

}
