/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2024 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server.sccharts.structurebasedediting

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.impl.OperatorExpressionImpl
import de.cau.cs.kieler.kexpressions.impl.ValuedObjectImpl
import de.cau.cs.kieler.kexpressions.impl.ValuedObjectReferenceImpl
import de.cau.cs.kieler.kexpressions.keffects.impl.AssignmentImpl
import de.cau.cs.kieler.kexpressions.kext.KExtStandaloneParser
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.lsp.KGraphDiagramState
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.LSPUtil
import de.cau.cs.kieler.language.server.ILanguageClientProvider
import de.cau.cs.kieler.language.server.KeithLanguageClient
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.impl.SCChartsFactoryImpl
import java.io.ByteArrayOutputStream
import java.util.List
import java.util.Map
import javax.inject.Singleton
import org.eclipse.lsp4j.Position
import org.eclipse.lsp4j.Range
import org.eclipse.lsp4j.TextEdit
import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.sprotty.Action
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.ILanguageServerExtension

/**
 * Structure based editing language server extension for SCCharts. This handles all actions that may be send by the client.
 */
@Singleton
class SCChartsStructureBasedEditingLanguageServerExtension implements ILanguageServerExtension, ILanguageClientProvider {

    @Inject extension SCChartsTransitionExtensions

    @Inject
    extension KGraphLanguageServerExtension

    @Inject KGraphDiagramState diagramState

    /**
     * The language client allows to send notifications or requests from the server to the client.
     * Notifications are preferred, since they allow more asynchronity.
     */
    KeithLanguageClient client

    SCChartsFactoryImpl factory = new SCChartsFactoryImpl

    Position previsionRange

    override initialize(ILanguageServerAccess access) {
        factory = new SCChartsFactoryImpl()
    }

    override setLanguageClient(LanguageClient client) {
        this.client = client as KeithLanguageClient
    }

    override getLanguageClient() {
        return this.client
    }

    /**
     * Finds the range, i.e. the number of lines, in the file currently active in the diagram state of the client.
     * 
     * @param clientId The clientId
     */
    def initCurrentResource(String clientId) {
        val uri = diagramState.getURIString(clientId)
        val resource = getResource(uri);
        val outputStream = new ByteArrayOutputStream
        resource.save(outputStream, emptyMap)
        val codeBefore = outputStream.toString().trim()
        val lines = codeBefore.split("\r\n|\r|\n")
        // The range is the length of the previous file.
        val lastLine = lines.get(lines.length - 1)
        previsionRange = new Position(lines.length, lastLine.length)
    }

    /**
     * Called to add a new transition to a state.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def addNewTransition(AddTransitionAction action, String clientId) {
        initCurrentResource(clientId)

        // get the node corresponding to the selected state on the client. Since the contextmenu was opened for a specific 
        // state we know the id exists and is a state so we can omit a try catch block
        val uri = diagramState.getURIString(clientId)
        val kNode = LSPUtil.getKNode(diagramState, uri, action.id)
        val node = kNode.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as State

        if (node.parentRegion === null) {
            this.client.sendMessage("The root may not have a successor.", "error")
            return
        }
        val new_transition = factory.createTransition()

        // Since trigger and effect are given as strings there may be variables that are not inputs / outputs
        // also we only allow assignments in effects.  
        try {
            changeTrigger(new_transition, action.trigger, uri)
            changeEffect(new_transition, action.effect, uri)
        } catch (ValuedObjectNotFoundException ex) {
            client.sendMessage("During the parsing of the expression " + action.trigger + " the object: " + ex.message +
                " could not be found.", "error")
            return
        } catch (ExpressionParseException ex) {
            client.sendMessage(
                "During the parsing of the expression " + action.effect + " the expression: " + ex.message +
                    " could not be converted to an assignment expression.", "error")
            return
        } catch (NullPointerException ex) {
            client.sendMessage("The expression could not be parsed.", "error")
            return
        }

        // Since the destination was selected it may be a region or a state outside the parent region of the selected node
        try {
            val kDest = LSPUtil.getKNode(diagramState, uri, action.destination)
            val dest = kDest.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as State
            // need to check if the destination is in the same region as the source
            if (dest.parentRegion !== node.parentRegion) {
                client.sendMessage("The selected state is not part of the same region.", "error")
                return
            }
            new_transition.sourceState = node
            new_transition.targetState = dest
        } catch (ClassCastException|NullPointerException ex) {
            // Catching the moment when not a state is selected as destination
            client.sendMessage("The selected element is not a targetable state.", "error")
            return
        }

        updateDocument(uri)
    }

    /**
     * Changes a given transition to a weak transition.
     * 
     * @param action The action to perform.
     * @param clientId The id of the frontend client
     * @param server The diagram server
     */
    def changeToWeak(ChangeToWeakTransitionAction action, String clientId) {
        initCurrentResource(clientId)

        val uri = diagramState.getURIString(clientId)
        val kEdge = LSPUtil.getKEdge(diagramState, uri, action.id)
        val edge = kEdge.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as Transition

        edge.preemption = PreemptionType.WEAK

        updateDocument(uri)
    }

