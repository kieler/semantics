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
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.reconstr.impl.KeywordSerializer;

import com.google.inject.Inject;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.text.kits.services.KitsGrammarAccess;

/**
 * @author chsch
 *
 */
public class KitsKeywordSerializer extends KeywordSerializer {
    
    @Inject
    KitsGrammarAccess grammarAccess;

    public boolean isValid(EObject context, Keyword keyword, Object value, IErrorAcceptor errorAcceptor) {
        
        if (keyword == grammarAccess.getRootRegionAccess().getRegionKeyword_2_0()
                || keyword == grammarAccess.getRootRegionAccess().getColonKeyword_2_3()
                || keyword == grammarAccess.getSingleRegionAccess().getRegionKeyword_1_0()
                || keyword == grammarAccess.getSingleRegionAccess().getColonKeyword_1_3()) {
            Region region = (Region) context;
            return !(region.getId() == null
                    && region.getLabel() == null
                    && (region.getSignals() == null || region.getSignals().isEmpty())
                    && (region.getVariables() == null || region.getVariables().isEmpty()));
        }
        return super.isValid(context, keyword, value, errorAcceptor);
    }
    
    public String serializeUnassignedKeyword(EObject context, Keyword keyword, AbstractNode node) {
        if (keyword == grammarAccess.getRootRegionAccess().getRegionKeyword_2_0()
                || keyword == grammarAccess.getRootRegionAccess().getColonKeyword_2_3()
                || keyword == grammarAccess.getSingleRegionAccess().getRegionKeyword_1_0()
                || keyword == grammarAccess.getSingleRegionAccess().getColonKeyword_1_3()) {
            Region region = (Region) context;
            if (region.getLabel() == null
                    && (region.getSignals() == null || region.getSignals().isEmpty())
                    && (region.getVariables() == null || region.getVariables().isEmpty())) {
                return null;
            }
        }
        return super.serializeUnassignedKeyword(context, keyword, node);
    }


}
