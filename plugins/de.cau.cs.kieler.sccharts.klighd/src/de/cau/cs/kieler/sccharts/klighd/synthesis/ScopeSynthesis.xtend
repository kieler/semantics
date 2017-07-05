/*  * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.core.model.Log
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.klighd.AbstractSCChartsSynthesis
import de.cau.cs.kieler.sccharts.klighd.SCChartsDiagramProperties
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisHooks
import java.util.LinkedHashSet

import static de.cau.cs.kieler.sccharts.klighd.synthesis.GeneralSynthesisOptions.*
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtension
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

/**
 * Main diagram synthesis for SCCharts.
 * 
 * @author als
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
@ViewSynthesisShared
class ScopeSynthesis extends AbstractSCChartsSynthesis<Scope> {

    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension SCChartsScopeExtensions 
    @Inject extension SCChartsSerializeHRExtension
    @Inject extension AnnotationsExtensions
    @Inject StateSynthesis stateSynthesis
    @Inject ControlflowRegionSynthesis controlflowSynthesis    
    @Inject DataflowRegionSynthesis dataflowSynthesis  
    @Inject TransitionSynthesis transitionSynthesis
        
    @Inject SynthesisHooks hooks  

    static val PRAGMA_SYMBOLS = "symbols"       
    static val PRAGMA_SYMBOL = "symbol"       
    static val PRAGMA_SYMBOLS_GREEK = "greek"
    static val PRAGMA_SYMBOLS_SUBSCRIPT = "subscript"       
    static val PRAGMA_SYMBOLS_MATH_SCRIPT = "math script"       
    static val PRAGMA_SYMBOLS_MATH_FRAKTUR = "math fraktur"       
    static val PRAGMA_SYMBOLS_MATH_DOUBLESTRUCK = "math doublestruck"
    static val PRAGMA_FONT = "font"        
    static val PRAGMA_SKINPATH = "skinpath"
    
    public static val SynthesisOption SHOW_ALL_SCCHARTS = SynthesisOption.createCheckOption("Show all SCCharts", false).
        setCategory(GeneralSynthesisOptions::APPEARANCE)
        
    override getDisplayedActions() {
        return newLinkedList => [ list |
            hooks.allHooks.forEach[list.addAll(getDisplayedActions)];
        ]
    }

    val ID = "de.cau.cs.kieler.sccharts.klighd.synthesis.SCChartsSynthesis"
    
    @Accessors private var String skinPath = ""
       
    override getDisplayedSynthesisOptions() {
        val options = new LinkedHashSet()
        
        // Add categories options
        options.addAll(APPEARANCE, DATAFLOW, LAYOUT, DEBUGGING)
        options.add(SHOW_ALL_SCCHARTS)
        options.add(USE_KLAY)
        options.addAll(dataflowSynthesis.displayedSynthesisOptions)
        
        // Add options of hooks
        hooks.allHooks.forEach[options.addAll(displayedSynthesisOptions)]
        
        return options.toList
    }

    override transform(Scope root) {
        val startTime = System.currentTimeMillis
        
        val rootNode = createNode
                
        //START
        hooks.invokeStart(root, rootNode)
        
        // If dot is used draw edges first to prevent overlapping with states when layout is bad
        usedContext.setProperty(KlighdProperties.EDGES_FIRST, !USE_KLAY.booleanValue)
        
//        val scc = root.getSCCharts
//        clearSymbols
//        for(symbolTable : scc.getStringPragmas(PRAGMA_SYMBOLS)) {  
//            var prefix = ""
//            if (symbolTable.values.size > 1) prefix = symbolTable.values.get(1)
//            if (symbolTable.values.head.equals(PRAGMA_SYMBOLS_GREEK)) { defineGreekSymbols(prefix) }
//            if (symbolTable.values.head.equals(PRAGMA_SYMBOLS_SUBSCRIPT)) { defineSubscriptSymbols(prefix) }
//            if (symbolTable.values.head.equals(PRAGMA_SYMBOLS_MATH_SCRIPT)) { defineMathScriptSymbols(prefix) }
//            if (symbolTable.values.head.equals(PRAGMA_SYMBOLS_MATH_FRAKTUR)) { defineMathFrakturSymbols(prefix) }
//            if (symbolTable.values.head.equals(PRAGMA_SYMBOLS_MATH_DOUBLESTRUCK)) { defineMathDoubleStruckSymbols(prefix) }
//        }             
//        for(symbol : scc.getStringPragmas(PRAGMA_SYMBOL)) {
//            symbol.values.head.defineSymbol(symbol.values.get(1))
//        }
//        if (scc.hasPragma(PRAGMA_SKINPATH)) skinPath = scc.getStringPragmas(PRAGMA_SKINPATH).head.values.head

        if (root instanceof SCCharts) {
            if (SHOW_ALL_SCCHARTS.booleanValue) {
                rootNode.children += root.rootStates.map[ stateSynthesis.transform(it); ]
            } else {
                rootNode.children += stateSynthesis.transform(root.rootStates.head) 
            }
        } else if (root instanceof State) {
            rootNode.children += stateSynthesis.transform(root);
        } else if (root instanceof ControlflowRegion) {
            //Adding all children to the root node will hide the graphical representation of the region itself.
//            rootNode.children += controlflowSynthesis.transform(root).children;
        }
        
        // Add tracking adapter to allow access to source model associations
        val trackingAdapter = new SourceModelTrackingAdapter();
        rootNode.setLayoutOption(SCChartsDiagramProperties::MODEL_TRACKER, trackingAdapter);
        // Since the root node will node use to display the diagram (SimpleUpdateStrategy) the tracker must be set on the children.
        rootNode.children.forEach[eAdapters.add(trackingAdapter)]
        
//        val pragmaFont = scc.getStringPragmas(PRAGMA_FONT).last
//        if (pragmaFont != null) {
//            rootNode.eAllContents.filter(KText).forEach[ fontName = pragmaFont.values.head ]
//        }
        
        hooks.invokeFinish(root, rootNode)

        // Log elapsed time
        Log.log(
            "SCCharts synthesis transformed model " + (root.label ?: root.id) + " in " +
                ((System.currentTimeMillis - startTime) as float / 1000) + "s.")
		
        return rootNode
    }
   
}
