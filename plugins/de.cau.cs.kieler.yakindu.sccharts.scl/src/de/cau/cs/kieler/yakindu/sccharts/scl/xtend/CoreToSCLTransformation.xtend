package de.cau.cs.kieler.yakindu.sccharts.scl.xtend

import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.scl.extensions.SCLCreateExtensions
import de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions
import de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions
import de.cau.cs.kieler.scl.extensions.SCLNamingExtensions
import de.cau.cs.kieler.scl.extensions.SCLOrderingExtensions
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
import java.util.ArrayList
import javax.inject.Inject
import org.yakindu.sct.model.sgraph.Event
import org.yakindu.sct.model.sgraph.Region
import org.yakindu.sct.model.sgraph.Statechart

import static de.cau.cs.kieler.yakindu.sccharts.scl.xtend.CoreToSCLTransformation.*

class CoreToSCLTransformation {
    
    @Inject
    extension SCLFactoryExtensions
    @Inject
    extension SCLCreateExtensions
    @Inject
    extension SCLOrderingExtensions
    @Inject
    extension SCLNamingExtensions
    @Inject
    extension SCLStatementExtensions
    @Inject
    extension SCCHelper         
    @Inject
    extension CoreToSCLOptimization
         
    public static int OPTIMIZE_NONE             = 0
    public static int OPTIMIZE_GOTO             = 1
    public static int OPTIMIZE_LABEL            = 2
    public static int OPTIMIZE_SELFLOOP         = 4
    public static int OPTIMIZE_STATEPOSITION    = 8
    public static int OPTIMIZE_ALL              = 
                                                  OPTIMIZE_GOTO + 
                                                  OPTIMIZE_LABEL + 
                                                  OPTIMIZE_SELFLOOP; 
//                                                  OPTIMIZE_STATEPOSITION;         
 
 
    def boolean optimize(int oFlags, int optimization) {
        oFlags.bitwiseAnd(optimization) > 0
    }
    //-------------------------------------------------------------------------
    //--          C O R E   TO   S C L -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------
           
    // Transforming SCC Aborts.
    def Program transformCoreToSCL(Statechart rootStatechart, int optimizationFlags) {
        var targetProgram = SclFactory::eINSTANCE.createProgram();
       
//        rootStatechart.statechartDistributePriorities
       
        val mainState = rootStatechart.regions.get(0).vertices.get(0) as SyncState
       
        targetProgram.setName(mainState.name)

        for(declaration : mainState.scopes.get(0).declarations) {
           targetProgram.declarations.add(createVariableDeclaration(declaration as Event));
        }
        var iS = transformCoreState(mainState, optimizationFlags)        
//        if (optimizationFlags.optimize(OPTIMIZE_GOTO)) { iS = iS.optimizeGoto }
//        if (optimizationFlags.optimize(OPTIMIZE_LABEL)) { iS = iS.optimizeLabel }
        targetProgram.statements.addAll(iS)
       
        targetProgram
    }

    def ArrayList<Statement> transformCoreRegion(Region region, int optimizationFlags) {
        var iS = createNewStatementList()
        val states = ImmutableList::copyOf(region.getVertices.filter(typeof(SyncState))).
          sort(e1, e2 | compareSCLRegionStateOrder(e1, e2))

//        if (region.getName() != null) {
//           iS.add((createSCLComment(region.getName()))
//        }

        var stateInstructions = new ArrayList<ArrayList<Statement>>
        for (state : states) {
            Debug(state.getHierarchicalName(""))
            stateInstructions.add(transformCoreState(state, optimizationFlags))
        }
        
        if (optimizationFlags.optimize(OPTIMIZE_STATEPOSITION)) {
            stateInstructions = stateInstructions.optimizeStateSetPosition
        }
        for(stateSet : stateInstructions) {
            iS.addAll(stateSet)
        }
        
        if (optimizationFlags.optimize(OPTIMIZE_GOTO)) { iS = iS.optimizeGoto }
        if (optimizationFlags.optimize(OPTIMIZE_LABEL)) { iS = iS.optimizeLabel }
        iS
    }
    
