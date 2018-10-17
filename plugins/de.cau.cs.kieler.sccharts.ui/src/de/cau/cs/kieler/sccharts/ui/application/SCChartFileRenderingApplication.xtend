/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.application

import de.cau.cs.kieler.core.model.util.ModelUtil
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kicool.ui.klighd.models.ModelChain
import de.cau.cs.kieler.klighd.IOffscreenRenderer
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.PrintWriter
import java.nio.file.Files
import java.nio.file.Paths
import java.util.HashSet
import java.util.Locale
import java.util.Scanner
import java.util.Set
import java.util.stream.Stream
import org.eclipse.core.runtime.IStatus
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.equinox.app.IApplication
import org.eclipse.equinox.app.IApplicationContext
import org.eclipse.swt.widgets.Display
import org.eclipse.xtext.resource.XtextResourceSet

/**
 * @author mek
 * 
 * This class represents the entry point for a headless application
 * to render and/or compile a set of sccharts into their graphical representation/code files.
 */
class SCChartFileRenderingApplication implements IApplication {

    // states for handling command line input
    private enum InputState {
        NONE,
        INPUT_FILE,
        SYSTEM_SELECTION,
        FILE_EXTENSION_SPECIFICATION
    }

    enum OutputFormat {
        SVG,
        BMP,
        PNG,
        JPEG
    }

    val String SCCHART_FILE_EXTENSION = ".sctx"
    val String SVG_FILE_EXTENSION = ".svg"
    val String BMP_FILE_EXTENSION = ".bmp"
    val String PNG_FILE_EXTENSION = ".png"
    val String JPEG_FILE_EXTENSION = ".jpeg"

    val String DEFAULT_COMPILER_SYSTEM_ID = "de.cau.cs.kieler.sccharts.netlist"

    // a reference to the resource set to load a SCChart, so it is created only once
    var XtextResourceSet resourceSet = null

    // A flag to indicate if the application is requested to stop.
    var boolean shouldStop = false
    // A flag to indicate if the application is stopped.
    var boolean stopped = false

    // The system to use for compilation
    var de.cau.cs.kieler.kicool.System system = null;

    // The format to use when rendering
    var OutputFormat renderFormat = OutputFormat.SVG;

    // A flag to indicate if files should be rendered.
    var boolean shouldRender = true

    // A flag to indicate of files should be compiled
    var boolean shouldCompile = false

    // A flag to indicate if files should be loaded as a model.
    var boolean loadAsModel = true

    // A set of file extensions to filter files in recursive searches
    var Set<String> acceptedExtensions = new HashSet(0);

