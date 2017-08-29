/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.annotations.formatting;

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.annotations.Annotatable
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.AnnotationsStandaloneSetup
import de.cau.cs.kieler.annotations.CommentAnnotation
import java.io.ByteArrayInputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.Strings

/**
 * Custom
 * {@link org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService
 * AbstractDeclarativeValueConverterService} that contributes value converters
 * dedicated to the COMMENT_ANNOTATION terminal and the EString data type,
 * defined in the Annotations grammar.
 * 
 * @author chsch ssm
 */
public class AnnotationsValueConverter extends DefaultTerminalConverters {

    static val Injector injector = new AnnotationsStandaloneSetup().createInjectorAndDoEMFRegistration();

    /**
     * Provides comment annotation converter dropping/attaching the leading/trailing characters.
     * 
     * @return dedicated value converter
     */
    @ValueConverter(rule = "COMMENT_ANNOTATION")
    def IValueConverter<String> convertCommentAnnotation() {
        return new IValueConverter<String>() {

            override String toValue(String string, INode node) {
                
                val lines = string.replace("/**", "").replace("*/", "").replaceAll("\\r", "").trim.split("\n")
                val newLines = <String> newArrayList
                for (i : 0..lines.length - 1) {
                    var add = true
                    val newLine = lines.get(i).replaceFirst("^\\s*\\*\\s*", "")
                    
                    if (newLine.startsWith("@")) {
                        val commentAnnotation = node.parent.semanticElement
                        if (commentAnnotation instanceof CommentAnnotation) {
                            if (commentAnnotation.parseAnnotation(newLine)) add = false        
                        }             
                    }
                    
                    if (add) newLines += newLine
                }
                
                val newString = newLines.join("\n")
                return newString
            }
    
            override String toString(String value) {
                if (Strings.isEmpty(value)) {
                    return null;
                } else {
                    val lines = value.split("\n")
                    if (lines.length > 1) for (i : 1..lines.length - 1) {
                        var newLine = lines.get(i).replaceFirst("\\s+\\*", " *")
                        if (!newLine.startsWith(" *") && !newLine.startsWith("/**")) newLine = " * " + newLine
                        lines.set(i, newLine)
                    }                   
                    
                    return "/**\n " + lines.join("\n") + "\n */";
                }
            }
        };
    }
    
    private def boolean parseAnnotation(Annotatable annotatable, String text) {
        try {
            val resourceSet = injector.getInstance(XtextResourceSet)
            val resource = resourceSet.createResource(URI.createURI("dummy:/example.anno"))
            val in = new ByteArrayInputStream(text.getBytes)
            resource.load(in, resourceSet.getLoadOptions());
            val annotationModel = resource.getContents().get(0)
            if (annotationModel instanceof Annotation) {
                annotatable.annotations += annotationModel
                return true
            }
        } catch (Exception e) {}
        return false
    }
    
    
    
    @Inject private QualifiedIDValueConverter qualifiedIDValueConverter;
    
    @ValueConverter(rule = "QualifiedID") 
    def IValueConverter<String> convertQualifiedID() {
        return qualifiedIDValueConverter;
    }
    
    @Inject private ExtendedIDValueConverter extendedIDValueConverter;
    
    @ValueConverter(rule = "ExtendedID") 
    def IValueConverter<String> convertExtendedID() {
        return extendedIDValueConverter;
    }    
    
    /**
     * Provides EString converter dropping/attaching the leading/trailing character.
     * 
     * @return dedicated value converter
     */
    @ValueConverter(rule = "EString")
    def IValueConverter<String> convertEString() {
        return genericStringValueConverter();
    }

    @ValueConverter(rule = "EStringBoolean")
    def IValueConverter<String> convertEStringBoolean() {
        return genericStringValueConverter();
    }

    @ValueConverter(rule = "EStringAllTypes")
    def IValueConverter<String> convertEStringAllTypes() {
        return genericStringValueConverter();
    }
    
    def IValueConverter<String> genericStringValueConverter() {
        return new IValueConverter<String>() {

            override String toValue(String string, INode node) {
                if (!Strings.isEmpty(string)) {
                    if (string.startsWith("\"") || string.startsWith("'")) {
                        return removeEscapeChars(string.substring(1, string.length() - 1));
                    } else {
                        return string;
                    }
                }
                return "";
            }

            override String toString(String value) {
                var String res = "\"\"";
                if (!Strings.isEmpty(value)) {
                    try {
                        res = AnnotationsValueConverter.this.getConverter("ID").toString(value);
                    } catch (ValueConverterException e) {
                        res = AnnotationsValueConverter.this.getConverter("STRING").toString(value);
                    }
                }
                return res;
            }
        };

    }
    
    public static def String removeEscapeChars(String string) {
        return string.replaceAll("\\\\\\\"", "\"").replaceAll("\\\\\\\\", "\\\\");
    }    
}
