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

package de.cau.cs.kieler.sim.kiem.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The Class KiemIcons. It provides all basic plug-in icons except the ones that are used by the
 * {@link de.cau.cs.kieler.sim.kiem.properties.KiemPropertyType}s and are declared directly by those
 * types.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 proposed yellow
 * 
 */
public final class KiemIcons {

    // -------------------------------------------------------------------------
    // images

    /** The Constant Image/ImageDescriptor KIEM. */
    public static final Image KIEM = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/kiemIcon.png").createImage();

    /** The Constant Image/ImageDescriptor KIEM. */
    public static final Image KIEM_DISABLED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/kiemIconDisabled.png").createImage();
    
    /** The Constant Image/ImageDescriptor PRODUCER_ENABLED. */
    public static final Image PRODUCER_ENABLED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/producer.png").createImage();

    /** The Constant Image/ImageDescriptor PRODUCER_DISABLED. */
    public static final Image PRODUCER_DISABLED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/producerDisabled.png").createImage();

    /** The Constant Image/ImageDescriptor OBSERVER_ENABLED. */
    public static final Image OBSERVER_ENABLED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/observer.png").createImage();

    /** The Constant Image/ImageDescriptor OBSERVER_DISABLED. */
    public static final Image OBSERVER_DISABLED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/observerDisabled.png").createImage();

    /** The Constant Image/ImageDescriptor PRODUCEROBSERVER_ENABLED. */
    public static final Image PRODUCEROBSERVER_ENABLED = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem", "icons/producerObserver.png")
            .createImage();

    /** The Constant Image/ImageDescriptor PRODUCEROBSERVER_DISABLED. */
    public static final Image PRODUCEROBSERVER_DISABLED = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
                    "icons/producerObserverDisabled.png").createImage();

    /** The Constant Image/ImageDescriptor INITCOMPONENT_ENABLED. */
    public static final Image INITCOMPONENT_ENABLED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/initComponent.png").createImage();

    /** The Constant Image/ImageDescriptor INITCOMPONENT_DISABLED. */
    public static final Image INITCOMPONENT_DISABLED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/initComponentDisabled.png").createImage();

    /** The Constant Image/ImageDescriptor CHECKED. */
    public static final Image CHECKED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/checked.png").createImage();

    /** The Constant Image/ImageDescriptor CHECKED_DISABLED. */
    public static final Image CHECKED_DISABLED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/checkedDisabled.png").createImage();

    /** The Constant Image/ImageDescriptor UNCHECKED. */
    public static final Image UNCHECKED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/unchecked.png").createImage();

    /** The Constant Image/ImageDescriptor UNCHECKED_DISABLED. */
    public static final Image UNCHECKED_DISABLED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/uncheckedDisabled.png").createImage();

    /** The Constant Image/ImageDescriptor CHECKEDPLAIN. */
    public static final Image CHECKEDPLAIN = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/checkedplain.png").createImage();

    /** The Constant Image/ImageDescriptor CHECKEDPLAIN_DISABLED. */
    public static final Image CHECKEDPLAIN_DISABLED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/checkedplainDisabled.png").createImage();

    /** The Constant Image/ImageDescriptor CHECKEDPLAIN_MASTER. */
    public static final Image CHECKEDPLAIN_MASTER = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/checkedplainMaster.png").createImage();

    /** The Constant Image/ImageDescriptor FOLDED. */
    public static final Image FOLDED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/fold.png").createImage();

    /** The Constant Image/ImageDescriptor FOLDED_DISABLED. */
    public static final Image FOLDED_DISABLED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/foldDisabled.png").createImage();

    /** The Constant Image/ImageDescriptor UNFOLDED. */
    public static final Image UNFOLDED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/unfold.png").createImage();

    /** The Constant Image/ImageDescriptor UNFOLDED_DISABLED. */
    public static final Image UNFOLDED_DISABLED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/unfoldDisabled.png").createImage();

    // -------------------------------------------------------------------------
    // image descriptors

    /** The Constant Image/ImageDescriptor IMGDESCR_ADD. */
    public static final ImageDescriptor IMGDESCR_OPEN = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/openIcon.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_ADD. */
    public static final ImageDescriptor IMGDESCR_ADD = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/addIcon.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_DELETE. */
    public static final ImageDescriptor IMGDESCR_DELETE = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem", "icons/deleteIcon.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_UP. */
    public static final ImageDescriptor IMGDESCR_UP = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/upIcon.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_UP_DISABLED. */
    public static final ImageDescriptor IMGDESCR_UP_DISABLED = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem", "icons/upIconDisabled.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_DOWN. */
    public static final ImageDescriptor IMGDESCR_DOWN = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/downIcon.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_DOWN_DISABLED. */
    public static final ImageDescriptor IMGDESCR_DOWN_DISABLED = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem", "icons/downIconDisabled.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_STEP. */
    public static final ImageDescriptor IMGDESCR_STEP = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/stepIcon.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_STEP_DISABLED. */
    public static final ImageDescriptor IMGDESCR_STEP_DISABLED = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem", "icons/stepIconDisabled.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_STEPBACK. */
    public static final ImageDescriptor IMGDESCR_STEPBACK = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem", "icons/stepBackIcon.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_STEPBACK_DISABLED. */
    public static final ImageDescriptor IMGDESCR_STEPBACK_DISABLED = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
                    "icons/stepBackIconDisabled.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_MACROSTEP. */
    public static final ImageDescriptor IMGDESCR_MACROSTEP = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem", "icons/macroStepIcon.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_MACROSTEP_DISABLED. */
    public static final ImageDescriptor IMGDESCR_MACROSTEP_DISABLED = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
                    "icons/macroStepIconDisabled.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_RUN. */
    public static final ImageDescriptor IMGDESCR_RUN = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/runIcon.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_RUN_DISABLED. */
    public static final ImageDescriptor IMGDESCR_RUN_DISABLED = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem", "icons/runIconDisabled.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_PAUSE. */
    public static final ImageDescriptor IMGDESCR_PAUSE = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem", "icons/pauseIcon.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_PAUSE_DISABLED. */
    public static final ImageDescriptor IMGDESCR_PAUSE_DISABLED = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem", "icons/pauseIconDisabled.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_STOP. */
    public static final ImageDescriptor IMGDESCR_STOP = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/stopIcon.png");

    /** The Constant Image/ImageDescriptor IMGDESCR_STOP_DISABLED. */
    public static final ImageDescriptor IMGDESCR_STOP_DISABLED = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem", "icons/stopIconDisabled.png");
    
    //-------------------------------------------------------------------------
    
    /**
     * Instantiates a new KIEM icons.
     */
    private KiemIcons() {
    }
    
}
