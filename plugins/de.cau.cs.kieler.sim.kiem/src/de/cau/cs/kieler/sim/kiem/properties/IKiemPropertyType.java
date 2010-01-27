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

package de.cau.cs.kieler.sim.kiem.properties;

/**
 * The Interface IKiemPropertyType. This is the base interface that has to be implemented by new
 * KiemProperty types that also must extend the {@link KiemPropertyType} abstract class.
 * KiemProperties have to implement the {@link #getValue(KiemProperty)} and the
 * {@link #setValue(KiemProperty, Object)} methods depending on the CellEditor that is used. The
 * standard CellEditor is the TextCellEditor but KiemPropertyTypes may provide their own CellEditors
 * by overriding the method
 * {@link KiemPropertyType#provideCellEditor(org.eclipse.swt.widgets.Composite)}.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 yellow
 * 
 */
public interface IKiemPropertyType {

    // -------------------------------------------------------------------------

    /**
     * Gets the value of the property type. This method is called by the cell editor and its
     * returned object depends on the latter. It returns the value that the
     * cell editor can handle.
     * <BR>
     * The concrete type of value is determined by the used cell editor and the type
     * it can handle. The task of an implementation of this method is to bridge the property 
     * string type and the cell editor type.
     * 
     * @param property
     *            the KiemProperty that this type operates on
     * 
     * @return the value of the property with the type depending on the cell editor
     */
    Object getValue(KiemProperty property);

    // -------------------------------------------------------------------------

    /**
     * Sets the value of the property type. This method is called by the cell editor and the object
     * parameter depends on the latter. It gets the value from the cell editor and
     * should store the appropriate string representation in the KIEM property.
     * <BR>
     * The concrete type of value is determined by the used cell editor and the type
     * it can handle. The task of an implementation of this method is to bridge the property 
     * string type and the cell editor type.
     * 
     * @param value
     *            the value of the property with the type depending on the cell editor
     * @param property
     *            the KiemProperty that this type operates on
     */
    void setValue(KiemProperty property, Object value);

}
