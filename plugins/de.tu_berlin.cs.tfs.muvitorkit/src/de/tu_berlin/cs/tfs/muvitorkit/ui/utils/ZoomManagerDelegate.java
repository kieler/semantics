package de.tu_berlin.cs.tfs.muvitorkit.ui.utils;

import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.draw2d.ScalableFigure;
import org.eclipse.draw2d.ScalableFreeformLayeredPane;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.ZoomListener;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.ui.actions.ZoomComboContributionItem;

/**
 * This class implements a ZoomManager that delegates method calls to another
 * {@link ZoomManager} which can be replaced.
 * 
 * <p>
 * It is needed if multiple graphical viewers are used on a page that provides a
 * ZoomManager for a {@link ZoomComboContributionItem}: Eclipse is updating the
 * item's zoom manager only by its IPartService that is triggered by part
 * activation which can not be fired manually. <br>
 * To be able to handle updating the {@link ZoomManager} of the
 * {@link ZoomComboContributionItem} manually this delegating
 * {@link ZoomManager} is provided via {@link IAdaptable#getAdapter(Class)}. The
 * actual {@link ZoomManager} this delegate refers to is being replaced by the
 * page when the current viewer changes.
 * </p>
 * 
 * @author Tony Modica
 */
public class ZoomManagerDelegate extends ZoomManager implements ZoomListener {

	/**
	 * The current {@link ZoomManager} that method calls are delegated to.
	 */
	private ZoomManager currentZoomManager;

	/**
	 * The listeners that listen to this delegate.
	 */
	private final ListenerList listenerList = new ListenerList();

	/**
	 * Standard constructor that calls the super constructor with null arguments
	 * since method calls will be delegated to {@link #currentZoomManager}.
	 * {@link #currentZoomManager}.
	 */
	public ZoomManagerDelegate() {
		super((ScalableFigure) null, null);
	}

	/**
	 * @return the currentZoomManager
	 */
	public ZoomManager getCurrentZoomManager() {
		checkCurrentZoomManager();
		return currentZoomManager;
	}

	/**
	 * @param newZoomManager
	 *            the new zoom manager to set as current
	 */
	public void setCurrentZoomManager(final ZoomManager newZoomManager) {
		Assert.isNotNull(newZoomManager);
		if (null != currentZoomManager) {
			currentZoomManager.removeZoomListener(this);
		}
		currentZoomManager = newZoomManager;
		currentZoomManager.addZoomListener(this);
		// manual refresh
		zoomChanged(currentZoomManager.getZoom());
	}

