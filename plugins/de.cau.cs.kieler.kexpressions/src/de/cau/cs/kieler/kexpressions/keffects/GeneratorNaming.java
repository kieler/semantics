/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kexpressions.keffects;

import static org.eclipse.xtext.GrammarUtil.getNamespace;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.Naming;

/**
 * @author ssm
 * @kieler.design 2017-07-27 proposed 
 * @kieler.rating 2017-07-27 proposed yellow 
 *
 */
public class GeneratorNaming extends Naming {

    @Override
    public String basePackageUi(Grammar g) {
        String grammarPackageName = getNamespace(g);
        int nameIndex = grammarPackageName.lastIndexOf('.');
        
        String grammarPackageNameFront = grammarPackageName.substring(0, nameIndex);
        String grammarPackageNameBack = grammarPackageName.substring(nameIndex + 1);
        
        String basePackageUiName;
        if (grammarPackageNameBack.equals("kexpressions")) {
            basePackageUiName = grammarPackageName + ".ui";
        } else {
            basePackageUiName = grammarPackageNameFront + ".ui." + grammarPackageNameBack;
        }
        
        return basePackageUiName;
    }
    
}
