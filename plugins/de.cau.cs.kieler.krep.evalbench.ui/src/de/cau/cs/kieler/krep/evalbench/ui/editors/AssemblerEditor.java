/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.krep.evalbench.ui.editors;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.program.Config;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;

/**
 * The basic editor for displaying assembler instructions in the evaluation bench. Subclasses of
 * this abstract class must create a suitable implementation of the <code>IAssembler</code>
 * interface.
 * 
 * @author msp, ctr
 */
public abstract class AssemblerEditor extends EditorPart {

    /** Column identifiers for the embedded table. */
    private static final String[] COLUMN_NAMES = { "index", "label", "instruction", "opcode" };

    private static final int[] COLUMN_WIDTH = { 40, 90, 300, 50 };

    private static final int[] COLUMN_ALIGN = { SWT.RIGHT, SWT.NONE, SWT.NONE, SWT.NONE };

    /** The embedded table. */
    private Table table = null;;
    /** The viewer used to display program instructions. */
    private TableViewer viewer;

    /**
     * Assembler used to parse the input file. Subclasses must fill this field with their
     * implementation.
     */
    private IAssembler assembler;

    /**
     * setter for the assembler. This should only be used once by each subclass.
     * 
     * @param asm
     *            the assembler used by this editor
     */
    protected void setAssembler(final IAssembler asm) {
        this.assembler = asm;
    }

    /**
     * Gets the protocol type suited for the current editor implementation. Subclasses must extend
     * this and return one of the constants defined in <code>ICommunicationProtocol</code>.
     * 
     * @return communication protocol identifier
     */
    public abstract String getProtocolType();

    /**
     * Reads an input file and executes an assembler to generate binary code and signals
     * information.
     * 
     * @param inputFile
     *            assembler file to be read
     * @throws IOException
     *             when the input file could not be read
     * @throws ParseException
     *             when the assembler fails to parse the input
     */
    private void updateProgram(final File inputFile) throws IOException, ParseException {
        // read input file
        StringBuffer stringBuffer = new StringBuffer();
        FileReader reader = new FileReader(inputFile);
        try {
            int c;

            while ((c = reader.read()) >= 0) {
                stringBuffer.append((char) c);
            }
            String source = stringBuffer.toString();
            // execute assembler
            assembler.assemble(inputFile.getName(), source);

        } finally {
            reader.close();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite,
     * org.eclipse.ui.IEditorInput)
     */
    @Override
    public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
        try {
            setSite(site);
            setInputWithNotify(input);
            // get input file and execute the assembler
            File file;
            if (input instanceof IPathEditorInput) {
                file = ((IPathEditorInput) input).getPath().toFile();

            } else {
                file = new File(input.getName());
            }
            updateProgram(file);
            setPartName(file.getName());
        } catch (IOException e) {
            throw new PartInitException(new Status(Status.ERROR, Activator.PLUGIN_ID,
                    "Could not read from input file.", e));
        } catch (ParseException e) {
            throw new PartInitException(new Status(Status.ERROR, Activator.PLUGIN_ID,
                    "The assembler could not parse the input file.", e));
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets .Composite)
     */
    @Override
    public void createPartControl(final Composite parent) {
        // create table
        table = new Table(parent, SWT.MULTI);
        for (int i = 0; i < COLUMN_WIDTH.length; i++) {
            TableColumn column0 = new TableColumn(table, COLUMN_ALIGN[i], i);
            column0.setWidth(COLUMN_WIDTH[i]);
        }
        table.setLinesVisible(true);
        table.setHeaderVisible(true);

        // create table viewer
        viewer = new TableViewer(table);
        viewer.setColumnProperties(COLUMN_NAMES);
        viewer.setContentProvider(new ProgramContentProvider());
        viewer.setLabelProvider(new ProgramLabelProvider());
        // set viewer input
        viewer.setInput(assembler.getInstructions());
    }

    /**
     * Selects the rows with the given numbers in the embedded table.
     * 
     * @param adrs
     *            instruction addresses to select
     */
    public final void setSelectedRows(final int[] adrs) {
        int[] rows = new int[adrs.length];
        for (int i = 0; i < adrs.length; i++) {
            rows[i] = assembler.adr2row(adrs[i]);
        }
        table.setSelection(rows);
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime. IProgressMonitor)
     */
    @Override
    public void doSave(final IProgressMonitor monitor) {
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

    /**
     * Gets the program binary.
     * 
     * @return the program
     */
    public IAssembler getAssembler() {
        return assembler;
    }

    /**
     * Gets the input signals.
     * 
     * @return the inputs
     */
    public LinkedList<Signal> getInputs() {
        return assembler.getInputs();
    }

    /**
     * Gets the output signals.
     * 
     * @return the outputs
     */
    public LinkedList<Signal> getOutputs() {
        return assembler.getOutputs();
    }

    /**
     * Check whether the current program can be executed on this the given configuration. Should be
     * accessed from the currently connected target.
     * 
     * @param krp
     *            configuration of the current processor
     * @return true if all constraints (e.g., number of signals) are fulfilled
     */
    public boolean canExecute(final Config krp) {
        return assembler.canExecute(krp) == null;
    }
}
