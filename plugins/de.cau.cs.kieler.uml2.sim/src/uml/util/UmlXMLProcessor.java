/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import uml.UmlPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        UmlPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the UmlResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new UmlResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new UmlResourceFactoryImpl());
        }
        return registrations;
    }

} //UmlXMLProcessor
