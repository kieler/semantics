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

package de.cau.cs.kieler.simplerailctrl.sim.ptolemy.oaw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

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

/**
 * The class MomlWriter implements an EMFWorkflowComponent that is able to 
 * output valid MOML files. MOML files can be considered to be the XML 
 * representation of Ptolemy models and for example can be loaded by the
 * Vergil GUI of Ptolemy.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class MomlWriter extends AbstractEMFWorkflowComponent {

	/** The constant COMPONENT_NAME. */
	private static final String COMPONENT_NAME = "Moml Writer";

//	/** The OPTION_SCHEMA_LOCATION. */
//	private boolean OPTION_SCHEMA_LOCATION = true;

//	/**
//	 * Sets the OPTION_SCHEMA_LOCATION.
//	 * 
//	 * @param option_schema_location the new option_schema_location
//	 */
//	public void setOPTION_SCHEMA_LOCATION(final boolean option_schema_location) {
//		OPTION_SCHEMA_LOCATION = option_schema_location;
//	}

//	/** The OPTION_SCHEMA_LOCATION_IMPLEMENTATION. */
//	private boolean OPTION_SCHEMA_LOCATION_IMPLEMENTATION = true;

//	/** The encoding. */
//	private final String encoding = null;

	/** The multiple resources in case of list. */
	private boolean multipleResourcesInCaseOfList = false;

	/** The clone slot contents. */
	private boolean cloneSlotContents = false;

	//-------------------------------------------------------------------------

	/**
	 * Sets the multiple resources in case of list.
	 * 
	 * @param b the new multiple resources in case of list
	 */
	public void setMultipleResourcesInCaseOfList(final boolean b) {
		multipleResourcesInCaseOfList = b;
	}

	//-------------------------------------------------------------------------

	/**
	 * Sets the clone slot contents.
	 * 
	 * @param b the new clone slot contents
	 */
	public void setCloneSlotContents(final boolean b) {
		this.cloneSlotContents = b;
	}

	//-------------------------------------------------------------------------

//	/**
//	 * Sets the oPTIO n_ schem a_ locatio n_ implementation.
//	 * 
//	 * @param option_schema_location_implementation the new oPTIO n_ schem a_ locatio n_ implementation
//	 */
//	public void setOPTION_SCHEMA_LOCATION_IMPLEMENTATION(final boolean option_schema_location_implementation) {
//		OPTION_SCHEMA_LOCATION_IMPLEMENTATION = option_schema_location_implementation;
//	}

	//-------------------------------------------------------------------------

	@SuppressWarnings("unchecked")
	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#invokeInternal(org.eclipse.emf.mwe.core.WorkflowContext, org.eclipse.emf.mwe.core.monitor.ProgressMonitor, org.eclipse.emf.mwe.core.issues.Issues)
	 */
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

	//-------------------------------------------------------------------------

	/**
	 * Creates the resource name.
	 * 
	 * @param eo the EObject
	 * 
	 * @return the string
	 */
	private String createResourceName(final EObject eo) {
		return getUri() + (getUri().endsWith("/") ? "" : "/") + getName(eo) + ".ecore";
	}

	//-------------------------------------------------------------------------

	/**
	 * Gets the name.
	 * 
	 * @param model the EObject model
	 * 
	 * @return the name
	 */
	private String getName(final EObject model) {
		return (String) model.eGet(model.eClass().getEStructuralFeature("name"));
	}

	//-------------------------------------------------------------------------

	/**
	 * Write to XMLResource.
	 * 
	 * @param r the XMLResource
	 */
	private void write(final XMLResource r) {
		try {
	        // set options to save specific XML stuff required by MoML
	        HashMap<Object, Object> options = new HashMap<Object, Object>();
	        options.put(XMIResource.OPTION_SAVE_DOCTYPE, true);
	        r.setDoctypeInfo("-//UC Berkeley//DTD MoML 1//EN","http://ptolemy.eecs.berkeley.edu/xml/dtd/MoML_1.dtd");
			r.save(options);

			//clean resource afterwards
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		}
		catch (final IOException e) {
			throw new WorkflowInterruptedException("Problems writing moml file to " + getUri() + " : " + e.getMessage());
		}
	}

	//-------------------------------------------------------------------------

	/**
	 * Gets the log message.
	 * 
	 * @return the log message
	 * 
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#getLogMessage()
	 */
	@Override
	public String getLogMessage() {
		return "Writing model to " + uri;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Gets the component name.
	 * 
	 * @return the component name
	 * 
	 * @see org.eclipse.emf.mwe.core.WorkflowComponent#getComponentName()
	 */
	@Override
	public String getComponentName() {
		return COMPONENT_NAME;
	}
	
}
