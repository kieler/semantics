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
package de.cau.cs.kieler.language.server.registration

import com.google.inject.Inject
import com.google.inject.Injector
import java.util.ArrayList
import org.apache.log4j.Logger
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.xtext.ide.server.concurrent.RequestManager
import java.util.List
import de.cau.cs.kieler.scl.ide.SCLIdeModule
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.Grammar

/**
 * Implements methods to extend the LSP to allow compilation
 * 
 * @author sdo
 * 
 */
class RegistrationLanguageServerExtension implements ILanguageServerExtension, CommandExtension {

    protected static val LOG = Logger.getLogger(RegistrationLanguageServerExtension)
    
    @Inject @Accessors(PUBLIC_GETTER) RequestManager requestManager
    
    @Inject
    Injector injector

    protected extension ILanguageServerAccess languageServerAccess
    
    override initialize(ILanguageServerAccess access) {
        this.languageServerAccess = access
    }
    def ILanguageServerAccess getLanguageServerAccess() {
        return languageServerAccess
    }
    
    override getLanguages() {
        val sclKeywords = #['_','bool','call','combine','conflict','confluent','const','else','end','expression','extern',
        'float','fork','global','goto','host','if','input','int','join','max','min','module','none','output','par',
        'pause','pre','print','pure','random','randomize','ref','run','schedule','scope','signal','static','string',
        'then','to','unsigned','val']
        val kextKeywords = #['_','bool','call','combine','conflict','confluent','const','expression','extern',
        'float','global','host','input','int','max','min','none','output','pre','print','pure','random','randomize',
        'ref','schedule','scope','signal','static','string','unsigned','val']
        val esterelKeywords = #[]
        val lustreKeywords = #[]
        val kgtKeywords = #['absolutePos','actions','anchor','areaData','background','bevel','bold','bottom',
        'bottomRightAnchor','center','chord','clipShape','columns','custom','dash','dashOffset','dashPattern',
        'decoratorData','dot','double','doubleClick','error','flat','flexibleHeight','flexibleWidth','fontName',
        'fontSize','foreground','grid','gridData','hAlign','height','horizontalAlignment','horizontalMargin','insets',
        'invisible','italic','junction','karc','kchildArea','kcustomRendering','kedge','kellipse','kgraph','kimage',
        'klabel','knode','kpolygon','kpolyline','kport','krectangle','krendering','krenderingLibrary','kroundedPolyline',
        'kroundedRectangle','kspline','kstylesTemplate','ktext','left','lineCap','lineJoin','lineStyle','lineWidth',
        'link','middleDoubleClick','middleSingleClick','middleSingleOrMultiClick','minCellHeight','minCellWidth',
        'minimalHeight','minimalWidth','miter','modifier','none','null','open','pie','pointData','points','pos','propagate',
        'properties','reference','referencePoint','relativePos','right','rotateWithLine','rotation','round','scale',
        'selection','shadow','single','singleClick','singleOrMultiClick','size','solid','square','squiggle','styles',
        'top','topLeftAnchor','underline','vAlign','verticalAlignment','verticalMargin','width','x','xoffset','y',
        'yoffset']
        val list = new ArrayList()
        list.add(new Language("scl", "SCL", sclKeywords))
        list.add(new Language("anno", "Annotations", #[]))
        list.add(new Language("kext", "Kext", kextKeywords))
        list.add(new Language("strl", "Esterel", new ArrayList))
        list.add(new Language("lus", "Lustre", new ArrayList))
        list.add(new Language("kgt", "KGraph", new ArrayList))
        return requestManager.runRead[ cancelIndicator |
            list
        ]
    }
}

@Data
class Language {
    String id
    String name
    List<String> keywords
    
}