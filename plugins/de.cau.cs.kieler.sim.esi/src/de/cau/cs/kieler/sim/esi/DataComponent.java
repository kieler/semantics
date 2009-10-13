package de.cau.cs.kieler.sim.esi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.InputStream;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.*;

import com.google.inject.Injector;

import de.cau.cs.kieler.EsiStandaloneSetup;
import de.cau.cs.kieler.esi.*;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;

public class DataComponent extends JSONStringDataComponent {

	//private KiemPropertyTypeFile traceFile;

	//private String traceFileString = "/home/ctr/runtime-EclipseApplication/test/abro.esi";
	private tracelist model = null;
	private Iterator<trace> iTrace;
	private Iterator<tick> iTick;

	public String step(String JSONobject) {
		StringBuffer res = new StringBuffer("{");
		if (!iTick.hasNext() && iTrace.hasNext()) {
			iTick = iTrace.next().getTicks().iterator();
		}
		if (iTick.hasNext()) {
			tick t = iTick.next();
			for (signal s : t.getInput()) {
				if (res.length() > 1){
					res.append(",");
				}
				if (!s.isValued())
					res.append("\"" + s.getName() + "\":{\""
							+ JSONSignalValues.presentKey + "\":true}");
				else
					res.append("\"" + s.getName() + "\":{\""
							+ JSONSignalValues.presentKey
							+ "\":true,\"value\":" + s.getVal() + "}");
				// returnObj.accumulate(s.getName(),
				// s.isValued()?s.getVal():"");
				// System.out.println(s.getName());
			}
		}
		res.append("}");
		System.out.println(res.toString());
		return res.toString();
	}

	// --------------------------------------------------------------------------
	// additional methods

	public void initialize() {
		ISetup setup = new EsiStandaloneSetup();
		Injector injector = setup.createInjectorAndDoEMFRegistration();
		XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
		rs.setClasspathURIContext(getClass());

		IResourceFactory resourceFactory = injector
				.getInstance(IResourceFactory.class);
		// setup.doSetup();
		URI uri = URI.createURI("TODO");// Activator.PLUGIN_ID);
		XtextResource resource = (XtextResource) resourceFactory
				.createResource(uri);
		rs.getResources().add(resource);
		// EsiParser parser = inj.getInstance(EsiParser.class);
		// EsiParser parser = new EsiParser();
		InputStream in;
		// if(model==null){
		try {
			 IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			    IEditorReference[] editors = page.getEditorReferences();
			 //in =   new StringInputStream(editors[(int)(getProperties()[0].getValue())].getEditorInput().toString());
			in = new FileInputStream(getProperties()[0].getValue());
			resource.load(in, null);
			EcoreUtil.resolveAll(resource);
			// parser.setElementFactory(EsiFactory.eINSTANCE);

			if (resource.getErrors().isEmpty()) {
				model = (tracelist) resource.getParseResult()
						.getRootASTElement();
				iTrace = model.getTraces().iterator();
				iTick = iTrace.next().getTicks().iterator();
			} else {
				model = null;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isConsumer() {
		return false;
	}

	public boolean isProducer() {
		return true;
	}

	@Override
	public boolean isMaster() {
		return false;
	}

	@Override
	public boolean isPauseFlag() {
		return false;
	}

	@Override
	public void commandPause() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
	 */
	public boolean isObserver() {
		return false;
	}

	@Override
	public KiemProperty[] provideProperties() {
		KiemProperty[] properties = new KiemProperty[2];
		properties[0] = new KiemProperty("Input File",
				new KiemPropertyTypeFile(),
				"/home/ctr/runtime-EclipseApplication/test/abro.esi");
		properties[0] = new KiemProperty("Input Editor",
				new KiemPropertyTypeEditor(),
				"/home/ctr/runtime-EclipseApplication/test/abro.esi");
		return properties;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
	 */
	public void wrapup() {
		// TODO Auto-generated method stub

	}

}