    /**
     * Changes a given transition to a terminating transition.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def changeToTerminating(ChangeToTerminatingTransitionAction action, String clientId) {
        initCurrentResource(clientId)

        val uri = diagramState.getURIString(clientId)
        val kEdge = LSPUtil.getKEdge(diagramState, uri, action.id)
        val edge = kEdge.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as Transition

        edge.preemption = PreemptionType.TERMINATION

        updateDocument(uri)
    }

    /**
     * Changes a given transition to a aborting transition.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def changeToAbort(ChangeToAbortingTransitionAction action, String clientId) {
        initCurrentResource(clientId)

        val uri = diagramState.getURIString(clientId)
        val kEdge = LSPUtil.getKEdge(diagramState, uri, action.id)
        val edge = kEdge.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as Transition

        edge.preemption = PreemptionType.STRONG

        updateDocument(uri)
    }

    /**
     * Changes the trigger and effect of a transition.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def changeIO(ChangeTriggerEffectAction action, String clientId) {
        initCurrentResource(clientId)

        val uri = diagramState.getURIString(clientId)
        val kEdge = LSPUtil.getKEdge(diagramState, uri, action.id)
        var edge = kEdge.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as Transition

        // currently as workaround we delete the edge and add it again since adjusting trigger and effect directly
        // introduces some weird spacing in the updateDocument step
        val prio = edge.priority
        val target = edge.targetState
        val source = edge.sourceState

        val newedge = createTransitionTo(source, target)

        // Since trigger and effect are given as strings there may be variables that are not inputs / outputs
        // also we only allow assignments in effects.  
        try {
            changeTrigger(newedge, action.trigger, uri)
            changeEffect(newedge, action.effect, uri)
            setSpecificPriority(newedge, prio)
        } catch (ValuedObjectNotFoundException ex) {
            client.sendMessage("During the parsing of the expression " + action.trigger + " the object: " + ex.message +
                " could not be found.", "error")
            return
        } catch (ExpressionParseException ex) {
            client.sendMessage(
                "During the parsing of the expression " + action.effect + " the expression: " + ex.message +
                    " could not be converted to an assignment expression.", "error")
            return
        } catch (NullPointerException ex) {
            client.sendMessage("The expression could not be parsed.", "error")
            return
        }
        deleteEdge(kEdge)

        updateDocument(uri)
    }

    /**
     * Method to change the destination of a given transition.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def changeDestination(ChangeTargetStateAction action, String clientId) {
        initCurrentResource(clientId)

        val uri = diagramState.getURIString(clientId)
        val kEdge = LSPUtil.getKEdge(diagramState, uri, action.id)
        val edge = kEdge.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as Transition

        // since the destination is selected by the user it may be inside another region or be no state atall        
        try {
            val kNode = LSPUtil.getKNode(diagramState, uri, action.new_target)
            val node = kNode.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as State
            // checking if the selected state is inside the same region as the source
            if (node.parentRegion !== edge.targetState.parentRegion) {
                client.sendMessage("The selected state is not part of the same region.", "error")
                return
            }

            edge.targetState.incomingTransitions.remove(edge)
            edge.targetState = node

            node.incomingTransitions.add(edge)
        } catch (ClassCastException|NullPointerException ex) {
            // catching the cases where the selected element is not a state
            client.sendMessage("The selected element is not a targetable state.", "error")
            return
        }

        updateDocument(uri)
    }

    /**
     * Method to change the source of a given transition.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def changeSource(ChangeSourceStateAction action, String clientId) {
        initCurrentResource(clientId)

        val uri = diagramState.getURIString(clientId)
        val kEdge = LSPUtil.getKEdge(diagramState, uri, action.id)
        val edge = kEdge.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as Transition

        // we need to check if the selected element is a state and if the selected element is inside the same region
        try {
            val kNode = LSPUtil.getKNode(diagramState, uri, action.new_source)
            val node = kNode.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as State
            // checking the the target and source are in the same region
            if (node.parentRegion !== edge.targetState.parentRegion) {
                client.sendMessage("The selected state is not part of the same region.", "error")
                return
            }

            edge.sourceState.outgoingTransitions.remove(edge)
            edge.sourceState = node

            node.outgoingTransitions.add(edge)
        } catch (ClassCastException|NullPointerException ex) {
            // catching all cases where not a state was selected.
            client.sendMessage("The selected element is not a targetable state.", "error")
            return
        }

        updateDocument(uri)
    }

    /**
     * Method to add an hierarchical state.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def addHirachicalNode(AddHierarchicalStateAction action, String clientId) {
        initCurrentResource(clientId)
        // we need to make sure that the new states name is given
        if (action.state_name.equals("")) {
            this.client.sendMessage("You must provide a state id.", "error")
            return
        }
        val newState = factory.createState()
        val state_id = getId(action.state_name)
        // we need to make sure the new name obeys the rules for state names.
        if (state_id.equals("_") || state_id.equals("")) {
            this.client.sendMessage("The state id needs to have atleast one number or letter in it.", "error")
            return
        }
        // we want to display the desired name as label in the graph
        if (!state_id.equals(action.state_name)) {
            newState.label = action.state_name
        }
        newState.name = state_id
        newState.initial = true

        // Regions follow a laxer definition for id's there may be regions that have no name etc.
        val newRegion = factory.createControlflowRegion()
        if (!action.region_name.equals("")) {
            val region_id = getId(action.region_name)

            if (!region_id.equals(action.region_name))
                newRegion.label = action.region_name

            newRegion.name = region_id
        }

        newRegion.states.add(newState)

        val uri = diagramState.getURIString(clientId)
        val kNode = LSPUtil.getKNode(diagramState, uri, action.id)
        val node = kNode.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as State

        node.regions.add(newRegion)

        updateDocument(uri)
    }

    /**
     * Method to add a concurrent behavior.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def addConcurrentRegion(AddConcurrentRegionAction action, String clientId) {
        initCurrentResource(clientId)

        // To make sure there is a name given for the state.
        if (action.state_name.equals("")) {
            this.client.sendMessage("You must provide a state id.", "error")
            return
        }
        val newState = factory.createState()
        val state_id = getId(action.state_name)
        // we need to make sure the new name obeys the rules for state names.
        if (state_id.equals("_") || state_id.equals("")) {
            this.client.sendMessage("The state id needs to have atleast one number or letter in it.", "error")
            return
        }
        // we want to display the desired name as label in the graph
        if (!state_id.equals(action.state_name)) {
            newState.label = action.state_name
        }
        newState.name = state_id
        newState.initial = true

        // Regions follow a laxer definition for id's there may be regions that have no name etc.
        val newRegion = factory.createControlflowRegion()
        if (!action.region_name.equals("")) {
            val region_id = getId(action.region_name)

            if (!region_id.equals(action.region_name))
                newRegion.label = action.region_name

            if (!(region_id.equals("") || region_id.equals("_")))
                newRegion.name = region_id
        }

        newRegion.states.add(newState)

        val uri = diagramState.getURIString(clientId)
        val kNode = LSPUtil.getKNode(diagramState, uri, action.id)
        val node = kNode.getProperty(KlighdInternalProperties.MODEL_ELEMENT)

        if (node instanceof ControlflowRegion) {
            (node as ControlflowRegion).parentState.regions.add(newRegion)
        }

        updateDocument(uri)
    }

    /**
     * Method to rename states and regions.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def rename(Action action, String clientId) {
        initCurrentResource(clientId)

        val uri = diagramState.getURIString(clientId)
        // We need to differentiate between states and regions
        if (action.kind === RenameStateAction.KIND) {
            val kNode = LSPUtil.getKNode(diagramState, uri, (action as RenameStateAction).id)
            val node = kNode.getProperty(KlighdInternalProperties.MODEL_ELEMENT)
            // we need to make sure the new name obeys the rules for state ids
            if ((action as RenameStateAction).state_name.equals("")) {
                this.client.sendMessage("You must provide a state id.", "error")
                return
            }
            val state_id = getId((action as RenameStateAction).state_name)
            if (state_id.equals("_") || state_id.equals("")) {
                this.client.sendMessage("The state id needs to have atleast one number or letter in it.", "error")
                return
            }
            if (!state_id.equals((action as RenameStateAction).state_name)) {
                (node as State).label = (action as RenameStateAction).state_name
            }
            (node as State).name = state_id

        } else if (action.kind === RenameRegionAction.KIND) {
            val kNode = LSPUtil.getKNode(diagramState, uri, (action as RenameRegionAction).id)
            val node = kNode.getProperty(KlighdInternalProperties.MODEL_ELEMENT)
            // we need to make sure the new name obeys the rules for region names.
            if((action as RenameRegionAction).region_name.equals("")) return

            val region_id = getId((action as RenameRegionAction).region_name)

            if (!region_id.equals((action as RenameRegionAction).region_name)) {
                (node as Region).label = (action as RenameRegionAction).region_name
            }

            (node as Region).name = region_id

        }

        updateDocument(uri)
    }

    /**
     * Method to delete elements ie. Regions, States and Transitions.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def delete(DeleteAction action, String clientId) {
        initCurrentResource(clientId)

        try {
            // for multiple slected elements
            val nodes = action.id.split(":");
            for (x : nodes) {
                this.deleteSingleElem(x, clientId)
            }
        } catch (NullPointerException ex) {
            // single element was send and should be deleted
            this.deleteSingleElem(action.id, clientId)
        }

        val uri = diagramState.getURIString(clientId)

        updateDocument(uri)
    }

    /**
     * Method to add a successor state to a given state.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def addSuccessorState(AddSuccessorStateAction action, String clientId) {
        initCurrentResource(clientId)

        val uri = diagramState.getURIString(clientId)
        val kNode = LSPUtil.getKNode(diagramState, uri, action.id)
        val node = kNode.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as State
        if (node.parentRegion === null) {
            this.client.sendMessage("The root may not have a successor.", "error")
            return
        }

        // we need to make sure a name for the new state is given
        if (action.state_name.equals("")) {
            this.client.sendMessage("You must provide a state id.", "error")
            return
        }
        val newState = factory.createState()
        val state_id = getId(action.state_name)
        // we need to make sure the new name obeys the rules for state id's
        if (state_id.equals("_") || state_id.equals("")) {
            this.client.sendMessage("The state id needs to have atleast one number or letter in it.", "error")
            return
        }
        // we want to display the given name in the graph and have the id only as id
        if (!state_id.equals(action.state_name)) {
            newState.label = action.state_name
        }
        newState.name = state_id

        val new_transition = factory.createTransition()

        // the trigger and effect are given as strings and can therefore can be false.
        // The Variables may not be initialised or the effect may not be an expression that assigns somthing.
        try {
            changeTrigger(new_transition, action.trigger, uri)
            changeEffect(new_transition, action.effect, uri)
        } catch (ValuedObjectNotFoundException ex) {
            client.sendMessage("During the parsing of the expression " + action.trigger + " the object: " + ex.message +
                " could not be found.", "error")
            return
        } catch (ExpressionParseException ex) {
            client.sendMessage(
                "During the parsing of the expression " + action.effect + " the expression: " + ex.message +
                    " could not be converted to an assignment expression.", "error")
            return
        } catch (NullPointerException ex) {
            client.sendMessage("The expression could not be parsed.", "error")
            return
        }

        new_transition.sourceState = node
        new_transition.targetState = newState

        node.parentRegion.states.add(newState)

        updateDocument(uri)
    }

    /**
     * Method to toggle a state to be final or not.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def toggleFinalState(ToggleFinalStateAction action, String clientId) {
        initCurrentResource(clientId)

        val uri = diagramState.getURIString(clientId)
        val kNode = LSPUtil.getKNode(diagramState, uri, action.id)
        val node = kNode.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as State
        if (node.parentRegion === null) {
            this.client.sendMessage("The root may not be final.", "error")
            return
        }
        node.final = !node.final

        updateDocument(uri)
    }

    /**
     * Send from client to server to indicate that the focused tab should be different.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def editSemanticDeclaration(EditSemanticDeclarationAction action, String clientId) {
        val uri = diagramState.getURIString(clientId)
        this.client.sendMessage(uri, "switchEditor")
    }

    /**
     * Makes the desired state initial and changes the old initial state to be normal.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def makeInitialState(MakeInitialStateAction action, String clientId) {
        initCurrentResource(clientId)

        // since the action is triggered with the contextmenu for states the action id is the id of a state and thus we can omit the try catch's
        val uri = diagramState.getURIString(clientId)
        val kNode = LSPUtil.getKNode(diagramState, uri, action.id)
        val newInitial = kNode.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as State
        if (newInitial.parentRegion === null) {
            this.client.sendMessage("The root may not be an initial node.", "error")
            return
        }
        // changes the old initial state to be normal
        for (node : newInitial.parentRegion.states) {
            if(node.initial) node.initial = false
        }

        newInitial.initial = true

        updateDocument(uri)
    }

    /**
     * Method to change a transitions priority.
     * The edge moves up/down the hierarchy and the others are moved up or down by one.
     * 
     * @param action The action to perform.
     * @param clientId The id of the client.
     */
    def changeEdgePriority(ChangePriorityAction action, String clientId) {
        initCurrentResource(clientId)
        val uri = diagramState.getURIString(clientId)
        val kEdge = LSPUtil.getKEdge(diagramState, uri, action.id)
        val edge = kEdge.getProperty(KlighdInternalProperties.MODEL_ELEMENT)
        val priority = Integer.parseInt(action.priority)
        setSpecificPriority(edge as Transition, priority)
        updateDocument(uri)
    }

