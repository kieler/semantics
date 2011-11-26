package de.cau.cs.kieler.esterel.cec.sim.kivi;

import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.json.JSONObject;

import de.cau.cs.kieler.esterel.cec.sim.EsterelCECSimPlugin;
import de.cau.cs.kieler.kies.esterel.Program;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;

public class DataComponent extends JSONObjectSimulationDataComponent {

	/** The Esterel editor. */
	private XtextEditor esterelEditor;

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

	}

	// -----------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.IDataComponent#wrapup()
	 */
	@Override
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
		// TODO Auto-generated method stub
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
//		KiemPropertyTypeFile compilerFile = new KiemPropertyTypeFile();
		properties[0] = new KiemProperty("Statement Name", "statement");

//		properties[1] = new KiemProperty("C-Compiler", compilerFile, "gcc");
//		properties[2] = new KiemProperty("Full Debug Mode", true);

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
