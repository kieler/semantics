package de.cau.cs.kieler.sim.esi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Iterator;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.*;
import org.eclipse.xtext.xtend.Activator;

import com.google.inject.Injector;

import de.cau.cs.kieler.EsiStandaloneSetup;
import de.cau.cs.kieler.esi.*;
import de.cau.cs.kieler.esi.impl.traceImpl;
import de.cau.cs.kieler.parser.antlr.EsiParser;
import de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataComponent extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {
	
	private String traceFile = "/home/ctr/runtime-EclipseApplication/test/abro.esi";
	private tracelist model = null;
	private Iterator<trace> iTrace;
	private Iterator<tick> iTick;
	/*private Iterator<EObject> traces = null;
	private Iterator<EObject> ticks = null;*/
	
	public JSONObject step(JSONObject JSONobject) {
		JSONObject returnObj = new JSONObject();
		try{
			if(!iTick.hasNext() && iTrace.hasNext()){
				iTick = iTrace.next().getTicks().iterator();
			}
			if(iTick.hasNext()){
				tick t = iTick.next();
				for(signal s: t.getInput()){
					returnObj.accumulate(s.getName(), "");
				}	
			}
			/*while(traces.hasNext()){
				System.out.println(traces.next());
			}*/
		/*	if (JSONobject.has("R")) {
				resetABO();
			}
			else {
				if (wA && JSONobject.has("A")) {
					transition_wA_dA();
				}
				if (wB && JSONobject.has("B")) {
					transition_wB_dB();
				}
				if (dA && dB) {
					transition_done();
					returnObj.accumulate("O","");
				}
			}
			if (done) {
				returnObj.accumulate("state","done");
			}
			if (dA && !dB) {
				returnObj.accumulate("state","dA, wB");
			}
			if (dB && !dA) {
				returnObj.accumulate("state","wA, dB");
			}
			if (wA && wB) {
				returnObj.accumulate("state","wA, wB");
			}*/
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return returnObj;
	}

	//--------------------------------------------------------------------------
	//additional methods
	
	public void initialize() {
		//EsiStandaloneSetup.doSetup();
		ISetup setup = new EsiStandaloneSetup();
		Injector injector = setup.createInjectorAndDoEMFRegistration();
		XtextResourceSet rs = injector.getInstance(XtextResourceSet.class); 
		rs.setClasspathURIContext(getClass()); 
		
		IResourceFactory resourceFactory =
			injector.getInstance(IResourceFactory.class); 
		//setup.doSetup();
		URI uri = URI.createURI(Activator.PLUGIN_ID);
		XtextResource resource =
			(XtextResource) resourceFactory.createResource(uri);
			rs.getResources().add(resource); 
		//EsiParser parser = inj.getInstance(EsiParser.class);
		//EsiParser parser = new EsiParser();
		InputStream in;
		//if(model==null){
		try {
			in = new FileInputStream(traceFile);
			resource.load(in, null);
			EcoreUtil.resolveAll(resource); 
			//parser.setElementFactory(EsiFactory.eINSTANCE);

			if(resource.getErrors().isEmpty()){
			  model = (tracelist)resource.getParseResult().getRootASTElement();
			  iTrace =  model.getTraces().iterator();
			  iTick = iTrace.next().getTicks().iterator();
			}else{
				model=null;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
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
	public boolean isDeltaConsumer() {
		return false;
	}
	
	@Override
	public boolean isPauseFlag() {
		return false;
	}
	
	@Override
	public void commandPause() {
	}

	@Override
	public String[] getLocalInterfaceVariables() {
		String[] signals = {"A"}; 
		return signals;
	}

}
