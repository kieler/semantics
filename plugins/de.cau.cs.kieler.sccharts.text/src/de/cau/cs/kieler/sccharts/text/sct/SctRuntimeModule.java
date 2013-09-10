/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text.sct;

/**
 * @author chsch
 *
 */
public class SctRuntimeModule extends
        de.cau.cs.kieler.sccharts.text.sct.AbstractSctRuntimeModule {

    public Class<? extends org.eclipse.xtext.resource.XtextResource> bindXtextResource() {
        return SctResource.class;
    }

    public Class<? extends org.eclipse.xtext.linking.ILinker> bindILinker() {
        return SctLinker.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITransientValueService> bindITransientValueService() {
        return SctTransientValueService.class;
    }

    public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
        return de.cau.cs.kieler.sccharts.text.sct.formatting.SctValueConverter.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IKeywordSerializer> bindIKeywordSerializer() {
        return de.cau.cs.kieler.sccharts.text.sct.formatting.SctKeywordSerializer.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IValueSerializer> bindIValueSerializer() {
        return de.cau.cs.kieler.sccharts.text.sct.formatting.SctValueSerializer.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IEnumLiteralSerializer> bindIEnumLiteralSerializer() {
        return de.cau.cs.kieler.sccharts.text.sct.formatting.SctEnumLiteralSerializer.class;
    }

    public Class<? extends org.eclipse.xtext.formatting.IIndentationInformation> bindIIndentationInformation() {
        return de.cau.cs.kieler.sccharts.text.sct.formatting.SctIndentionInformation.class;
    }

}
