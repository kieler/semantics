/*******************************************************************************
 * Copyright (c) 2008 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.diagram.statemachine.custom.listeners;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramDropTargetListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.TransferData;

/**
 * This class is used to handle drop event on diagram
 * 
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public abstract class DropTargetListener extends DiagramDropTargetListener {

	public DropTargetListener(EditPartViewer viewer, Transfer xfer) {
		super(viewer, xfer);
	}

	protected abstract Object getJavaObject(TransferData data);

	@Override
	protected List<EObject> getObjectsBeingDropped() {
		// get objects from transfer
		TransferData data = getCurrentEvent().currentDataType;
		HashSet<URI> uris = new HashSet<URI>();

		Object transferedObject = getJavaObject(data);
		if(transferedObject instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection)transferedObject;
			for(Iterator<?> it = selection.iterator(); it.hasNext();) {
				Object nextSelectedObject = it.next();
				// if (nextSelectedObject instanceof UMLNavigatorItem) {
				// View view = ((UMLNavigatorItem)
				// nextSelectedObject).getView();
				// nextSelectedObject = view.getElement();
				// } else
				if(nextSelectedObject instanceof IAdaptable) {
					IAdaptable adaptable = (IAdaptable)nextSelectedObject;
					nextSelectedObject = adaptable.getAdapter(EObject.class);
				}
				if(nextSelectedObject instanceof EObject) {
					EObject modelElement = (EObject)nextSelectedObject;
					Resource modelElementResource = modelElement.eResource();
					uris.add(modelElementResource.getURI().appendFragment(modelElementResource.getURIFragment(modelElement)));
					// TODO check visualID supported by class diagram
				}
			}
		}

		ArrayList<EObject> result = new ArrayList<EObject>();
		for(URI uri : uris) {
			EObject modelObject = getTransactionalEditingDomain().getResourceSet().getEObject(uri, true);
			result.add(modelObject);
		}
		return result;
	}

	protected abstract TransactionalEditingDomain getTransactionalEditingDomain();

}
