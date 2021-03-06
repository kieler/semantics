/*
 * generated by Xtext
 */
package de.cau.cs.kieler.esterel.formatting2;

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.esterel.Abort
import de.cau.cs.kieler.esterel.Await
import de.cau.cs.kieler.esterel.Block
import de.cau.cs.kieler.esterel.Case
import de.cau.cs.kieler.esterel.Constant
import de.cau.cs.kieler.esterel.ConstantDeclaration
import de.cau.cs.kieler.esterel.ConstantExpression
import de.cau.cs.kieler.esterel.ConstantRenaming
import de.cau.cs.kieler.esterel.DelayExpression
import de.cau.cs.kieler.esterel.Do
import de.cau.cs.kieler.esterel.ElsIf
import de.cau.cs.kieler.esterel.Emit
import de.cau.cs.kieler.esterel.EsterelFunctionCall
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EsterelThread
import de.cau.cs.kieler.esterel.EsterelVariableDeclaration
import de.cau.cs.kieler.esterel.EveryDo
import de.cau.cs.kieler.esterel.Exec
import de.cau.cs.kieler.esterel.ExecCase
import de.cau.cs.kieler.esterel.Exit
import de.cau.cs.kieler.esterel.Function
import de.cau.cs.kieler.esterel.FunctionDeclaration
import de.cau.cs.kieler.esterel.Halt
import de.cau.cs.kieler.esterel.IfTest
import de.cau.cs.kieler.esterel.InputDeclaration
import de.cau.cs.kieler.esterel.InputOutputDeclaration
import de.cau.cs.kieler.esterel.LocalSignalDeclaration
import de.cau.cs.kieler.esterel.LocalVariableDeclaration
import de.cau.cs.kieler.esterel.Loop
import de.cau.cs.kieler.esterel.Nothing
import de.cau.cs.kieler.esterel.OutputDeclaration
import de.cau.cs.kieler.esterel.Present
import de.cau.cs.kieler.esterel.PresentCase
import de.cau.cs.kieler.esterel.Procedure
import de.cau.cs.kieler.esterel.ProcedureCall
import de.cau.cs.kieler.esterel.ProcedureDeclaration
import de.cau.cs.kieler.esterel.Relation
import de.cau.cs.kieler.esterel.RelationDeclaration
import de.cau.cs.kieler.esterel.Renaming
import de.cau.cs.kieler.esterel.Renamings
import de.cau.cs.kieler.esterel.Repeat
import de.cau.cs.kieler.esterel.ReturnDeclaration
import de.cau.cs.kieler.esterel.Run
import de.cau.cs.kieler.esterel.Sensor
import de.cau.cs.kieler.esterel.SensorDeclaration
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.Suspend
import de.cau.cs.kieler.esterel.Sustain
import de.cau.cs.kieler.esterel.Task
import de.cau.cs.kieler.esterel.TaskDeclaration
import de.cau.cs.kieler.esterel.Trap
import de.cau.cs.kieler.esterel.TrapHandler
import de.cau.cs.kieler.esterel.TypeDeclaration
import de.cau.cs.kieler.esterel.TypeDefinition
import de.cau.cs.kieler.esterel.TypeIdentifier
import de.cau.cs.kieler.esterel.Variable
import de.cau.cs.kieler.esterel.extensions.EsterelExtensions
import de.cau.cs.kieler.esterel.services.EsterelGrammarAccess
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scl.Assignment
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.scl.formatting2.SCLFormatter
import org.eclipse.xtext.formatting2.IFormattableDocument

class EsterelFormatter extends SCLFormatter {
	
	@Inject extension EsterelGrammarAccess
    @Inject extension EsterelExtensions

	def dispatch void format(EsterelProgram esterelprogram, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (module : esterelprogram.modules.indexed) {
			format(module.value, document);
			if (module.key > 0) module.value.prepend[ newLine ]
            module.value.regionFor.keyword(":").prepend[ noSpace ].append[ newLine ]
		}
	}

