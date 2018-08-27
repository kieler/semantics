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

/**
 * Description of a compilation system for select-box entries. Consist of label an id.
 * 
 * @author sdo
 *
 */
class SystemDescription {
    
    private String label
    private String id
    
    new (String label, String id) {
        this.label = label
        this.id = id
    }
    
}

/**
 * Configuration options for the compiler, used for communication with Theia client.
 * 
 */
class CompilerConfiguration {
    private boolean isCheckedDeveloperToggle
    private boolean isCheckedFlattenSystemViewToggle
    private boolean isCheckedForwardResultToggle
    private boolean isCheckedAutoCompileToggle
    private boolean isCheckedVisualLayoutFeedbackToggle
    private boolean isCheckedCompileInplaceToggle
    private boolean isCheckedCompileTracingToggle
    private boolean isCheckedDebugEnvironmentModelsToggle
    private boolean isCheckedShowPrivateSystemsToggle
    
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