    def ArrayList<Statement> transformCoreState(SyncState state, int optimizationFlags) {
        var iS = createNewStatementList()
        val stateID = state.getHierarchicalName("")
        
//        iS.addInstruction(createSCLComment("-- Begin of state "+state.getName()+" --"))
//        iS.addInstruction(createSCLLabel(stateID));
        
        if (state.isComposite()) {
            // COMPOSITE STATE         
            
            if (state.getRegions().size<2) {
                var regionInstructions =  transformCoreRegion(state.getRegions().head, optimizationFlags)
                iS.addAll(regionInstructions)
            } else {
                var parallel = SclFactory::eINSTANCE.createParallel();
                for(stateRegion : state.getRegions()) {
                    val regionInstructions = transformCoreRegion(stateRegion, optimizationFlags)
                    parallel.getThreads().add(createSCLThread(regionInstructions))
                }
                iS.add(parallel.createStatement)
            }
            
            for(transition : state.getNormalterminations) {
              val targetState = transition.target as SyncState 
              
              val effect = transition.getEffect()
              if (effect != null) {
                  iS.addAll(createSCLAssignment(effect).createStatements)
              }
              
              var goto = createSCLGoto(targetState.getHierarchicalName(""))
              iS.add(goto.createStatement)
            }
             
        } else {
            // NON COMPOSITE STATE
        
            if (state.isFinal) {
                // FINALE STATE
                
            } else {
                // STATE IS NOT A FINAL STATE
                iS.addAll(state.transformStateTransitions(optimizationFlags))
            } // isFinal
        
        } // isComposite
       
        if (iS.size==0) {
            iS.add(createSCLEmptyStatement)
        }
        iS.head.label = stateID;
        iS;        
    }
    
    
    def ArrayList<Statement> transformStateTransitions(SyncState state, int optimizationFlags) {
        var iS = createNewStatementList()
        
        val transitions = state.outgoingTransitions.filter(typeof(SyncTransition))
        val immediateTransitions = ImmutableList::copyOf(transitions.filter(e | e.isImmediate))
        var selfTransitions = transitions.filter(e | 
            (e.target instanceof SyncState) && ((e.target as SyncState) == state))
            
        var boolean defaultTransition = false

        var immediateIS = createNewStatementList()    
     
        for(transition : immediateTransitions) {
                val targetStatements = transformStateTransition(transition)
                if (targetStatements.head?.getInstruction instanceof Goto) { defaultTransition = true; }
                immediateIS.addAll(targetStatements)
        }
                
        if (transitions.size <= immediateTransitions.size) {
            var selfInstructions = createNewStatementList()
            if (!defaultTransition) {
                selfInstructions.add(createSCLPause.createStatement)
                selfInstructions.add(createSCLGoto(state.getHierarchicalName("")).createStatement)
            }
            if (optimizationFlags.optimize(OPTIMIZE_SELFLOOP) &&
               ((transitions.size==2 && selfTransitions.size==1 && selfTransitions.head.trigger == null) ||
                (transitions.size==1 && selfTransitions.size!=1))) {
                iS.addAll(optimizeSelfLoop(immediateIS, selfInstructions));
            } else {
                iS.addAll(immediateIS)
                iS.addAll(selfInstructions)            
            }
            
            return iS;
        }
        
        iS.addAll(immediateIS)
        iS.add(createSCLPause.createStatement);
        
        if (optimizationFlags.optimize(OPTIMIZE_SELFLOOP) &&
           ((transitions.size==2 && selfTransitions.size==1 && selfTransitions.head.trigger == null) ||
            (transitions.size==1 && selfTransitions.size!=1))) {
            var targetStatements = transformStateTransition(
                transitions.filter(e | ((e.target) instanceof SyncState) &&
                    ((e.target as SyncState) != state
                )
                ).head
            )
            if (targetStatements.last?.getInstruction instanceof Goto) {
                iS.addAll(targetStatements);
            } else {
                var ArrayList<Statement> selfInstructions = null;
                
                if (selfTransitions.size==1) {
                    selfInstructions = transformStateTransition(selfTransitions.head)
                } else {
                    selfInstructions = createNewStatementList()
                    selfInstructions.add(createSCLGoto(state.getHierarchicalName("")).createStatement)
                }
                
                iS.addAll(optimizeSelfLoop(targetStatements, selfInstructions));
            } 
        } else {
            for (transition : transitions) {
                val targetStatements = transformStateTransition(transition)
                if (targetStatements.last?.getInstruction instanceof Goto) { defaultTransition = true; }
                iS.addAll(targetStatements)
            }
            if (!defaultTransition) {
                iS.add(createSCLGoto(state.getHierarchicalName("")).createStatement);
            }
        }
        
        iS
    }
    
    def ArrayList<Statement> transformStateTransition(SyncTransition transition) {
        var iS = createNewStatementList()
        val targetState = transition.target as SyncState
        val transitionEffect = transition.getEffect()
        val transitionTrigger = transition.getTrigger()
        var targetGoto = createSCLGoto(targetState.getHierarchicalName(""))
        if (transitionTrigger.exists) {
            var conditional = createSCLConditional(transitionTrigger)
            if (transitionEffect.exists) {
                val transitionAssignments = createSCLAssignment(transitionEffect)
                conditional.statements.addAll(transitionAssignments.createStatements)
            }
            conditional.statements.add(targetGoto.createStatement)
            iS.add(conditional.createStatement)
        } else {
            if (transitionEffect.exists) {
                val transitionAssignments = createSCLAssignment(transitionEffect)
                iS.addAll(transitionAssignments.createStatements)
            }
            iS.add(targetGoto.createStatement)
        }
        iS;
    }
     
}