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

package de.cau.cs.kieler.sim.kiem.views;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import de.cau.cs.kieler.sim.kiem.Messages;
import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.ui.KiemIcons;

/**
 * The Class KiemLabelProvider provides the labels for the table of DataComponentExs in the
 * KiemView.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class KiemLabelProvider implements ITableLabelProvider {

    /** The parent view. This is used to trigger a refresh. */
    private KiemView parent;

    /** The Constant COLUMN_0. */
    private static final int COLUMN_0 = 0;

    /** The Constant COLUMN_1. */
    private static final int COLUMN_1 = 1;

    /** The Constant COLUMN_2. */
    private static final int COLUMN_2 = 2;

    /** The Constant COLUMN_3. */
    private static final int COLUMN_3 = 3;

    /** The Constant COLUMN_4. */
    private static final int COLUMN_4 = 4;

    /** The Constant COLUMN_5. */
    private static final int COLUMN_5 = 5;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kiem label provider.
     * 
     * @param parentParam
     *            the parent view
     */
    public KiemLabelProvider(final KiemView parentParam) {
        super();
        this.parent = parentParam;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Image getColumnImage(final Object element, final int columnIndex) {
        // if property
        if (element instanceof KiemProperty) {
            if (columnIndex == COLUMN_0) {
                KiemProperty property = (KiemProperty) element;
                return property.getType().getIcon();
            } else {
                return null;
            }
        }

        // if component
        DataComponentEx dataComponentEx = (DataComponentEx) element;
        if (columnIndex == COLUMN_0) {
            if (dataComponentEx.isProducerObserver()) {
                // producer
                if (dataComponentEx.isEnabled()) {
                    // enabled
                    return KiemIcons.PRODUCEROBSERVER_ENABLED;
                } else {
                    // disabled
                    return KiemIcons.PRODUCEROBSERVER_DISABLED;
                }
            } else if (dataComponentEx.isProducer()) {
                // producer
                if (dataComponentEx.isEnabled()) {
                    // enabled
                    return KiemIcons.PRODUCER_ENABLED;
                } else {
                    // disabled
                    return KiemIcons.PRODUCER_DISABLED;
                }
            } else if (dataComponentEx.isObserver()) {
                // Observer
                if (dataComponentEx.isEnabled()) {
                    // enabled
                    return KiemIcons.OBSERVER_ENABLED;
                } else {
                    // disabled
                    return KiemIcons.OBSERVER_DISABLED;
                }
            } else {
                // Observer
                if (dataComponentEx.isEnabled()) {
                    // enabled
                    return KiemIcons.INITCOMPONENT_ENABLED;
                } else {
                    // disabled
                    return KiemIcons.INITCOMPONENT_DISABLED;
                }
            }
        } else if (columnIndex == COLUMN_2) {
            if (dataComponentEx.isEnabled()) {
                // enabled
                if (parent.kIEMInstance.execution == null) {
                    return KiemIcons.CHECKED;
                } else {
                    return KiemIcons.CHECKED_DISABLED;
                }
            } else {
                // disabled
                if (parent.kIEMInstance.execution == null) {
                    return KiemIcons.UNCHECKED;
                } else {
                    return KiemIcons.UNCHECKED_DISABLED;
                }
            }
        } else if (columnIndex == COLUMN_4) {
            if (dataComponentEx.isMaster()) {
                // enabled
                if (dataComponentEx.isEnabled()) {
                    return KiemIcons.CHECKEDPLAIN_MASTER;
                } else {
                    return KiemIcons.CHECKEDPLAIN_DISABLED;
                }
            } else {
                // disabled
                return null;
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String getColumnText(final Object element, final int columnIndex) {
        if (element instanceof KiemProperty) {
            KiemProperty kiemProperty;
            switch (columnIndex) {
            case COLUMN_0: // NAME_COLUMN or KEY_COLUMN
                kiemProperty = (KiemProperty) element;
                return kiemProperty.getKey();
            case COLUMN_1: // VALUE_COLUMN
                kiemProperty = (KiemProperty) element;
                return kiemProperty.getValue();
            case COLUMN_2: // ENABLED_COLUMN
                return "";
            case COLUMN_3: // TYPE_COLUMN
                return "";
            case COLUMN_4: // MASTER_COLUMN
                return "";
            default:
                throw new RuntimeException("columnIndex out of bounds (6)");
            }
        } else {
            DataComponentEx dataComponentEx = (DataComponentEx) element;
            switch (columnIndex) {
            case COLUMN_0: // NAME_COLUMN or KEY_COLUMN
                return dataComponentEx.getName();
            case COLUMN_1: // VALUE_COLUMN
                return "";
            case COLUMN_2: // ENABLED_COLUMN
                return "";
            case COLUMN_3: // TYPE_COLUMN
                String type = "";
                if (dataComponentEx.isProducerObserver()) {
                    type = Messages.mObserverProducerDataComponent;
                } else if (dataComponentEx.isProducer()) {
                    type = Messages.mProducerDataComponent;
                } else if (dataComponentEx.isObserver()) {
                    type = Messages.mObserverDataComponent;
                } else {
                    type = Messages.mInitializationDataComponent;
                }
                return type;
            case COLUMN_4: // MASTER_COLUMN
                return "";
            case COLUMN_5: // NEEDMODEL_COLUMN
                return "";
            default:
                throw new RuntimeException("columnIndex out of bounds (6)");
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
   public void addListener(final ILabelProviderListener listener) {
    }

    // -------------------------------------------------------------------------

   /**
    * {@inheritDoc}
    */
   public void dispose() {
    }

    // -------------------------------------------------------------------------

   /**
    * {@inheritDoc}
    */
   public boolean isLabelProperty(final Object element, final String property) {
        return false;
    }

    // -------------------------------------------------------------------------

   /**
    * {@inheritDoc}
    */
    public void removeListener(final ILabelProviderListener listener) {
    }

}
