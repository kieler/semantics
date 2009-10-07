/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.trace.rif;
//package krep.evalbench.trace.rif;
//
//import java.io.Reader;
//
//import org.antlr.runtime.ANTLRReaderStream;
//import org.antlr.runtime.CommonTokenStream;
//import org.eclipse.ui.IWorkbenchPart;
//
//import krep.evalbench.Activator;
//import krep.evalbench.program.IAssembler;
//import krep.evalbench.trace.Trace;
//import krep.evalbench.trace.TraceList;
//import krep.evalbench.ui.views.MessageView;
//
///**
// * @author ctr
// *
// * Trace that is read from a rif file
// */
//public class Rif extends Trace{
//
//    /**
//     * @param asm assembler program that is tested by this trace
//     * @param source name of the rif file
//     */
//    public Rif(IAssembler asm, final String source) {
//	//super(asm, source);
//    }
//
//    /**
//     * @param asm assembler program that is tested by this trace
//     * @param source reader of for the rif file
//     */
//    public Rif(IAssembler asm, final Reader source) {
//	//super(asm, source);
//    }
//
//    private rifParser parser;
//
//    protected boolean parse(final Reader source) {
//	try {
//	    final rifLexer lex = new rifLexer(new ANTLRReaderStream(source));
//	    final CommonTokenStream tokens = new CommonTokenStream(lex);
//	    parser = new rifParser(tokens);
//	    if(parser.parse(this)){
//		return true;
//	    }else{
//		MessageView.print(parser.getErrorMsg());
//		return false;
//	    }
//	} catch (final Exception e) {
//	    // Tools.showDialog(e);
//	    // e.printStackTrace();
//
//	    return false;
//	}
//
//    }
//
//}