    override start(IApplicationContext context) throws Exception {
        // Mark application internally as running and make sure no stop handler is waiting.
        synchronized (this) {
            shouldStop = false
            stopped = false
            notifyAll()
        }

        // initialize state
        acceptedExtensions = new HashSet(1);
        acceptedExtensions.add(SCCHART_FILE_EXTENSION)

        loadAsModel = true

        shouldRender = true
        renderFormat = OutputFormat.SVG

        shouldCompile = false
        system = KiCoolRegistration.getSystemById(DEFAULT_COMPILER_SYSTEM_ID)

        // mark this application as running
        context.applicationRunning

        var args = context.arguments.get(IApplicationContext.APPLICATION_ARGS) as String[]
        var inpState = InputState.NONE // no special meaning of next parameter
        // read from stdIn if no parameters are specified
        if (args.length == 0) {
            args = #["-in", "-"]
        }

        // read parameters and execute their meaning (in order)
        for (param : args) {
            // Interpret parameters as long as the application should not stop.
            if (!shouldStop) {

                switch (inpState) {
                    case NONE: {
                        var lowerParam = param.toLowerCase(Locale.ROOT)
                        switch (lowerParam) {
                            // help
                            case "-?",
                            case "-help": {
                                printHelp
                            }
                            // rendering
                            case "-svg": {
                                shouldRender = true
                                renderFormat = OutputFormat.SVG
                            }
                            case "-png": {
                                shouldRender = true
                                renderFormat = OutputFormat.PNG
                            }
                            case "-bmp": {
                                shouldRender = true
                                renderFormat = OutputFormat.BMP
                            }
                            case "-jpeg": {
                                shouldRender = true
                                renderFormat = OutputFormat.JPEG
                            }
                            case "-norender": {
                                shouldRender = false
                            }
                            // compilation
                            case "-compile": {
                                if (system !== null) {
                                    shouldCompile = true
                                } else {
                                    System.err.println(
                                        "Error: could not enable compilation, since no valid system is loaded")
                                }
                            }
                            case "-system": {
                                inpState = InputState.SYSTEM_SELECTION
                            }
                            case "-nocompile": {
                                shouldCompile = false
                            }
                            // model loading
                            case "-astext": {
                                loadAsModel = false
                            }
                            case "-asmodel": {
                                loadAsModel = true
                            }
                            // file
                            case "-extension": {
                                inpState = InputState.FILE_EXTENSION_SPECIFICATION
                            }
                            case "-in": {
                                // next parameter is a file to read target SCCharts from
                                inpState = InputState.INPUT_FILE
                            }
                            default: {
                                // use this parameter as one file specifier for SCCharts to render
                                handleSpecifiers(Stream.of(param), true)
                            }
                        }
                    }
                    case FILE_EXTENSION_SPECIFICATION: {
                        inpState = InputState.NONE
                        acceptedExtensions = new HashSet(param.split(","))
                    }
                    case INPUT_FILE: {
                        inpState = InputState.NONE
                        // Current parameter specifies a file to read SCCHarts specifier from
                        var InputStreamReader reader = null
                        if (param == "-") {
                            // input file is stdIn
                            reader = new InputStreamReader(System.in)
                        } else {
                            // input file is a file
                            var file = new File(param)
                            if (!file.exists)
                                System.err.println("Could not find file: " + param)
                            else if (!file.canRead)
                                System.err.println("File is not readable: " + param)
                            else
                                reader = new FileReader(file)
                        }
                        // use each line as one SCCHarts specifier
                        if(reader !== null) handleSpecifiers(new BufferedReader(reader).lines, true)
                    }
                    case SYSTEM_SELECTION: {
                        inpState = InputState.NONE
                        // load compilation system
                        system = KiCoolRegistration.getSystemById(param)
                        if (system === null) {
                            System.err.println("Error: could not load compilation system \"" + param + "\"")
                        }
                        shouldCompile = (system !== null)
                    }
                }
            }
        }

        synchronized (this) {
            stopped = true
            notifyAll()
        }

        return IApplication.EXIT_OK
    }

    /**
     * This method prints the help output
     */
    private def printHelp() {
        println("This is a program to render/compile SCCharts into files.")
        println("Parameter:")
        println("  -help/-?     : Shows this help.")
        println()
        println("  Rendering: (default: on, SVG)")
        println("    -svg       : Following files are rendered to SVG.")
        println("    -png       : Following files are rendered to PNG.")
        println("    -bmp       : Following files are rendered to BMP.")
        println("    -jpeg      : Following files are rendered to JPEG.")
        println("    -noRender  : Don't render following files")
        println()
        println("  Compilation: (default: off, system-id: " + DEFAULT_COMPILER_SYSTEM_ID + ")")
        println("    -compile   : (Re-)Enables compilation for following files.")
        println("    -system <compilation system-id>")
        println("               : Compiles following files with the given compilation system.")
        println("    -noCompile : Don't compile following files.")
        println()
        println("  Model loading: (default: load as Model)")
        println("    -asModel   : Load input as model.")
        println("    -asText    : Load input as string of file Contents.")
        println()
        println("  Files: (default extension: " + SCCHART_FILE_EXTENSION + ")")
        println("    -extension <extensions>")
        println("               : Sets the extensions to use when searching a directory.")
        println("                 Multiple extensions can be separated with a comma(,).")
        println("    -in -      : Reads a list of SCCharts file paths to render/compile from input.")
        println("    -in <file> : Reads a list of SCCharts file paths to render/compile from specified file.")
        println("    <file>     : A (SCCharts) file path to render/compile.")
        println()
        println("Any parameter may be used multiple times and are case insensitive.")
        println("Using a folder as a input file results in a recursive search")
        println("for files with matching extensions to render/compile.")
        println("The Output-File is saved in the same location as the input file")
        println("with a different file name extension.")
        println("If no parameters are specified for this application, then the parameters")
        println("\"-in -\" are assumed.")
    }

