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
 * 
 *****************************************************************************/

package de.cau.cs.kieler.synccharts.sbase;

import de.cau.cs.kieler.ksbase.ui.TransformationUIManager;
import de.cau.cs.kieler.ksbase.ui.listener.ITransformationEventListener;
import de.cau.cs.kieler.synccharts.labelparser.bridge.SyncchartsContentAdapter;

/**
 * Bridge between KSBasE and the Synccharts content adapter. This class is used to avoid conflicts
 * where a transformation has executed completely before the content adapter processes model
 * changes.
 * 
 * @author mim
 * 
 */
public final class ContentAdapterKSbasEBridge implements ITransformationEventListener {

    /** Singleton instance. **/
    public static final ContentAdapterKSbasEBridge INSTANCE = new ContentAdapterKSbasEBridge();

    private ContentAdapterKSbasEBridge() {
    }

    /**
     * Registers the transformation listener.
     */
    public void registerListener() {
        TransformationUIManager.INSTANCE.addTransformationListener(this);
    }

    /**
     * Set content provider to 'record' state for the transformation.
     * 
     * @param args
     *            unused parameters.
     */
    public void transformationAboutToExecute(final Object[] args) {
        SyncchartsContentAdapter.INSTANCE.setRecording(true);
    }

    /**
     * Reactivate content adapter.
     * 
     * @param args
     *            unused parameters
     */
    public void transformationExecuted(final Object[] args) {
        SyncchartsContentAdapter.INSTANCE.setRecording(false);
    }

}
