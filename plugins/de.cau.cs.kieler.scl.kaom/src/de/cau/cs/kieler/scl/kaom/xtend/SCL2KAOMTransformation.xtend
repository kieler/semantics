/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.kaom.xtend

import com.google.inject.Injector
import de.cau.cs.kieler.scl.SCLStandaloneSetup

//import com.google.common.collect.ImmutableList
import com.google.inject.Guice
//import de.cau.cs.kieler.scl.scl.Annotation
import de.cau.cs.kieler.core.annotations.NamedObject 
//import java.util.ArrayList
//import java.util.HashMap

import org.eclipse.xtext.serializer.ISerializer
import org.yakindu.sct.model.stext.stext.Expression


import de.cau.cs.kieler.kaom.Entity
import de.cau.cs.kieler.kaom.KaomFactory

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
//import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject

import de.cau.cs.kieler.scl.extensions.SCLGotoExtensions
import de.cau.cs.kieler.scl.extensions.SCLThreadExtensions
import de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions

import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.Assignment

import de.cau.cs.kieler.kaom.Port
import de.cau.cs.kieler.kaom.Relation
import de.cau.cs.kieler.kaom.Linkable
import java.util.HashMap
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.InstructionStatement


class SCL2KAOMTransformation {
    
    /*
     * Injector and Serializer
     * Needed for SText expression serialization
     */
    private static val Injector i = SCLStandaloneSetup::doSetup();
    private static val ISerializer serializer = i.getInstance(typeof(ISerializer));
    
    
    private var HashMap<Entity, Instruction>Entity2Instruction;
    private var HashMap<Instruction, Entity>Instruction2Entity;

     extension de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions SCLExpressionExtensions = 
            Guice::createInjector().getInstance(typeof(SCLExpressionExtensions))
     extension de.cau.cs.kieler.scl.extensions.SCLGotoExtensions SCLGotoExtensions = 
            Guice::createInjector().getInstance(typeof(SCLGotoExtensions))
     extension de.cau.cs.kieler.scl.extensions.SCLThreadExtensions SCLThreadExtensions = 
            Guice::createInjector().getInstance(typeof(SCLThreadExtensions))
//     extension de.cau.cs.kieler.yakindu.sccharts.scl.xtend.SCCHelper SCCHelper = 
//         Guice::createInjector().getInstance(typeof(SCCHelper))
 
    //-------------------------------------------------------------------------
    //--          S C L  2  K A O M  -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------
           
    // Transform the SCL program into a KAOM netlist model
    def Entity transform(Program program) {
        // initialize mapping
        Entity2Instruction = new HashMap<Entity, Instruction>;
        Instruction2Entity = new HashMap<Instruction, Entity>;
        
        var targetModel = KaomFactory::eINSTANCE.createEntity();
        val statementList = program.statements;
        statementList.transform(targetModel);        
        targetModel
    }
    
    //-------------------------------
    
    def dispatch Entity transform(EList<EObject> eObjectList, Entity containingEntity) {
        val kaomSequence = containingEntity.createCompound;
        kaomSequence.setName("SEQUENCE");
//        val or1 = kaomSequence.createOr;
//        val or2 = kaomSequence.createOr;
//        or1.link(kaomSequence.sel);
//        or2.link(kaomSequence.k1);
//        
//        var firstEntityLinktToGo = false;
//        
//        var Instruction priorInstruction = null;
//        var Entity priorEntity = null;
//        for (eObject : eObjectList) {
//            if (eObject instanceof Instruction) {
//                val instruction = eObject as Instruction;
//                
//                
//                instruction.sequenceConnect(priorEntity, containingEntity);
//                
//                // TODO: The following SHOULD be an Entity!
//                val entity = instruction.transform(kaomSequence) as Entity;
//
//                if (!firstEntityLinktToGo) {
//                    kaomSequence.go.link(entity.go);
//                    firstEntityLinktToGo = true;
//                }
//                
//                entity.sel.link(or1);
//                entity.k1.link(or2);
//                kaomSequence.res.link(entity.res);
//                
//                if (priorInstruction != null) {
//                    // Connect prioInstruction with Instruction
//                    priorEntity.k0.link(entity.go);
//                }
//            
//                priorInstruction = instruction;
//                priorEntity = entity;
//            }
//        }
//        // Connect last instruction
//        priorEntity.k0.link(kaomSequence.k0);
        kaomSequence
    }
    