    /**
     * This method takes a stream of file-path-strings and recurses into folders rendering SCChart files.
     * The target file type is specified by the OutputFormat format.
     * Errors are printed to std-err.
     * 
     * @param selectors a Stream of paths to handle
     * @param isDirect true if an error should be printed on file extension miss-match
     */
    private def void handleSpecifiers(Stream<String> selectors, boolean isDirect) {
        val iter = selectors.iterator;
        while (!shouldStop && iter.hasNext) {
            val selector = iter.next

            // check file
            var file = new File(selector)
            if (!file.exists)
                System.err.println("Could not find file or directory: " + selector)
            else if (file.isDirectory) {
                // get a list of all files in this folder (with recursion)
                handleSpecifiers(
                    Files.walk(Paths.get(file.path)).filter([p|Files::isRegularFile(p)]).map([path|path.toString]),
                    false
                )
            } else {
                val fileExtension = getFileExtension(file.name.toLowerCase(Locale.ROOT))
                if (!isDirect && !acceptedExtensions.contains(fileExtension)) {
                    // ignore file
                } else if(!file.canRead) System.err.println("File is not readable: " + selector) else handleFile(file)
            }
        }
    }

    /**
     * this method gets the default output file for a input file and the specified output format
     */
    def File getOutputFile(File inputFile, OutputFormat format) {
        val absPath = inputFile.absolutePath
        return new File(
            absPath.substring(0, absPath.length - SCCHART_FILE_EXTENSION.length) + getExtension(format)
        )
    }

    /**
     * This method initializes the resource set and Display for rendering.
     */
    private def void initResourceSet() {
        val scchartsInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration
        resourceSet = scchartsInjector.getInstance(XtextResourceSet);
        // initialize some display for rendering
        Display.^default
    }

    /**
     * This method loads a model based on the SCTX-EMF-ResourceSet
     */
    def loadModel(File file) {
        // get output file path
        val absPath = file.absolutePath

        // initialize resource set if not done already
        if (resourceSet === null) {
            initResourceSet
        }

        // get the SCChart
        val resource = resourceSet.getResource(URI.createFileURI(absPath), true)
        return resource.getContents().head
    }

    /**
     * Returns the contents of a File as a String
     */
    def loadText(File file) {
        var Scanner scanner = null
        try {
            scanner = new Scanner(file)
            return scanner.useDelimiter("\\Z") // EOF as delimiter
        } finally {
            if(scanner !== null) scanner.close
        }
    }

    /**
     * This method takes a file pointing to a SCChart file which should be rendered.
     * The result gets saved in the same place as the SCChart with different file extension.
     * The target file type is specified by the OutputFormat format.
     * Errors are printed to std-err.
     */
    def void renderSCChart(File file, OutputFormat format) {
        renderSCChart(file, format, getOutputFile(file, format))
    }

    /**
     * This method takes a file pointing to a SCChart file which should be rendered.
     * The result gets saved in the specified outputFile.
     * The target file type is specified by the OutputFormat format.
     * Errors are printed to std-err.
     */
    def void renderSCChart(File file, OutputFormat format, File outputFile) {
        println("Rendering file: " + file.path)

        // get model
        val scchart = loadModel(file) as SCCharts

        // and render it
        renderModel("file: " + file.path, scchart, format, outputFile.absolutePath)
    }

