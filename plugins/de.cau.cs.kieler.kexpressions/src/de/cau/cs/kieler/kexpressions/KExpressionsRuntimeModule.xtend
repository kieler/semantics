/*
 * generated by Xtext
 */
package de.cau.cs.kieler.kexpressions

import de.cau.cs.kieler.kexpressions.converter.KExpressionsValueConverter
import org.eclipse.xtext.conversion.IValueConverterService

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class KExpressionsRuntimeModule extends AbstractKExpressionsRuntimeModule {
    
    override Class<? extends IValueConverterService> bindIValueConverterService() {
        return KExpressionsValueConverter;
    }
    
}