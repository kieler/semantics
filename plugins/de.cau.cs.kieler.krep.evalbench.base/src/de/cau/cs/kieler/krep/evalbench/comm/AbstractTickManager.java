package de.cau.cs.kieler.krep.evalbench.comm;

import java.util.LinkedList;

import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.trace.Tick;
import de.cau.cs.kieler.krep.evalbench.ui.editors.AssemblerEditor;


/**
 * Abstract superclass for extensions of the tick manager
 * extension point.
 * 
 * @author msp
 */
public abstract class AbstractTickManager implements ISignalListener {

	/** Identifier for the signal listener extension point */
	public final static String EXTENSION_ID = "de.cau.cs.kieler.krep.evalbench.tickManager";
	
	/*
	 * (non-Javadoc)
	 * @see krep.evalbench.comm.ISignalListener#tickPerformed(java.util.LinkedList, java.util.LinkedList)
	 */
	public abstract void tickPerformed(LinkedList<Signal> inputs, LinkedList<Signal> outputs);
	
	/**
	 * Retrieves the currently active assembler editor from the
	 * common layer.
	 * 
	 * @return the active assembler editor, or null if there is no active
	 *         assembler editor
	 */
	protected AssemblerEditor getActiveAssemblerEditor() {
		return Activator.commonLayer.getActiveAssemblerEditor();
	}
	
	/**
	 * Triggers a program tick in the common layer. The given
	 * editor part is brought to top, so the common layer can
	 * synchronize with it.
	 * <p>
	 * Note that this method may throw a <code>NullPointerException</code>
	 * if the given editor part is no longer available.
	 * 
	 * @param editorPart assembler editor to use
	 */
	protected void triggerTick(IEditorPart editorPart) {
		editorPart.getSite().getPage().bringToTop(editorPart);
		Activator.commonLayer.step(new Tick());
	}
	
	/**
	 * Triggers a program reset in the common layer.
	 */
	protected void triggetReset() {
		try {
		    Activator.commonLayer.reset();
		} catch (CommunicationException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	}
	
	/**
	 * Updates the signal views of the evaluation bench.
	 */
	protected void updateSignalViews() {
		Activator.commonLayer.updateSignalViews();
	}
	
}
