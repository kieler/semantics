/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.transformation;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.kico.KielerCompilerContext;

/**
 * Interface for a processor which is the smallest element of a transformation. Each processor must
 * supply an id and a process method. Optionally a human readable name can be supplied.
 * 
 * @author cmot
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * 
 */
public interface IProcessor {

    /**
     * Must supply a unique ID to identify this processor.
     * 
     * @return the string
     */
    public String getId();

    // -------------------------------------------------------------------------

    /**
     * Optionally supply a human readable name for this processor. If null is returned then the id
     * will be used in place of the name.
     * 
     * @return the string
     */
    public String getName();

    // -------------------------------------------------------------------------

    /**
     * Central transform method that implements a processor. It should return a specific EObject if
     * there are any following transformations. A code generation will finally return a String
     * object.<BR>
     * <BR>
     * Note that the first parameter type and the return type should be as specific as possible and
     * state which objects this processor can handle and will return. These types are used for
     * grouping transformations based on the compilation input. <BR>
     * <BR>
     * This method will be called with precedence compared to process(EObject). Nevertheless there
     * should not be both methods implemented in a processor.
     * 
     * @param eObject
     *            the e object
     * @param context
     *            the context
     * @return the e object
     * @throws Exception
     *             the exception
     */
    public Object process(EObject eObject, KielerCompilerContext context) throws Exception;

    // -------------------------------------------------------------------------

    /**
     * Central transform method that implements a processor. It should return a specific EObject if
     * there are any following transformations. A code generation will finally return a String
     * object.<BR>
     * <BR>
     * Note that the first parameter type and the return type should be as specific as possible and
     * state which objects this processor can handle and will return. These types are used for
     * grouping transformations based on the compilation input.<BR>
     * <BR>
     * The method process(EObject, KielerCompilerContext) will be called with precedence compared to
     * this method. Nevertheless there should not be both methods implemented in a processor.
     * 
     * @param eObject
     *            the e object
     * @return the e object
     */
    public Object process(EObject eObject) throws Exception;

    // -------------------------------------------------------------------------

}
