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
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import java.util.LinkedList
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * SCCharts Transformation Extensions. Extension in order to improve readability of SCCharts extended
 * feature transformations.
 * 
 * @author cmot
 * @kieler.design 2015-12-10 proposed 
 * @kieler.rating 2015-12-10 proposed yellow
 */
class SCChartsTransformationExtension {

    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsControlflowRegionExtensions

    // This prefix is used for namings of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    // -------------------------------------------------------------------------
    // --             H I G H E R      L E V E L     T E S T S                --
    // -------------------------------------------------------------------------
    // Test if a state can be immediately aborted
    def boolean canImmediateAborted(State state) {
        ((state.outgoingTransitions.filter[e|e.isStrongAbort && e.implicitlyImmediate].size > 0) ||
            (state.outgoingTransitions.filter[e|e.isWeakAbort && e.implicitlyImmediate].size > 0))
    }

    // Test if for a state ALL regions may possibly terminate immediate
    def boolean canImmediateTerminate(State state) {
        val regions = state.getControlflowRegions
        for (region : regions) {
            if (region instanceof ControlflowRegion) {
                if (!region.canImmediateTerminate) {
                    return false;
                }
            }
        }
        return true;
    }

    // Test if a region can possibly terminate immediate 
    def boolean canImmediateTerminate(ControlflowRegion region) {
        for (finalState : region.states.filter[isFinal]) {
            if (finalState.isImmediatelyReachable) {
                return true
            }
        }
    }

    // Test if a final state is reachable immediately from an initial state
    def boolean isImmediatelyReachable(State finalState) {
        if (finalState.initial)
            return true
        val visited = new LinkedList<State>
        visited.add(finalState)
        val next = new LinkedList<Transition>
        next.addAll(finalState.incomingTransitions.filter[implicitlyImmediate])
        while (next.size > 0) {
            val n = next.pop
            if (!visited.contains(n.sourceState)) {
                if (n.sourceState.initial)
                    return true
                visited.add(n.sourceState)
                next.addAll( n.sourceState.incomingTransitions.filter[implicitlyImmediate])
            }
        }
        return false
    }

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
    def public VariableDeclaration declaration2(ValuedObject valuedObject) {
        if (valuedObject.eContainer instanceof VariableDeclaration) {
            return valuedObject.eContainer as VariableDeclaration
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
        valuedObject.declaration2.isInput
    }

// TODO: getInput/isInput?
    // Return whether the ValuedObject is an input.
    def public boolean isInput(ValuedObject valuedObject) {
        valuedObject.declaration2.isInput
    }

    // Return whether the ValuedObject is an output.
    def public boolean getOutput(ValuedObject valuedObject) {
        valuedObject.declaration2.isOutput
    }

    // Return whether the ValuedObject is an output.
    def public boolean isOutput(ValuedObject valuedObject) {
        valuedObject.declaration2.isOutput
    }

    // Return whether the ValuedObject is static.
    def public boolean getStatic(ValuedObject valuedObject) {
        valuedObject.declaration2.isStatic
    }

    // Return whether the ValuedObject is static.
    def public boolean isStatic(ValuedObject valuedObject) {
        valuedObject.declaration2.isStatic
    }

    // Return whether the ValuedObject is a const.
    def public boolean getConst(ValuedObject valuedObject) {
        valuedObject.declaration2.isConst
    }

    // Return whether the ValuedObject is a const.
    def public boolean isConst(ValuedObject valuedObject) {
        valuedObject.declaration2.isConst
    }

    // Return whether the ValuedObject is a const.
    def public boolean getExtern(ValuedObject valuedObject) {
        valuedObject.declaration2.isExtern
    }

    // Return whether the ValuedObject is a const.
    def public boolean isExtern(ValuedObject valuedObject) {
        valuedObject.declaration2.isExtern
    }

    // Return whether the ValuedObject is a signal.
    def public boolean getSignal(ValuedObject valuedObject) {
        valuedObject.declaration2.isSignal
    }

    // Return whether the ValuedObject is a signal.
    def public boolean isSignal(ValuedObject valuedObject) {
        valuedObject.declaration2.isSignal
    }

    // ========= ATTRIBUTE SETTER =========
    def ValuedObject copyAttributes(ValuedObject valuedObject, ValuedObject valuedObjectWithAttributes) {
        if (valuedObjectWithAttributes.initialValue !== null) {
            valuedObject.setInitialValue(valuedObjectWithAttributes.initialValue.copy)
        }
        if (valuedObjectWithAttributes.combineOperator !== null) {
            valuedObject.setCombineOperator(valuedObjectWithAttributes.combineOperator)
        }
        if (!valuedObjectWithAttributes.cardinalities.nullOrEmpty) {
            for (card : valuedObjectWithAttributes.cardinalities) {
                valuedObject.cardinalities.add(card.copy);
            }
        }
        valuedObject
    }

    // Set the intial value of a valued object based on its type (e.g. int -> 0, bool -> false)
    def void setDefaultValue(ValuedObject valuedObject) {
        switch (valuedObject.type) {
            case BOOL: {
                valuedObject.initialValue = createBoolValue(false)
            }
            case INT,
            case DOUBLE,
            case FLOAT,
            case UNSIGNED: {
                valuedObject.initialValue = createIntValue(0)
            }
            case STRING: {
                valuedObject.initialValue = createStringValue("")
            }
            case HOST: {
            }
            case PURE: {
            }
        }
    }

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
        val uniqueDeclaration = valuedObject.uniqueDeclaration
        uniqueDeclaration.setSignal(isSignal)
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
    def public VariableDeclaration createVariableDeclaration() {
        KExpressionsFactory::eINSTANCE.createVariableDeclaration
    }

    // Creates a new Declaration on the basis of an existing declaration if existing. The new declaration
    // has the same attributes than the existing one but will not contain their ValuedObjects.
    // If the exitsingDeclaration is null then createDeclaration(Declaration existingDeclaration) behaves
    // as createDeclaration().
    def public VariableDeclaration createDeclaration(VariableDeclaration existingDeclaration) {
        val newDeclaration = createVariableDeclaration()
        if (existingDeclaration !== null) {
            newDeclaration.copyAttributes(existingDeclaration)
            val parent = existingDeclaration.eContainer
            if (parent instanceof Scope) {
                parent.declarations += newDeclaration
            }
        }
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
            val newDeclaration = createVariableDeclaration;
            newDeclaration._addValuedObject(valuedObject)
            newDeclaration
        }
    }

