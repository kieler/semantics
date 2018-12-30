/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.codegen.smv

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.verification.VerificationProperty
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.ssa.IOPreserverExtensions
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 * 
 */
class SmvCodeGeneratorSpecificationsModule extends SmvCodeGeneratorModuleBase {

    @Inject extension KEffectsExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SSACoreExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions   
    @Inject extension IOPreserverExtensions      
    @Inject extension SmvCodeSerializeHRExtensions serializer
    
    override getName() {
        return class.simpleName;
    }

    override generateInit() {
    }
    
    override generate() {
        val verificationProperties = (parent as SmvCodeGeneratorModule).verificationProperties
        if(verificationProperties.isNullOrEmpty) {
            return
        }
        for(property : verificationProperties) {
            val specName = property.getSmvSpecName
            appendIndentedLine('''«specName»''')
            incIndentationLevel
            appendIndentedLine('''«property.formula»;''')
            decIndentationLevel
        }
    }
    
    override generateDone() {
    }
    
    private def String getSmvSpecName(VerificationProperty property) {
        switch(property.type) {
            case INVARIANT : return "INVARSPEC"
            case LTL : return "LTLSPEC"
            case CTL : return "CTLSPEC"
            default : throw new Exception("Cannot translate VerificationProperty '"+property+"' to SMV code")
        }
    }
}
