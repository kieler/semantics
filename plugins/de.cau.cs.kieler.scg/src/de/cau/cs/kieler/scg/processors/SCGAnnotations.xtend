/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.processors

import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.ReferenceAnnotation
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.TagAnnotation
import de.cau.cs.kieler.annotations.registry.AnnotationsType
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import org.eclipse.emf.ecore.EObject

import static de.cau.cs.kieler.annotations.registry.AnnotationsRegistry.*

/** 
 * @author ssm
 * @kieler.design 2016-06-10 ssm als
 * @kieler.rating 2016-04-07 proposed yellow
 * 
 */

class SCGAnnotations {
    
                
    public static val String ANNOTATION_NAME = 
        register("module.name", AnnotationsType.SYSTEM, StringAnnotation, SCGraph, 
            "Stores the mane of the module this SCG is created from.");
    
    public static val ANNOTATION_GUARDCREATOR = 
        register("guardCreator", AnnotationsType.SYSTEM, StringAnnotation, SCGraph, 
            "Marks an SCG as being processed by the guard creator.")

    public static val ANNOTATION_CONDITIONALASSIGNMENT = 
        register("conditional", AnnotationsType.SYSTEM, StringAnnotation, Assignment, 
            "Marks a sequential assignment as being responsible for a conditional expression.")

    public static val ANNOTATION_SEQUENTIALIZED = 
        register("sequentialized", AnnotationsType.SYSTEM, StringAnnotation, SCGraph, 
            "Marks an SCG as being processed by the sequentializer.")
             
    public static val ANNOTATION_HOSTCODE = 
        register("hostcode", AnnotationsType.USER, StringAnnotation, SCGraph,
            "Annotation for target language hostcode.")

    public static val ANNOTATION_CONTROLFLOWTHREADPATHTYPE = 
        register("cfPathType", AnnotationsType.SYSTEM, StringAnnotation, Entry, 
            "Annotation that determines the control flow type of a thread.")

    public static val ANNOTATION_IGNORETHREAD = 
        register("ignoreThread", AnnotationsType.USER, Annotation, Entry, 
            "Orders the synchronizer to ignore a specific thread.")

    public static val ANNOTATION_DEPENDENCYTRANSFORMATION = 
        register("dependencies", AnnotationsType.USER, StringAnnotation, SCGraph, 
            "Marks an SCG as being processed by the dependency transformation.")

    public static val String ANNOTATION_SCPDGTRANSFORMATION = 
        register("scpdg", AnnotationsType.SYSTEM, StringAnnotation, SCGraph, 
            "Marks an SCG as being processed by the SCPDG transformation.")
     
    public static val String ANNOTATION_REGIONNAME = 
        register("regionName", AnnotationsType.SYSTEM, StringAnnotation, Entry, 
            "Annotations an entry node of an SCG with the name of its region.")
    
    public static val String ANNOTATION_LABEL = 
        register("label", AnnotationsType.USER, StringAnnotation, EObject, 
            "Allows the user to override the displayed text of a node.")
    
    public static val String ANNOTATION_BRANCH = 
        register("branch", AnnotationsType.USER, StringAnnotation, Conditional,
            "Allows a user to set the direction of an outgoing conditional branch.")
            
    public static val String ANNOTATION_HEADNODE = 
        register("sbHeadNode", AnnotationsType.SYSTEM, StringAnnotation, EObject, 
            "Indicates scheduling blocks with head nodes.");
            
    public static val ANNOTATION_SSA = 
        register("SSA", AnnotationsType.SYSTEM, StringAnnotation, SCGraph, 
            "Marks an SCG as being in SSA form.")
            
    public static val ANNOTATION_RETURN_NODE = 
        register("isReturn", AnnotationsType.SYSTEM, TagAnnotation, Assignment, 
            "Marks an node as return node.")
            
    public static val ANNOTATION_METHOD_PARAMETER = 
        register("methodParameter", AnnotationsType.SYSTEM, IntAnnotation, ValuedObject, 
            "Marks an node as method parameter assignment.")
            
    public static val ANNOTATION_METHOD_REQUIRES_SELF = 
        register("methodHasSelfParameter", AnnotationsType.SYSTEM, TagAnnotation, MethodDeclaration, 
            "Marks an node as method parameter.")            
            
    public static val ANNOTATION_METHOD_REQUIRES_TICKDATA = 
        register("methodHasTickDataParameter", AnnotationsType.SYSTEM, TagAnnotation, MethodDeclaration, 
            "Marks an node as method parameter.")
                        
    public static val ANNOTATION_METHOD_REFERENCE = 
        register("method", AnnotationsType.SYSTEM, ReferenceAnnotation, SCGraph, 
            "Marks an SCG as a method, referencing its declaration.")
            
    public static val ANNOTATION_METHOD_INLINING = 
        register("inline", AnnotationsType.SYSTEM, TagAnnotation, MethodDeclaration, 
            "Marks a method/method call to be always inlined.")
            
    public static val ANNOTATION_METHOD_LOCAL_VARIABLE = 
        register("methodLocalVar", AnnotationsType.SYSTEM, TagAnnotation, ValuedObject, 
            "Marks an VO as local variable in method.")
            
    public static val ANNOTATION_LOOP = 
        register("loop", AnnotationsType.SYSTEM, StringAnnotation, Node, 
            "Marks a node as a result of a for/while loop.")
}
