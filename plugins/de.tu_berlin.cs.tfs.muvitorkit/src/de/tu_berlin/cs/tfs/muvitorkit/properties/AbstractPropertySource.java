package de.tu_berlin.cs.tfs.muvitorkit.properties;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

/**
 * @author Tony
 * 
 */
abstract public class AbstractPropertySource<T> implements IPropertySource {

	private final IPropertyDescriptor[] descriptors;

	final private T model;

	public AbstractPropertySource(final T model) {
		this.model = model;
		descriptors = createPropertyDescriptors();
	}

	protected T getModel() {
		return model;
	}

	abstract protected IPropertyDescriptor[] createPropertyDescriptors();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.IPropertySource#getEditableValue()
	 */
	public Object getEditableValue() {
		return model;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
	 */
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return descriptors;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#isPropertySet(java.lang
	 * .Object)
	 */
	public boolean isPropertySet(final Object id) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java
	 * .lang.Object)
	 */
	public void resetPropertyValue(final Object id) {
	}
}
