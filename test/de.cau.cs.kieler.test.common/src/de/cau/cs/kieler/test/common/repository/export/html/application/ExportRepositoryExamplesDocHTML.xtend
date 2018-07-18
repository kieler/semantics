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
package de.cau.cs.kieler.test.common.repository.export.html.application

import de.cau.cs.kieler.sccharts.ui.application.SCChartFileRenderingApplication
import de.cau.cs.kieler.sccharts.ui.application.SCChartFileRenderingApplication.OutputFormat
import de.cau.cs.kieler.test.common.repository.ModelsRepository
import de.cau.cs.kieler.test.common.repository.TestModelData
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.URL
import java.util.ArrayList
import java.util.Comparator
import java.util.HashMap
import java.util.List
import org.eclipse.equinox.app.IApplication
import org.eclipse.equinox.app.IApplicationContext

/**
 * @author mek
 *
 */
class ExportRepositoryExamplesDocHTML implements IApplication {
    
    override start(IApplicationContext context) throws Exception {
        // mark application as running
        context.applicationRunning
        
        // get models
        val models = ModelsRepository.models
        
        // group models by documentation Tags
        val modelsByTag = <String, List<TestModelData>>newHashMap()
        val allDocuModels = newLinkedList()
        for (model: models) {
            // is this model a model for the documentation?
            if (model.additionalProperties.containsKey("docuTags")) {
                // add it to the corresponding documentation lists
                allDocuModels.add(model)
                for (tag: model.docuTags) {
                    val list = modelsByTag.computeIfAbsent(tag, [e| newLinkedList()])
                    list.add(model)
                }
            }
        }
        
        // (re)render all documentation models
        val renderer = new SCChartFileRenderingApplication
        renderer.init
        for (model: allDocuModels) {
            val path = model.repositoryPath +"/"+ model.modelPath
            val outputPath = path.substring(0, path.length-4)+"svg"
            val srcFile = new File(path)
            val newFile = new File(outputPath)
            // only re-render if source file is newer
            if (!newFile.exists || srcFile.lastModified >= newFile.lastModified) {
                renderer.renderSCChart(srcFile, OutputFormat.SVG)
            }
        }
        
        // Load HTML templates
        val idxTmpl = getFileContents("platform:/plugin/de.cau.cs.kieler.test.common/resources/DocHTML/idx.html")
        val idxNavTmpl = getFileContents("platform:/plugin/de.cau.cs.kieler.test.common/resources/DocHTML/idxNav.html")
        val mainTmpl = getFileContents("platform:/plugin/de.cau.cs.kieler.test.common/resources/DocHTML/main.html")
        val navTmpl = getFileContents("platform:/plugin/de.cau.cs.kieler.test.common/resources/DocHTML/nav.html")
        val entryTmpl = getFileContents("platform:/plugin/de.cau.cs.kieler.test.common/resources/DocHTML/entry.html")
        
        modelsByTag.put("All", allDocuModels)
        
        // get sorted list of all tags
        val tags = new ArrayList<String>(modelsByTag.keySet)
        tags.sort
        
        // make sure the doc folder exists
        new File("./doc").mkdir
            
        // build index
        {
            var idxNav = new StringBuilder
            // create the concatenation of all links
            for (tag: tags) {
                val tagModels = modelsByTag.get(tag)
                
                var data = newHashMap
                data.put("NAV_TARGET", extractValidFileName(tag)+".html")
                data.put("NAV_NAME", tag+" ("+tagModels.size+")")
                
                idxNav.append(applyTemplate(idxNavTmpl, data))
            }
            
            var data = newHashMap
            data.put("NAV", idxNav.toString)
            data.put("TITLE", "Examples")
            
            // save to file
            val out = new OutputStreamWriter(new FileOutputStream(new File("./doc/index.html")))
            out.write(applyTemplate(idxTmpl, data))
            out.flush
            out.close
        }
        
        // build subPage
        {
            // get navigation content which is the same for each tag-page
            var nav_builder = new StringBuilder
            for (tag: tags) {
                 val tagModels = if (tag == "All") allDocuModels else modelsByTag.get(tag)
                
                var data = newHashMap
                data.put("NAV_TARGET", extractValidFileName(tag)+".html")
                data.put("NAV_NAME", tag+" ("+tagModels.size+")")
                
                nav_builder.append(applyTemplate(navTmpl, data))
            }
            var main_data = newHashMap
            main_data.put("NAV", nav_builder.toString)
            
            // build a page for each tag
            for (tag: tags) {
                val model_contend_builder = new StringBuilder
                
                // sort models so the output is ordered
                val tagModels = modelsByTag.get(tag)
                tagModels.sort(Comparator.comparing([model|model.modelFile]))
                
                var num = 1
                // build the list of examples as one concatenation
                for (model: tagModels) {
                    var data = newHashMap
                    val path = model.repositoryPath +"/"+ model.modelPath
                    
                    data.put("LABEL_NAME", "Example_"+num)
                    data.put("TITLE", "Example #"+num+" - "+model.modelFile)
                    data.put("CODE", getFileContents(new File(path)))
                    data.put("SVG_LOCATION", "file:///"+path.substring(0, path.length-4)+"svg")
                    
                    model_contend_builder.append(applyTemplate(entryTmpl, data))
                    num++
                }
                main_data.put("CONTEND", model_contend_builder.toString)
                main_data.put("TITLE", "Examples - "+tag)
                main_data.put("HEADLINE", "Examples for \""+tag+"\" ("+tagModels.size+")")
                
                // save to file
                val out = new OutputStreamWriter(new FileOutputStream(new File("./doc/"+extractValidFileName(tag)+".html")))
                out.write(applyTemplate(mainTmpl, main_data))
                out.flush
                out.close
            }
        }
        
        
        return IApplication.EXIT_OK
    }
    