    /**
     * Helper method to delete a single element.
     * 
     * @param id The element id.
     * @param clientId The id of the client.
     */
    def deleteSingleElem(String id, String clientId) {
        val uri = diagramState.getURIString(clientId)
        // kNode may be states or regions.
        val kNode = LSPUtil.getKNode(diagramState, uri, id)

        if (kNode !== null && kNode.parent !== null) {
            deleteNode(kNode);
        }
        // edges are transitions
        val kEdge = LSPUtil.getKEdge(diagramState, uri, id)
        if (kEdge !== null) {
            deleteEdge(kEdge);
        }
    }

    /**
     * Helper method to delete edges by removing the edge from source and target.
     * 
     * @param kEdge The KEdge to delete.
     */
    def deleteEdge(KEdge kEdge) {
        val edge = kEdge.getProperty(KlighdInternalProperties.MODEL_ELEMENT)
        val source = kEdge.source.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as State
        val target = kEdge.target.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as State

        source.outgoingTransitions.remove(edge)
        target.incomingTransitions.remove(edge)
    }

    /**
     * Helper method to delete nodes or regions.
     * 
     * @param kNode The KNode to delete.
     */
    def void deleteNode(KNode kNode) {
        val node = kNode.getProperty(KlighdInternalProperties.MODEL_ELEMENT)

        if (node instanceof State) {
            // if we delete the last state in a region we instead want to delete the region itself
            if (node.parentRegion.states.length === 1) {
                node.parentRegion.parentState.regions.remove(node.parentRegion)
                return
            }
            // for all incomming edges we need to delete edge and remove it from the source
            for (incommingEdge : kNode.incomingEdges) {

                val source = incommingEdge.source.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as State

                val transitions = source.getOutgoingTransitions()
                val toDelete = newArrayList

                for (transition : transitions) {
                    if (transition.getTargetState() === node) {
                        toDelete.add(transition)
                    }
                }
                for (transition : toDelete) {
                    source.outgoingTransitions.remove(transition)
                }

            }
            // for all outgoing edges we need to delete the edge and remove it from the target
            for (outgoingEdge : kNode.outgoingEdges) {
                val target = outgoingEdge.target.getProperty(KlighdInternalProperties.MODEL_ELEMENT) as State

                val transitions = target.getIncomingTransitions()
                val toDelete = newArrayList

                for (transition : transitions) {
                    if (transition.getSourceState() === node) {
                        toDelete.add(transition)
                    }
                }
                for (transition : toDelete) {
                    target.incomingTransitions.remove(transition)
                }
            }
            // if the node is initial we want to make any other node initial
            if (node.initial) {
                if (node.parentRegion.states.get(0) !== node) {
                    node.parentRegion.states.get(0).initial = true
                } else {
                    node.parentRegion.states.get(1).initial = true
                }

            }
            // finally we want to remove the node from the region. 
            node.parentRegion.states.remove(node)
        } else {
            // in case of regions we want to delete them from the parent state
            (node as ControlflowRegion).parentState.regions.remove(node)
        }

    }

