package de.cau.cs.kieler.s.sc;

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
        return "templates::Codegen";
    }

}
