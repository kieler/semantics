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
package de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen

import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.sccharts.State
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.processors.statebased.codegen.StatebasedCCodeSerializeHRExtensions
import java.util.List
import de.cau.cs.kieler.sccharts.Scope
import java.util.Map
import de.cau.cs.kieler.sccharts.ControlflowRegion
import static extension de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.StatebasedLeanCCodeGenerator.hostcodeSafeName
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VariableDeclaration

/**
 * @author ssm
 * @kieler.design 2018-12-06 proposed 
 * @kieler.rating 2018-12-06 proposed yellow 
 * 
 */
class StatebasedLeanCTemplate {
    
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension StatebasedCCodeSerializeHRExtensions
    
    @Accessors val header = new StringBuilder
    @Accessors val source = new StringBuilder
    
    protected State rootState
    protected List<Scope> scopes
    protected Map<Scope, String> scopeNames
    protected Map<Scope, String> scopeEnumNames
    protected Map<Scope, String> contextStructNames
    protected var int regionCounter
    protected var int stateEnumCounter
    
    def void create(State rootState) {
        this.rootState = rootState
        
        scopes = <Scope> newLinkedList
        scopeNames = <Scope, String> newHashMap
        scopeEnumNames = <Scope, String> newHashMap
        contextStructNames = <Scope, String> newHashMap
        regionCounter = 0
        stateEnumCounter = 0
        enumerateScopes(rootState, "", "")
     
        createHeader
        createSource   
    }
    
    protected def void enumerateScopes(Scope scope, String namePrefix, String contextPrefix) {
        scopes += scope
        if (scope instanceof State) {
            if (!scopeNames.containsKey(scope)) {
                val name = if (namePrefix.nullOrEmpty) scope.name.hostcodeSafeName else namePrefix + '''_state''' + scope.name.hostcodeSafeName
                scopeNames.put(scope, name)
            }
            val enumName = 
                (if (scopeEnumNames.containsKey(scope)) '''S''' + (stateEnumCounter++) else scope.name.hostcodeSafeName).
                toUpperCase
            scopeEnumNames.put(scope, enumName)
            for (region : scope.regions.filter(ControlflowRegion)) {
                val newContextPrefix = if (scope.parentRegion === null) contextPrefix  
                    else contextPrefix + scope.parentRegion.uniqueName.lowerCapital + '''.'''
                enumerateScopes(region, scopeNames.get(scope), newContextPrefix)
            }
        } else if (scope instanceof ControlflowRegion) {
            if (!scopeNames.containsKey(scope)) {
                val name = if (scope.name.nullOrEmpty) '''R''' + (regionCounter++) else scope.name.hostcodeSafeName
                scopeNames.put(scope, namePrefix + '''_region''' + name)
                
                contextStructNames.put(scope, contextPrefix + scope.uniqueName.lowerCapital)
            }
            for (state : scope.states) {
                enumerateScopes(state, scopeNames.get(scope), contextPrefix)
            }
            
        }
    }
    
    
    protected def void createHeader() {
        val code = 
            '''
            // The chosen scheduling regime (IUR) uses four states to maintain the status of threads."),
            typedef enum {
              TERMINATED,
              RUNNING,
              READY,
              PAUSING
            } ThreadStatus;
            
            // Interface
            typedef struct {
              « rootState.createDeclarations »
            } Iface;
            
            « FOR r : scopes.filter(ControlflowRegion) »
            // This enum contains all states of the « r.name » region
            typedef enum {
                « FOR s : r.states.indexed »« s.value.uniqueEnumName 
                »« IF s.value.isHierarchical », « s.value.uniqueEnumName»RUNNING« ENDIF 
                »« IF s.key < r.states.size-1 », « ENDIF»« ENDFOR »
            } « r.uniqueName »State;
            
            // The thread data of « r.name »
            typedef struct {
              ThreadStatus threadStatus; 
              « r.uniqueName »State activeState; 
              char delayedEnabled; 
              Iface* iface; 
              « FOR c : r.states.map[ regions ].flatten.filter(ControlflowRegion) »
              « c.uniqueName.capitalize »  « c.uniqueName »;
              « ENDFOR »
            } « r.uniqueName.capitalize »Context;
            « ENDFOR »
            
            // Root level data of the program
            typedef struct {
              Iface iface;
              ThreadStatus threadStatus;
              
              « FOR r : rootState.regions.filter(ControlflowRegion) »
              « r.uniqueName.capitalize » « r.uniqueName.lowerCapital »;
              « ENDFOR »
            } TickData;
            
            
            « FOR s : scopes »
                static inline void « s.uniqueName »(« s.contextName.capitalize » *context);
            « ENDFOR »
            
            void reset(TickData *context);
            void tick(TickData *context);
            '''
        
        header.append(code)        
    }
    
