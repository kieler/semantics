/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.transformation.kivi;

import java.util.HashMap;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.esterel.transformation.core.TransformationCommand;

/**
 * @author uru
 * 
 */
public class TransformationEffect extends AbstractEffect {

    private XtendFacade xtendFacade;
    private Object[] parameters;
    private String transformationName;
    private TransactionalEditingDomain editingDomain;

    /**
     * Default constructor.
     * 
     * @param extentionFile
     *            file containing the extentions.
     * @param theTransformationName
     *            name of the transformation to run.
     * @param theParameters
     *            parameters to pass.
     * @param basePackages
     *            emf packages needed within the transformation.
     * @param theEditingDomain
     *            editing domain in which the transformation should be performed.
     */
    public TransformationEffect(final String extentionFile, final String theTransformationName,
            final Object[] theParameters, final String[] basePackages,
            final TransactionalEditingDomain theEditingDomain) {
        super();
        this.parameters = theParameters;
        this.transformationName = theTransformationName;
        this.editingDomain = theEditingDomain;

        String extentionWithout = extentionFile;
        // cut off file extention
        if (extentionWithout.contains("." + XtendFile.FILE_EXTENSION)) {
            extentionWithout = extentionWithout.substring(0,
                    extentionWithout.indexOf("." + XtendFile.FILE_EXTENSION));
        }

        HashMap<String, Variable> map = new HashMap<String, Variable>();
        map.put("recursive", new Variable("boolean", true));
        ExecutionContextImpl exec = new ExecutionContextImpl(map);

        xtendFacade = XtendFacade.create(exec, extentionWithout);
        registerEPackages(basePackages);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void undo() {
        System.out.println("TransformEffect undo");
        super.undo();
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {

        // FIXME workaround to avoid deadlock with FireOnceTriggerListener
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

            public void run() {
                TransformationCommand command = new TransformationCommand(xtendFacade, parameters,
                        transformationName, editingDomain);
                CommandStack stack = editingDomain.getCommandStack();
                stack.execute(command);

            }
        });

    }

    private void registerEPackages(final String[] basePackages) {
        // Register all meta models
        for (String basePackage : basePackages) {
            try {
                EPackage pack = EcoreUtil2.getEPackageByClassName(basePackage);

                // create EMFMetaModel with the given EPackage
                EmfMetaModel metaModel = new EmfMetaModel(pack);
                xtendFacade.registerMetaModel(metaModel);
            } catch (ConfigurationException ce) {
                // package class could not be found
                // this is bad and should not happen.
                System.err.println("ERRORRRRRR");
                return;
            }
        }
    }

}