	def dispatch void format(TypeDeclaration typedeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : typedeclaration.getAnnotations()) {
			format(annotations, document);
		}
		for (TypeDefinition types : typedeclaration.types) {
			format(types, document);
			types.append[ noSpace ]
		}
		typedeclaration.append[ newLine ]
	}

	def dispatch void format(ConstantDeclaration constantdeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Constant constants : constantdeclaration.constants()) {
			format(constants, document);
			constants.append[ noSpace ]
		}
        constantdeclaration.append[ newLine ]
	}

	def dispatch void format(Constant constant, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(constant.getInitialValue(), document);
		
		format(constant.getType(), document);
	}

	def dispatch void format(FunctionDeclaration functiondeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : functiondeclaration.getAnnotations()) {
			format(annotations, document);
		}
		for (Function functions : functiondeclaration.functions()) {
			format(functions, document);
			functions.append[ noSpace ]
		}
		
        functiondeclaration.append[ newLine ]
	}

	def dispatch void format(Function function, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (TypeIdentifier parameterTypes : function.getParameterTypes()) {
			format(parameterTypes, document);
		}
		format(function.getReturnType(), document);
	}

	def dispatch void format(ProcedureDeclaration proceduredeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : proceduredeclaration.getAnnotations()) {
			format(annotations, document);
		}
		for (Procedure procedures : proceduredeclaration.procedures) {
			format(procedures, document);
			procedures.append[ noSpace ]
		}
        proceduredeclaration.append[ newLine ]
	}

	def dispatch void format(Procedure procedure, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (TypeIdentifier referenceArguments : procedure.getReferenceArguments()) {
			format(referenceArguments, document);
		}
		for (TypeIdentifier valueArguments : procedure.getValueArguments()) {
			format(valueArguments, document);
		}
	}

	def dispatch void format(TaskDeclaration taskdeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : taskdeclaration.getAnnotations()) {
			format(annotations, document);
		}
		for (Task tasks : taskdeclaration.tasks) {
			format(tasks, document);
			tasks.append[ noSpace ]
		}
        taskdeclaration.append[ newLine ]
	}

	def dispatch void format(Task task, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (TypeIdentifier referenceArguments : task.getReferenceArguments()) {
			format(referenceArguments, document);
		}
		for (TypeIdentifier valueArguments : task.getValueArguments()) {
			format(valueArguments, document);
		}
	}

	def dispatch void format(InputDeclaration inputdeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : inputdeclaration.getAnnotations()) {
			format(annotations, document);
		}
		for (ValuedObject valuedObjects : inputdeclaration.getValuedObjects()) {
			format(valuedObjects, document);
			valuedObjects.append[ noSpace ]
		}
        inputdeclaration.append[ newLine ]
	}

	def dispatch void format(OutputDeclaration outputdeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : outputdeclaration.getAnnotations()) {
			format(annotations, document);
		}
		for (ValuedObject valuedObjects : outputdeclaration.getValuedObjects()) {
			format(valuedObjects, document);
			valuedObjects.append[ noSpace ]
		}
        outputdeclaration.append[ newLine ]
	}

	def dispatch void format(InputOutputDeclaration inputoutputdeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : inputoutputdeclaration.getAnnotations()) {
			format(annotations, document);
		}
		for (ValuedObject valuedObjects : inputoutputdeclaration.getValuedObjects()) {
			format(valuedObjects, document);
			valuedObjects.append[ noSpace ]
		}
        inputoutputdeclaration.append[ newLine ]
	}

	def dispatch void format(ReturnDeclaration returndeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : returndeclaration.getAnnotations()) {
			format(annotations, document);
		}
		for (ValuedObject valuedObjects : returndeclaration.getValuedObjects()) {
			format(valuedObjects, document);
			valuedObjects.append[ noSpace ]
		}
        returndeclaration.append[ newLine ]
	}

	def dispatch void format(SensorDeclaration sensordeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : sensordeclaration.getAnnotations()) {
			format(annotations, document);
		}
		for (ValuedObject valuedObjects : sensordeclaration.getValuedObjects()) {
			format(valuedObjects, document);
			valuedObjects.append[ noSpace ]
		}
        sensordeclaration.append[ newLine ]
	}

	def dispatch void format(Sensor sensor, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(sensor.getType(), document);
	}

	def dispatch void format(RelationDeclaration relationdeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : relationdeclaration.getAnnotations()) {
			format(annotations, document);
		}
		for (Relation relations : relationdeclaration.getRelations()) {
			format(relations, document);
			relations.append[ noSpace ]
		}
        relationdeclaration.append[ newLine ]
	}

	def dispatch void format(EsterelParallel esterelparallel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Statement threads : esterelparallel.statements) {
			format(threads, document);
		}
		esterelparallel.regionFor.keywords("||").forEach[prepend[ newLine ] append[ newLine ]]
	}

	def dispatch void format(EsterelThread esterelthread, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (statement : esterelthread.statements.indexed) {
			format(statement.value, document);
//			if (statement.key > 0) statement.value.prepend[newLine]
//			statement.value.surround[ indent ]
		}
        
        esterelthread.regionFor.keywords(";").forEach[prepend[ noSpace ] append[ newLine ]]
//        esterelthread.regionFor.keywords(esterelThreadAccess.semicolonKeyword_1_1_0).forEach[prepend[ noSpace ]]
//        esterelthread.regionFor.keywords(esterelThreadAccess.semicolonKeyword_2).forEach[prepend[ noSpace ]]
	}

	def dispatch void format(Nothing nothing, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : nothing.getAnnotations()) {
			format(annotations, document);
		}
