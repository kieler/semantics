/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import de.cau.cs.kieler.klighd.LightDiagramLayoutConfig
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.text.SCTXEditor
import java.util.Set
import java.util.WeakHashMap
import org.eclipse.jface.text.TextSelection
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.resource.EObjectAtOffsetHelper
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.util.concurrent.IUnitOfWork

import static extension de.cau.cs.kieler.klighd.kgraph.util.KGraphIterators.*
import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.MemorizingExpandCollapseAction.*

/**
 * Synchronized editor selection with expansion state.
 * 
 * TODO: Reactivate when synthesis is moved to .ide and this hook will only be loaded when .ui is used (Eclipse only).
 * 
 * @author als
 * 
 */
@ViewSynthesisShared
class SmartCollapseHook extends SynthesisHook {

    public static val SynthesisOption SMART_COLLAPSE = SynthesisOption.createCheckOption(
        ExpandCollapseHook, "Editor Context Collapse (Experimental)", false)
        .setCategory(GeneralSynthesisOptions::NAVIGATION)
    
    // ----------------------------------------------------------------------------------------------------------------
    
    static val WeakHashMap<SCTXEditor, SelectionData> SELECTION = new WeakHashMap
    
    static val SELECTION_LISTENER = new SCTXEditor.CursorChangeListener() {
                
        override notifyCursorChange(SCTXEditor source, int pos) {
            try {
                if (SELECTION.containsKey(source)) {
                    val data = SELECTION.get(source)
                    if (data !== null && data.context.getOptionValue(SMART_COLLAPSE) as Boolean) {
                        val regions = source.document.readOnly(new SelectedRegionFinder(source))
                        if (!regions.equals(data.regions)) {
                            data.regions.clear
                            data.regions.addAll(regions)
                            regions.addAllSurroundingRegions

                            for (node : data.context.viewModel.getKNodeIterator(false).filter [
                                data.context.getSourceElement(it) instanceof Region
                            ].toIterable) {
                                val region = data.context.getSourceElement(node) as Region
                                if (regions.contains(region)) {
                                    data.context.viewer.expand(node)
                                } else if (!(data.context.getOptionValue(MEMORIZE_EXPANSION_STATES) as Boolean) || !(region.expansionState?:false)) {
                                    data.context.viewer.collapse(node)
                                }
                            }
                        }
                        
                        new LightDiagramLayoutConfig(data.context).animate(true).performLayout
                    }
                }
            } catch (Exception e) {
                // fail silent   
            }
        }
    }
    
    static class SelectedRegionFinder implements IUnitOfWork<Set<Region>, XtextResource> {
        
        val XtextEditor editor
        static extension EObjectAtOffsetHelper = new EObjectAtOffsetHelper
        
        new(XtextEditor editor) {
            this.editor = editor
        }
        
        override exec(XtextResource state) throws Exception {
            val textSelection = editor?.selectionProvider?.selection as TextSelection
            val selection = newHashSet
            if (textSelection !== null) {
                for (var i = 0; i <= textSelection.length; i++){
                    // TODO Does not work with references
                    var eobj = state.resolveElementAt(textSelection.offset + i)
                    while (eobj !== null) {
                        if (eobj instanceof Region) {
                            selection += eobj
                            eobj = null
                        } else {
                            eobj = eobj.eContainer
                        }
                    }
                }
            }
            return selection
        }
        
    }
    
    static class SelectionData {
        @Accessors val ViewContext context
        @Accessors val Set<Region> regions
        
        new( ViewContext context) {
            this.context = context
            this.regions = newHashSet
        }
    }
    
    // ----------------------------------------------------------------------------------------------------------------

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SMART_COLLAPSE)
    }
    
    override finish(Scope scope, KNode knode) {
        val editor = usedContext.sourceWorkbenchPart
        if (editor instanceof SCTXEditor) {
            if (SMART_COLLAPSE.booleanValue) {
                val data = new SelectionData(usedContext)
                val regions = editor.document.readOnly(new SelectedRegionFinder(editor))
                data.regions.addAll(regions)
                regions.addAllSurroundingRegions
                
                for (node : knode.getKNodeIterator(true).filter[it.associatedObject instanceof Region].toIterable) {
                    val region = node.associatedObject as Region
                    if (regions.contains(region)) {
                        node.initiallyExpand
                    } else if (!MEMORIZE_EXPANSION_STATES.booleanValue || !(region.expansionState?:false)) {
                        node.initiallyCollapse
                    }
                }
                editor.addCursorChangeListener(SELECTION_LISTENER)
                SELECTION.put(editor, data)
            } else {
                SELECTION.remove(editor)
            }
        }
    }
    
    private static def void addAllSurroundingRegions(Set<Region> regions) {
        for (region : regions.immutableCopy) {
            var parent = region.eContainer
            while (parent !== null) {
                if (parent instanceof Region) {
                    regions += parent
                }
                parent = parent.eContainer
            }
        }
    }
    
    private static def associatedObject(KGraphElement kge) {
        return kge.getProperty(KlighdInternalProperties.MODEL_ELEMEMT)
    }
}
