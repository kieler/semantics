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

import de.cau.cs.kieler.klighd.IOffscreenRenderer
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.InputStreamReader
import java.nio.file.Files
import java.nio.file.Paths
import java.util.Locale
import java.util.stream.Stream
import org.eclipse.core.runtime.IStatus
import org.eclipse.equinox.app.IApplication
import org.eclipse.equinox.app.IApplicationContext
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.swt.widgets.Display
import java.util.Map
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import java.io.PrintWriter
import java.io.IOException

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
        SYSTEM_SELECTION
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
    
    override start(IApplicationContext context) throws Exception {
        // Mark application internally as running and make sure no stop handler is waiting.
        synchronized(this) {
            shouldStop = false
            stopped    = false
            notifyAll()
        }
        
        // initialize state
        shouldRender  = true
        renderFormat  = OutputFormat.SVG
        
        shouldCompile = false
        system        = KiCoolRegistration.getSystemById(DEFAULT_COMPILER_SYSTEM_ID)
        
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
                
                switch (inpState){
                    case NONE: {
                        var lowerParam = param.toLowerCase(Locale.ROOT)
                        if (lowerParam == "-help") {
                            // help is requested
                            println("This is a program to render/compile SCCharts into files. (default: SVG,no compilation)")
                            println("Parameter:")
                            println("  -help      : shows this help")
                            println("  Rendering:")
                            println("    -svg       : following files are rendered to SVG")
                            println("    -png       : following files are rendered to PNG")
                            println("    -bmp       : following files are rendered to BMP")
                            println("    -jpeg      : following files are rendered to JPEG")
                            println("    -norender  : Don't render following files")
                            println("  Compilation: (default system-id: "+DEFAULT_COMPILER_SYSTEM_ID+")")
                            println("    -compile   : (re-)enables compilation for following files")
                            println("    -system <compilation system-id>")
                            println("               : compiles following files with the given compilation system")
                            println("    -nocompile : Don't compile following files")
                            println("  -in -      : reads a list of SCCharts file paths to render/compile from input")
                            println("  -in <file> : reads a list of SCCharts file paths to render/compile from specified file")
                            println("  <file>     : a (SCCharts) file path to render/compile")
                            println("Any parameter may be used multiple times.")
                            println("Using a folder as a SCChart file results in a recursive search")
                            println("for SCChart files to render/compile.")
                            println("The Output-File is saved in the same location as the SCChart file")
                            println("with a different file name extension.")
                            println("If no parameter for this application is specified, then the parameter")
                            println("\"-in -\" is assumed")
                        } else if (lowerParam == "-in") {
                            // next parameter is a file to read target SCCharts from
                            inpState = InputState.INPUT_FILE
                        } else if (lowerParam == "-svg") {
                            shouldRender = true
                            renderFormat = OutputFormat.SVG
                        } else if (lowerParam == "-png") {
                            shouldRender = true
                            renderFormat = OutputFormat.PNG
                        } else if (lowerParam == "-bmp") {
                            shouldRender = true
                            renderFormat = OutputFormat.BMP
                        } else if (lowerParam == "-jpeg") {
                            shouldRender = true
                            renderFormat = OutputFormat.JPEG
                        } else if (lowerParam == "-norender") {
                            shouldRender = false
                        } else if (lowerParam == "-compile") {
                            if (system !== null) {
                                shouldCompile = true
                            } else {
                                System.err.println("Error: could not enable compilation, since no valid system is loaded")
                            }
                        } else if (lowerParam == "-system") {
                            inpState = InputState.SYSTEM_SELECTION
                        } else if (lowerParam == "-nocompile") {
                            shouldCompile = false
                        } else {
                            // use this parameter as one file specifier for SCCharts to render
                            handleSpecifiers(Stream.of(param), true)
                        }
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
                            if (!file.exists) System.err.println("Could not find file: "+param)
                            else if (!file.canRead) System.err.println("File is not readable: "+param)
                            else reader = new FileReader(file)
                        }
                        // use each line as one SCCHarts specifier
                        if (reader !== null) handleSpecifiers(new BufferedReader(reader).lines, true)
                    }
                    case SYSTEM_SELECTION: {
                        inpState = InputState.NONE
                        // load compilation system
                        system = KiCoolRegistration.getSystemById(param)
                        if (system === null) {
                            System.err.println("Error: could not load compilation system \""+param+"\"")
                        }
                        shouldCompile = (system !== null)
                    }
                }
            }
        }
        
        synchronized(this) {
            stopped = true
            notifyAll()
        }
        
        return IApplication.EXIT_OK
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
        selectors.forEach([selector |
            // Skip file(s) if application should stop
            if (shouldStop) return;
            // check file
            var file = new File(selector)
            if (!file.exists) System.err.println("Could not find file or directory: "+selector)
            else if (file.isDirectory) {
                // get a list of all files in this folder (with recursion)
                handleSpecifiers(
                    Files.walk(Paths.get(file.path))
                        .filter([p|Files::isRegularFile(p)])
                        .map([path|path.toString])
                    , false
                )
            } else {
                if (!file.name.toLowerCase(Locale.ROOT).endsWith(SCCHART_FILE_EXTENSION)) {
                    if (isDirect) System.err.println("File is not a SCCharts file: "+selector)
                }
                else if (!file.canRead) System.err.println("File is not readable: "+selector)
                else handleFile(file)
            }
        ])
    }
    
    /**
     * this method gets the default output file for a input file and the specified output format
     */
    def File getOutputFile(File inputFile, OutputFormat format) {
        val absPath = inputFile.absolutePath
        return new File(
            absPath.substring(0, absPath.length-SCCHART_FILE_EXTENSION.length)
                + getExtension(format)
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
        println("Rendering file: "+file.path)
        
        // get model
        val scchart = loadModel(file) as SCCharts
        
        // and render it
        renderModel("file: "+file.path, scchart, format, outputFile.absolutePath)
    }
    
    /**
     * This method renders and compiles a file according to the current state.
     * Errors are printed to std-err.
     */
    private def handleFile(File file) {
        println("Handling file: "+file.path)
        
        // get model
        val model = loadModel(file)
        
        // and render model if requested
        if (shouldRender) {
            renderModel(
                    "file: "+file.path,
                    model as SCCharts,
                    renderFormat,
                    getOutputFile(file, renderFormat).absolutePath
            )
        }
        
        // Handle Compilation if requested.
        if (shouldCompile) {
            val cc = Compile.createCompilationContext(system, model)
            val resultEnv = cc.compile
            // Save files inside a CodeContainer.
            if (resultEnv.model instanceof CodeContainer) {
                val codeContainer = resultEnv.model as CodeContainer
                for (codeFileEntry : codeContainer.files) {
                    try {
                        // Write code into file.
                        val codeFile = new File(file.parent + "/" + codeFileEntry.fileName)
                        val PrintWriter out = new PrintWriter(codeFile)
                        out.print(codeFileEntry.code)
                        out.close
                    } catch (IOException e) {
                        System.err.print("Error saving compilation result: "+e.message)
                    }
                }
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
              model
            , getRenderingTargetType(format)
            , targetFile
        );
        
        // check if rendering was successful
        if (!result.OK) {
            System.err.println("Error Rendering "+modelSrcDescription)
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
        synchronized(this) {
            // Request application to stop and wait until application is stopped.
            while (!stopped) {
                shouldStop = true
                wait()
            }
        }
    }
    
}