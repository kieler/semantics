/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem;

import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;

/**
 * <p>
 * Components implementing this interface can provide configuration information
 * for KIEM. For example change the aimed step duration and be notified if the
 * user changes it in one of the components.
 * </p>
 * <p>
 * Whenever the value of a configuration element is needed by the plugin it will
 * start to ask all configuration providers for a value through the
 * changeProperty(propertyId) method. Providers that do not wish to provide a
 * value or can't provide one should throw an Exception. The plugin will take
 * the value from the first provider that does not throw an Exception. All other
 * providers will be ignored.
 * </p>
 * <p>
 * When a property is changed through the user interface the plugin will inform
 * all providers of the change through a (key, value) pair.
 * </p>
 * <p>
 * The extension point only supports String values as that is the format that is
 * easiest to store in the PreferenceScope. This implementation might later be
 * changed to support general Objects that must at least implement the
 * Serializable interface.
 * </p>
 * <p>
 * For a list of supported properties see:
 * {@link de.cau.cs.kieler.sim.kiem.KiemPlugin}
 * </p>
 * <p>
 * For an implementation example see:
 * {@link de.cau.cs.kieler.sim.kiem.KiemPlugin#getAimedStepDuration()}
 * {@link de.cau.cs.kieler.sim.kiem.KiemPlugin#setAimedStepDuration(int)}
 * </p>
 * 
 * @author soh
 * @kieler.rating 2010-02-03 proposed yellow
 * 
 */
public interface IKiemConfigurationProvider {

    /**
     * Ask the component to give a new value for the property specified by the
     * id. If multiple components are registered on this extension point only
     * the first value that was successfully retrieved will be used. All other
     * providers will not be asked.
     * 
     * @param propertyId
     *            the id of the property to change.
     * @return the new value of the property.
     * @throws KiemPropertyException
     *             if the propertyId was not found.
     */
    String changeProperty(String propertyId) throws KiemPropertyException;

    /**
     * Notify the listener that the user changed the property specified by the
     * id.
     * 
     * @param propertyId
     *            the id of the property.
     * @param value
     *            the new value of the property.
     */
    void propertyChanged(String propertyId, String value);
}
