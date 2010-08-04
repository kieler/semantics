package de.tu_berlin.cs.tfs.muvitorkit.ui.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * Manager for persistence operations on an EMF model.
 * 
 * @author Tony Modica
 */
public class EMFModelManager {

	/**
	 * In EMF, a Resource provides the way to have access to the model content.
	 */
	private Resource resource = null;

	/**
	 * The top level models in the resource.
	 */
	private List<EObject> models = null;

	/**
	 * The ResourceSet
	 */
	private final ResourceSet resourceSet = new ResourceSetImpl();

	/**
	 * This constructor initializes the EMF model package and registers a file
	 * extension.
	 * 
	 * @param extension
	 *            The file extension
	 */
	public EMFModelManager(final String extension) {
		/*
		 * Register the XMI resource factory for the editor's file extension We
		 * use a subclass that creates a special XMIResource that makes use of
		 * UUID to support EMF Clipboard as described in GMF's
		 * "Tutorial: EMF Clipboard Copy and Paste"
		 */
		final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put(extension,
				new XMIResourceFactoryImpl() {
					@Override
					public Resource createResource(final URI uri) {
						return new XMIResourceImpl(uri) {
							@Override
							protected boolean useUUIDs() {
								return true;
							}
						};
					}
				});
	}

	/**
	 * Loads the model from the file. It this fails then the passed list of
	 * default models will be set in the resource for saving later with
	 * {@link #save(IPath)}. Return the loaded or the default models,
	 * respectively.
	 * 
	 * @param path
	 *            A {@link IPath} to a file containing a {@link Resource}.
	 * @param defaultModels
	 *            a list of default models to use when loading fails
	 * @return the loaded models or the default models
	 */
	public List<EObject> load(final IPath path,
			final List<EObject> defaultModels) {
		final Map<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(XMLResource.OPTION_DECLARE_XML, Boolean.TRUE);
		try {
			resource = resourceSet.getResource(URI.createPlatformResourceURI(
					path.toString(), true), true);
			resource.load(options);
			/*
			 * copy the contents because the resource will be emptied on
			 * "save as"
			 */
			models = new BasicEList<EObject>(resource.getContents());
			recursiveSetNamesIfUnset(models);
			return models;
		} catch (final Exception e) {
			// FIXME eigentlich sollte getResource schon eine Resource erzeugen
			// something failed, so try again without loading the model and use
			// the defaultModel instead
			if (resource == null) {
				// create a resource if getting one has failed before
				resource = resourceSet.createResource(URI
						.createPlatformResourceURI(path.toString(), true));
			}
			Assert
					.isNotNull(resource,
							"Unerwarteter Fehler in EMFModelmanager: Keine Resource erzeugbar.");
			resource.getContents().clear();
			resource.getContents().addAll(defaultModels);
			models = defaultModels;
			recursiveSetNamesIfUnset(models);
			return defaultModels;
		}
	}

	/**
	 * Saves the content of the model to the file.
	 */
	public void save(final IPath path) throws IOException {
		// This sets the model as contents in a new resource when using save as.
		try {
			resource = resourceSet.getResource(URI.createPlatformResourceURI(
					path.toString(), true), true);
		} catch (final Exception e) {
			// FIXME eigentlich sollte getResource schon eine Resource erzeugen
			resource = resourceSet.createResource(URI
					.createPlatformResourceURI(path.toString(), true));
			Assert.isTrue(false, "Unerwartete Codeausführung.");
		}
		recursiveSetNamesIfUnset(models);
		resource.getContents().clear();
		resource.getContents().addAll(models);
		final Map<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(XMLResource.OPTION_DECLARE_XML, Boolean.TRUE);
		resource.save(options);
	}

	/**
	 * FIXED: This ensures compatibility if models are changed from using
	 * {@link ENamedElement}s to using a custom NamedElement with default name
	 * "" or vice versa. All names of {@link ENamedElement} that are
	 * <code>null</code> are set to " " when saving the file.
	 * 
	 * FIXED: Additionally, we do not allow empty names "", because these
	 * models' URIs can not be used to resolve the models again. This only
	 * affects old models, MuvitorTreeEditor cares about this before saving as
	 * well.
	 */
	private static void recursiveSetNamesIfUnset(final List<EObject> models) {
		for (final EObject model : models) {
			if (model instanceof ENamedElement) {
				final ENamedElement namedElement = (ENamedElement) model;
				final String name = namedElement.getName();
				if (name == null || name.equals("")) {
					namedElement.setName(" ");
				}
				recursiveSetNamesIfUnset(model.eContents());
			}
		}
	}
}