    /**
     * This method renders and compiles a file according to the current state.
     * Errors are printed to std-err.
     */
    private def handleFile(File file) {
        println("Handling file: " + file.path)

        // get model
        val model = if(loadAsModel) loadModel(file) else loadText(file)

        // and render model if requested
        if (shouldRender) {
            renderModel(
                "file: " + file.path,
                model as SCCharts,
                renderFormat,
                getOutputFile(file, renderFormat).absolutePath
            )
        }

        // Handle Compilation if requested.
        if (shouldCompile) {
            val cc = Compile.createCompilationContext(system, model)

            // compile and extract result
            val resultEnv = cc.compile
            var resModel = resultEnv.model

            // decompose chain
            if (resModel instanceof ModelChain) {
                resModel = resModel.getSelectedModel()
            }

            switch (resModel) {
                // Save files inside a CodeContainer.
                CodeContainer: {
                    val codeContainer = resModel as CodeContainer
                    for (codeFileEntry : codeContainer.files) {
                        saveStringToFile(codeFileEntry.code, file.parent + "/" + codeFileEntry.fileName)
                    }
                }
                EObject: {
                    // TODO: get correct file extension
                    ModelUtil.saveModel(resModel,
                        URI.createURI(file.parent + "/" + removeFileExtension(file.name) + '.out'))
                }
                String: {
                    // TODO: get correct file extension
                    saveStringToFile(resModel, file.parent + "/" + removeFileExtension(file.name) + '.out')
                }
                default: {
                    // TODO: get correct file extension
                    saveStringToFile(resModel.toString, file.parent + "/" + removeFileExtension(file.name) + '.out')
                }
            }
        }
    }

    /**
     * This method gets a file name and returns the name with
     * the last file extension (including the dot) removed if present.
     * If there is no file extension, then the name is returned.
     */
    private def removeFileExtension(String name) {
        val extPoint = name.lastIndexOf('.')
        if (extPoint >= 0) {
            return name.substring(0, extPoint)
        }
        return name
    }

    /**
     * This method gets a file name and returns the last file extension
     * excluding the dot if present or "".
     */
    private def getFileExtension(String name) {
        val extPoint = name.lastIndexOf('.')
        if (extPoint >= 0) {
            return name.substring(extPoint + 1)
        }
        return ""
    }

    /**
     * This method tries to save a given string into a file given by path
     * Errors are printed to std-err.
     */
    private def saveStringToFile(String contend, String path) {
        saveStringToFile(contend, new File(path))
    }

    /**
     * This method tries to save a given string into given file
     * Errors are printed to std-err.
     */
    private def saveStringToFile(String contend, File file) {
        var PrintWriter out
        try {
            // Write contend into file.
            out = new PrintWriter(file)
            out.print(contend)
            out.close
        } catch (IOException e) {
            System.err.print("Error saving compilation result: " + e.message)
        } finally {
            if (out !== null) {
                out.close
            }
        }
    }

    /**
     * This method renders a given model into the targetFile in the given format.
     * Errors are printed to std-err.
     */
    def renderModel(String modelSrcDescription, Object model, OutputFormat format, String targetFile) {
        // render the SCChart
        val IStatus result = LightDiagramServices.renderOffScreen(
            model,
            getRenderingTargetType(format),
            targetFile
        );

        // check if rendering was successful
        if (!result.OK) {
            System.err.println("Error Rendering " + modelSrcDescription)
            System.err.println(result)
            result.exception.printStackTrace
        }
    }

    /**
     * This method translates a OutputFormat into its corresponding file extension
     */
    private def getExtension(OutputFormat format) {
        switch (format) {
            case OutputFormat.SVG: SVG_FILE_EXTENSION
            case OutputFormat.PNG: PNG_FILE_EXTENSION
            case OutputFormat.BMP: BMP_FILE_EXTENSION
            case OutputFormat.JPEG: JPEG_FILE_EXTENSION
        }
    }

    /**
     * This method translates a OutputFormat into its corresponding rendering target
     */
    private def getRenderingTargetType(OutputFormat format) {
        switch (format) {
            case OutputFormat.SVG: IOffscreenRenderer.SVG
            case OutputFormat.PNG: IOffscreenRenderer.PNG
            case OutputFormat.BMP: IOffscreenRenderer.BMP
            case OutputFormat.JPEG: IOffscreenRenderer.JPEG
        }
    }

    override stop() {
        synchronized (this) {
            // Request application to stop and wait until application is stopped.
            while (!stopped) {
                shouldStop = true
                wait()
            }
        }
    }

}
