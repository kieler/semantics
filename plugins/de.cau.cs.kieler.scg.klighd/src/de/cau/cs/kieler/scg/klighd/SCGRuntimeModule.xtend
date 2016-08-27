/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.klighd

import de.cau.cs.kieler.kexpressions.KExpressionsRuntimeModule
import com.google.inject.Singleton
import org.eclipse.xtext.scoping.IScopeProvider

/** 
 * Specialized SCG runtime module
 * This is necessary to override the default KExpression scope provider. 
 * IMPORTANT: The binding has to be a singleton!
 * 
 * @author ssm
 * @kieler.design 2013-10-23 proposed 
 * @kieler.rating 2013-10-23 proposed yellow
 */
class SCGRuntimeModu2le extends KExpressionsRuntimeModule {
    
    @Singleton
    override Class<? extends IScopeProvider> bindIScopeProvider() {
        return typeof(SCGKExpressionsScopeProvider);
    }    
}