    //-------------------------------
    
    def dispatch Entity sequenceConnect(Conditional conditional, Entity priorEntity, Entity containingEntity) {
        val or = containingEntity.createOr;
        val and1 = containingEntity.createAnd;
        val and2 = containingEntity.createAnd;
        val not = containingEntity.createNot;
        
        val conditionPort = containingEntity.getPort("C");
        
        conditionPort.link(and1);
        containingEntity.go.link(and1);
        
        conditionPort.link(not);
        not.link(and2);
        containingEntity.go.link(and2);


        // Do the recursion for the containing instruction list
        //TODO
        val entity = conditional.statements.head.transform(containingEntity) as Entity;
        
        and1.link(entity.go);
        containingEntity.res.link(entity.res);
        
        entity.sel.link(containingEntity);
        
        // K0 if entity terminates instantaneously or if implicit else branch
        entity.k0.link(or);
        and2.link(or);
        or.link(containingEntity.k0);
        
        entity.k1.link(containingEntity.k1);
        // The next 
        entity;
    }
    def dispatch Entity  sequenceConnect(Goto goto, Entity priorEntity, Entity containingEntity) {
        val targetStatement = goto.targetStatement;
        if (targetStatement instanceof InstructionStatement) {
            val targetInstructionStatement = targetStatement as InstructionStatement;
            val targetEntity = targetInstructionStatement.instruction.entity;
            priorEntity.sel.link(targetEntity.go);
        }
        // The next prior-entity is NULL for the goto statement (cause control flow will
        // be somewhere totally ELSE after goto took place!)
        null
    }
    def dispatch Entity sequenceConnect(Instruction instruction, Entity priorEntity, Entity containingEntity) {
        // The default case for parallel, pause, and assignments
        
        // TODO: The following SHOULD be an Entity!
        val entity = instruction.transform(containingEntity) as Entity;
        
//        entity.sel.link(or1);
//        entity.k1.link(or2);
//        kaomSequence.res.link(entity.res);
        
         // Connect prioInstruction with Instruction
         priorEntity.k0.link(entity.go);
         entity;
    }
    
    //-------------------------------
    
    def dispatch Entity transform(Pause pause, Entity containingEntity) {
        val kaomPause = containingEntity.createCompound(pause);
        kaomPause.setName("PAUSE");
        val reg = kaomPause.createRegister;
        val and = kaomPause.createAnd;
        val r1 = kaomPause.createRelation;
        val r2 = kaomPause.createRelation;
        
        kaomPause.go.link(r1);
        r1.link(reg);
        kaomPause.res.link(and);
        r1.link(kaomPause.k1);
        reg.link(r2);
        r2.link(and);
        and.link(kaomPause.k0);
        r2.link(kaomPause.sel);
        kaomPause
    }
    
