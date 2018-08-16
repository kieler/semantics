/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.ide.CompilerViewUtil
import de.cau.cs.kieler.klighd.IOffscreenRenderer
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.sccharts.impl.SCChartsImpl
import de.cau.cs.kieler.scg.impl.SCGraphsImpl
import java.io.ByteArrayOutputStream
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.lsp4j.jsonrpc.validation.NonNull
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.xtext.ide.server.concurrent.RequestManager
import org.eclipse.xtext.resource.XtextResourceSet
import de.cau.cs.kieler.scl.impl.SCLProgramImpl
import de.cau.cs.kieler.esterel.impl.EsterelProgramImpl
import de.cau.cs.kieler.lustre.lustre.impl.LustreProgramImpl
import de.cau.cs.kieler.kexpressions.kext.impl.KextImpl

/**
 * @author sdo
 * 
 */
class KeithLanguageServerExtension implements ILanguageServerExtension, CommandExtension {

    protected static val LOG = Logger.getLogger(KeithLanguageServerExtension)
    
    @Inject @Accessors(PUBLIC_GETTER) RequestManager requestManager
    
    @Inject
    Injector injector
    
    protected Map<String, List<Snapshot>> snapshotMap = new HashMap<String, List<Snapshot>>
    protected Map<String, List<Object>> objectMap = new HashMap<String, List<Object>>

    protected extension ILanguageServerAccess languageServerAccess
    
    var Class<?> modelClassFilter
    
    override initialize(ILanguageServerAccess access) {
        this.languageServerAccess = access
    }
    def ILanguageServerAccess getLanguageServerAccess() {
        languageServerAccess
    }
    
    override compile(String uri, String command) {
        var string = uri
        
        this.snapshotMap.put(uri, new LinkedList)
        this.objectMap.put(uri, new LinkedList)
        
        if (string.startsWith("file://")) {
            string = string.substring(7) 
        }
        
        var stringUri = URI.createFileURI(string)
        
        var resourceSet = stringUri.xtextResourceSet 
        val resource = resourceSet.getResource(stringUri, true)
        
        var eobject = resource.getContents().head
        var context = compile(eobject, command)
        for (iResult : context.processorInstancesSequence) {
            convertImpl(iResult.environment , uri, iResult.name)
        }
        return requestManager.runRead[ cancelIndicator |
            new CompilationResults(this.snapshotMap.get(uri))
        ]
    }
    
    def convertImpl(Environment environment, String uri, String processorName) {
        var List<Object> snapshots = environment.getProperty(Environment.SNAPSHOTS)
        var impl = environment.model
        var errors = environment.errors
        var warnings = environment.warnings
        var infos = environment.infos
        if (impl instanceof CodeContainer) {
            this.objectMap.get(uri).add(impl)
            this.snapshotMap.get(uri).add(new Snapshot("code", "generated", 0, errors, warnings, infos))
        } else if (impl instanceof SCChartsImpl) {
            this.objectMap.get(uri).add(impl)
            this.snapshotMap.get(uri).add(new Snapshot("sctx", processorName, 0, errors, warnings, infos))
            var count = 1
            for (snapshot : snapshots) {
                this.objectMap.get(uri).add(snapshot as EObject)
                this.snapshotMap.get(uri).add(new Snapshot("sctx", processorName, count, errors, warnings, infos))
                count++
            }
        } else if (impl instanceof SCGraphsImpl) {
            this.objectMap.get(uri).add(impl)
            this.snapshotMap.get(uri).add(new Snapshot("scg", processorName, 0, errors, warnings, infos))
            var count = 1
            for (snapshot : snapshots) {
                this.objectMap.get(uri).add(snapshot as EObject)
                this.snapshotMap.get(uri).add(new Snapshot("scg", processorName, count, errors, warnings, infos))
                count++
            }
        } else if (impl instanceof SCLProgramImpl) {
            this.objectMap.get(uri).add(impl)
            this.snapshotMap.get(uri).add(new Snapshot("scl", processorName, 0, errors, warnings, infos))
            var count = 1
            for (snapshot : snapshots) {
                this.objectMap.get(uri).add(snapshot as EObject)
                this.snapshotMap.get(uri).add(new Snapshot("scl", processorName, count, errors, warnings, infos))
                count++
            }
        } else if (impl instanceof EsterelProgramImpl) {
            this.objectMap.get(uri).add(impl)
            this.snapshotMap.get(uri).add(new Snapshot("esterel", processorName, 0, errors, warnings, infos))
            var count = 1
            for (snapshot : snapshots) {
                this.objectMap.get(uri).add(snapshot as EObject)
                this.snapshotMap.get(uri).add(new Snapshot("esterel", processorName, count, errors, warnings, infos))
                count++
            }
        }  else if (impl instanceof LustreProgramImpl) {
            this.objectMap.get(uri).add(impl)
            this.snapshotMap.get(uri).add(new Snapshot("lustre", processorName, 0, errors, warnings, infos))
            var count = 1
            for (snapshot : snapshots) {
                this.objectMap.get(uri).add(snapshot as EObject)
                this.snapshotMap.get(uri).add(new Snapshot("lustre", processorName, count, errors, warnings, infos))
                count++
            }
        } else if (impl instanceof KextImpl) {
            this.objectMap.get(uri).add(impl)
            this.snapshotMap.get(uri).add(new Snapshot("kext", processorName, 0, errors, warnings, infos))
            var count = 1
            for (snapshot : snapshots) {
                this.objectMap.get(uri).add(snapshot as EObject)
                this.snapshotMap.get(uri).add(new Snapshot("kext", processorName, count, errors, warnings, infos))
                count++
            }
        } else {
            println("Got something I currently do not recognize " + impl.class)
        }
        
    }
    
    /**
     * @return the correct XtextResourceSet for the given uri based in its file extension.
     */
    def XtextResourceSet getXtextResourceSet(@NonNull URI uri) {
        return injector.getInstance(XtextResourceSet);
    }
    
    private def compile(EObject eobject, String systemId) {
        val context = Compile.createCompilationContext(systemId, eobject)
        context.compile
        return context
    }
    
    override show(String uri, int index) {
        var Object model = this.objectMap.get(uri).get(index)
        var writer = new ByteArrayOutputStream()
        LightDiagramServices.renderOffScreen(model, IOffscreenRenderer.SVG, writer)
        val svg = writer.toString
        return requestManager.runRead[ cancelIndicator |
            svg
        ]
    }
    
    override getSystems(String stringUri, boolean filter) {
        var string = stringUri
        if (stringUri.startsWith("file://")) {
            string = stringUri.substring(7) 
        }
        var uri = URI.createFileURI(string)
        
        var resourceSet = uri.xtextResourceSet 
        val resource = resourceSet.getResource(uri, true)
        
        var eobject = resource.getContents().head
        val model = if(filter) eobject
        if (model !== null && model.class !== modelClassFilter) {
            modelClassFilter = model.class
        }
        var systems = CompilerViewUtil.getSystemModels(true, modelClassFilter)
        val systemDescriptions = getDescription(systems)
        return requestManager.runRead[ cancelIndicator |
            systemDescriptions
        ]
    }
    
    def EObject getEObjectFromURI(String stringUri) {
        var uri = URI.createFileURI(stringUri)
        var resourceSet = uri.xtextResourceSet
        val resource = resourceSet.getResource(uri, true)

        return resource.getContents().head
    }
    
    def List<SystemDescription> getDescription(List<System> systems) {
        var systemDescription = newLinkedList
        for (system : systems) {
            systemDescription.add(new SystemDescription(system.label, system.id))	
        }
        return systemDescription
    }
    
}