package de.cau.cs.kieler.sccharts.text.sct.scoping

import de.cau.cs.kieler.core.kexpressions.ArrayType
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FloatValue
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.PrimitiveTypeReference
import de.cau.cs.kieler.core.kexpressions.Type
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.Assignment
import de.cau.cs.kieler.sccharts.Emission
import javax.inject.Inject
import org.eclipse.emf.ecore.resource.ResourceSet
import de.cau.cs.kieler.core.kexpressions.ValueType
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.PrimitiveType

/**
 * This helper class provides type inference on KExpressions' simple Types.
 * It is still incomplete. By careful while editing as the scoping relies on the correctness!
 *
 * This class may be injected while using it in the context of an Xtext-based editor,
 *  as the editor-specific injector configuration contains a binding class for
 *  {@link ResourceSet}, in order to properly identify the volatile PrimitiveType instances.
 * 
 * In other use cases it is supposed to be instantiated via a manual constructor call. 
 * @author chsch 
 */
class TypesExtensions {
        
    private static final String TYPE_RESOURCE_URI_STRING = "kexpressions://types.types";
    private static final URI TYPE_RESOURCE_URI = URI.createURI(TYPE_RESOURCE_URI_STRING);
    
    private ResourceSet resourceSet = null;
    
    /**
     * Constructor
     * 
     * @param set a ResourceSet that is needed to properly identify primitive types (which are
     *  maintained as single instances of {@link PrimitiveType} for each valid primitive type.
     */
    @Inject
    new(ResourceSet set) {
        this.resourceSet = set;
    }

    def Type findTypeByName(String name) {
        if (this.resourceSet == null) {
            return null;
        }
        
        val res = this.resourceSet.getResource(TYPE_RESOURCE_URI, false)?:createTypes(this.resourceSet);
        
        val PrimitiveType type = res.getContents().filter(typeof(PrimitiveType)).filter[
            it.name.equals(name);
        ].head;
        
        return type;
    }
    
    def private Resource createTypes(ResourceSet set) {
        val Resource resource = set.createResource(TYPE_RESOURCE_URI);
        ValueType.values().forEach[ v |
            resource.contents += KExpressionsFactory.eINSTANCE.createPrimitiveType() => [
                it.name = v.literal;
            ];
        ];
        return resource;
    }
    
    def getAvailableTypes() {
        if (this.resourceSet == null) {
            return null;
        } 
        
        var res = this.resourceSet.getResource(TYPE_RESOURCE_URI, false)?:createTypes(this.resourceSet);
        
        return res?.contents?:emptyList
    }
    
        
    def dispatch Type getActualType(BoolValue value) {
        return findTypeByName(ValueType.BOOL.literal);
    }
    
    def dispatch Type getActualType(FloatValue value) {
        return findTypeByName(ValueType.FLOAT.literal);
    }
    
    def dispatch Type getActualType(IntValue value) {
        return findTypeByName(ValueType.INT.literal);
    }
    
    def dispatch Type getActualType(Assignment assignment) {
        return assignment.valuedObject.actualType;
    }
    
    def dispatch Type getActualType(Emission emission) {
        return emission.valuedObject.actualType;
    }
    
    def dispatch Type getActualType(ValuedObjectReference reference) {
        return null;
    }    

    def dispatch Type getActualType(ValuedObject decl) {
        return decl?.type2?.actualType;
    }    

    def dispatch Type getActualType(ArrayType ref) {
        return ref.elementType.actualType;
    }
    
    def dispatch Type getActualType(PrimitiveTypeReference ref) {
        return ref.primitiveType;
    }
    
    // for the use in scope providers, static access methods are really helpful.
    //  the names however may be improved ;-)
    
    def static Type findType(Expression expr) {
        return new TypesExtensions(expr.eResource.resourceSet).getActualType(expr);
    } 
    
    def static Type findType(ValuedObjectReference expr) {
        return new TypesExtensions(expr.eResource.resourceSet).getActualType(expr);
    } 

    def static Type findActualType(PrimitiveTypeReference ref) {
        return new TypesExtensions(ref.eResource.resourceSet).getActualType(ref);
    }
}