//		nothing.append[ newLine ]
	}

	def dispatch void format(Halt halt, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : halt.getAnnotations()) {
			format(annotations, document);
		}
//		halt.append[ newLine ]
	}

	def dispatch void format(Block block, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : block.getAnnotations()) {
			format(annotations, document);
		}
		for (Statement statements : block.getStatements()) {
			format(statements, document);
		}
		
//        block.regionFor.keywords(blockAccess.semicolonKeyword_3_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
//        block.regionFor.keywordPairs(blockAccess.leftSquareBracketKeyword_2, blockAccess.rightSquareBracketKeyword_4).head?.interior[ indent ]
//        block.append[ newLine ]
        block.regionFor.keyword(";")?.prepend[ noSpace ]
        block.regionFor.keywordPairs("[", "]").head?.interior[ indent ]
        block.regionFor.keyword("[").append[ newLine ]
        block.regionFor.keyword("]").prepend[ newLine ] 
	}

	def dispatch void format(Emit emit, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : emit.getAnnotations()) {
			format(annotations, document);
		}
		format(emit.getExpression(), document);
//		emit.append[ newLine ]
	}

	def dispatch void format(Sustain sustain, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : sustain.getAnnotations()) {
			format(annotations, document);
		}
		format(sustain.getExpression(), document);
		
//		sustain.append[ newLine ]
	}

	override dispatch void format(Assignment assignment, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(assignment.getExpression(), document);
		
//		assignment.append[ newLine ]
	}

	def dispatch void format(ProcedureCall procedurecall, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : procedurecall.getAnnotations()) {
			format(annotations, document);
		}
		for (Expression valueArguments : procedurecall.getValueArguments()) {
			format(valueArguments, document);
		}
		
//		procedurecall.append[ newLine ]
	}

	def dispatch void format(Present present, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : present.getAnnotations()) {
			format(annotations, document);
		}
		format(present.getExpression(), document);
		for (Statement statements : present.getStatements()) {
			format(statements, document);
			statements.surround[ indent ]
		}
		for (PresentCase cases : present.getCases()) {
			format(cases, document);
			cases.surround[ indent ]
		}
		for (Statement elseStatements : present.getElseStatements()) {
			format(elseStatements, document);
			elseStatements.surround[ indent ]
		}
		
		if (!present.cases?.empty) {
		    present.regionFor.keyword("present").append[ newLine ]
		}
		
		present.regionFor.keyword("then").append[ newLine ]
	    present.regionFor.keyword("else").append[ newLine ]
	    present.regionFor.keyword("end").prepend[ newLine ]
//		present.append[ newLine ]
		
        
//        present.regionFor.keywords(presentAccess.semicolonKeyword_3_1_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
//        present.regionFor.keywords(presentAccess.semicolonKeyword_2_0_1_2_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(PresentCase presentcase, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : presentcase.getAnnotations()) {
			format(annotations, document);
		}
		format(presentcase.getExpression(), document);
		for (Statement statements : presentcase.getStatements()) {
			format(statements, document);
			statements.surround[ indent ]
		}
		
		presentcase.regionFor.keyword("do").append[ newLine ]
		presentcase.append[ newLine ]
		
