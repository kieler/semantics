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
package de.cau.cs.kieler.sccharts.text.sct;

import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.linking.impl.Linker;

import de.cau.cs.kieler.sccharts.text.sct.formatting.SctEnumLiteralSerializer;
import de.cau.cs.kieler.sccharts.text.sct.formatting.SctIndentionInformation;
import de.cau.cs.kieler.sccharts.text.sct.formatting.SctKeywordSerializer;
import de.cau.cs.kieler.sccharts.text.sct.formatting.SctValueConverter;
import de.cau.cs.kieler.sccharts.text.sct.formatting.SctValueSerializer;
import de.cau.cs.kieler.sccharts.text.sct.scoping.SctQualifiedNameProvider;
import de.cau.cs.kieler.sccharts.text.sct.scoping.SctScopeProvider;
import de.cau.cs.kieler.sccharts.text.sct.validation.SctValidator;

/**
 * Sct runtime modules binding.
 * 
 * @author chsch
 * @author als 
 */
public class SctRuntimeModule extends de.cau.cs.kieler.sccharts.text.sct.AbstractSctRuntimeModule {

    public Class<? extends org.eclipse.xtext.resource.XtextResource> bindXtextResource() {
        return SctResource.class;
    }

    public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return SctQualifiedNameProvider.class;
    }

    public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
        return SctScopeProvider.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITransientValueService> bindITransientValueService() {
        return SctTransientValueService.class;
    }

    public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
        return SctValueConverter.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IKeywordSerializer> bindIKeywordSerializer() {
        return SctKeywordSerializer.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IValueSerializer> bindIValueSerializer() {
        return SctValueSerializer.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IEnumLiteralSerializer> bindIEnumLiteralSerializer() {
        return SctEnumLiteralSerializer.class;
    }

    public Class<? extends org.eclipse.xtext.formatting.IIndentationInformation> bindIIndentationInformation() {
        return SctIndentionInformation.class;
    }
    
    @org.eclipse.xtext.service.SingletonBinding(eager=true) public Class<? extends de.cau.cs.kieler.sccharts.text.sct.validation.SctJavaValidator> bindSctJavaValidator() {
        return SctValidator.class;
    }
    
    public Class<? extends ILinker> bindILinker() {
        return SctLinker.class;
    }    

}
