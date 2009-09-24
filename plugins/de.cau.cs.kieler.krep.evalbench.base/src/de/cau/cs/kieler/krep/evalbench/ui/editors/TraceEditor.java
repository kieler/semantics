package de.cau.cs.kieler.krep.evalbench.ui.editors;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.*;
import org.eclipse.ui.part.EditorPart;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.trace.TraceList;
import de.cau.cs.kieler.krep.evalbench.ui.views.TraceContentProvider;
import de.cau.cs.kieler.krep.evalbench.ui.views.TraceLabelProvider;

/**
 * The basic editor for displaying trace files. 
 * Subclasses of this abstract class must create a suitable
 * implementation of the <code>ITrace</code> interface.
 * 
 * @author ctr
 */

abstract public class TraceEditor extends EditorPart {

	/** Column identifiers for the embedded table */
	private final static String[] COLUMN_NAMES = { "tick", "values"};

	/** The embedded table */
	private Table table;
	/** The viewer used to display program instructions */
	private TableViewer viewer;

	abstract TraceList openTrace(String source);

	/**
	 * Reads an input file and executes an assembler to generate binary code
	 * and signals information.
	 * 
	 * @param inputFile
	 *            assembler file to be read
	 * @throws IOException
	 *             when the input file could not be read
	 * @throws ParseException
	 *             when the assembler fails to parse the input
	 */
	private void updateProgram(File inputFile) throws IOException,
			ParseException {
		// read input file
		StringBuffer stringBuffer = new StringBuffer();
		FileReader reader = new FileReader(inputFile);
		int c;
		while ((c = reader.read()) >= 0) {
			stringBuffer.append((char) c);
		}
		
		String source = stringBuffer.toString();
		Activator.setTraces(openTrace(source));
	//	Trace.notifyListeners();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite,
	 *      org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		try {
			setSite(site);
			setInputWithNotify(input);
			// get input file and execute the assembler
			File file;
			if (input instanceof IPathEditorInput) {
				file = ((IPathEditorInput) input).getPath().toFile();
				// TODO add support for default editor inputs
				/*
				 * } else if (input instanceof IURIEditorInput) { file = new
				 * File(((IURIEditorInput)input).getURI().getPath());
				 */
			} else {
				file = new File(input.getName());
			}
			updateProgram(file);
			setPartName(file.getName());
		} catch (IOException e) {
			throw new PartInitException(new Status(Status.ERROR,
					Activator.PLUGIN_ID, "Could not read from input file.", e));
		} catch (ParseException e) {
			throw new PartInitException(new Status(Status.ERROR,
					Activator.PLUGIN_ID,
					"The assembler could not parse the input file.", e));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		// create table
		table = new Table(parent, SWT.MULTI);
		TableColumn column0 = new TableColumn(table, SWT.LEFT, 0);
		column0.setWidth(200);
		TableColumn column1 = new TableColumn(table, SWT.NONE, 1);
		column1.setWidth(200);
		table.setLinesVisible(false);
		table.setHeaderVisible(false);
		// create table viewer
		viewer = new TableViewer(table);
		viewer.setColumnProperties(COLUMN_NAMES);
		viewer.setContentProvider(new TraceContentProvider());
		viewer.setLabelProvider(new TraceLabelProvider());
		 // set viewer input
		viewer.setInput(Activator.getTraces().getTable().toArray(new String[0][0]));
	}

	/**
	 * Selects the rows with the given numbers in the embedded table.
	 * 
	 * @param rows
	 *            rows to select
	 */
	public void setSelectedRows() {
		//int rows[] =   {trace.getPos() };
		//table.setSelection(rows);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
	    // Nothing to do
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
	    // Nothing to do
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#isDirty()
	 */
	@Override
	public boolean isDirty() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
	    // Nothing to do
	}
}
