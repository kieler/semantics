/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.klighd

import de.cau.cs.kieler.kicool.ui.kitt.synthesis.TracingTreeDiagramSynthesis
import de.cau.cs.kieler.kicool.ui.kitt.update.TracingVisualizationUpdateStrategy
import de.cau.cs.kieler.kicool.ui.klighd.actions.OpenCodeInEditorAction
import de.cau.cs.kieler.kicool.ui.klighd.actions.RemoveChainElementAction
import de.cau.cs.kieler.kicool.ui.klighd.syntheses.CodePlaceHolderSynthesis
import de.cau.cs.kieler.kicool.ui.klighd.syntheses.ModelChainSynthesis
import de.cau.cs.kieler.kicool.ui.klighd.syntheses.XtextSerializationSynthesis
import de.cau.cs.kieler.kicool.ui.synthesis.CodeContainerSynthesis
import de.cau.cs.kieler.kicool.ui.synthesis.EnvironmentSynthesis
import de.cau.cs.kieler.kicool.ui.synthesis.ExecutableContainerSynthesis
import de.cau.cs.kieler.kicool.ui.synthesis.GenericCompilationResultSynthesis
import de.cau.cs.kieler.kicool.ui.synthesis.GenericStringSynthesis
import de.cau.cs.kieler.kicool.ui.synthesis.JavaASTSynthesis
import de.cau.cs.kieler.kicool.ui.synthesis.KASTSynthesis
import de.cau.cs.kieler.kicool.ui.synthesis.KiCoolSynthesis
import de.cau.cs.kieler.kicool.ui.synthesis.MessageObjectListSynthesis
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectAdditionalIntermediateAction
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectIntermediateAction
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectNothing
import de.cau.cs.kieler.kicool.ui.synthesis.actions.SelectParent
import de.cau.cs.kieler.kicool.ui.synthesis.actions.StartExecutableAction
import de.cau.cs.kieler.kicool.ui.synthesis.actions.ToggleProcessorOnOffAction
import de.cau.cs.kieler.kicool.ui.view.registry.DeFocusNodeAction
import de.cau.cs.kieler.kicool.ui.view.registry.FocusNodeAction
import de.cau.cs.kieler.kicool.ui.view.registry.KiCoolRegistrySynthesis
import de.cau.cs.kieler.kicool.ui.view.registry.KiCoolSystemsSynthesis
import de.cau.cs.kieler.klighd.IKlighdStartupHook
import de.cau.cs.kieler.klighd.KlighdDataManager

/**
 * Configuration of KLighD with all registrations for this bundle to work.
 * 
 * @author nre
 */
class KicoolKlighdSetup implements IKlighdStartupHook {
    
    override execute() {
        KlighdDataManager.instance
            .registerAction(SelectIntermediateAction.ID, new SelectIntermediateAction)
            .registerAction(SelectAdditionalIntermediateAction.ID, new SelectAdditionalIntermediateAction)
            .registerAction(ToggleProcessorOnOffAction.ID, new ToggleProcessorOnOffAction)
//            .registerAction(OpenCodeInEditorAction.ID, new OpenCodeInEditorAction)
            .registerAction(RemoveChainElementAction.ID, new RemoveChainElementAction)
            .registerAction(SelectNothing.ID, new SelectNothing)
            .registerAction(SelectParent.ID, new SelectParent)
            .registerAction("de.cau.cs.kieler.ui.view.registry.focusNode", new FocusNodeAction)
            .registerAction("de.cau.cs.kieler.ui.view.registry.deFocusNode", new DeFocusNodeAction)
            .registerAction(StartExecutableAction.ID, new StartExecutableAction)
            .registerUpdateStrategy("de.cau.cs.kieler.kicool.ui.kitt.update.TracingVisualizationUpdateStrategy", new TracingVisualizationUpdateStrategy)
            .registerDiagramSynthesisClass("de.cau.cs.kieler.kicool.ui.synthesis.KiCoolSynthesis", KiCoolSynthesis)
            .registerDiagramSynthesisClass("de.cau.cs.kieler.kicool.ui.synthesis.GenericStringSynthesis", GenericStringSynthesis)
            .registerDiagramSynthesisClass("de.cau.cs.kieler.kicool.ui.synthesis.MessageObjectListSynthesis", MessageObjectListSynthesis)
            .registerDiagramSynthesisClass("de.cau.cs.kieler.kicool.ui.kitt.syntheses.TracingTreeDiagramSynthesis", TracingTreeDiagramSynthesis)
            .registerDiagramSynthesisClass("de.cau.cs.kieler.kicool.ui.klighd.syntheses.ModelChainSynthesis", ModelChainSynthesis)
            .registerDiagramSynthesisClass("de.cau.cs.kieler.kicool.ui.klighd.syntheses.CodePlaceHolderSynthesis", CodePlaceHolderSynthesis)
            .registerDiagramSynthesisClass("de.cau.cs.kieler.kicool.ui.klighd.syntheses.XtextSerializationSynthesis", XtextSerializationSynthesis)
            .registerDiagramSynthesisClass("de.cau.cs.kieler.kicool.ui.synthesis.CodeContainerSynthesis", CodeContainerSynthesis)
            .registerDiagramSynthesisClass("de.cau.cs.kieler.kicool.ui.synthesis.EnvironmentSynthesis", EnvironmentSynthesis)
            .registerDiagramSynthesisClass("de.cau.cs.kieler.kicool.ui.view.registry.KiCoolRegistrySynthesis", KiCoolRegistrySynthesis)
            .registerDiagramSynthesisClass("de.cau.cs.kieler.kicool.ui.synthesis.ExecutableContainer", ExecutableContainerSynthesis)
            .registerDiagramSynthesisClass("GenericCompilationResult", GenericCompilationResultSynthesis)
            .registerDiagramSynthesisClass("de.cau.cs.kieler.kicool.ui.synthesis.KASTSynthesis", KASTSynthesis)
            .registerDiagramSynthesisClass("de.cau.cs.kieler.kicool.ui.view.registry.KiCoolSystemsSynthesis", KiCoolSystemsSynthesis)
            .registerDiagramSynthesisClass("de.cau.cs.kieler.kicool.ui.JavaASTSynthesis", JavaASTSynthesis)
    }
    
}