/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package de.cau.cs.kieler.simplerailctrl.sim.ptolemy.oaw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowInterruptedException;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.AbstractEMFWorkflowComponent;

import Moml.util.MomlResourceFactoryImpl;

public class MomlWriter extends AbstractEMFWorkflowComponent {

	private static final String COMPONENT_NAME = "Moml Writer";

	private boolean OPTION_SCHEMA_LOCATION = true;

	public void setOPTION_SCHEMA_LOCATION(final boolean option_schema_location) {
		OPTION_SCHEMA_LOCATION = option_schema_location;
	}

	private boolean OPTION_SCHEMA_LOCATION_IMPLEMENTATION = true;

	private final String encoding = null;

	private boolean multipleResourcesInCaseOfList = false;

	private boolean cloneSlotContents = false;

	public void setMultipleResourcesInCaseOfList(final boolean b) {
		multipleResourcesInCaseOfList = b;
	}

	public void setCloneSlotContents(final boolean b) {
		this.cloneSlotContents = b;
	}

	public void setOPTION_SCHEMA_LOCATION_IMPLEMENTATION(final boolean option_schema_location_implementation) {
		OPTION_SCHEMA_LOCATION_IMPLEMENTATION = option_schema_location_implementation;
	}

	@Override
	public void invokeInternal(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
		Object slotContent = ctx.get(getModelSlot());
		if (slotContent == null) {
			issues.addError(this, "slot '" + getModelSlot() + "' is empty.");
			return;
		}
		if (!((slotContent instanceof Collection<?>) || (slotContent instanceof EObject))) {
			issues.addError(this, "slot '" + getModelSlot() + "' neither contains an EList nor an EObject",
					slotContent, null, null);
			return;
		}

		if (slotContent instanceof EObject) {
			final EObject sc = (EObject) slotContent;
			if (cloneSlotContents) {
				if (sc.eResource() == null) {
					issues.addWarning(this, "model in slot '" + getModelSlot()
							+ "' is not yet associated with a resource; cloning it is most likely an error!");
				}
				else {
					final EcoreUtil.Copier copier = new EcoreUtil.Copier();
					final EObject copy = copier.copy(sc);
					copier.copyReferences();
					slotContent = copy;
				}
			}
			else {
				if (sc.eResource() != null) {
					issues.addWarning(this, "the element in slot '" + getModelSlot()
							+ "' is already contained in a resource and will be taken out of that resource!");
				}
			}
		}

		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new MomlResourceFactoryImpl());

		if (!multipleResourcesInCaseOfList) {
			//final Resource r = getResourceSet().createResource(URI.createURI(getUri()));
			final XMLResource r = (XMLResource)resourceSet.createResource(URI.createURI(getUri()));
			if (slotContent instanceof Collection<?>) {
				r.getContents().addAll((Collection) slotContent);
			}
			else {
				r.getContents().add((EObject) slotContent);
			}
			write(r);
		}
		else {
			if (slotContent instanceof Collection<?>) {
				final Collection coll = (Collection) slotContent;
				final Collection<Resource> resources = new ArrayList<Resource>();
				for (final Object object : coll) {
					final EObject eo = (EObject) object;
					//final Resource r = getResourceSet().createResource(URI.createURI(createResourceName(eo)));
					final XMLResource r = (XMLResource)resourceSet.createResource(URI.createURI(createResourceName(eo)));
					r.getContents().add(eo);
					resources.add(r);
				}
				for (final Resource r : resources) {
					//write(r);
					write((XMLResource)r);
				}
			}
			else {
				//final Resource r = getResourceSet().createResource(URI.createURI(getUri()));
				final XMLResource r = (XMLResource)resourceSet.createResource(URI.createURI(getUri()));
				r.getContents().add((EObject) slotContent);
				write(r);
			}
		}
	}

	private String createResourceName(final EObject eo) {
		return getUri() + (getUri().endsWith("/") ? "" : "/") + getName(eo) + ".ecore";
	}

	private String getName(final EObject model) {
		return (String) model.eGet(model.eClass().getEStructuralFeature("name"));
	}

	private void write(final XMLResource r) {
	//private void write(final Resource r) {
		try {
	        // set options to save specific XML stuff required by MoML
	        HashMap<Object, Object> options = new HashMap<Object, Object>();
	        options.put(XMIResource.OPTION_SAVE_DOCTYPE, true);
	        r.setDoctypeInfo("-//UC Berkeley//DTD MoML 1//EN","http://ptolemy.eecs.berkeley.edu/xml/dtd/MoML_1.dtd");

//			final Map<String, Object> options = new HashMap<String, Object>();
//			if (OPTION_SCHEMA_LOCATION) {
//				options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
//			}
//			if (OPTION_SCHEMA_LOCATION_IMPLEMENTATION) {
//				options.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
//			}
//			if (encoding != null) {
//				options.put(XMIResource.OPTION_ENCODING, encoding);
//			}
			r.save(options);

			//clean resource afterwards
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		}
		catch (final IOException e) {
			throw new WorkflowInterruptedException("Problems writing moml file to " + getUri() + " : " + e.getMessage());
		}
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#getLogMessage()
	 */
	@Override
	public String getLogMessage() {
		return "Writing model to " + uri;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.WorkflowComponent#getComponentName()
	 */
	@Override
	public String getComponentName() {
		return COMPONENT_NAME;
	}
}