    /**
     * this method returns a string based on the input,
     * which has only characters which are valid in a file name
     */
    def String extractValidFileName(String name) {
        val newName = new StringBuilder(name.length)
        
        val iterator = name.codePoints.iterator
        while (iterator.hasNext) {
            val int c = iterator.next
            if (Character.isAlphabetic(c) || Character.isDigit(c) || c == "-" || c == "_") {
                newName.appendCodePoint(c);
            }
        }
        
        return newName.toString
    }
    
    /**
     * gets the (String) contents of a file referred by a URL String
     * with \n as line break or "" on error
     */
    def String getFileContents(String resource) {
         try {
            val URL url = new URL(resource)
            val InputStream inputStream = url.openConnection().getInputStream()
            
            return getFileContents(inputStream)
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ""
    }
    
    /**
     * gets the (String) contents of a file
     * with \n as line break or "" on error
     */
    def String getFileContents(File file) {
         try {
            return getFileContents(new FileInputStream(file))
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ""
    }
    
    /**
     * gets the (String) contents of the provided InputStream
     * with \n as line break or "" on error
     */
    def String getFileContents(InputStream inputStream) {
         try {
            val BufferedReader in = new BufferedReader(new InputStreamReader(inputStream))
            var String inputLine
            val sb = new StringBuilder
            
            while ((inputLine = in.readLine) !== null) {
                sb.append(inputLine)
                sb.append('\n')
            }
            in.close()
            
            return sb.toString
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ""
    }
    
    /**
     * returns the template string with all keys surrounded by double dollars ("$$KEY$$")
     * being replaced with the corresponding map entry
     */
    def String applyTemplate(String template, HashMap<String, String> values) {
        val sb = new StringBuilder
        
        // run thru the text
        var pos = 0
        do {
            // find next placeholder
            val nextPlaceholder = template.indexOf("$$", pos)
            if (nextPlaceholder>=0) {
                // append text before placeholder
                sb.append(template, pos, nextPlaceholder)
                // append placeholder value
                var placeholderEnd = template.indexOf("$$", nextPlaceholder+2)
                if (placeholderEnd<0) {
                    System.err.println("Invalid Placeholder in Template")
                    placeholderEnd = nextPlaceholder+2
                }
                sb.append(values.get(template.subSequence(nextPlaceholder+2, placeholderEnd)))
                pos = placeholderEnd+2
            } else {
                // no more placeholder
                sb.append(template, pos, template.length)
                pos = template.length
            }
            // while there is more to append
        } while (pos < template.length)
        
        return sb.toString
    }
    
    override stop() {}
    
}