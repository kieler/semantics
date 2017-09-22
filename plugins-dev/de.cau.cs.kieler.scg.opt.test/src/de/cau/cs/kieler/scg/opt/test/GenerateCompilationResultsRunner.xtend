/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.opt.test
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.ecore.EObject
import org.junit.runners.model.FrameworkMethod
import org.junit.runners.model.InitializationError
import org.junit.runners.model.Statement
import org.osgi.framework.Bundle
import com.google.common.collect.Lists
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.kexpressions.text.kext.Kext
import de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kico.CompilationResult
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompilerSelection
import de.cau.cs.kieler.sccharts.impl.StateImpl
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.impl.SCGraphImpl
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner
import de.cau.cs.kieler.scg.impl.AssignmentImpl
import java.io.FileWriter
import java.io.BufferedWriter
import java.io.PrintWriter
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.impl.ControlflowRegionImpl
import de.cau.cs.kieler.scg.impl.ControlFlowImpl
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.sccharts.State

class GenerateCompilationResultsRunner extends ModelCollectionTestRunner {
	public static String KEXT_CHECK_ANNOTATION="check"
	public static String KEXT_EXPECT_ANNOTATION="expect"
	static FileWriter fw = new FileWriter("/tmp/results.csv", true);
    static BufferedWriter bw = new BufferedWriter(fw);
    static PrintWriter out = new PrintWriter(bw)
	ArrayList<Result> results=new ArrayList()
	/** 
	 * @param clazz
	 * @throws Throwable
	 */
	new(Class<?> clazz) throws Throwable {
		super(clazz)
	}
	
