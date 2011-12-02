package de.cau.cs.kieler.esterel.cec.sim.kivi;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.json.JSONException;
import org.json.JSONObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.cau.cs.kieler.esterel.cec.sim.EsterelCECSimPlugin;
import de.cau.cs.kieler.kies.esterel.Program;
import de.cau.cs.kieler.kies.ui.EsterelSemanticHighlightingCalculator;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;

public class DataComponent extends JSONObjectSimulationDataComponent {

	/** The Esterel editor. */
	private XtextEditor esterelEditor;
	
	/** The Xtext document. */
	private IXtextDocument document;

	/** The Esterel program. */
	private Program esterelProgram;

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
		this.document = esterelEditor.getDocument();
	}


	// -----------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.IDataComponent#wrapup()
	 */
	public void wrapup() throws KiemInitializationException {
		// TODO Auto-generated method stub

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
			//FIXME: Why does replaceAll not work for "."?!
			while (uri.indexOf(".") > 0) {
				String test = uri.substring(0,uri.indexOf("."));
				String test2 = uri.substring(uri.indexOf(".")+1, uri.length()); 
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
		}

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

	// -----------------------------------------------------------------------------

//	private List<StructuralFeature> structuralFeatures(EObject eObject) {
//			    return org.eclipse.xtext.EcoreUtil2.typeSelect(eObject. .getFeatures(), StructuralFeature.class);
//			}	

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
		LinkedList<EObject> activeStatements = new LinkedList<EObject>();

		if (jSONObject.has(statementName)) {
			// Now extract the statements separated by a colon
			try {
				String activeStatementsString = jSONObject
						.getString(statementName);
				
				String[] activeStatementsArray = activeStatementsString.split(",");
				
				for (String activeStatementID : activeStatementsArray) {
					EObject activeStatement = this.getEObject(activeStatementID);
					if (activeStatement != null) {
						activeStatements.add(activeStatement);
					}
				}
				
			} catch (JSONException e) {
				throw new KiemExecutionException(
						"Cannot parse statement data variable of active Esterel statements for visualization.",
						false, false, true, e);
			}

		}


		// Highlight the active statements
		for (EObject statement : activeStatements) {
           XtextEditor editor;
		try {
			editor = this.getEsterelEditor();
            ISelectionProvider selectionProvider = editor.getSelectionProvider();
            
            EsterelSemanticHighlightingCalculator.highlightObjects = activeStatements;
            editor.resetHighlightRange();
            
		} catch (KiemInitializationException e) {
			throw new KiemExecutionException(
					"No active Esterel editor for statement visualization.",
					false, false, true, e);
		}
		}
		
		
		// This is just an observer component
		return null;
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
		// KiemPropertyTypeFile compilerFile = new KiemPropertyTypeFile();
		properties[0] = new KiemProperty("Statement Name", "statement");

		// properties[1] = new KiemProperty("C-Compiler", compilerFile, "gcc");
		// properties[2] = new KiemProperty("Full Debug Mode", true);

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
