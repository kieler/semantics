package de.cau.cs.kieler.sim.krep;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;

import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.krep.evalbench.comm.CommunicationProtocol;
import de.cau.cs.kieler.krep.evalbench.comm.ICommunicationProtocol;
import de.cau.cs.kieler.krep.evalbench.comm.JNIConnection;
import de.cau.cs.kieler.krep.evalbench.comm.KepProtocol;
import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.exceptions.LoadException;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KepAssembler;
import de.cau.cs.kieler.krep.evalbench.ui.views.AssemblerView;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeWorkspaceFile;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataComponent extends JSONObjectDataComponent {

	private JNIConnection connection = null;
	private CommunicationProtocol protocol = null;
	private IAssembler assembler = null;

	private AssemblerView viewer = null;

	
	@Override
	public JSONObject step(JSONObject data) throws KiemExecutionException {
		JSONObject res = new JSONObject();
		LinkedList<Signal> inputs = assembler.getInputs();
		LinkedList<Signal> outputs = assembler.getOutputs();
		int[] trace;
		for (Signal s : inputs) {
			s.setPresent(data.has(s.getName()));
		}
		try {
			protocol.tick(inputs.size() + outputs.size(), inputs, outputs);
			trace = protocol.getExecutionTrace();
			viewer.markTrace(trace);
		} catch (CommunicationException e) {
			throw new KiemExecutionException(
					"Communication error performing tick", true, e);
		}
		try {
			for (Signal s : outputs) {
				res.accumulate(s.getName(), JSONSignalValues.newValue(s
						.getPresent()));
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public void initialize() throws KiemInitializationException {
		connection = new JNIConnection();

		try {
			if(getProperties()[1].getValue().equals("KLP")){
				connection.initialize(ICommunicationProtocol.P_KREP);
			}else{
				connection.initialize(ICommunicationProtocol.P_KEP);
			}
			protocol = new KepProtocol(connection);
			assembler = new KepAssembler();
			FileReader in = new FileReader(getProperties()[1].getValue());
			if (in != null) {
				assembler.assemble("huhu", in);
			}
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
			for (IViewReference view : page.getViewReferences()) {
				if (view.getId().equals(AssemblerView.VIEW_ID)) {
					this.viewer = (AssemblerView) (view.getView(true));
				}
			}
		} catch (FileNotFoundException e) {
			assembler = null;
			throw new KiemInitializationException("Cannot find assembler file",
					true, e);
		} catch (ParseException e) {
			assembler = null;
			throw new KiemInitializationException(
					"Cannot parse assembler file", true, e);
		} catch (CommunicationException e) {
			assembler = null;
			throw new KiemInitializationException("Connection failed", true, e);
		}
		if (assembler != null) {
			try {
				protocol.loadProgram(assembler, null);
				if (viewer != null) {
					viewer.setAssembler(assembler);
				}
			} catch (CommunicationException e) {
				throw new KiemInitializationException("Communication Error",
						true, e);
			} catch (LoadException e) {
				throw new KiemInitializationException("Cannot load program",
						true, e);

			}
		}
	}

	@Override
	public boolean isObserver() {
		return true;
	}

	@Override
	public boolean isProducer() {
		return true;
	}

	@Override
	public void wrapup() throws KiemInitializationException {
		connection.dispose();
		connection=null;
		assembler=null;
		protocol=null;
		viewer=null;
	}

	@Override
	public KiemProperty[] provideProperties() {
		KiemProperty[] properties = new KiemProperty[3];
		String[] items = { "KEP", "KLP" };
		properties[0] = new KiemProperty("Processor",
				new KiemPropertyTypeChoice(items), items[0]);
		properties[1] = new KiemProperty("Assembler File",
				new KiemPropertyTypeWorkspaceFile(), "abro.kasm");
		properties[2] = new KiemProperty("Assembler Editor",
				new KiemPropertyTypeEditor(), "");
		return properties;
	}

	@Override
	public String[] provideInterfaceKeys() {
		LinkedList<String> signals = new LinkedList<String>();
		if (assembler != null) {
			for (Signal s : assembler.getInputs()) {
				signals.add(s.getName());
			}
			for (Signal s : assembler.getOutputs()) {
				signals.add(s.getName());
			}
		}
		return signals.toArray(new String[signals.size()]);
	}

}