    protected def void createSource() {
        
        createSourceReset
        createSourceTick
        
        for (s : scopes) {
            switch (s) {
                State: createSourceState(s)
                ControlflowRegion: createSourceControlflowRegion(s)
            }
        }   
    }
    
    protected def void createSourceReset() {
        val code = 
            '''
            void reset(TickData *context) {
              «FOR r : rootState.regions.filter(ControlflowRegion) »
              « setInterface("context->" + r.uniqueName.lowerCapital, r) »
              « ENDFOR »
            }
            
            '''
            
       source.append(code) 
    }
    
    protected def void createSourceTick() {
        val code = 
            '''
            void tick(TickData *context) {
              if (!context->threadStatus) return;
              
              « FOR r : scopes.filter(ControlflowRegion) »
              if (context->« contextStructNames.get(r) ».threadStatus == PAUSING) {
                context->« contextStructNames.get(r) ».threadStatus = READY;
                context->« contextStructNames.get(r) ».delayedEnabled = 1;
              }
              « ENDFOR »
            }
            
            '''
        
        source.append(code)
    }
    
    protected def void createSourceState(State state) {
        
    }
    
    protected def void createSourceControlflowRegion(ControlflowRegion region) {
        
    }
    
    
    
    
    protected def createDeclarations(State state) {
        val sb = new StringBuilder
        for (declaration : rootState.declarations.filter(VariableDeclaration)) {
            for (valuedObject : declaration.valuedObjects) {
                val declarationType = if (declaration.type != ValueType.HOST || declaration.hostType.nullOrEmpty) 
                    declaration.type.serializeHR
                    else declaration.hostType
                sb.append(  
                  '''
                    « declarationType » « valuedObject.name »« 
                    IF (valuedObject.isArray) »« FOR cardinality : valuedObject.cardinalities »[« cardinality.serializeHR »]« 
                    ENDFOR »« ENDIF 
                    »;« IF declaration.input » // Input« ENDIF »« 
                    IF declaration.output » // Output« ENDIF»
                  '''
                )
            }
        }
        
        return sb.toString
    }
    
    protected def String setInterface(String prefix, ControlflowRegion r) {
        val code = 
            '''
              « prefix ».iface = &(context->iface);
            '''
        
        for (r2 : r.states.filter[ isHierarchical ].map[ regions ].flatten.filter(ControlflowRegion)) {
            setInterface(prefix + r2.uniqueName.lowerCapital + ".", r2)
        }
        
        return code
    }    
    
    
    
    
    
    protected def String uniqueName(Scope scope) {
        scopeNames.get(scope)
    }
    
    protected def String capitalize(String string) {
        string.substring(0, 1).toUpperCase + string.substring(1) 
    }

    protected def String lowerCapital(String string) {
        string.substring(0, 1).toLowerCase + string.substring(1) 
    }
    
    protected def String uniqueEnumName(State state) {
        scopeEnumNames.get(state)
    }
    
    protected def String contextName(Scope scope) {
        if (scope instanceof State) {
            if (scope == rootState) {
                '''TickData'''            
            } else {
                scope.parentRegion.uniqueName
            }
        } else if (scope instanceof ControlflowRegion) {
            scope.uniqueName
        }
    }
    
}