    /**
     * Helper method to change the trigger of an transition.
     * 
     * @param transition The transition
     * @param trigger The trigger
     * @param uri The uri String
     */
    def changeTrigger(Transition transition, String trigger, String uri) {
        if (trigger != "") {
            // may yield nothing and thus throw a nullpointer exception (Handeled when the mehtod is used)
            val newTrigger = KExtStandaloneParser.parseExpression(trigger)

            // The expression may consist of multiple operators
            if ((newTrigger instanceof OperatorExpressionImpl)) {
                changeTriggerSubExpressions(transition, newTrigger, uri)

            } else if (newTrigger instanceof ValuedObjectReferenceImpl) {
                // If there is a valued objectreverence we need to change the reference to the one in the model
                (newTrigger as ValuedObjectReferenceImpl).valuedObject = getValuedObjectReference(diagramState, uri,
                    (newTrigger as ValuedObjectReferenceImpl).valuedObject.name)
            }

            transition.trigger = newTrigger
        }
    }

    /**
     * Helper method to change the valued object references recursively for all valued objects.
     * 
     * @param transition The transition
     * @param trigger The trigger
     * @param uri The uri string
     */
    def void changeTriggerSubExpressions(Transition transition, OperatorExpressionImpl trigger, String uri) {
        for (exp : trigger.subExpressions) {
            // If we have an operator we want to change the subexpressions
            if (exp instanceof OperatorExpressionImpl) {
                changeTriggerSubExpressions(transition, exp, uri)

            } else if (exp instanceof ValuedObjectReferenceImpl) {
                // if we have a object reference we want to change it to the one in the model
                exp.valuedObject = getValuedObjectReference(diagramState, uri, exp.valuedObject.name)
            }
        }
    }