    def dispatch Entity transform(Parallel parallel, Entity containingEntity) {
        val kaomParallel = containingEntity.createCompound(parallel);
        kaomParallel.setName("||");

        val kaomSynchronizer = kaomParallel.createSynchronizer;
        kaomSynchronizer.setName("Synchronizer");
        kaomSynchronizer.k0.link(kaomParallel.k0);
        kaomSynchronizer.k1.link(kaomParallel.k1);

        val or1 = kaomParallel.createOr;
        or1.link(kaomParallel.sel);

        containingEntity.childEntities.add(kaomParallel);
        for (thread : parallel.threads) {
            val or2 = kaomParallel.createOr;
            val not = kaomParallel.createNot;
            
            // TODO: The following SHOULD be an Entity!
            val entity = thread.statements.transform(kaomParallel) as Entity;
            kaomParallel.go.link(entity.go);  
            kaomParallel.res.link(entity.res);  
            entity.k0.link(kaomSynchronizer.i0);
            entity.k1.link(kaomSynchronizer.i1);
            or2.link(not);
            not.link(kaomSynchronizer.iem);
            entity.sel.link(or2);
            kaomParallel.go.link(or2);
            entity.sel.link(or1);
        } 
        kaomParallel
    }
    
//    def dispatch Entity transform(Goto goto, Entity targetModel) {
//        var kaomGoto = targetModel.createCompound(goto);
//        kaomGoto.setName("GOTO");
//        
//        val gotoInstruction = goto.gotoLookUp;
//        val gotoEntity = gotoInstruction.entity;
//        
//        kaomGoto.sel.link(gotoEntity.go);
//        
////        goto.gotoTargetExists(//goto.rootContainer.)
//        
//        targetModel.childEntities.add(kaomGoto);
//        kaomGoto
//    }
    
    def dispatch Entity transform(Assignment assignment, Entity containingEntity) {
        var kaomAssignment = containingEntity.createCompound(assignment);
        val assignmentCopy = assignment.assignment;
        var nodeText = serializer.serialize(assignmentCopy);
        kaomAssignment.setName(nodeText.correctSerialization);
        kaomAssignment
    }
    
//    def dispatch Entity transform(Conditional conditional, Entity targetModel) {
//        var kaomConditional = targetModel.createCompound(conditional);
//
//        val or = kaomConditional.createOr;
//        
//        val and1 = kaomConditional.createAnd;
//        val and2 = kaomConditional.createAnd;
//        val not = kaomConditional.createNot;
//        
//        val conditionPort = kaomConditional.getPort("C");
//        
//        conditionPort.link(and1);
//        kaomConditional.go.link(and1);
//        
//        conditionPort.link(not);
//        not.link(and2);
//        kaomConditional.go.link(and2);
//
//        // TODO: The following SHOULD be an Entity!
//        val entity = conditional.instructions.transform(kaomConditional) as Entity;
//        
//        and1.link(entity.go);
//        kaomConditional.res.link(entity.res);
//        
//        entity.sel.link(kaomConditional.sel);
//        
//        // K0 if entity terminates instantaneously or if implicit else branch
//        entity.k0.link(or);
//        and2.link(or);
//        or.link(kaomConditional.k0);
//        
//        entity.k1.link(kaomConditional.k1);
//        
//        kaomConditional.setName("C?P:Q");
//        targetModel.childEntities.add(kaomConditional);
//        kaomConditional
//    }
//    
//    def dispatch void transform(Object object, Entity targetModel) {
//        // The default case
//    }
    
    //-------------------------------

    def Entity createCompound(Entity containingEntity, Instruction instruction) {
        val entity = containingEntity.createCompound;
        // Create mapping
        entity.mapping(instruction);
        entity;
    }

    def Entity createCompound(Entity containingEntity) {
        val entity = KaomFactory::eINSTANCE.createEntity();
        // Create ports
        entity.go;
        entity.res;
        entity.sel;
        entity.k0;
        entity.k1;
        containingEntity.childEntities.add(entity);
        return entity;
    }

    //-------------------------------

    def Entity createSynchronizer(Entity containingEntity) {
        val entity = KaomFactory::eINSTANCE.createEntity();
        // Create ports
        entity.iem;
        entity.i0;
        entity.i1;
        entity.k0;
        entity.k1;
        containingEntity.childEntities.add(entity);
        return entity;
    }
    
    //-------------------------------
    
    def Port getIn(Entity entity) {entity.getPort("In");}
    def Port getOut(Entity entity) {entity.getPort("Out");}
    def Port getGo(Entity entity) {entity.getPort("Go");}
    def Port getRes(Entity entity) {entity.getPort("Res");}
    def Port getSel(Entity entity) {entity.getPort("Sel");}
    def Port getK0(Entity entity) {entity.getPort("K0");}
    def Port getK1(Entity entity) {entity.getPort("K1");}
    def Port getI0(Entity entity) {entity.getPort("I0");}
    def Port getI1(Entity entity) {entity.getPort("I1");}
    def Port getIem(Entity entity) {entity.getPort("IEM");}
    
