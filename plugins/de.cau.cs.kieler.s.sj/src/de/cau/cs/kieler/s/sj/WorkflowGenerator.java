package de.cau.cs.kieler.s.sj;

import org.eclipse.core.internal.resources.File;

import de.cau.cs.kieler.s.codegen.AbstractWorkflowGenerator;

public class WorkflowGenerator extends AbstractWorkflowGenerator {

    /**
     * The constructor sets the location in the KIELER workspace to save the sc
     * files if you just generate sc code without simulation. It also sets the
     * variables for the EMF reader.
     */
    public WorkflowGenerator() {
        super();
    }

    /**
     * The constructor to use a given diagram (as *.kixs file) for generating
     * code.
     * 
     * @param fileLocation
     *            the location of the given diagram file
     */
    public WorkflowGenerator(final String fileLocation) {
        super(fileLocation);
    }

    /**
     * Creates a new WorkflowGenerator.java.
     * 
     * @param selectedFiles
     */
    public WorkflowGenerator(final File selectedFile) {
        super(selectedFile);
    }

    /**
     * Creates a new WorkflowGenerator.java.
     * 
     * @param selectedFiles
     * @param fileLocation
     *            the location of the given diagram file
     */
    public WorkflowGenerator(final File selectedFile, final String fileLocation) {
        super(selectedFile, fileLocation);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getNameOfMainMethod() {
        return "main";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPathToMainTemplate() {
        return "de::cau::cs::kieler::s::sj::templates::Codegen";
    }

}