    /**
     * Helper function to change the effect of a transition.
     * 
     * @param transition The transition
     * @param rawEffectString The raw effect string
     * @param uri The uri string
     */
    def changeEffect(Transition transition, String rawEffectString, String uri) {
        // we want to delete any old effects
        transition.effects.removeAll(transition.effects)

        if (rawEffectString != "") {
            // since there may be multiple assignments in a effect we need to split those up before parsing.
            val effectStrings = rawEffectString.split(";")
            for (effectString : effectStrings) {
                try {
                    // may be null if no expression could be generated   
                    val effect = KExtStandaloneParser.parseEffect(effectString);
                    // need to update the valued object since the parser generates dummys
                    // cast can throw a class cast exception since the user input may be no assingment
                    (effect as AssignmentImpl).reference.valuedObject = getValuedObjectReference(diagramState, uri,
                        (effect as AssignmentImpl).reference.valuedObject.name)
                    transition.effects.add(effect)
                } catch (ClassCastException ex) {
                    // simply rethrown for readability in the catch cases outside of method
                    throw new ExpressionParseException(effectString)
                }
            }
        }
    }

    /**
     * Updates the textual representation on the client.
     * For now everything is replaced.
     * 
     * @param uri String uri of resource
     */
    def updateDocument(String uri) {
        val Map<String, List<TextEdit>> changes = newHashMap

        val resource = getResource(uri);

        val outputStream = new ByteArrayOutputStream
        resource.save(outputStream, emptyMap)
        val codeAfter = outputStream.toString().trim()

        // The range is the length of the previous file.
        val Range range = new Range(new Position(0, 0), previsionRange)

        val TextEdit textEdit = new TextEdit(range, codeAfter)
        changes.put(uri, #[textEdit]);

        this.client.replaceContentInFile(uri, codeAfter, range)
    }

    /**
     * Removes all characters that can not be in an id from a string and returns the resulting string.
     * 
     * @param name String name to replace characters in
     * @reurn The same string instance with deletes characters.
     */
    def getId(String name) {
        return name.replaceAll("[^a-zA-Z0-9_]", "")
    }

    static def ValuedObjectImpl getValuedObjectReference(KGraphDiagramState diagramState, String uri, String name) {

        val root = LSPUtil.getRoot(diagramState, uri)
        val node = root.children.get(0).getProperty(KlighdInternalProperties.MODEL_ELEMENT) as State
        for (declaration : node.declarations) {
            for (obj : declaration.valuedObjects) {
                if(obj.name == name) return obj as ValuedObjectImpl
            }
        }
        throw new ValuedObjectNotFoundException(name)
    }

}

/**
 * Simple exception to throw if a valued object could not be found.
 */
class ValuedObjectNotFoundException extends Exception {

    new(String notFound) {
        super(notFound)
    }
}

/**
 * Simple exception for readability when error arises during the parsing of a expression
 */
class ExpressionParseException extends Exception {

    new(String expression) {
        super(expression)
    }

}
