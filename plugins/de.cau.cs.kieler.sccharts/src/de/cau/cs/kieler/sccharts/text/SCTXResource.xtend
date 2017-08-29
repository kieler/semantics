/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text;

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.sccharts.SCCharts
import java.io.File
import java.io.IOException
import java.io.OutputStream
import java.util.HashMap
import java.util.Map
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.CommonPlugin
import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import org.eclipse.xtext.parser.IParseResult
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.resource.XtextResource

import static org.eclipse.emf.common.util.URI.*
import org.eclipse.emf.ecore.util.EcoreUtil
import java.io.InputStream

/**
 * A customized {@link LazyLinkingResource}. Modifies the parsed model and fixes some runtime bugs.
 *
 * @author chsch
 * @author als
 * @author ssm
 */

public class SCTXResource extends LazyLinkingResource {

    @Inject extension AnnotationsExtensions
    
    static val PRAGMA_IMPORT_LEVEL = PragmaRegistry.register("import-level", StringPragma, 
        "Top-level SCCharts can be annotation with \"root\" to clear the resource set.")
    static val PRAGMA_IMPORT = PragmaRegistry.register("import", StringPragma,
        "Add resources via import to the resource set.")  

    private var importPragmaHash = 0

    /**
     * Starts model consolidation before {@link LazyLinkingResource#doLinking()}.
     */
    override void doLinking() {
//        if (importsHaveChanged) 
        updateResourceSet
        super.doLinking();
    }

    /**
     * Registers {@link SaveOptions} and delegates to
     * {@link LazyLinkingResource#doSave(OutputStream, Map)}
     */
    override void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
        // there's something strange let me go crazy : options is null no matter
        // what the param in resource.save(...) is ... :-(
        val myOptions = new HashMap<Object, Object>();

        SaveOptions.newBuilder().format().noValidation().getOptions().addTo(myOptions);

        super.doSave(outputStream, myOptions);
    }

    /**
     * Eliminates an ugly bug within the calling method
     * {@link XtextResource#update(int, int, String)}:<br>
     * If a parsing round fails entirely, the last previously successfully deducted EObject will
     * remain in contents though the parseResult is empty! After the next successful parser run the
     * new EObject will be added to contents regardless the non-emptiness of contents.
     */
    override void updateInternalState(IParseResult parseResult) {
        if (parseResult.getRootASTElement() != null && getContents().size() != 0
                && !getContents().get(0).equals(parseResult.getRootASTElement())) {
            unload(getContents().get(0));
            getContents().remove(0);
            while (!getContents().isEmpty()) {
                getContents().remove(0);
            }
        }
        this.getContents().clear();
        super.updateInternalState(parseResult);
    }

    // ---------------------------------------------------------------------------------------

    protected def void updateResourceSet() {
        val contents = getContents
        if (contents !== null && (contents.size == 0 || !(contents.head instanceof SCCharts))) return;
        
        val scc = contents.head as SCCharts
        val ownR = scc.eResource
        val segments = ownR.URI.segments
        val base = ownR.URI.scheme + ":/" + String.join("/", segments.subList(0, segments.length - 1)) + "/"
        
        val rSet = this.getResourceSet
        
        val importlevels = scc.getPragmas(PRAGMA_IMPORT_LEVEL)
        if (!importlevels.empty) {
            if ((importlevels.head as StringPragma).values.head.equals("root")) {
                rSet.resources.removeIf[ it != ownR ]
            }
        }
       
        val importPragmas = scc.getPragmas(PRAGMA_IMPORT).filter(StringPragma)
        for (importPragma : importPragmas) {
            try {
                for(importName : importPragma.values) {
                
                    if (importName.endsWith("*")) {
                        val ownRLocationURI = createFileURI(CommonPlugin.resolve(ownR.URI).toFileString)
                        
                        val importNameBase = importName.substring(0, importName.length - 1)
                        val baseURI = createURI(base + importNameBase)
                        val resolvedFile = CommonPlugin.resolve(baseURI);
                        val path = new Path(resolvedFile.toFileString())
                        val folder = new File(path.toString)
                        for (file : folder.listFiles.filter[ toString.endsWith(".sctx") ]) {
                            val importURI = createFileURI(file.toString)
                            if (!importURI.equals(ownRLocationURI) && !rSet.resources.exists[ it.URI.equals(importURI) ])
                                rSet.getResource(importURI, true)
                        }
                    } else {
                        val importURI = createURI(base + importName + ".sctx") 
                        rSet.getResource(importURI, true)
                    }
                }
            } catch (Exception e) {
                System.err.println("Resource " + importPragma.values.head + " not found!")
            }
        }
        
//  EXPERIMENTAL RELOAD of parents
//  TODO this maybe only necessary at save if necessary at all.         
//        val lastSegment = ownR.URI.lastSegment
//        val ownName = lastSegment.substring(0, lastSegment.length - 5)
//        for (r : rSet.resources.filter[ it !== this ].map[ getContents.head ].filter(SCCharts)) {
//            val rImports = scc.getPragmas(PRAGMA_IMPORT).filter(StringPragma).map[ values.head ]
//            if (rImports.exists[ it.endsWith(ownName) ]) {
//                if (r.eResource instanceof SCTXResource) {
//                    (r.eResource as SCTXResource).doLinking
//                }
//            }
//        }
        
    }
    
    protected def boolean importsHaveChanged() {
        val rootObject = getContents
        if (rootObject.empty || !(rootObject.get(0) instanceof SCCharts)) return false
        
        val scc = rootObject.get(0) as SCCharts
        
        var pragmaHash = 0
        
        val importlevels = scc.getPragmas(PRAGMA_IMPORT_LEVEL).filter(StringPragma)
        val imports = scc.getPragmas(PRAGMA_IMPORT).filter(StringPragma)
        
        if (!importlevels.empty) pragmaHash += importlevels.head.values.head.hashCode
        for (import : imports.map[values].flatten) pragmaHash += import.hashCode 
                
        if (importPragmaHash != pragmaHash) {
            importPragmaHash = pragmaHash
            return true
        }
        return false
    }

}