    // copies all attributes from a declaration to a target declaration
    def VariableDeclaration copyAttributes(VariableDeclaration target, VariableDeclaration declaration) {
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
    // Attention: The declaration of the valuedObject MUST NOT BE NULL.
    def public VariableDeclaration getUniqueDeclaration(ValuedObject valuedObject) {
        val declaration = valuedObject.declaration2
        if (declaration === null) {
            // ERROR CASE
        }
        if (declaration._containsOnly(valuedObject)) {
            // We don't have to care about other valuedObjects
            return declaration
        } else {
            // Make a new Declaration
            val newDeclaration = createDeclaration(declaration)
            // Remove the valuedObject from the old group and add it to the new group
            declaration._removeValuedObject(valuedObject)
            val parent = declaration.eContainer
            if (parent instanceof State) {
                parent.declarations.add(newDeclaration)
            } else if (parent instanceof ControlflowRegion) {
                parent.declarations.add(newDeclaration)
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

    // Add a ValuedObject.
    // The visibility of this method is 'package' to allow the ValuedObjectList to add a ValuedObject.
    def Declaration _addValuedObject(Scope scope, ValuedObject valuedObject) {
        val declaration = createVariableDeclaration()
        scope.declarations.add(declaration)
        declaration.valuedObjects.add(valuedObject)
        declaration
    }

// -------------------------------------------------------------------------
// --                       K E X P R E S S I O N S                       --
// -------------------------------------------------------------------------
// NOW PART OF KExpressionsCreateExtensions
// @Inject
// extension KExpressionsCreateExtensions
// ===========  VALUES  ===========
//    // Create a TRUE value.
//    def public BoolValue TRUE() {
//        createBoolValue(true)
//    }
//
//    // Create a FALSE value.
//    def public BoolValue FALSE() {
//        createBoolValue(false)
//    }
//    // Create an int value.
//    def IntValue createIntValue(int value) {
//        val expression = KExpressionsFactory::eINSTANCE.createIntValue()
//        expression.setValue(value)
//        expression
//    }
//
//    // Create a float value.
//    def FloatValue createFloatValue(float value) {
//        val expression = KExpressionsFactory::eINSTANCE.createFloatValue()
//        expression.setValue(value)
//        expression
//    }
//
//    // Create a boolean value.
//    def BoolValue createBoolValue(boolean value) {
//        val expression = KExpressionsFactory::eINSTANCE.createBoolValue()
//        expression.setValue(value)
//        expression
//    }
//
//    // Create a string value
//    def StringValue createStringValue(String value) {
//        val expression = KExpressionsFactory::eINSTANCE.createStringValue()
//        expression.setValue(value)
//        expression
//    }
//
//    // Create an empty text expression.
//    def TextExpression createTextExpression() {
//        val expression = KExpressionsFactory::eINSTANCE.createTextExpression()
//        expression
//    }
// ------------------------------------------------------------------------
}
