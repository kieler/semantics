/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.ksbase.gmf.handler;

import java.util.List;

import org.eclipse.gef.Request;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.ksbase.m2m.ITransformationFramework;

/**
 * Request for the execution of a model transformation.
 * 
 * @author mim
 */
public class ExecuteTransformationRequest extends Request {

    /** The request used to initiate a transformation. */
    public static final String REQ_EXEC_TRANS = "execute transformation";

    /** Variables used to initialize the command. **/
    private IEditorPart editPart;
    private String command;
    private String fileName;
    private List<Object> selection;
    private List<String> modelPackages;
    private ITransformationFramework framework;

    /**
     * Creates a transformation request.
     * 
     * @param ePart
     *            The active EditPart
     * @param cmd
     *            The transformation command
     * @param file
     *            Name of the transformation file
     * @param sel
     *            The active selection
     * @param themodelPackages
     *            The model packages for the active editor
     * @param fframework
     *            The ITransformationFramework to use for execution
     */
    public ExecuteTransformationRequest(final IEditorPart ePart,
            final String cmd, final String file, final List<Object> sel,
            final List<String> themodelPackages,
            final ITransformationFramework fframework) {
        super(REQ_EXEC_TRANS);
        this.editPart = ePart;
        this.command = cmd;
        this.fileName = file;
        this.modelPackages = themodelPackages;
        this.selection = sel;
        this.framework = fframework;
    }

    /**
     * Gets the model package.
     * 
     * @return modelPackage
     */
    public final List<String> getModelPackages() {
        return this.modelPackages;
    }

    /**
     * Sets the edit part.
     * 
     * @param epart
     *            The target edit part.
     */
    public final void setEditPart(final IEditorPart epart) {
        this.editPart = epart;
    }

    /**
     * Gets the edit part.
     * 
     * @return the editPart
     */
    public final IEditorPart getEditPart() {
        return this.editPart;
    }

    /**
     * Sets the transformation command.
     * 
     * @param cmd
     *            The transformation command.
     */
    public final void setCommand(final String cmd) {
        this.command = cmd;
    }

    /**
     * Gets the transformation command.
     * 
     * @return An method name
     */
    public final String getCommand() {
        return this.command;
    }

    /**
     * Sets the filename.
     * 
     * @param file
     *            Name of the file.
     */
    public final void setFileName(final String file) {
        this.fileName = file;
    }

    /**
     * Gets the filename.
     * 
     * @return A file name
     */
    public final String getFileName() {
        return this.fileName;
    }

    /**
     * Sets the current selection.
     * 
     * @param sel
     *            The active selection object
     */
    public final void setSelection(final List<Object> sel) {
        this.selection = sel;
    }

    /**
     * The current selection.
     * 
     * @return an ISelection object
     */
    public final List<Object> getSelection() {
        return this.selection;
    }

    /**
     * Gets the assigned transformation framework.
     * 
     * @return An implementation of ITransformationFramework
     */
    public ITransformationFramework getFramework() {
        return framework;
    }

    /**
     * Sets the transformation framework.
     * 
     * @param fframework
     *            An implementation of ITransformationFramework
     */
    public void setFramework(final ITransformationFramework fframework) {
        this.framework = fframework;
    }

}