//        presentcase.regionFor.keywords(presentCaseAccess.semicolonKeyword_3_1_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(IfTest iftest, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : iftest.getAnnotations()) {
			format(annotations, document);
		}
		format(iftest.getExpression(), document);
		for (Statement statements : iftest.getStatements()) {
			format(statements, document);
			statements.surround[ indent ]
		}
		for (ElsIf elseif : iftest.getElseif()) {
			format(elseif, document);
		}
		for (Statement elseStatements : iftest.getElseStatements()) {
			format(elseStatements, document);
			elseStatements.surround[ indent ]
		}
		
		iftest.regionFor.keyword("then").append[ newLine ]
        iftest.regionFor.keyword("else").append[ newLine ]
//        iftest.append[ newLine ]
//        iftest.regionFor.keywords(ifTestAccess.semicolonKeyword_3_2_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
//        iftest.regionFor.keywords(ifTestAccess.semicolonKeyword_5_1_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(ElsIf elsif, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : elsif.getAnnotations()) {
			format(annotations, document);
		}
		format(elsif.getExpression(), document);
		for (Statement statements : elsif.getStatements()) {
			format(statements, document);
			statements.surround[ indent ]
		}
		
		elsif.regionFor.keyword("then").append[ newLine ]
		elsif.append[ newLine ]
		
//        elsif.regionFor.keywords(elsIfAccess.semicolonKeyword_3_1_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(Loop loop, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : loop.getAnnotations()) {
			format(annotations, document);
		}
		for (Statement statements : loop.getStatements()) {
			format(statements, document);
		}
		format(loop.getDelay(), document);
		
        loop.regionFor.keyword("loop").append[ newLine ]
        loop.regionFor.keyword("end").prepend[ newLine ]
        loop.regionFor.keyword("each").prepend[ newLine ]
        loop.regionFor.keywordPairs("loop", "end").head?.interior[ indent ]
        loop.regionFor.keywordPairs("loop", "each").head?.interior[ indent ]
//        loop.append[ newLine ]
		
//        loop.regionFor.keywords(loopAccess.semicolonKeyword_3_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(Repeat repeat, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : repeat.getAnnotations()) {
			format(annotations, document);
		}
		format(repeat.getExpression(), document);
		for (Statement statements : repeat.getStatements()) {
			format(statements, document);
		}
		
		repeat.regionFor.keyword("times").append[ newLine ]
		repeat.regionFor.keywordPairs("times", "end").head?.interior[ indent ]
//		repeat.append[ newLine ]
//        repeat.regionFor.keywords(repeatAccess.semicolonKeyword_5_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(Abort abort, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : abort.getAnnotations()) {
			format(annotations, document);
		}
		for (Statement statements : abort.getStatements()) {
			format(statements, document);
		}
		format(abort.getDelay(), document);
		for (Statement doStatements : abort.getDoStatements()) {
			format(doStatements, document);
		}
		for (Case cases : abort.getCases()) {
			format(cases, document);
		}
		
		if (!abort.cases?.empty) {
		    abort.regionFor.keyword("when").append[ newLine ]
		}
		
        abort.regionFor.keyword("abort").append[ newLine ]
        abort.regionFor.keyword("when").prepend[ newLine ]
        abort.regionFor.keyword("end").prepend[ newLine ]
        abort.regionFor.keyword("do").prepend[ newLine ]
        abort.regionFor.keywordPairs("abort", "when").head?.interior[ indent ]
        abort.regionFor.keywordPairs("do", "end").head?.interior[ indent ]
//        abort.append[ newLine ]
		
//        abort.regionFor.keywords(abortAccess.semicolonKeyword_2_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
//        abort.regionFor.keywords(abortAccess.semicolonKeyword_4_0_1_1_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(Case caseStm, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : caseStm.getAnnotations()) {
			format(annotations, document);
		}
		format(caseStm.getDelay(), document);
		for (Statement statements : caseStm.getStatements()) {
			format(statements, document);
			statements.surround[ indent ]
		}
		
		caseStm.surround[ indent ]
		caseStm.append[ newLine ]
		caseStm.regionFor.keyword("do").append[ newLine ]
	}

	def dispatch void format(Await await, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : await.getAnnotations()) {
			format(annotations, document);
		}
		format(await.getDelay(), document);
		for (Statement statements : await.getStatements()) {
			format(statements, document);
		}
		for (Case cases : await.getCases()) {
			format(cases, document);
			cases.surround[ indent ]
		}
		
		await.regionFor.keyword("do").append[ newLine ]
		await.regionFor.keywordPairs("do", "end").head?.interior[ indent ]
