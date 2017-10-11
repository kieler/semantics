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

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimaps
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.sccharts.SCCharts
import java.io.File
import java.io.IOException
import java.io.OutputStream
import java.lang.ref.WeakReference
import java.util.Collection
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.common.CommonPlugin
import org.eclipse.emf.common.util.URI
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import org.eclipse.xtext.parser.IParseResult
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

import static org.eclipse.emf.common.util.URI.*

import static extension com.google.common.collect.Sets.*
import static extension de.cau.cs.kieler.core.model.util.URIUtils.*

/**
 * A customized {@link LazyLinkingResource}. Modifies the parsed model and fixes some runtime bugs.
 * It also handles imports of other SCCharts.
 * 
 * @author chsch
 * @author als
 * @author ssm
 */
public class SCTXResource extends LazyLinkingResource {

    @Inject extension AnnotationsExtensions

    public static val FILE_EXTENSION = "sctx"
    private static val FILE_EXTENSION_INTERN = "." + FILE_EXTENSION

    public static val PRAGMA_IMPORT = PragmaRegistry.register("import", StringPragma,
        "Add resources via import to the resource set.")

    /** All resources that were imported */
    private static val IMPORTED_RESOURCES = Multimaps.synchronizedSetMultimap(
        HashMultimap.<File, WeakReference<SCTXResource>>create)

    /** List of current imports */
    private val currentImports = HashMultimap.<String, File>create

    /** The file this resource was imported for */
    @Accessors(PUBLIC_GETTER)
    protected var File underlyingFile = null
    /** The flag indicating whether this resources was imported by another or not */
    @Accessors(PUBLIC_GETTER)
    protected var boolean imported = false
    
    /** The flag indicating whether this resources clears it references before linking */
    @Accessors(PUBLIC_GETTER)    
    private var clearReferencesBeforeLinking = false