	override protected void runTestRunnerForModel(Object object, String modelName) throws Throwable {
		if (object instanceof StateImpl) {
		    var long startTime;
		    var long endTime;
			var StateImpl obj=(object as StateImpl)
			addResults(obj, modelName, "model")
			// count startspace
			// first compile to sequenzialized scg
			startTime = System.nanoTime()
			var SCGraph seq=sequenzializedSCG(obj) 
			endTime = System.nanoTime()
			addResults(seq, modelName, "compile", endTime - startTime);
			var seqCompSize = CompileAndBytecodeSize(seq);
			// compile with feature
			startTime = System.nanoTime()
			var SCGraph cp=cp(seq)
			endTime = System.nanoTime()
			addResults(cp, modelName, "cp", endTime - startTime);
			startTime = System.nanoTime()
			var SCGraph rv=rv(seq)
            endTime = System.nanoTime()
            addResults(rv, modelName, "rv", endTime - startTime);
            startTime = System.nanoTime()
            var SCGraph cprv=cprv(seq)
            endTime = System.nanoTime()
            addResults(cprv, modelName, "cprv", endTime - startTime);
            startTime = System.nanoTime()
            var SCGraph rvcp=rvcp(seq)
            endTime = System.nanoTime()
            addResults(rvcp, modelName, "rvcp", endTime - startTime);
			
			// write results to file
			var print = modelName
			for(result : results) {
			    // id;nodes;assignments;declarations
			    print += ";" + result.id + ";" + result.nodes + ";" + result.assigments + ";" + result.declarations + ";" + result.duration.toString().replace(".", ",")
			}
			out.println(print)
			out.flush()
			bw.flush()
			fw.flush()
			results.clear()
		}
	}
	def private void addResults(StateImpl in, String modelName, String id) {
	    var Result base=new Result() 
        base.id=id
        if(in != null) {
            base.nodes = countStates(in.regions) // states
            base.declarations = CountDeclarations(in.declarations)
            base.assigments = CountTransitions(in.regions) // transitions 
        }
        base.duration = 0
        
        if(results == null) {
            results = new ArrayList()
        }
        
        results.add(base)
	}
	def private int CountTransitions(EList<Region> list) {
	    var int count = 1
        val countList = new ArrayList<Integer>()
        
        list.forEach[
            if(it instanceof ControlflowRegionImpl) {
               var cfr = it as ControlflowRegionImpl
               cfr.states.forEach[
                    countList.add(it.incomingTransitions.size)
                    if(it.regions != null) {
                       countList.add(CountTransitions(it.regions))
                   }
               ]
            }
        ]
        
        for(var i = 0; i < countList.size; i++) {
            count += countList.get(i)
        }
        
        return count
	}
	def private int countStates(EList<Region> list) {
	    var int count = 0
	    val countList = new ArrayList<Integer>()
	    
	    list.forEach[
	        if(it instanceof ControlflowRegionImpl) {
	           var cfr = it as ControlflowRegionImpl
	           countList.add(cfr.states.size)
	           cfr.states.forEach[
	               if(it.regions != null) {
	                   countList.add(countStates(it.regions))
	               }
	           ]
	        }
	    ]
	    
	    for(var i = 0; i < countList.size; i++) {
	        count += countList.get(i)
	    }
	    
	    return count
	}
	def private void addResults(SCGraph in, String modelName, String id, long duration) {
		var Result base=new Result() 
		base.id=id 
		if(in != null) {
            base.nodes=in.getNodes().size()
            base.declarations=CountDeclarations(in.declarations)
            base.assigments=CountAssignments(in)
		}
		base.duration = (duration as double) / 1000000
		
		if(results == null) {
		    results = new ArrayList()
		}
		
		results.add(base)
	}
	def int CountAssignments(SCGraph in) {
		return in.nodes.filter(typeof(AssignmentImpl)).filter[
                    it.operator.getName().equals("ASSIGN")
                ].filter[
                    if(it.valuedObject == null) {
                        return false
                    }
                    return (it.valuedObject.getName().startsWith("g") || it.valuedObject.getName().startsWith("PRE_g"))
                ].size
	}
	def int CountDeclarations(State in) {
	    val countList = new ArrayList<Integer>()
	    var count = 0
	    
	    countList.add(CountDeclarations(in.declarations))
	    
	    in.regions.forEach[
	        countList.add(CountDeclarations(it.declarations))
	        if(it instanceof ControlflowRegionImpl) {
	            val cfr = it as ControlflowRegionImpl
	            cfr.states.forEach[
	                countList.add(CountDeclarations(it))
	            ]
	        }
	    ]
	    
	    for(var i = 0; i < countList.size; i++) {
	        count = countList.get(i)
	    }
	    return count
	}
	def int CountDeclarations(EList<Declaration> decl) {
        var count = 0;
        for(var i = 0; i < decl.size; i++) {
            val tmpDecl = decl.get(i)
            count += tmpDecl.valuedObjects.size
        }
        return count
    }
	def private SCGraph sequenzializedSCG(StateImpl obj) {
		var ArrayList<String> features=new ArrayList<String>() 
		features.add("scg.sequentialize") 
		var ArrayList<String> disabled=new ArrayList<String>()
		disabled.add("SIMULATIONVISUALIZATION")
		var KielerCompilerContext context=new KielerCompilerContext(features,disabled,new ArrayList<String>(),new ArrayList<String>(),new ArrayList<String>(),obj) 
		context.setAdvancedSelect(true) 
		var CompilationResult res=KielerCompiler.compile(context) 
		var Object ret=res.getObject() 
		return (ret as SCGraph) 
	}
	def private SCGraph cp(SCGraph obj) {
		var ArrayList<String> features=new ArrayList<String>() 
		features.add("opt.cp") 
		var KielerCompilerContext context=new KielerCompilerContext(features,new ArrayList<String>(),new ArrayList<String>(),new ArrayList<String>(),new ArrayList<String>(),obj) 
		context.setAdvancedSelect(false) 
		var CompilationResult res=KielerCompiler.compile(context) 
		var Object ret=res.getObject() 
		return (ret as SCGraph) 
	}
	def private SCGraph rv(SCGraph obj) {
		var ArrayList<String> features=new ArrayList<String>() 
		features.add("opt.rv") 
		var KielerCompilerContext context=new KielerCompilerContext(features,new ArrayList<String>(),new ArrayList<String>(),new ArrayList<String>(),new ArrayList<String>(),obj) 
		context.setAdvancedSelect(false) 
		var CompilationResult res=KielerCompiler.compile(context) 
		var Object ret=res.getObject() 
		return (ret as SCGraph) 
	}
	def private SCGraph cprv(SCGraph obj) {
		return rv(cp(obj)) 
	}
	def private SCGraph rvcp(SCGraph obj) {
		return cp(rv(obj)) 
    }
    def private int CompileAndBytecodeSize(SCGraph obj) {
        var ArrayList<String> features=new ArrayList<String>() 
        features.add("s.java") 
        var KielerCompilerContext context=new KielerCompilerContext(features,new ArrayList<String>(),new ArrayList<String>(),new ArrayList<String>(),new ArrayList<String>(),obj) 
        context.setAdvancedSelect(false) 
        var CompilationResult res=KielerCompiler.compile(context) 
        var Object ret=res.getObject()
        var tmp = ret;
        return 0;
    }
}