    def Port getPort(Entity entity, String name) {
        if (entity.childPorts.filter(e | e.name.equals(name)).nullOrEmpty) {
            // Create port if it has not exist yet
            val port = KaomFactory::eINSTANCE.createPort();
            port.setName(name);
            entity.childPorts.add(port);
        }
        entity.childPorts.filter(e | e.name.equals(name)).head;
    }

    //-------------------------------
    
    def void link(Linkable source, Linkable target) {
        val link = KaomFactory::eINSTANCE.createLink;
        (source.eContainer as Entity).childLinks.add(link);

        if (source instanceof Entity) {
            val port = KaomFactory::eINSTANCE.createPort();
            port.setName("Out");
            (source as Entity).childPorts.add(port);
            link.setSource(port);
        }
        else {
            link.setSource(source);
        }
        if (target instanceof Entity) {
            val port = KaomFactory::eINSTANCE.createPort();
            port.setName("In");
            (target as Entity).childPorts.add(port);
            link.setTarget(port);
        }
        else {
            link.setTarget(target);
        }
    }
    
    //-------------------------------

    def Entity createRegister(Entity containingEntity) {
        val entity = KaomFactory::eINSTANCE.createEntity();
        entity.setName("R");
        containingEntity.childEntities.add(entity);
        return entity;
    }

    def Entity createAnd(Entity containingEntity) {
        val entity = KaomFactory::eINSTANCE.createEntity();
        entity.setName("AND");
        containingEntity.childEntities.add(entity);
        return entity;
    }

    def Entity createOr(Entity containingEntity) {
        val entity = KaomFactory::eINSTANCE.createEntity();
        entity.setName("OR");
        containingEntity.childEntities.add(entity);
        return entity;
    }
    
    def Entity createNot(Entity containingEntity) {
        val entity = KaomFactory::eINSTANCE.createEntity();
        entity.setName("NOT");
        containingEntity.childEntities.add(entity);
        return entity;
    }

    def Relation createRelation(Entity containingRelation) {
        val relation = KaomFactory::eINSTANCE.createRelation();
        containingRelation.childRelations.add(relation);
        return relation;
    }
    
    //-------------------------------
    //-------------------------------

    def void mapping(Entity entity, Instruction instruction) {
        Entity2Instruction.put(entity, instruction);
        Instruction2Entity.put(instruction, entity);
    }
    
    def Instruction getInstruction(Entity entity) {
        return Entity2Instruction.get(entity);
    }

    def Entity getEntity(Instruction instruction) {
        return Instruction2Entity.get(instruction);
    }

    //-------------------------------
    //-------------------------------
    
    def Statement getTargetStatement(Goto goto) {
        val thread = goto.thread;
        val targetLabel = goto.targetLabel;
        val statement = thread.eAllContents.toIterable().
            filter(typeof(Statement)).filter(e | (e as Statement).getLabel.equals(targetLabel)  
                                              && (e as Statement).thread == thread).head;
        statement;
    }
    
    
    def dispatch Thread getThread(Statement statement) {
        if (statement.eContainer instanceof Thread) {
            return statement.eContainer as Thread;
        }
        // Statement is not contained in any thread (e.g., in the Program)
        return null
    }
    
    def dispatch Thread getThread(Instruction instruction) {
        if (instruction.eContainer instanceof Thread) {
            return instruction.eContainer as Thread;
        }
        if (instruction.eContainer instanceof Instruction) {
            return (instruction.eContainer as Instruction).thread 
        }
        if (instruction.eContainer instanceof Statement) {
            return (instruction.eContainer as Statement).thread 
        }
        // Instruction is not contained in any thread
        return null
    } 
}