//		await.append[ newLine ]
		
//        await.regionFor.keywords(awaitAccess.semicolonKeyword_2_0_1_1_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(EveryDo everydo, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : everydo.getAnnotations()) {
			format(annotations, document);
		}
		format(everydo.getDelay(), document);
		for (Statement statements : everydo.getStatements()) {
			format(statements, document);
		}
		
		everydo.regionFor.keyword("do").append[ newLine ]
		everydo.regionFor.keywordPairs("do", "end").head?.interior[ indent ]
//		everydo.append[ newLine ]
		
//        everydo.regionFor.keywords(everyDoAccess.semicolonKeyword_4_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(Suspend suspend, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : suspend.getAnnotations()) {
			format(annotations, document);
		}
		for (Statement statements : suspend.getStatements()) {
			format(statements, document);
		}
		format(suspend.getDelay(), document);
		
		suspend.regionFor.keyword("suspend").append[ newLine ]
        suspend.regionFor.keyword("when").prepend[ newLine ]
        suspend.regionFor.keywordPairs("suspend", "when").head?.interior[ indent ]
//        suspend.append[ newLine ]
		
//        suspend.regionFor.keywords(suspendAccess.semicolonKeyword_2_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(Trap trap, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : trap.getAnnotations()) {
			format(annotations, document);
		}
		for (Signal trapSignals : trap.getTrapSignals()) {
			format(trapSignals, document);
		}
		for (Statement statements : trap.getStatements()) {
			format(statements, document);
			statements.surround[ indent ]
		}
		for (TrapHandler trapHandler : trap.getTrapHandler()) {
			format(trapHandler, document);
		}
		
        trap.regionFor.keyword("in").append[ newLine ]
        trap.regionFor.keyword("end").prepend[ newLine ]
        trap.append[ newLine ]
		
//        trap.regionFor.keywords(trapAccess.semicolonKeyword_5_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(TrapHandler traphandler, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : traphandler.getAnnotations()) {
			format(annotations, document);
		}
		format(traphandler.expression, document);
		for (Statement statements : traphandler.getStatements()) {
			format(statements, document);
			statements.surround[ indent ]
		}
		
		traphandler.regionFor.keyword("do").append[ newLine ]
		traphandler.append[ newLine ]
		
//        traphandler.regionFor.keywords(trapHandlerAccess.semicolonKeyword_4_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(Exit exit, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : exit.getAnnotations()) {
			format(annotations, document);
		}
		format(exit.getExpression(), document);
		
//		exit.append[ newLine ]
	}

	def dispatch void format(Exec exec, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : exec.getAnnotations()) {
			format(annotations, document);
		}
		for (Expression valueParameters : exec.getValueParameters()) {
			format(valueParameters, document);
		}
		for (Statement statements : exec.getStatements()) {
			format(statements, document);
		}
		for (ExecCase execCaseList : exec.getExecCaseList()) {
			format(execCaseList, document);
			execCaseList.surround[ indent ]
		}
		
		if (!exec.execCaseList?.empty) {
		    exec.regionFor.keyword("exec").append[ newLine ]
		}
		
		exec.regionFor.keyword("do").append[ newLine ]
		exec.regionFor.keywordPairs("do", "end").head?.interior[ indent ]
//		exec.append[ newLine ]
		
//        exec.regionFor.keywords(execAccess.semicolonKeyword_2_0_9_1_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(ExecCase execcase, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : execcase.getAnnotations()) {
			format(annotations, document);
		}
		for (Expression valueParameters : execcase.getValueParameters()) {
			format(valueParameters, document);
		}
		for (Statement statements : execcase.getStatements()) {
			format(statements, document);
			statements.surround[ indent ]
		}
		execcase.regionFor.keyword("do").append[ newLine ]
		execcase.append[ newLine ]
		
//        execcase.regionFor.keywords(execCaseAccess.semicolonKeyword_11_1_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(LocalSignalDeclaration localsignaldeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : localsignaldeclaration.getAnnotations()) {
			format(annotations, document);
		}
		for (ValuedObject valuedObjects : localsignaldeclaration.getValuedObjects()) {
			format(valuedObjects, document);
		}
		for (Statement statements : localsignaldeclaration.getStatements()) {
			format(statements, document);
		}
		
		localsignaldeclaration.regionFor.keyword("in").append[ newLine ]
		localsignaldeclaration.regionFor.keywordPairs("in", "end").head?.interior[ indent ]
