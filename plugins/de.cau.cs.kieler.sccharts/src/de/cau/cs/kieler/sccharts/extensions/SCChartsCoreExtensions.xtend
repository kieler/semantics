/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.extensions

import com.google.common.collect.ImmutableList
import java.util.List
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.SCChartsFactory

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class SCChartsCoreExtensions {
    
    public static val GENERATED_PREFIX = "_"    
    
    def <E> ImmutableList<E> immutableCopy(List<E> list) {
        ImmutableList::copyOf(list) as ImmutableList<E>
    }
    
    def createSCChart() { 
        SCChartsFactory::eINSTANCE.createSCCharts
    }
     
    def EObject getRoot(EObject eObject) {
        if (eObject.eContainer == null) eObject  else eObject.eContainer.root
    }         
    
    def int id(EObject eObject) {
        eObject.hashCode
    }

    def String id(EObject eObject, String string) {
        string + eObject.id
    }

    def String id(String string) {
        GENERATED_PREFIX + string;
    }

    def String removeSpecialCharacters(String string) {
        if (string == null) {
            return null;
        }
        return string.replace("-", "").replace("_", "").replace(" ", "").replace("+", "").replace("#", "").
            replace("$", "").replace("?", "").replace("!", "").replace("%", "").replace("&", "").replace("[", "").
            replace("]", "").replace("<", "").replace(">", "").replace(".", "").replace(",", "").replace(":", "").
            replace(";", "").replace("=", "");
    }

    def String getHierarchicalName(Scope scope) {
        scope.getHierarchicalName(null)
    }

    def String getHierarchicalName(Scope scope, String decendingName) {
        if (scope == null)
            return decendingName
        else {
            var scopeId = "";
            if (scope.id != null) {
                scopeId = scope.id
            } else {
                val parent = (scope.eContainer as Scope);
                if (parent instanceof State) {
                    scopeId = "region" + parent.regions.indexOf(scope)
                }
            }
            return (scope.eContainer as Scope).getHierarchicalName(scopeId + "_" + decendingName)
        }
    }    
    
    def asSCCharts(EObject eObject) {
        eObject as SCCharts
    }
    
    def asState(EObject eObject) {
        eObject as State
    }

    def asControlflowRegion(EObject eObject) {
        eObject as ControlflowRegion
    }
    
    def asDataflowRegion(EObject eObject) {
        eObject as DataflowRegion
    }
    
    def asTransition(EObject eObject) {
        eObject as Transition
    }    
}