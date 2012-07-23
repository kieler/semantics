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
package de.cau.cs.kieler.synccharts.custom;

import java.util.Iterator;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.core.WrappedException;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.text.actions.bridge.ActionLabelProcessorWrapper;

/**
 * Utility class comprising several SyncCharts specific convenience methods.
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public final class SyncchartsUtil {

    // CHECKSTYLEOFF LineLength|JavadocVariable
    public static final String MSG_KITS_INIT_FAILED = "SyncChart domain model could not be initialized.";
    public static final String MSG_LABEL_SERIAL_FAILED = "Transition labels could not be serialized properly.";
    // CHECKSTYLEON LineLength|JavadocVariable
    
    /**
     * Utility class should not have a public or default constructor.
     */
    private SyncchartsUtil() {
    }
    

    /**
     * Utility method assuring the proper initialization of textual SyncCharts model.
     * Needed as empty regions (esp. root regions) are not serialized in kits.
     * 
     * @author chsch
     * 
     * @param domain the {@link TransactionalEditingDomain} in charge
     * @param diagram the related {@link Diagram} notation element
     */
    public static void assureInitializedDomainModel(final TransactionalEditingDomain domain,
            final Diagram diagram) {
        EcoreUtil.resolve(diagram.getElement(), diagram.eResource().getResourceSet());
        if (((InternalEObject) diagram.getElement()).eIsProxy()) {
            Resource res = diagram
                    .eResource()
                    .getResourceSet()
                    .getResource(
                            ((InternalEObject) diagram.getElement()).eProxyURI().trimFragment(),
                            true);
            domain.getCommandStack().execute(
                    new AddCommand(domain, res.getContents(), SyncchartsFactory.eINSTANCE
                            .createRegion()));
            EcoreUtil.resolve(diagram.getElement(), diagram.eResource().getResourceSet());
            if (((InternalEObject) diagram.getElement()).eIsProxy()) {
                throw new IllegalStateException(MSG_KITS_INIT_FAILED);
            }
        }
    }
    

    /**
     * Deletes orphaned notation elements to avoid broken transition edges etc.
     * Serializes labels as they are not stored in textual kits files.
     * 
     * @author chsch
     * 
     * @param domain the {@link TransactionalEditingDomain} in charge
     * @param diagram the related {@link Diagram} notation element
     */
    public static void cleanUpNotationModel(final TransactionalEditingDomain domain,
            final Diagram diagram) {
        CompoundCommand cc = new CompoundCommand();
        Object o = null;
        for (Iterator<?> it = diagram.eAllContents(); it.hasNext();) {
            o = it.next();
            if (NotationPackage.eINSTANCE.getView().isInstance(o)
                    && ((View) o).getElement() != null
                    && ((InternalEObject) ((View) o).getElement()).eIsProxy()) {
                if (NotationPackage.eINSTANCE.getConnector().isInstance(o)) {
                    cc.append(new RemoveCommand(domain, ((Connector) o).getSource()
                            .getSourceEdges(), o));
                    cc.append(new RemoveCommand(domain, ((Connector) o).getTarget()
                            .getTargetEdges(), o));
                    cc.append(new RemoveCommand(domain, diagram.getPersistedEdges(), o));
                    
                } else {
                    cc.append(new RemoveCommand(domain, ((View) ((View) o).eContainer())
                            .getPersistedChildren(), o));
                }
            }
        }
        domain.getCommandStack().execute(cc);

        if (diagram.getElement() instanceof Region
                && !((InternalEObject) diagram.getElement()).eIsProxy()) {
            try {
                ActionLabelProcessorWrapper.processActionLabels(diagram.getElement(),
                        ActionLabelProcessorWrapper.SERIALIZE);
            } catch (Exception e) {
                // throw new WrappedException(e, MSG_LABEL_SERIAL_FAILED);
            	//FIXME: Log error 
            }
        }
    }
}
