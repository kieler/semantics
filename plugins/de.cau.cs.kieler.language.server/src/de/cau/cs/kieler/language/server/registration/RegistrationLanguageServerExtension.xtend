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
        val list = new ArrayList()
        list.add(new Language("scl", "SCL"))
        list.add(new Language("anno", "Annotations"))
        list.add(new Language("kext", "Kext"))
        list.add(new Language("strl", "Esterel"))
        list.add(new Language("lus", "Lustre"))
        list.add(new Language("kgt", "KGraph"))
        return requestManager.runRead[ cancelIndicator |
            list
        ]
    }
}

@Data
class Language {
    String id
    String name
//    MonarchLanguage monarchLanguage
//    MonarchConfiguration configuration
    
}

@Data
class MonarchConfiguration {
    String wordPattern
    Comments comments
    List<List<String>> brackets
    AutoClosingPairs autoClosingPairs
}

@Data
class Comments {
    String lineComment
    List<String> blockComment
}

@Data
class AutoClosingPairs {
    String open
    String close
    List<String> notIn
}

@Data
class MonarchLanguage {
    String tokenPostfix
    List<String> keywords
    String symbols
    String escapes
    String digits
    String octaldigits
    String binarydigits
    String hexdigits
    Tokenizer tokenizer
}

@Data
class Tokenizer {
    Root root
    Whitespace whitespace
    Comment comment
    MString string
    SingleQuotedString singleQuotedString
}

@Data 
class Root {
    
}

@Data
class Whitespace {
    //TODO
}

@Data
class Comment {
    //TODO
}

@Data
class MString {
    //TODO 
}

@Data
class SingleQuotedString {
    //TODO
}
