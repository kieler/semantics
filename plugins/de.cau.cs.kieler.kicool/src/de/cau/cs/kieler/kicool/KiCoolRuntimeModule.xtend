/*
 * generated by Xtext
 */
package de.cau.cs.kieler.kicool

import de.cau.cs.kieler.kicool.converter.KiCoolValueConverter
import org.eclipse.xtext.conversion.IValueConverterService

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class KiCoolRuntimeModule extends AbstractKiCoolRuntimeModule {

    override Class<? extends IValueConverterService> bindIValueConverterService() {
        return KiCoolValueConverter
    } 

}