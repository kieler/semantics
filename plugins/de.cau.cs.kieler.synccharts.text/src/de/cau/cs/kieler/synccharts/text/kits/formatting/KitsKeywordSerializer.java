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
package de.cau.cs.kieler.synccharts.text.kits.formatting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parsetree.reconstr.ITokenSerializer;
import org.eclipse.xtext.parsetree.reconstr.impl.KeywordSerializer;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Inject;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.text.kits.services.KitsGrammarAccess;

/**
 * Customized {@link ITokenSerializer.IKeywordSerializer}. Realizes the suppression of the keyword
 * 'region' and the related ':' if it is not needed.
 * 
 * Behavior is realized by overriding the
 * {@link KeywordSerializer#serializeUnassignedKeyword(EObject, Keyword, AbstractNode)} method,
 * overriding the
 * {@link KeywordSerializer#isValid(EObject, Keyword,
 * Object, org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IErrorAcceptor)}
 * does not lead to the intended behavior.
 * 
 * @author chsch
 */
public class KitsKeywordSerializer extends KeywordSerializer {
    
    @Inject
    KitsGrammarAccess grammarAccess;

    public String serializeUnassignedKeyword(EObject context, Keyword keyword, INode node) {
        if (keyword == grammarAccess.getRootRegionAccess().getRegionKeyword_1_1()
                || keyword == grammarAccess.getRootRegionAccess().getColonKeyword_1_4()) {
            Region region = (Region) context;
            if (Strings.isEmpty(region.getId())
                    && Strings.isEmpty(region.getLabel())
                    && (region.getAnnotations() == null || region.getAnnotations().isEmpty())
                    && (region.getSignals() == null || region.getSignals().isEmpty())
                    && (region.getVariables() == null || region.getVariables().isEmpty())) {
                return null;
            }
        }
        if (keyword == grammarAccess.getSingleRegionAccess().getRegionKeyword_0_1()
                || keyword == grammarAccess.getSingleRegionAccess().getColonKeyword_0_4()) {
            Region region = (Region) context;
            if (region.eContainer() != null
                    && ((State) region.eContainer()).getRegions().size() == 1
                    && Strings.isEmpty(region.getId())
                    && Strings.isEmpty(region.getLabel())
                    && (region.getAnnotations() == null || region.getAnnotations().isEmpty())
                    && (region.getSignals() == null || region.getSignals().isEmpty())
                    && (region.getVariables() == null || region.getVariables().isEmpty())) {
                return null;
            }
        }
        return super.serializeUnassignedKeyword(context, keyword, node);
    }


}
