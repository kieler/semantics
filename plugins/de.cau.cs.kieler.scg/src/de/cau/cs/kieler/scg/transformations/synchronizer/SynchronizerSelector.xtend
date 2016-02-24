/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.transformations.synchronizer

import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Singleton
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.UnsupportedSCGException
import java.util.List

/**
 * @author ssm
 * @kieler.design 2014-09-24 proposed 
 * @kieler.rating 2014-09-24 proposed yellow
 *
 */
 @Singleton
class SynchronizerSelector {
    
    @Inject
    extension SCGControlFlowExtensions  
    
    @Inject
    extension SCGThreadExtensions
    
    @Inject
    extension AnnotationsExtensions 
    
    protected static val ANNOTATION_CONTROLFLOWTHREADPATHTYPE = "cfPathType"    
    protected static val ANNOTATION_IGNORETHREAD = "ignore"
    public static val ANNOTATION_SELECTEDSYNCHRONIZER = "synchronizer"

    protected val List<Class<? extends AbstractSynchronizer>> SYNCHRONIZER_LIST = <Class<? extends AbstractSynchronizer>> newArrayList(
        typeof(DepthJoin2Synchronizer),
        typeof(InstantaneousSynchronizer),
        typeof(DepthSynchronizer),
        typeof(SurfaceSynchronizer),
        typeof(DepthJoinSynchronizer),
        typeof(SurfaceSynchronizer)
    )
    protected val DEFAULT_SYNCHRONIZER = typeof(SurfaceSynchronizer)
    
    protected val synchronizerInstances = <AbstractSynchronizer> newArrayList
    private var AbstractSynchronizer defaultSynchronizer = null
    
    new() {
        for(synchronizerClass : SYNCHRONIZER_LIST) {
            val synchronizer = Guice.createInjector().getInstance(synchronizerClass)
            synchronizerInstances += synchronizer
            if (synchronizerClass == DEFAULT_SYNCHRONIZER) {
                defaultSynchronizer = synchronizer
            }
        }        
    }
    
    public def AbstractSynchronizer chooseSynchronizer(Join join) {
        val threadPathTypes = join.getEntryNodes.filter[ !hasAnnotation(ANNOTATION_IGNORETHREAD) ].
        map[ getStringAnnotationValue(ANNOTATION_CONTROLFLOWTHREADPATHTYPE) ].map[ fromString2 ].toList
        for(synchronizer : synchronizerInstances) {
            if (synchronizer.isSynchronizable(join.fork, threadPathTypes, false)) {
                return synchronizer
            }
        }
        
        return defaultSynchronizer
    }
    
    protected def getEntryNodes(Join join) {
        join.allPrevious.map[ eContainer ].filter(typeof(Exit)).map[ entry ]
    }   
    
    public def AbstractSynchronizer annotate(AbstractSynchronizer synchronizer, Join join) {
        join.createStringAnnotation(ANNOTATION_SELECTEDSYNCHRONIZER, synchronizer.getId)
        synchronizer
    } 
    
    public def AbstractSynchronizer getSynchronizer(String id) {
        for(synchronizer : synchronizerInstances) {
            if (synchronizer.getId == id) {
                return synchronizer
            }
        }
        
        throw new UnsupportedSCGException("Synchronizer Id not found: "+id)
    }
    
    public def AbstractSynchronizer getSynchronizer(Join join) {
        val id = join.getStringAnnotationValue(ANNOTATION_SELECTEDSYNCHRONIZER)
        if (id == "") {
            return defaultSynchronizer;
        } else {
            return id.getSynchronizer
        }
    }
}