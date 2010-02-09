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
package de.cau.cs.kieler.sim.kiem.config.extension;

import de.cau.cs.kieler.sim.kiem.IKiemConfigurationProvider;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.KiemPropertyKeyWrapper;
import de.cau.cs.kieler.sim.kiem.config.managers.ConfigurationManager;
import de.cau.cs.kieler.sim.kiem.config.managers.Tools;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;

/**
 * Provides a link to the configuration manager.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class ConfigurationProvider implements IKiemConfigurationProvider {

    /**
     * {@inheritDoc}
     */
    public String changeProperty(final String propertyId)
            throws KiemPropertyException {
        KiemPropertyKeyWrapper wrapper = null;
        if (propertyId == null) {

            throw new KiemPropertyException(Tools.PROPERTY_KEY_CANT_BE_NULL);
        }
        wrapper = new KiemPropertyKeyWrapper(propertyId);
        return ConfigurationManager.getInstance().findPropertyValue(wrapper,
                null);
    }

    /**
     * {@inheritDoc}
     */
    public void propertyChanged(final String propertyId, final String value) {
        if (propertyId == null) {
            // can't have null keys, do nothing
            return;
        }
        KiemPropertyKeyWrapper wrapper = new KiemPropertyKeyWrapper(propertyId);
        ConfigurationManager.getInstance()
                .updateCurrentProperty(wrapper, value);

        // inform the KIEM that a property in his view was changed
        KiemPlugin.getDefault().getKIEMViewInstance().setDirty(true);
    }
}
