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
package de.cau.cs.kieler.sccharts.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.Scope
import org.eclipse.emf.ecore.EObject

/**
 * SCCharts Transformation Extensions. Extension in order to improve readability of SCCharts extended
 * feature transformations.
 * 
 * @author cmot
 * @kieler.design 2015-12-10 proposed 
 * @kieler.rating 2015-12-10 proposed yellow
 */
class SCChartsTransformationExtension {

    @Inject
    extension SCChartsExtension

    // This prefix is used for namings of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    // -------------------------------------------------------------------------
    // --          V A L U E D     O B J E C T S    W R A P P E R             --
    // -------------------------------------------------------------------------
    
    // // Return the list of all contained ValuedObjects. 
    // // ATTENTION: This method returns a specific list. If you add ValuedObjects to this
    // // list they will be added to  the container of a Declaration.
    def public ValuedObjectList getValuedObjects(EObject eObject) {
        val declarations = eObject.eContents.filter(typeof(Declaration)).toList
        val returnList = new ValuedObjectList()
        // This is necessary for adding ValuedObjects later
        returnList.setContainer(eObject)
        for (declaration : declarations) {
            returnList.addAll(declaration.valuedObjects)
        }
        returnList
    }

    // Return the declaration of the ValuedObject which is the container of it and may contain 
    // other valued objects.
    def public Declaration declaration(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof Declaration) {
            return valuedObject.eContainer as Declaration
        }
    }


    // Removes a ValuedObject from any declaration it is contained in.
    def public void removeValuedObject(EObject eObject, ValuedObject valuedObject) {
        val declarations = eObject.eAllContents.filter(typeof(Declaration)).
            filter[valuedObjects.contains(valuedObject)].toList;
        for (declaration : declarations.immutableCopy) {
            declaration.valuedObjects.remove(valuedObject)
        }
    }
    
    // =========  VALUED OBJECT CREATION =========
    
    // Creates a new ValuedObject. This is not contained in any scope / declaration yet!
    def ValuedObject createValuedObject(String valuedObjectName) {
        val valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject();
        valuedObject.setName(valuedObjectName)
        valuedObject
    }
    
    // Creates a new ValuedObject in a scope.
    def ValuedObject createValuedObject(Scope scope, String valuedObjectName) {
        val valuedObject = createValuedObject(valuedObjectName)
        scope.valuedObjects.add(valuedObject)
        valuedObject
    }

    // ========= ATTRIBUTE GETTER =========
    // Return whether the ValuedObject is an input.
    def public boolean getInput(ValuedObject valuedObject) {
        valuedObject.declaration.input
    }

    // Return whether the ValuedObject is an input.
    def public boolean isInput(ValuedObject valuedObject) {
        valuedObject.getInput()
    }

    // Return whether the ValuedObject is an output.
    def public boolean getOutput(ValuedObject valuedObject) {
        valuedObject.declaration.output
    }

    // Return whether the ValuedObject is an output.
    def public boolean isOutput(ValuedObject valuedObject) {
        valuedObject.getOutput()
    }

    // Return whether the ValuedObject is static.
    def public boolean getStatic(ValuedObject valuedObject) {
        valuedObject.declaration.static
    }

    // Return whether the ValuedObject is static.
    def public boolean isStatic(ValuedObject valuedObject) {
        valuedObject.getStatic()
    }

    // Return whether the ValuedObject is a const.
    def public boolean getConst(ValuedObject valuedObject) {
        valuedObject.declaration.const
    }

    // Return whether the ValuedObject is a const.
    def public boolean isConst(ValuedObject valuedObject) {
        valuedObject.getConst()
    }

    // Return whether the ValuedObject is a const.
    def public boolean getExtern(ValuedObject valuedObject) {
        valuedObject.declaration.extern
    }

    // Return whether the ValuedObject is a const.
    def public boolean isExtern(ValuedObject valuedObject) {
        valuedObject.getExtern()
    }

    // Return whether the ValuedObject is an array.
    def public boolean isArray(ValuedObject valuedObject) {
        !valuedObject.cardinalities.nullOrEmpty
    }

    // Return whether the ValuedObject is a signal.
    def public boolean getSignal(ValuedObject valuedObject) {
        valuedObject.declaration.signal
    }

    // Return whether the ValuedObject is a signal.
    def public boolean isSignal(ValuedObject valuedObject) {
        valuedObject.getSignal()
    }

    // ========= ATTRIBUTE SETTER =========
    // Set the type of a ValuedObject. 
    def public ValuedObject setType(ValuedObject valuedObject, ValueType type) {
        val uniqueDeclaration = valuedObject.uniqueDeclaration
        uniqueDeclaration.setType(type)
        valuedObject;
    }

    // Set the Declaration to a specific type.
    def private Declaration setType(Declaration declaration, ValueType type) {
        declaration.type = type
        declaration
    }

    // Set the ValuedObject to be or not be an input.
    def public ValuedObject setInput(ValuedObject valuedObject, boolean isInput) {
        val uniqueDeclaration = valuedObject.uniqueDeclaration
        uniqueDeclaration.setInput(isInput)
        valuedObject;
    }

    // Set the ValuedObject to be an input.
    def public ValuedObject setIsInput(ValuedObject valuedObject) {
        valuedObject.setInput(true)
    }

    // Set the ValuedObject to NOT be an input.
    def public ValuedObject setIsNotInput(ValuedObject valuedObject) {
        valuedObject.setInput(false)
    }

    // Set the ValuedObject to be or not be an output.
    def public ValuedObject setOutput(ValuedObject valuedObject, boolean isOutput) {
        val uniqueDeclaration = valuedObject.uniqueDeclaration
        uniqueDeclaration.setOutput(isOutput)
        valuedObject;
    }

    // Set the ValuedObject to be an output.
    def public ValuedObject setIsOutput(ValuedObject valuedObject) {
        valuedObject.setOutput(true)
    }

    // Set the ValuedObject to NOT be an output.
    def public ValuedObject setIsNotOutput(ValuedObject valuedObject) {
        valuedObject.setOutput(false)
    }

    // Set the ValuedObject to be or not be static.
    def public ValuedObject setStatic(ValuedObject valuedObject, boolean isStatic) {
        val uniqueDeclaration = valuedObject.uniqueDeclaration
        uniqueDeclaration.setStatic(isStatic)
        valuedObject;
    }

    // Set the ValuedObject to be static.
    def public ValuedObject setIsStatic(ValuedObject valuedObject) {
        valuedObject.setConst(true)
    }

    // Set the ValuedObject to NOT be static.
    def public ValuedObject setIsNotStatic(ValuedObject valuedObject) {
        valuedObject.setConst(false)
    }

    // Set the ValuedObject to be or not be a Const.
    def public ValuedObject setConst(ValuedObject valuedObject, boolean isConst) {
        val uniqueDeclaration = valuedObject.uniqueDeclaration
        uniqueDeclaration.setConst(isConst)
        valuedObject;
    }

    // Set the ValuedObject to be a constant.
    def public ValuedObject setIsConst(ValuedObject valuedObject) {
        valuedObject.setConst(true)
    }

    // Set the ValuedObject to NOT be a constant.
    def public ValuedObject setIsNotConst(ValuedObject valuedObject) {
        valuedObject.setConst(false)
    }

    // Set the ValuedObject to be or not be a Const.
    def public ValuedObject setExtern(ValuedObject valuedObject, boolean isExtern) {
        val uniqueDeclaration = valuedObject.uniqueDeclaration
        uniqueDeclaration.setExtern(isExtern)
        valuedObject;
    }

    // Set the ValuedObject to be extern.
    def public ValuedObject setIsExtern(ValuedObject valuedObject) {
        valuedObject.setExtern(true)
    }

    // Set the ValuedObject to NOT be extern.
    def public ValuedObject setIsNotExtern(ValuedObject valuedObject) {
        valuedObject.setExtern(false)
    }

    // Set the ValuedObject to be a signal.
    def ValuedObject setSignal(ValuedObject valuedObject, boolean isSignal) {
        valuedObject.setSignal(isSignal)
        valuedObject
    }

    // Set the ValuedObject to be a signal.
    def public ValuedObject setIsSignal(ValuedObject valuedObject) {
        valuedObject.setSignal(true)
    }

    // Set the ValuedObject to be a (usual) variable.
    def public ValuedObject setIsNotSignal(ValuedObject valuedObject) {
        valuedObject.setSignal(false)
    }

    // Set the ValuedObject to be an input.
    def ValuedObject setInput(ValuedObject valuedObject) {
        valuedObject.setInput(true)
        valuedObject
    }

    // Set the ValuedObject to be an output.
    def ValuedObject setOutput(ValuedObject valuedObject) {
        valuedObject.setOutput(true)
        valuedObject
    }

    // Set the ValuedObject to be of type PURE.
    def ValuedObject setTypePure(ValuedObject valuedObject) {
        valuedObject.setType(ValueType::PURE)
        valuedObject
    }

    // Set the ValuedObject to be of type INT.
    def ValuedObject setTypeInt(ValuedObject valuedObject) {
        valuedObject.setType(ValueType::INT)
        valuedObject
    }

    // Set the ValuedObject to be of type BOOL.
    def ValuedObject setTypeBool(ValuedObject valuedObject) {
        valuedObject.setType(ValueType::BOOL)
        valuedObject
    }

    // Set the ValuedObject to be of type DOUBLE.
    def ValuedObject setTypeDouble(ValuedObject valuedObject) {
        valuedObject.setType(ValueType::DOUBLE)
        valuedObject
    }

    // Set the ValuedObject to be of type FLOAT.
    def ValuedObject setTypeFloat(ValuedObject valuedObject) {
        valuedObject.setType(ValueType::FLOAT)
        valuedObject
    }
    
    

    // -------------------------------------------------------------------------
    // --           V A R I A B L E S    A N D    S I G N A L S               --
    // -------------------------------------------------------------------------

    // ===========  VARIABLES  ===========
    // Creates a new variable ValuedObject in a Scope.
    def ValuedObject createVariable(Scope scope, String variableName) {
        scope.createValuedObject(variableName)
    }

    // ============  SIGNALS  ============
    // Creates a new variable ValuedObject in a Scope.
    def ValuedObject createSignal(Scope scope, String variableName) {
        scope.createValuedObject(variableName).setIsSignal
    }
    
    
    
    // -------------------------------------------------------------------------
    // --                        D E C L A R A T I O N S                      --
    // -------------------------------------------------------------------------
    
    // Creates a new Declaration.
    def public Declaration createDeclaration() {
        KExpressionsFactory::eINSTANCE.createDeclaration
    }

    // Creates a new Declaration on the basis of an existing declaration. The new declaration has
    // the same attributes than the existing one but will not contain their ValuedObjects.
    def public Declaration createDeclaration(Declaration existingDeclaration) {
        val newDeclaration = createDeclaration()
        newDeclaration.copyAttributes(existingDeclaration)
        newDeclaration
    }
    
    // =========  HELPER METHODS =========
    
    // Get the surrounding Declaration of a ValuedObject that contains the ValuedObject. 
    // This Declaration may also contain other ValuedObjects, see containsOnly().
    // If the valuedObject does not have any Declaration yet, then create a new one.
    def private Declaration getDeclarationOrCreate(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof Declaration) {
            return valuedObject.eContainer as Declaration
        } else {
            val newDeclaration = createDeclaration;
            newDeclaration._addValuedObject(valuedObject)
            newDeclaration
        }
    }

    // copies all attributes from a declaration to a target declaration
    def private Declaration copyAttributes(Declaration target, Declaration declaration) {
        target => [
            type = declaration.type
            input = declaration.input
            output = declaration.output
            signal = declaration.signal
            static = declaration.static
            const = declaration.const
        ]
    }

    // Helper method for Setter-Wrapper. It returns the direct Declaration of a ValuedObject
    // if there are no other ValuedObjects in this group. Otherwise it creates and returns
    // a new Declaration and removes the ValuedObject from the old one, adding it to the 
    // new one.
    def public Declaration getUniqueDeclaration(ValuedObject valuedObject) {
        val declaration = valuedObject.declaration
        if (declaration._containsOnly(valuedObject)) {
            // We don't have to care about other valuedObjects
            return declaration
        } else {
            // Make a new Declaration
            val newDeclaration = createDeclaration(declaration)
            // Remove the valuedObject from the old group and add it to the new group
            declaration._removeValuedObject(valuedObject)
            if (declaration.valuedObjects.size == 0) {
                // THIS CANNOT HAPPEN, OTHERWISE WE WOULD HAVE BEEN IN CASE ONE!
            }
            newDeclaration._addValuedObject(valuedObject)
            newDeclaration
        }
    }

    // Check if a Declaration only contains a single ValuedObject.
    def private boolean _containsOnly(Declaration declaration, ValuedObject valuedObject) {
        (declaration.valuedObjects.contains(valuedObject)) && (declaration.valuedObjects.size == 1)
    }

    // Remove a specific ValuedObject.
    def private _removeValuedObject(Declaration declaration, ValuedObject valuedObject) {
        if (declaration.valuedObjects.contains(valuedObject)) {
            declaration.valuedObjects -= valuedObject
        }
    }

    // Add a ValuedObject.
    // The visibility of this method is 'package' to allow the ValuedObjectList to add a ValuedObject.
    def Declaration _addValuedObject(Declaration declaration, ValuedObject valuedObject) {
        declaration.valuedObjects.add(valuedObject)
        declaration
    }
    
    
    // ------------------------------------------------------------------------

}