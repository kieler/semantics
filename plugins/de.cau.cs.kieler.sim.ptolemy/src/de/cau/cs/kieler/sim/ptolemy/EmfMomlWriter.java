package de.cau.cs.kieler.sim.ptolemy;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;

import Moml.util.MomlResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mwe.emf.AbstractEmfWorkflowComponent;
import org.openarchitectureware.workflow.WorkflowInterruptedException;


public class EmfMomlWriter extends AbstractEmfWorkflowComponent {

	private static final Log LOG = LogFactory.getLog(EmfMomlWriter.class);
	
	private static final String COMPONENT_NAME = "EMF Writer";

	private boolean OPTION_SCHEMA_LOCATION = true;

	public void setOPTION_SCHEMA_LOCATION(boolean option_schema_location) {
		OPTION_SCHEMA_LOCATION = option_schema_location;
	}

	private boolean OPTION_SCHEMA_LOCATION_IMPLEMENTATION = true;

	private boolean multipleResourcesInCaseOfList = false;

	private boolean cloneSlotContents = false;

	public void setMultipleResourcesInCaseOfList(boolean b) {
		multipleResourcesInCaseOfList = b;
	}

	public void setCloneSlotContents(boolean b) {
		this.cloneSlotContents = b;
	}

	public void setOPTION_SCHEMA_LOCATION_IMPLEMENTATION(boolean option_schema_location_implementation) {
		OPTION_SCHEMA_LOCATION_IMPLEMENTATION = option_schema_location_implementation;
	}

	@SuppressWarnings("unchecked")
	public void invoke(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		Object slotContent = ctx.get(getModelSlot());
		if (slotContent == null) {
			issues.addError(this, "slot '" + getModelSlot() + "' is empty.");
			return;
		}
		if (!(slotContent instanceof Collection<?> || slotContent instanceof EObject)) {
			issues
					.addError(this, "slot '" + getModelSlot() + "' neither contains an EList nor an EObject",
							slotContent);
			return;
		}

		if (slotContent instanceof EObject) {
			EObject sc = (EObject) slotContent;
			if (cloneSlotContents) {
				if (sc.eResource() == null) {
					issues.addWarning(this, "model in slot '" + getModelSlot()
							+ "' is not yet associated with a resource; cloning it is most likely an error!");
				}
				else {
					EcoreUtil.Copier copier = new EcoreUtil.Copier();
					EObject copy = copier.copy(sc);
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

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new MomlResourceFactoryImpl());
        
		if (!multipleResourcesInCaseOfList) {
			//Resource r = getResourceSet().createResource(URI.createURI(getUri()));
			XMLResource r = (XMLResource)resourceSet.createResource(URI.createURI(getUri()));
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
				Collection coll = (Collection) slotContent;
				Collection<Resource> resources = new ArrayList<Resource>();
				for (Object object : coll) {
					EObject eo = (EObject) object;
					//Resource r = getResourceSet().createResource(URI.createURI(createResourceName(eo)));
					XMLResource r = (XMLResource)resourceSet.createResource(URI.createURI(createResourceName(eo)));
					r.getContents().add(eo);
					resources.add(r);
				}
				for (Resource r : resources) {
			        //r.setDoctypeInfo("-//UC Berkeley//DTD MoML 1//EN","http://ptolemy.eecs.berkeley.edu/xml/dtd/MoML_1.dtd");
					write((XMLResource)r);
				}
			}
			else {
				//Resource r = getResourceSet().createResource(URI.createURI(getUri()));
				XMLResource r = (XMLResource)resourceSet.createResource(URI.createURI(getUri()));
				r.getContents().add((EObject) slotContent);
				write(r);
			}
		}
	}

	private String createResourceName(EObject eo) {
		return getUri() + (getUri().endsWith("/") ? "" : "/") + getName(eo) + ".ecore";
	}

	private String getName(EObject model) {
		return (String) model.eGet(model.eClass().getEStructuralFeature("name"));
	}

	private void write(XMLResource r) {
		try {
	        // set options to save specific XML stuff required by MoML
	        HashMap<Object, Object> options = new HashMap<Object, Object>();
	        options.put(XMIResource.OPTION_SAVE_DOCTYPE, true);
	        r.setDoctypeInfo("-//UC Berkeley//DTD MoML 1//EN","http://ptolemy.eecs.berkeley.edu/xml/dtd/MoML_1.dtd");

//			Map<String, Object> options = new HashMap<String, Object>();
//			if (OPTION_SCHEMA_LOCATION) {
//				options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
//			}
//			if (OPTION_SCHEMA_LOCATION_IMPLEMENTATION) {
//				options.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
//			}
			r.save(options);
			
			//clean resource afterwards
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
			//r.delete(options);
			//r = null;
		}
		catch (final IOException e) {
			throw new WorkflowInterruptedException("Problems writing xmi file to " + getUri() + " : " + e.getMessage());
		}
	}

	@Override
	public String getLogMessage() {
		return "Writing model to " + uri;
	}

	public String getComponentName() {
		return COMPONENT_NAME;
	}
}
