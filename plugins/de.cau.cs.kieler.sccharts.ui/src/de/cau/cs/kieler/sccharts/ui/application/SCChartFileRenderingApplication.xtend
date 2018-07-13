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

class SCChartFileRenderingApplication implements IApplication {
    
    // states for handling command line input
    private enum InputState {
        NONE,
        INPUT_FILE
    }
    
    val String SCCHART_FILE_EXTENSION = ".sctx"
    val String SVG_FILE_EXTENSION = ".svg"
    val String BMP_FILE_EXTENSION = ".bmp"
    val String PNG_FILE_EXTENSION = ".png"
    val String JPEG_FILE_EXTENSION = ".jpeg"
    
    // a reference to the resource set to load a SCChart, so it is created only once
    var XtextResourceSet resourceSet = null
    // informations about the output type
    var String outputType = IOffscreenRenderer.SVG
    var String outputExtension = SVG_FILE_EXTENSION
    
    override start(IApplicationContext context) throws Exception {
        // mark this application as running
        context.applicationRunning
        
        var args = context.arguments.get(IApplicationContext.APPLICATION_ARGS) as String[]
        var inpState = InputState.NONE // no special meaning of next parameter
        outputType = IOffscreenRenderer.SVG
        outputExtension = SVG_FILE_EXTENSION
        
        // read from stdIn if no parameters are specified
        if (args.length == 0) {
            args = #["-in", "-"]
        }
        
        // read parameters and execute their meaning (in order)
        for (param : args) {
            switch (inpState){
                case NONE: {
                    var lowerParam = param.toLowerCase(Locale.ROOT)
                    if (lowerParam == "-help") {
                        // help is requested
                        println("This is a program to render SCCharts into files. (default: SVG)")
                        println("Parameter:")
                        println("  -help      : shows this help")
                        println("  -svg       : all following files are rendered to SVG")
                        println("  -png       : all following files are rendered to PNG")
                        println("  -bmp       : all following files are rendered to BMP")
                        println("  -jpeg      : all following files are rendered to JPEG")
                        println("  -in -      : reads a list of SCCharts file Paths to render from input")
                        println("  -in <file> : reads a list of SCCharts file Paths to render from specified file")
                        println("  <file>     : a SCCharts file Path to render")
                        println("Any parameter may be used multiple times.")
                        println("Using a folder as a SCChrat file results in a recursive search")
                        println("for SCCharts files to render.")
                        println("The SVG-File is saved in the same location as the SCChrat file")
                        println("with a different file name extension.")
                        println("If no parameter for this application is specified, then the parameter")
                        println("\"-in -\" is assumed")
                    } else if (lowerParam == "-in") {
                        // next parameter is a file to read target SCCharts from
                        inpState = InputState.INPUT_FILE
                    } else if (lowerParam == "-svg") {
                        outputType = IOffscreenRenderer.SVG
                        outputExtension = SVG_FILE_EXTENSION
                    } else if (lowerParam == "-png") {
                        outputType = IOffscreenRenderer.PNG
                        outputExtension = PNG_FILE_EXTENSION
                    } else if (lowerParam == "-bmp") {
                        outputType = IOffscreenRenderer.BMP
                        outputExtension = BMP_FILE_EXTENSION
                    } else if (lowerParam == "-jpeg") {
                        outputType = IOffscreenRenderer.JPEG
                        outputExtension = JPEG_FILE_EXTENSION
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
            }
        }
        
        return IApplication.EXIT_OK
    }
    
    /**
     * this method takes a stream of file-path-strings and recurses into folders rendering SCChart files
     */
    def void handleSpecifiers(Stream<String> selectors, boolean isDirect) {
        selectors.forEach([selector |
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
                else renderSCChart(file)
            }
        ])
    }
    
    /**
     * this method takes a file pointing to a SCChart file which should be rendered as SVG.
     * The SVG gets saved in the same place as the SCChart with different file extension.
     */
    def void renderSCChart(File file) {
        println("Rendering file: "+file.path)
        
        // get output file path
        val absPath = file.absolutePath
        val targetFile = absPath.substring(0, absPath.length-SCCHART_FILE_EXTENSION.length) + outputExtension
        
        // initialize resource set if not done already
        if (resourceSet === null) {
            val scchartsInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration
            resourceSet = scchartsInjector.getInstance(XtextResourceSet);
            // initialize some display for rendering
            Display.^default
        }
        
        // get the SCChart
        val resource = resourceSet.getResource(URI.createFileURI(absPath), true)
        val scchart = resource.getContents().head as SCCharts
        
        // render the SCChart
        val IStatus result = LightDiagramServices.renderOffScreen(
              scchart
            , outputType
            , targetFile
            //, null
        );
        
        // check if rendering was successful
        if (!result.OK) {
            System.err.println("Error Rendering file: "+file.path)
            System.err.println(result)
            result.exception.printStackTrace
        }
        
    }
    
    override stop() {}
    
}