	private void checkCurrentZoomManager() {
		Assert.isNotNull(currentZoomManager,
				"ZoomManagerDelegate had no current zoom manager!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomListener#zoomChanged(double)
	 */
	public void zoomChanged(final double zoom) {
		final Object[] listeners = listenerList.getListeners();
		for (int i = 0; i < listeners.length; ++i) {
			((ZoomListener) listeners[i]).zoomChanged(zoom);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editparts.ZoomManager#addZoomListener(org.eclipse.gef
	 * .editparts.ZoomListener)
	 */
	@Override
	public void addZoomListener(final ZoomListener listener) {
		listenerList.add(listener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#canZoomIn()
	 */
	@Override
	public boolean canZoomIn() {
		checkCurrentZoomManager();
		return currentZoomManager.canZoomIn();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#canZoomOut()
	 */
	@Override
	public boolean canZoomOut() {
		checkCurrentZoomManager();
		return currentZoomManager.canZoomOut();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#getMaxZoom()
	 */
	@Override
	public double getMaxZoom() {
		checkCurrentZoomManager();
		return currentZoomManager.getMaxZoom();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#getMinZoom()
	 */
	@Override
	public double getMinZoom() {
		checkCurrentZoomManager();
		return currentZoomManager.getMinZoom();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#getNextZoomLevel()
	 */
	@Override
	public double getNextZoomLevel() {
		checkCurrentZoomManager();
		return currentZoomManager.getNextZoomLevel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#getPane()
	 */

	@Override
	@Deprecated
	public ScalableFreeformLayeredPane getPane() {
		checkCurrentZoomManager();
		return currentZoomManager.getPane();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#getPreviousZoomLevel()
	 */
	@Override
	public double getPreviousZoomLevel() {
		checkCurrentZoomManager();
		return currentZoomManager.getPreviousZoomLevel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#getScalableFigure()
	 */
	@Override
	public ScalableFigure getScalableFigure() {
		checkCurrentZoomManager();
		return currentZoomManager.getScalableFigure();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#getUIMultiplier()
	 */
	@Override
	public double getUIMultiplier() {
		checkCurrentZoomManager();
		return currentZoomManager.getUIMultiplier();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#getViewport()
	 */
	@Override
	public Viewport getViewport() {
		checkCurrentZoomManager();
		return currentZoomManager.getViewport();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#getZoom()
	 */
	@Override
	public double getZoom() {
		checkCurrentZoomManager();
		return currentZoomManager.getZoom();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#getZoomAsText()
	 */
	@Override
	public String getZoomAsText() {
		checkCurrentZoomManager();
		return currentZoomManager.getZoomAsText();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#getZoomLevelContributions()
	 */
	@Override
	public List<?> getZoomLevelContributions() {
		checkCurrentZoomManager();
		return currentZoomManager.getZoomLevelContributions();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#getZoomLevels()
	 */
	@Override
	public double[] getZoomLevels() {
		checkCurrentZoomManager();
		return currentZoomManager.getZoomLevels();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#getZoomLevelsAsText()
	 */
	@Override
	public String[] getZoomLevelsAsText() {
		checkCurrentZoomManager();
		return currentZoomManager.getZoomLevelsAsText();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editparts.ZoomManager#removeZoomListener(org.eclipse.
	 * gef.editparts.ZoomListener)
	 */
	@Override
	public void removeZoomListener(final ZoomListener listener) {
		listenerList.remove(listener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#setUIMultiplier(double)
	 */
	@Override
	public void setUIMultiplier(final double multiplier) {
		checkCurrentZoomManager();
		currentZoomManager.setUIMultiplier(multiplier);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editparts.ZoomManager#setViewLocation(org.eclipse.draw2d
	 * .geometry.Point)
	 */
	@Override
	public void setViewLocation(final Point p) {
		checkCurrentZoomManager();
		currentZoomManager.setViewLocation(p);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#setZoom(double)
	 */
	@Override
	public void setZoom(final double zoom) {
		checkCurrentZoomManager();
		currentZoomManager.setZoom(zoom);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#setZoomAnimationStyle(int)
	 */
	@Override
	public void setZoomAnimationStyle(final int style) {
		checkCurrentZoomManager();
		currentZoomManager.setZoomAnimationStyle(style);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editparts.ZoomManager#setZoomAsText(java.lang.String)
	 */
	@Override
	public void setZoomAsText(final String zoomString) {
		checkCurrentZoomManager();
		currentZoomManager.setZoomAsText(zoomString);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editparts.ZoomManager#setZoomLevelContributions(java.
	 * util.List)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void setZoomLevelContributions(final List contributions) {
		checkCurrentZoomManager();
		currentZoomManager.setZoomLevelContributions(contributions);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#setZoomLevels(double[])
	 */
	@Override
	public void setZoomLevels(final double[] zoomLevels) {
		checkCurrentZoomManager();
		currentZoomManager.setZoomLevels(zoomLevels);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#zoomIn()
	 */
	@Override
	public void zoomIn() {
		checkCurrentZoomManager();
		currentZoomManager.zoomIn();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.ZoomManager#zoomOut()
	 */
	@Override
	public void zoomOut() {
		checkCurrentZoomManager();
		currentZoomManager.zoomOut();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editparts.ZoomManager#zoomTo(org.eclipse.draw2d.geometry
	 * .Rectangle)
	 */
	@Override
	public void zoomTo(final Rectangle rect) {
		checkCurrentZoomManager();
		currentZoomManager.zoomTo(rect);
	}
}
