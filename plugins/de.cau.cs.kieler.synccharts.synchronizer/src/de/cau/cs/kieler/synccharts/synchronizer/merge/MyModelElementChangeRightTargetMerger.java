/*******************************************************************************
 * Copyright (c) 2006, 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package de.cau.cs.kieler.synccharts.synchronizer.merge;

import java.util.Iterator;

import org.eclipse.emf.compare.EMFComparePlugin;
import org.eclipse.emf.compare.FactoryException;
import org.eclipse.emf.compare.diff.merge.DefaultMerger;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceOrderChange;
import org.eclipse.emf.compare.util.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Merger for an {@link ModelElementChangeRightTarget} operation.<br/>
 * <p>
 * Are considered for this merger :
 * <ul>
 * <li>RemoveModelElement</li>
 * <li>RemoteAddModelElement</li>
 * </ul>
 * </p>
 * 
 * @author <a href="mailto:laurent.goubet@obeo.fr">Laurent Goubet</a>
 * @kieler.ignore (excluded from review process)
 */
public class MyModelElementChangeRightTargetMerger extends DefaultMerger {

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.emf.compare.diff.merge.api.AbstractMerger#applyInOrigin()
     */
    @Override
    public void applyInOrigin() {
        final ModelElementChangeRightTarget theDiff = (ModelElementChangeRightTarget) this.diff;
        final EObject origin = theDiff.getLeftParent();
        final EObject element = theDiff.getRightElement();
        final EObject newOne = copy(element);
        final EReference ref = element.eContainmentFeature();
        if (ref != null) {
            try {
                EFactory.eAdd(origin, ref.getName(), newOne);
                setXMIID(newOne, getXMIID(element));
            } catch (final FactoryException e) {
                EMFComparePlugin.log(e, true);
            }
        } else if (origin == null && getDiffModel().getLeftRoots().size() > 0) {
            getDiffModel().getLeftRoots().get(0).eResource().getContents().add(newOne);
        } else if (origin != null) {
            origin.eResource().getContents().add(newOne);
        } else {
            // FIXME Throw exception : couldn't merge this
        }
        // we should now have a look for AddReferencesLinks needing this object
        final Iterator<EObject> siblings = getDiffModel().eAllContents();
        while (siblings.hasNext()) {
            final DiffElement op = (DiffElement) siblings.next();
            if (op instanceof ReferenceChangeRightTarget) {
                final ReferenceChangeRightTarget link = (ReferenceChangeRightTarget) op;
                // now if I'm in the target References I should put my copy in the origin
                if (link.getLeftTarget().equals(element)) {
                    link.setRightTarget(newOne);
                }
            } else if (op instanceof ReferenceOrderChange) {
                final ReferenceOrderChange link = (ReferenceOrderChange) op;
                if (link.getReference().equals(ref)) {
                    // FIXME respect ordering!
                    link.getLeftTarget().add(newOne);
                }
            }
        }
        super.applyInOrigin();
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.emf.compare.diff.merge.api.AbstractMerger#undoInTarget()
     */
    @Override
    public void undoInTarget() {
        final ModelElementChangeRightTarget theDiff = (ModelElementChangeRightTarget) this.diff;
        final EObject element = theDiff.getRightElement();
        // now removes all the dangling references
        try {
            final EObject parent = theDiff.getRightElement().eContainer();
            EcoreUtil.remove(element);
            // chsch: results in transaction rollback
            removeDanglingReferences(parent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.undoInTarget();
    }
}
