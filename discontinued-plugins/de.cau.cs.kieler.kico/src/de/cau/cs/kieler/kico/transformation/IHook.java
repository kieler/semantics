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
 * This interface defines what a concrete hook is. A hook is an EObject processing or
 * observation unit that is invoked before/after each transformation, processor or snapshot.
 * 
 * @author cmot, als
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * 
 */
public interface IHook {

    /**
     * Must supply a unique ID to identify this hook.
     * 
     * @return the string
     */
    public String getId();

    // -------------------------------------------------------------------------

    /**
     * Optionally supply a human readable name for this hook. If null is returned then the id
     * will be used in place of the name.
     * 
     * @return the string
     */
    public String getName();
    
    // -------------------------------------------------------------------------

    /**
     * Is invoked before each a compilation starts for the given context.
     */
    public void preCompilation(KielerCompilerContext context);

    // -------------------------------------------------------------------------

    /**
     * Is invoked before each transformation. An EObject can be modified or inspected.
     * 
     * @return the model
     */
    public EObject preTransformation(EObject model, KielerCompilerContext context, ITransformation transformation);

    // -------------------------------------------------------------------------

    /**
     * Is invoked after each transformation. An EObject can be modified or inspected.
     * 
     * @return the model
     */
    public Object postTransformation(EObject input, Object result, KielerCompilerContext context, ITransformation transformation);

    // -------------------------------------------------------------------------
    

    /**
     * Is invoked before each processor. An EObject can be modified or inspected.
     * 
     * @return the list
     */
    public EObject preProcessor(EObject model, KielerCompilerContext context, IProcessor processor);

    // -------------------------------------------------------------------------

    /**
     * Is invoked after each processor. An EObject can be modified or inspected.
     * 
     * @return the model
     */
    public Object postProcessor(EObject input, Object result, KielerCompilerContext context, IProcessor processor);

    // -------------------------------------------------------------------------
    

    /**
     * Is invoked before each snapshot. An EObject can be modified or inspected.
     * 
     * @return the model
     */
    public EObject preSnapshot(EObject model, KielerCompilerContext context);

    // -------------------------------------------------------------------------

    /**
     * Is invoked after each snapshot. An EObject can be modified or inspected.
     * 
     * @return the model
     */
    public EObject postSnapshot(EObject model, KielerCompilerContext context);

    // -------------------------------------------------------------------------
    
    /**
     * Is invoked to perform a copy of the model. If return value is not null the returned value
     * will be taken as the effective copy. If more than one hook wants to perform the copy an
     * RuntimeException will be raised.
     * 
     * @return the copy
     */
    public EObject copy(EObject model, KielerCompilerContext context);

    // -------------------------------------------------------------------------
    
}
