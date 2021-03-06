/*
 * generated by Xtext
 */
package de.cau.cs.kieler.esterel.scest.formatting2;

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Set
import de.cau.cs.kieler.esterel.UnEmit
import de.cau.cs.kieler.esterel.formatting2.EsterelFormatter
import de.cau.cs.kieler.esterel.scest.services.SCEstGrammarAccess
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.scl.Assignment
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.scl.Parallel
import de.cau.cs.kieler.scl.Pause
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.scl.Thread
import org.eclipse.xtext.formatting2.IFormattableDocument

class SCEstFormatter extends EsterelFormatter {
	
	@Inject extension SCEstGrammarAccess

	override dispatch void format(EsterelProgram esterelprogram, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Module modules : esterelprogram.getModules()) {
			format(modules, document);
		}
	}

//	override dispatch void format(EsterelModule esterelmodule, extension IFormattableDocument document) {
//		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		for (Annotation annotations : esterelmodule.getAnnotations()) {
//			format(annotations, document);
//		}
//		for (Declaration declarations : esterelmodule.getDeclarations()) {
//			format(declarations, document);
//		}
//		for (EsterelDeclaration esterelDeclarations : esterelmodule.getEsterelDeclarations()) {
//			format(esterelDeclarations, document);
//		}
//		for (Statement statements : esterelmodule.getStatements()) {
//			format(statements, document);
//		}
//	}

	override dispatch void format(Assignment assignment, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(assignment.getExpression(), document);
	}

	def dispatch void format(UnEmit unemit, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : unemit.getAnnotations()) {
			format(annotations, document);
		}
	}

	def dispatch void format(Set set, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : set.getAnnotations()) {
			format(annotations, document);
		}
		format(set.getExpression(), document);
	}
	
   override dispatch void format(Pause pause, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
        for (Annotation annotations : pause.getAnnotations()) {
            format(annotations, document);
        }
        pause.regionFor.keyword(";")?.prepend[ noSpace ]
    }
    
    override dispatch void format(Parallel parallel, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
        for (Thread threads : parallel.getThreads()) {
            format(threads, document);
        }
        parallel.append[ newLine ]
        parallel.regionFor.keyword("par").prepend[ newLine ]
        parallel.regionFor.keyword("join").prepend[ newLine ]
    }
    
    override dispatch void format(Thread thread, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
        for (Annotation annotations : thread.getAnnotations()) {
            format(annotations, document);
        }
        for (Declaration declarations : thread.getDeclarations()) {
            format(declarations, document);
        }
        for (Statement statements : thread.getStatements()) {
            format(statements, document);
            statements.surround[ indent ]
        }
        
        if (thread.regionFor.keyword("{") !== null) {
            thread.regionFor.keyword("{").append[ newLine ]
        } else {
            thread.prepend[ newLine ]
        }
    }
}
