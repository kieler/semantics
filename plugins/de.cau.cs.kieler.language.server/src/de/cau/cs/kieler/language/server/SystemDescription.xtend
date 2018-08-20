/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server

import java.util.List

/**
 * @author sdo
 *
 */
class SystemDescription {
    
    String label
    String id
    
    new (String label, String id) {
        this.label = label
        this.id = id
    }
    
}

class CompilerConfiguration {
    boolean isCheckedDeveloperToggle
    boolean isCheckedFlattenSystemViewToggle
    boolean isCheckedForwardResultToggle
    boolean isCheckedAutoCompileToggle
    boolean isCheckedVisualLayoutFeedbackToggle
    boolean isCheckedCompileInplaceToggle
    boolean isCheckedCompileTracingToggle
    boolean isCheckedDebugEnvironmentModelsToggle
    boolean isCheckedShowPrivateSystemsToggle
    
    new (boolean dev, boolean flattenSystem, boolean forwardResult, boolean autoCompile, boolean visualFeedback, 
        boolean inplace, boolean tracing, boolean debugEnv, boolean showPrivate
    ) {
        this.isCheckedAutoCompileToggle = autoCompile
        this.isCheckedCompileInplaceToggle = inplace
        this.isCheckedCompileTracingToggle = tracing
        this.isCheckedDebugEnvironmentModelsToggle = debugEnv
        this.isCheckedDeveloperToggle = dev
        this.isCheckedFlattenSystemViewToggle = flattenSystem
        this.isCheckedForwardResultToggle = forwardResult
        this.isCheckedShowPrivateSystemsToggle = showPrivate
        this.isCheckedVisualLayoutFeedbackToggle = visualFeedback
    }
}