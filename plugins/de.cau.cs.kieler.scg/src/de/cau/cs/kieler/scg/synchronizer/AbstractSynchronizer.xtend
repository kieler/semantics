/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
package de.cau.cs.kieler.scg.synchronizer

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Predecessor
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import java.util.Map
import java.util.Set
import java.util.List
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.guardCreation.AbstractGuardCreator
import de.cau.cs.kieler.kico.AbstractKielerCompilerAuxiliaryData
import de.cau.cs.kieler.scg.Fork

/** 
 * This class is part of the SCG transformation chain. In particular a synchronizer is called by the scheduler
 * whenever multiple threads join again. This abstract class defines the generic interface of a synchronizer 
 * since the scheduler may choose different synchronizers for different tasks.<br>
 * The chain is used to gather important information 
 * about the schedulability of a given SCG. This is done in several key steps. Between two steps the results 
 * are cached in specifically designed metamodels for further processing. At the end of the transformation
 * chain a newly generated (and sequentialized) SCG is returned. <br>
 * You can either call the transformations manually or use the SCG transformation extensions to enrich the
 * SCGs with the desired information.<br>
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					
 *   |-- Basic Block Analysis
 *   |-- Scheduler
 *   |    |-- Graph analyses
 *   |    |-- Scheduling
 *   |    |   |-- Synchonize threads		<== YOU ARE HERE
 *   |    |-- Optimization
 *   |-- Sequentialization (new SCG)
 *       |-- Optimization					
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-11-28 proposed 
 * @kieler.rating 2013-11-28 proposed yellow
 * @abstract
 */
abstract class AbstractSynchronizer {
	
    /** Inject SCG extensions. */    
    @Inject
    extension SCGCoreExtensions
    
    @Inject
    extension SCGControlFlowExtensions	
	
    @Inject
    extension SCGThreadExtensions
    
    @Inject
    extension AnnotationsExtensions	
    
    protected static val ANNOTATION_CONTROLFLOWTHREADPATHTYPE = "cfPathType"
    protected static val ANNOTATION_IGNORETHREAD = "ignore"
	
	protected var KielerCompilerContext compilerContext = null
	protected var Map<Node, SchedulingBlock> schedulingCache = null
	
	protected val newGuards = <Guard> newHashSet
   
    /**
     * This function has to be overwritten in the derived class. It is called by the 
     * {@link #synchronize(Join)} function which is called by the scheduler 
     * and constructs the actual synchronizer.
     * 
     * @param join
     * 			the join node in question
     * @return Returns a {@code SynchronizerData} class which includes all mandatory 
     * 		data to construct a guard expression for the join node in question.
     * @abstract 
     */
    protected abstract def void build(Join join, Guard guard, SchedulingBlock schedulingBlock, SCGraph scg);
    
    public abstract def boolean isSynchronizable(Fork fork, Iterable<ThreadPathType> threadPathTypes, boolean instantaneousFeedback);
    
//    public abstract def Set<Predecessor> getExcludedPredecessors(Join join, Map<Node, SchedulingBlock> schedulingBlockCache, 
//    	List<AbstractKielerCompilerAncillaryData> ancillaryData);
//    	
//    public abstract def Set<Predecessor> getAdditionalPredecessors(Join join, Map<Node, SchedulingBlock> schedulingBlockCache, 
//    	List<AbstractKielerCompilerAncillaryData> ancillaryData);
    
    public abstract def String getId();
    
    /**
     * This function is the entry point for the scheduler. The scheduler calls 
     * {@code synchronize} whenever multiple threads are joined at a join node.
     * 
     * @param join 
     * 			the join node in question
     * @return Returns a {@code SynchronizerData} class which includes all mandatory 
     * 		data to construct a guard expression for the join node in question.
     */
    public def void synchronize(Join join, Guard guard, SchedulingBlock schedulingBlock, SCGraph scg, 
    	AbstractGuardCreator guardCreator, 
    	KielerCompilerContext context, Map<Node, SchedulingBlock> schedulingBlockCache
    ) {
        schedulingCache = schedulingBlockCache
        compilerContext = context
        newGuards.clear
        build(join, guard, schedulingBlock, scg) 
    }    
    
    public def boolean isSynchronizable(Join join) {
        val threadPathTypes = join.getEntryNodes.map[ getStringAnnotationValue(ANNOTATION_CONTROLFLOWTHREADPATHTYPE) ].map[ fromString2 ]
        // TODO: Use actual instantaneous feedback!
        isSynchronizable(join.fork, threadPathTypes, false)
    }
   
    protected def getCachedSchedulingBlock(Node node) {
    	if (schedulingCache == null) { return node.schedulingBlock }
    	schedulingCache.get(node)
    }
    
    protected def getThreadPathTypes(Join join) {
        join.getEntryNodes.map[ getStringAnnotationValue(ANNOTATION_CONTROLFLOWTHREADPATHTYPE) ].map[ fromString2 ]
    }
    
    protected def getEntryNodes(Join join) {
        join.allPrevious.map[ eContainer ].filter(typeof(Exit)).map[ entry ]
    }
    
    public def getNewGuards() {
        return newGuards
    }
}