    override setURI(URI uri) {
        super.uri = uri

        try {
            underlyingFile = uri.javaFile
        } catch (Exception e) {
            // ignore
        }
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

    override void updateInternalState(IParseResult parseResult) {
        /**
         * Eliminates an ugly bug within the calling method
         * {@link XtextResource#update(int, int, String)}:<br>
         * If a parsing round fails entirely, the last previously successfully deducted EObject will
         * remain in contents though the parseResult is empty! After the next successful parser run the
         * new EObject will be added to contents regardless the non-emptiness of contents.
         */
        if (parseResult.getRootASTElement() != null && getContents().size() != 0 &&
            !getContents().get(0).equals(parseResult.getRootASTElement())) {
            unload(getContents().get(0));
            getContents().remove(0);
            while (!getContents().isEmpty()) {
                getContents().remove(0);
            }
        }
        this.getContents().clear();

        // Handle imports
        if (parseResult.rootASTElement !== null) {
            try {
                updateImports(parseResult.rootASTElement as SCCharts)
            } catch (Exception e) {
                // fail silent
            }
        }

        super.updateInternalState(parseResult);
    }

    // ---------------------------------------------------------------------------------------
    protected def void updateImports(SCCharts scc) {
        // Assure resource set
        if (this.resourceSet === null) {
            SCTXStandaloneSetup.doSetup.getInstance(XtextResourceSet).resources.add(this)
        }

        // Import pragma delta
        val importPragmas = scc.getPragmas(PRAGMA_IMPORT).filter(StringPragma).map[values].flatten.toSet
        val addedImports = importPragmas.difference(currentImports.keySet)
        val removedImports = currentImports.keySet.difference(importPragmas)

        val base = uri.segmentsList.take(uri.segmentCount - 1).join(uri.scheme + ":/", "/", "/", [it])

        // Update folder imports
        // This might be slow!
        var folderImportChanged = false
        for (folderImport : importPragmas.filter [
            it.endsWith("*") && !addedImports.contains(it) && !removedImports.contains(it)
        ]) {
            try {
                val importNameBase = folderImport.substring(0, folderImport.length - 1) // skip *
                val baseURI = createURI(base + importNameBase)
                val folderURI = CommonPlugin.resolve(baseURI)
                val folder = new File(folderURI.toFileString)

                if (!folder.listFiles.filter[path.endsWith(FILE_EXTENSION_INTERN) && !it.equals(underlyingFile)].toSet.
                    symmetricDifference((currentImports.get(folderImport) ?: emptySet).toSet).empty) {
                    // Remove current one
                    currentImports.removeAll(folderImport)
                    // Add new to resource set
                    for (file : folder.listFiles.filter[path.endsWith(FILE_EXTENSION_INTERN)]) {
                        createFileURI(file.toString).importResource(folderImport)
                    }
                    folderImportChanged = true
                }
            } catch (Exception e) {
                // fail silent
            }
        }

        // Add to resource set
        for (import : addedImports) {
            try {
                if (import.endsWith("*")) {
                    val importNameBase = import.substring(0, import.length - 1) // skip *
                    val baseURI = createURI(base + importNameBase)
                    val folderURI = CommonPlugin.resolve(baseURI)
                    val folder = new File(folderURI.toFileString)

                    // Add them to resource set
                    for (file : folder.listFiles.filter[toString.endsWith(FILE_EXTENSION_INTERN)]) {
                        createFileURI(file.toString).importResource(import)
                    }
                } else {
                    val importURI = createURI(base + import +
                        if(import.endsWith(FILE_EXTENSION_INTERN)) "" else FILE_EXTENSION_INTERN)
                    importURI.importResource(import)
                }
            } catch (Exception e) {
                // Not necessary since there is a check in the validator
            }
        }

        // Remove from resource set
        if (!removedImports.empty || folderImportChanged) {
            removedImports.unimportResources
        }
    }

    protected def importResource(URI importUri, String importName) {
        val file = importUri.javaFile

        // Do not self import
        if(this.uri.javaFile.equals(file)) return;

        // Import if not already imported (prevent double import)
        if (!resourceSet.resources.filter(SCTXResource).exists[file.equals(it.underlyingFile)]) {
            val res = resourceSet.getResource(importUri, true) as SCTXResource
            res.imported = true
            IMPORTED_RESOURCES.put(file, new WeakReference(res))
        }

        // Register import association
        currentImports.put(importName, file)
    }

    protected def unimportResources(Collection<String> imports) {
        // Remove import association
        currentImports.keySet.removeAll(imports)

        val boundImports = boundResources

        // Remove all resources that are no longer imported
        resourceSet.resources.removeIf[!boundImports.containsValue(it)]
    }

    protected def boundResources() {
        val resources = resourceSet.resources.filter(SCTXResource).toMap[it.underlyingFile]
        val boundImport = newHashMap
        val checkImportQueue = newLinkedList(this)

        while (!checkImportQueue.empty) {
            val r = checkImportQueue.pop
            boundImport.put(r.underlyingFile, r)
            // Add all resources which are imported but not yet checked to check queue
            checkImportQueue.addAll(r.currentImports.values.filter[!boundImport.containsKey(it)].map [
                resources.get(it)
            ].filterNull.toSet)
        }

        return boundImport
    }

    // ---------------------------------------------------------------------------------------
    
    /**
     * Clears all linked references an then relinks the model.
     */
    public def clearRefsAndRelink() {
        clearReferencesBeforeLinking = true
        relink
        clearReferencesBeforeLinking = false
    }
    
    /**
     * Reloads all resources that also represent the model located in the underlying file but are part of other resource sets (imported by other resources). 
     */
    public def reloadImporters() {
        try {
            // Clear empty references 
            IMPORTED_RESOURCES.get(underlyingFile)?.removeIf[get === null]

            // Update others
            for (other : (IMPORTED_RESOURCES.get(underlyingFile) ?: emptyList).filter[it.get !== this]) {
                val r = other.get
                if (r !== null && r.resourceSet !== null) {
                    // Refresh resource
                    r.unload
                    r.load(r.resourceSet.loadOptions)
                    
                    // Relink importer
                    for (importer : r.resourceSet.resources.filter(SCTXResource).filter[it.currentImports.values.exists[this.underlyingFile.equals(it)]]) {
                        importer.clearRefsAndRelink
                    }
                }
            }
        } catch (Exception e) {
            // fail silent
        }
    }

    /**
     * Returns a map of imports. The keys are the user specified import paths and the value are the resolved files associated with the import.
     * Use {@link getAllImports()} to resolve the file to the actual resources. 
     */
    public def getDirectImports() {
        return Multimaps.unmodifiableMultimap(currentImports)
    }

    /**
     * Returns a map of all resources in the resource set that are directly or indirectly imported by this resource (including this resource).
     * The key are the underlying file and the values are the actual resources. 
     */
    public def getAllImports() {
        return boundResources
    }

}
