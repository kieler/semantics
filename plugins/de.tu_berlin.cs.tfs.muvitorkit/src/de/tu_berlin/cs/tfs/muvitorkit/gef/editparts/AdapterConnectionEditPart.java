package de.tu_berlin.cs.tfs.muvitorkit.gef.editparts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import de.tu_berlin.cs.tfs.muvitorkit.gef.directedit.MuvitorDirectEditManager;
import de.tu_berlin.cs.tfs.muvitorkit.gef.directedit.MuvitorDirectEditPolicy;
import de.tu_berlin.cs.tfs.muvitorkit.gef.directedit.IDirectEditPart.IGraphicalDirectEditPart;
import de.tu_berlin.cs.tfs.muvitorkit.properties.EObjectPropertySource;
import de.tu_berlin.cs.tfs.muvitorkit.ui.MuvitorTreeEditor;
import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.MuvitorNotifierService;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.ui.views.properties.IPropertySource;

/**
 * This edit part is a convenience implementation with the following frequently
 * used features for EObjects:
 *
 * <ul>
 * <li>On activation of this edit part, an EMF adapter is being installed on a
 * this edit parts' model, listening for model changes and passing the
 * notifications to {@link #notifyChanged(Notification)} and to the
 * {@link MuvitorNotifierService}. More adapters can freely be installed which
 * will be removed on deactivation.
 * <li>In {@link #createPropertySource()} an default
 * {@link EObjectPropertySource} showing all model features is created for this
 * edit part. {@link #getAdapter(Class)} provides the property source the the
 * properties view. Subclasses may override both.
 * <li>This edit part is prepared for GEF direct editing. Subclasses just need
 * to implement {@link IGraphicalDirectEditPart} to enable this feature.
 * <li> {@link #performDirectEdit()} and {@link #performOpen()} may be overridden
 * to handle direct edit or open requests differently. By default,
 * {@link #performOpen()} will try to open a view with the model,
 * {@link #performDirectEdit()} will try to directly edit the property of the
 * specified feature ID specified by implementing
 * {@link IGraphicalDirectEditPart}.
 * </ul>
 *
 * @author Tony Modica
 */
abstract public class AdapterConnectionEditPart<T extends EObject> extends
		AbstractConnectionEditPart {

	/**
	 * The {@link Adapter}s that have been associated to some {@link EObject}s.
	 *
	 * @see #registerAdapter(Adapter, EObject)
	 */
	final private Map<Adapter, EObject> adapters = new HashMap<Adapter, EObject>();

	/**
	 * By default, an Adapter will be installed on the model, passing the
	 * notifications to {@link #notifyChanged(Notification)} and to the
	 * {@link MuvitorNotifierService}.
	 *
	 * @param model
	 *            the model of this editpart
	 */
	public AdapterConnectionEditPart(final T model) {
		setModel(model);
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new MuvitorDirectEditPolicy());
		registerAdapter(new AdapterImpl() {
			@Override
			public final void notifyChanged(final Notification msg) {
				AdapterConnectionEditPart.this.notifyChanged(msg);
				MuvitorNotifierService.notifyListeners(msg);
			}
		});
	}

	/**
	 * Via this method subclasses can install {@link Adapter}s in
	 * {@link #activate()} listening to changes on a specific {@link EObject}.
	 * All registered adapters will be deregistered by default in
	 * {@link #deactivate()}.
	 *
	 * @param adapter
	 *            an {@link Adapter} to register on the model
	 * @param model
	 *            an {@link EObject} to observe with the passed adapter
	 */
	public final void registerAdapter(final Adapter adapter, final EObject model) {
		adapters.put(adapter, model);
		model.eAdapters().add(adapter);
	}

	/**
	 * Convenience method to register an {@link Adapter} on this editpart's
	 * model in {@link #activate()}.
	 *
	 * @param adapter
	 *            an {@link Adapter} to register on this editpart's model
	 * @see #registerAdapter(Adapter, EObject)
	 */
	public final void registerAdapter(final Adapter adapter) {
		registerAdapter(adapter, getCastedModel());
	}

	/**
	 * Convenience method to let {@link #notifyChanged(Notification)} receive
	 * notifications from additional EObjects. This method registers an
	 * {@link Adapter} on some EObject that just forwards its notifications.
	 *
	 * @param adapter
	 *            an {@link Adapter} to register on this editpart's model
	 * @see #registerAdapter(Adapter, EObject)
	 */
	public final void registerAdapter(final EObject model) {
		registerAdapter(new AdapterImpl() {
			@Override
			public final void notifyChanged(final Notification msg) {
				AdapterConnectionEditPart.this.notifyChanged(msg);
			}
		}, model);
	}

	/**
	 * Convenience method that casts the model to the appropriate type.
	 *
	 * @return The model of this EditPart appropriately casted.
	 */
	@SuppressWarnings("unchecked")
	public final T getCastedModel() {
		return (T) getModel();
	}

	/**
	 * Removes this edit part's adapters from the model. Subclasses may override
	 * but must call super implementation!
	 *
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#deactivate()
	 */
	@Override
	public void deactivate() {
		if (isActive()) {
			for (final Entry<Adapter, EObject> entry : adapters.entrySet()) {
				entry.getValue().eAdapters().remove(entry.getKey());
			}
			super.deactivate();
		}
	}

	/**
	 * Handles the standard GEF requests "direct edit" and "open" on this edit
	 * part.
	 *
	 * @see #performDirectEdit()
	 * @see #performOpen()
	 * @see org.eclipse.gef.editparts.AbstractEditPart#performRequest(org.eclipse.gef.Request)
	 */
	@Override
	public void performRequest(final Request request) {
		if (RequestConstants.REQ_DIRECT_EDIT == request.getType()) {
			performDirectEdit();
		} else if (RequestConstants.REQ_OPEN == request.getType()) {
			performOpen();
		}
	}

	/**
	 * Calls MuvitorTreeEditor.showView(getCastedModel) by default. Subclasses
	 * may override to perform some other action here.
	 */
	protected void performOpen() {
		MuvitorTreeEditor.showView(getCastedModel());
	}

	/**
	 * Creates and opens a {@link MuvitorDirectEditManager} by default, handling
	 * direct editing, if this edit part implements
	 * {@link IGraphicalDirectEditPart}. Subclasses may override to perform some
	 * other action here.
	 */
	protected void performDirectEdit() {
		if (this instanceof IGraphicalDirectEditPart) {
			new MuvitorDirectEditManager(this).show();
		}
	}

	/**
	 * By default, an Adapter will be registered with this editpart's model that
	 * passes notifications to this method, which subclasses are expected to
	 * override. This can be extended to receive notifications from other
	 * EObjects as well with {@link #registerAdapter(EObject)}.
	 */
	protected void notifyChanged(final Notification notification) {
	}

	/**
	 * Subclasses may override but must call super implementation!
	 *
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 */
	@Override
	public Object getAdapter(@SuppressWarnings("unchecked") final Class key) {
		if (IPropertySource.class == key) {
			return createPropertySource();
		}
		return super.getAdapter(key);
	}

	/**
	 * Creates a default {@link EObjectPropertySource} showing all model
	 * features for this edit part. Subclasses may override.
	 *
	 * @return the property source for this edit part
	 */
	protected IPropertySource createPropertySource() {
		return new EObjectPropertySource(getCastedModel());
	}
}