//		localsignaldeclaration.append[ newLine ]
		
//        localsignaldeclaration.regionFor.keywords(localSignalDeclarationAccess.semicolonKeyword_5_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(LocalVariableDeclaration localvariabledeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : localvariabledeclaration.getAnnotations()) {
			format(annotations, document);
		}
		for (EsterelVariableDeclaration variableDeclarations : localvariabledeclaration.getDeclarations()) {
			format(variableDeclarations, document);
		}
		for (Statement statements : localvariabledeclaration.getStatements()) {
			format(statements, document);
		}
		
		localvariabledeclaration.regionFor.keyword("in").append[ newLine ]
        localvariabledeclaration.regionFor.keywordPairs("in", "end").head?.interior[ indent ]
//        localvariabledeclaration.append[ newLine ]
		
//        localvariabledeclaration.regionFor.keywords(localVariableDeclarationAccess.semicolonKeyword_5_0_0_1).forEach[prepend[ noSpace ].append[ newLine ]]
	}

	def dispatch void format(EsterelVariableDeclaration esterelvariabledeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Variable variables : esterelvariabledeclaration.variables()) {
			format(variables, document);
		}
		format(esterelvariabledeclaration.getType(), document);
		
		esterelvariabledeclaration.append[ newLine ]
	}

	def dispatch void format(Variable variable, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(variable.getInitialValue(), document);
	}

	def dispatch void format(Run run, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : run.getAnnotations()) {
			format(annotations, document);
		}
		format(run.getModule(), document);
		for (Renamings renamings : run.getRenamings()) {
			format(renamings, document);
			renamings.prepend[ newLine ].surround[ indent ]
		}
		
		
		run.append[ newLine ]
	}

	def dispatch void format(Renamings renamings, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : renamings.getAnnotations()) {
			format(annotations, document);
		}
		for (Renaming renaming : renamings.getRenamings()) {
			format(renaming, document);
		}
	}

	def dispatch void format(ConstantRenaming constantrenaming, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(constantrenaming.getNewValue(), document);
	}

	def dispatch void format(Do doStm, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : doStm.getAnnotations()) {
			format(annotations, document);
		}
		for (Statement statements : doStm.getStatements()) {
			format(statements, document);
			statements.surround[ indent ]
		}
		format(doStm.getDelay(), document);
		for (Annotation watchingAnnotations : doStm.getWatchingAnnotations()) {
			format(watchingAnnotations, document);
		}
		format(doStm.getWatching(), document);
		for (Statement watchingStatements : doStm.getWatchingStatements()) {
			format(watchingStatements, document);
		}
		
		doStm.regionFor.keyword("do").append[ newLine ]
		doStm.regionFor.keyword("timeout").append[ newLine ]
		doStm.regionFor.keywordPairs("timeout", "end").head?.interior[ indent ]
//		doStm.append[ newLine ]
	}

	def dispatch void format(EsterelFunctionCall esterelfunctioncall, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Expression parameter : esterelfunctioncall.getParameter()) {
			format(parameter, document);
		}
	}

	def dispatch void format(ConstantExpression constantexpression, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(constantexpression.getValue(), document);
	}

	override dispatch void format(OperatorExpression operatorexpression, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Expression subExpressions : operatorexpression.getSubExpressions()) {
			format(subExpressions, document);
		}
	}

	def dispatch void format(DelayExpression delayexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(delayexpr.getDelay(), document);
		format(delayexpr.getExpression(), document);
	}
	
    override dispatch void format(Module module, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
        for (Annotation annotations : module.getAnnotations()) {
            format(annotations, document);
        }
        for (Declaration declarations : module.getDeclarations()) {
            format(declarations, document);
        }
        for (Statement statement : module.getStatements()) {
            format(statement, document);
        }
        
        module.regionFor.keyword(":").append[ newLine ]
        module.regionFor.keyword(".").append[ newLine ]
        module.regionFor.keyword(".").prepend[ newLine ]
        module.regionFor.keyword("end").append[ newLine ]
        module.regionFor.keyword("end").prepend[ newLine ]
    }
}
