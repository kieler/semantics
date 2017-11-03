package de.cau.cs.kieler.scg.codegen

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.scg.extensions.SCGSerializeHRExtensions
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions

/**
 * @author ssm
 * 
 * @kieler.design 2015-09-17 proposed ssm
 * @kieler.rating 2015-09-17 proposed yellow
 *
 */
class CodeGeneratorSerializeHRExtensions extends SCGSerializeHRExtensions {
    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KEffectsExtensions

    override dispatch CharSequence serializeHR(ReferenceCall referenceCall) {
        val declaration = referenceCall.valuedObject.referenceDeclaration
        if (declaration.extern.nullOrEmpty) { 
            return referenceCall.valuedObject.serializeHR.toString + referenceCall.parameters.serializeHRParameters
        } else {
            return declaration.extern + referenceCall.parameters.serializeHRParameters
        }
    }    
    
    override dispatch CharSequence serialize(ReferenceCall referenceCall) {
        val declaration = referenceCall.valuedObject.referenceDeclaration
        if (declaration.extern.nullOrEmpty) { 
            return referenceCall.valuedObject.serialize.toString + referenceCall.parameters.serializeParameters
        } else {
            return declaration.extern + referenceCall.parameters.serializeParameters
        }
    }
    

}