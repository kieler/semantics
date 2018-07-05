/**
 * HelpFileGenerator contains the code generation templates used in EHelpGenerator for
 * toc and html file generation.
 * 
 * @author 	Christian Motika
 * @date	10.10.2017
 * 
 */
package de.cau.cs.kieler.ehelp.generator

import de.cau.cs.kieler.ehelp.eHelp.Chapter
import de.cau.cs.kieler.ehelp.eHelp.Content
import de.cau.cs.kieler.ehelp.eHelp.EHelpModel
import de.cau.cs.kieler.ehelp.eHelp.Enum
import de.cau.cs.kieler.ehelp.eHelp.Images
import de.cau.cs.kieler.ehelp.eHelp.Keyword
import de.cau.cs.kieler.ehelp.eHelp.Link
import de.cau.cs.kieler.ehelp.eHelp.List
import de.cau.cs.kieler.ehelp.eHelp.ListItem
import de.cau.cs.kieler.ehelp.eHelp.Text
import de.cau.cs.kieler.ehelp.util.EHelpConsts
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.ehelp.eHelp.Table
import de.cau.cs.kieler.ehelp.eHelp.TableRow
import de.cau.cs.kieler.ehelp.eHelp.TableCell
import de.cau.cs.kieler.ehelp.eHelp.Context
import de.cau.cs.kieler.ehelp.eHelp.ConfigPath

/**
 * This class contains the code generation templates used in EHelpGenerator for
 * toc and html file generation.
 */
class HelpFileGenerator {

    // -------------------------------------------------------------------------
    // --          G E N E R A T E   F I L E S   T O C   A N D    H T M L 
    // -------------------------------------------------------------------------
    //
    // -------------------------------------------------------------------------
    // Entry for keyword index.xml generation 
    public def generateKeywordXml(EHelpModel model) {
        var returnText = '''<?xml version="1.0" encoding="UTF-8"?>''' + "\n\n"
        returnText += '''<index>''' + "\n"
        val keywords = model.eAllContents.filter(typeof(Keyword)).toList
        for (keyword : keywords) {
            val keywordParentChapter = keyword.parentChapter
            if (keywordParentChapter !== null) {
                returnText += '''<entry keyword="«keyword.text»">''' + "\n"
                returnText +=
                    '''<topic href="«model.path»«keywordParentChapter.fileName».«EHelpConsts.htmlFileExtension»" />''' + "\n"
                returnText += '''</entry>''' + "\n"
            }
        }
        returnText += '''</index>'''
        return returnText
    }

    // Entry for complete help content file (HelpComplete.html) generation 
    public def generateCompleteDocumentation(EHelpModel model) {
        var returnText = '''<html>
                            <body><h1>
                            <span lang="EN-US">«EHelpConsts.getMainTitle»</span></h1>'''

        val allChapters = model.eAllContents.filter(typeof(Chapter)).toList

        for (chapter : allChapters) {

            returnText += '''<a id="«chapter.chaperIndex»">'''
            returnText += '''<h2>
                            <span lang="EN-US">«chapter.getChapterNumber» «chapter.title»</span></h2>'''
            returnText += '''</a>'''

            for (content : chapter.content) {

                returnText += content.expandContent(true)
            }

            returnText += '''<br> <br>'''
        }

        returnText += '''</body></html>'''
        return returnText
    }

    // Entry for context sensitive index file content.xml generation 
    public def generateContextXml(EHelpModel model) {
        var returnText = '''<?xml version="1.0" encoding="UTF-8"?>''' + "\n\n"
        returnText += '''<contexts>''' + "\n"
        val contexts = model.eAllContents.filter(typeof(Context)).toList
        for (context : contexts) {
            val contextParentChapter = context.parentChapter
            if (contextParentChapter !== null) {
                returnText += '''<context id="«context.id»«EHelpConsts.contextIdPostfix»">''' + "\n"
                returnText +=
                    '''<topic href="«model.path»«contextParentChapter.fileName».«EHelpConsts.htmlFileExtension»" label="«context.label»"  />''' +
                        "\n"
				returnText += '''</context>''' + "\n"
                    }
                }
                returnText += '''</contexts>'''
                return returnText
            }

            //
            // -------------------------------------------------------------------------
            // Entry for subchapter outline generation 
            public def generateSubchapterOutlineHtml(Chapter chapter, boolean beforeContent) {
                var returnText = ''''''
                val chapterGeneratedImplicitOutline = EHelpConsts.generateImplicitOutline
                if (chapterGeneratedImplicitOutline > 0) {
                    // if all (2) or only if no other content than chapter (1)
                    val chapterContentOtherThanSubChapters = chapter.content.size > 0
                    if ((chapterContentOtherThanSubChapters && chapterGeneratedImplicitOutline == 2 && beforeContent) ||
                        (chapterContentOtherThanSubChapters && chapterGeneratedImplicitOutline == 3 &&
                            !beforeContent) || (!chapterContentOtherThanSubChapters && beforeContent)) {
                        // Implicit outline generation
                        if (chapter.subchapters.size > 0) {
                            returnText += '''<p><p><br>Subchapters:</p><ol>'''
                            for (subchapter : chapter.subchapters) {
                                val subchapter2 = subchapter as Chapter
                                if (subchapter2 != null) {
                                    returnText +=
                                        '''<li><a href="«subchapter2.fileName».«EHelpConsts.htmlFileExtension»">«subchapter2.title»</a></li>'''
                                }
                            }
                            returnText += '''</ol></p>'''
                        }
                    }
                }
                return returnText
            }

            //
            // -------------------------------------------------------------------------
            // Entry for HTML chapter generation 
//							<head><style>deactspan {display: inline-block;} img { width: 100%;}</style></head>
            public def generateChapterHtml(Chapter chapter) {
                var returnText = '''<html>
							<body><h2>
							<span lang="EN-US">«chapter.title»</span></a></h2>'''

                val chapterGeneratedImplicitOutline = EHelpConsts.generateImplicitOutline

                // possibly produce outline before
                returnText += chapter.generateSubchapterOutlineHtml(true)

                for (content : chapter.content) {
                    returnText += content.expandContent(false)
                }

                // possibly produce outline after
                returnText += chapter.generateSubchapterOutlineHtml(false)

                returnText += '''</body></html>'''
                return returnText
            }

            //
            // ------------------------------------------------------------------------
            // Generate the toc.xml file
            def generateTOC(EHelpModel model) {
                resetChapterIndex

                var returnText = '''<?xml version="1.0" encoding="UTF-8"?>''' + "\n"
                returnText += '''<?NLS TYPE="org.eclipse.help.toc"?>''' + "\n\n"
                returnText += '''<toc label="«EHelpConsts.mainTitle»" topic=" " >''' + "\n"
                for (chapter : model.chapters) {
                    returnText += chapter.generateTOCChapter
                }
                returnText += '''</toc>'''
                return returnText
            }

            //
            // ------------------------------------------------------------------------
            // Recursive helper file for a chapter or subchapter
            private def String generateTOCChapter(Chapter chapter) {
                if (!chapter.
                    hasSubchapters) {
                    return '''<topic href="«chapter.path»«chapter.fileName».«EHelpConsts.htmlFileExtension»" label="«chapter.title.removeHTMLCode»"/>''' +
                        "\n"
                } else {
                    var returnText = '''<topic href="«chapter.path»«chapter.fileName».«EHelpConsts.htmlFileExtension»" label="«chapter.title.removeHTMLCode»">''' +
                        "\n"
                    for (subchapter : chapter.subchapters) {
                        returnText += subchapter.generateTOCChapter
                    }
                    returnText += '''</topic>''' + "\n"
                    return returnText
                }
            }

            // -------------------------------------------------------------------------
            // --         D I S P A T C H    E X P A N D    C O N T E N T
            // -------------------------------------------------------------------------
            //
            // ------------------------------------------------------------------------
            // Text (after/before a Link OR "paragraphed")
            private def dispatch String expandContent(Text content, boolean linksOff) {
                if (content.nextContent instanceof Link || content.prevContent instanceof Link) {
                    return '''«content.text.replaceHTMLSpecialChars»'''
                } else {
                    return '''<p
		     class="MsoNormal">
		      <span
		       lang="EN-US">«content.text.replaceHTMLSpecialChars»</span>
		    </p>'''
                }
            }

            //
            // ------------------------------------------------------------------------
            // Image
            private def dispatch String expandContent(Images content, boolean linksOff) {
                return '''<p
		     class="MsoNormal">
		     «FOR image : content.images»
		      <span><img
		       src="«EHelpConsts.imageSubFolderName»/«image»"></span>		     
		     «ENDFOR»
		    </p>'''
            }

            //
            // ------------------------------------------------------------------------
            // Link
            private def dispatch String expandContent(Link content, boolean linksOff) {
                if (!linksOff) {
                    return '''<a href="«content.link.fileName».«EHelpConsts.htmlFileExtension»">«content.caption»</a>'''
                } else {
                    return '''<a href="#«content.link.chaperIndex»">«content.caption»</a>'''
                }
            }

            //
            // ------------------------------------------------------------------------
            // List or Enumeration Item
            private def String expandListItem(ListItem item, boolean linksOff) {
                return '''<li>
                «FOR content : item.content» 
                    «(content as Content).expandContent(linksOff)»
                «ENDFOR»</li>'''
            }

            //
            // ------------------------------------------------------------------------
            // List
            private def dispatch String expandContent(List content, boolean linksOff) {
                return '''<ul>
                «FOR item : content.items»
                    «(item as ListItem).expandListItem(linksOff)»
                «ENDFOR»
                </ul>'''
            }

            //
            // ------------------------------------------------------------------------
            // Enumeration
            private def dispatch String expandContent(Enum content, boolean linksOff) {
                return '''<ol>
                «FOR item : content.items» 
                    «(item as ListItem).expandListItem(linksOff)»
                «ENDFOR»
                </ol>'''
            }

            //
            // ------------------------------------------------------------------------
            // Table
            private def dispatch String expandContent(Table table, boolean linksOff) {
                var returnText = '''<table>'''
                var style = ''''''
                if (table.stretch) {
                    style += ''' width="100%"'''
                }
                if (table.width > 0) {
                    style += ''' border="''' + table.width + '''"'''
                }
                if (table.spacing > 0) {
                    style += ''' cellspacing="''' + table.spacing + '''"'''
                }
                if (style.length > 0) {
                    returnText = '''<table ''' + style + '''>'''
                }
                return returnText + '''
                «FOR item : table.rows» 
                    «(item as TableRow).expandTableRow(linksOff)»
                «ENDFOR»
                </table>'''
            }

            //
            // ------------------------------------------------------------------------
            // TableRow
            private def dispatch String expandTableRow(TableRow row, boolean linksOff) {
                return '''<tr>
                «FOR cell : row.cells» 
                    «(cell as TableCell).expandTableCell(linksOff)»
                «ENDFOR»
                </tr>'''
            }

            //
            // ------------------------------------------------------------------------
            // TableCell
            private def dispatch String expandTableCell(TableCell cell, boolean linksOff) {
                var align = ''''''
                if (cell.left) {
                    align = '''align="left"'''
                } else if (cell.right) {
                    align = '''align="right"'''
                } else if (cell.center) {
                    align = '''align="center"'''
                }

                var valign = ''''''
                if (cell.top) {
                    valign = '''valign="top"'''
                } else if (cell.bottom) {
                    valign = '''valign="bottom"'''
                } else if (cell.middle) {
                    valign = '''valign="middle"'''
                }

                return '''<td ''' + align + ''' ''' + valign + '''>
                «FOR content : cell.content» 
                    «(content as Content).expandContent(linksOff)»
                «ENDFOR»</td>'''
            }

            //
            // ------------------------------------------------------------------------
            // Keyword 
            private def dispatch String expandContent(Keyword content, boolean linksOff) {
                // Do not expand keywords, these are hidden for normal html site creation
                return ''''''
            }

            //
            // ------------------------------------------------------------------------
            // Context 
            private def dispatch String expandContent(Context content, boolean linksOff) {
                // Do not expand contexts, these are hidden for normal html site creation
                return ''''''
            }

            //
            // ------------------------------------------------------------------------
            // Fall back case for any other content
            private def dispatch String expandContent(Content content, boolean linksOff) {
                return ''''''
            }

            // -------------------------------------------------------------------------
            // --                         A C C E S S      
            // -------------------------------------------------------------------------
            // ------------------------------------------------------------------------
            // Get the content object after the current one, if any, null otherwise
            private def getNextContent(Content content) {
                if (content.eContainer !== null) {
                    var found = false
                    for (otherContent : content.eContainer.eContents) {
                        if (found) {
                            return otherContent
                        }
                        if (otherContent == content) {
                            found = true
                        }
                    }
                }
                return null
            }

            // ------------------------------------------------------------------------
            // Get the content object before the current one, if any, null otherwise
            private def getPrevContent(Content content) {
                if (content.eContainer !== null) {
                    var EObject prevContent = null
                    for (otherContent : content.eContainer.eContents) {
                        if (otherContent == content) {
                            return prevContent
                        }
                        prevContent = otherContent
                    }
                }
                return null
            }
            
            
            
            // ------------------------------------------------------------------------
            // Root model
            def EHelpModel getModel(EObject eObject) {
                if (eObject instanceof EHelpModel) {
                        return eObject
                } else {
                    return eObject.eContainer.getModel
                }
            }


            // ------------------------------------------------------------------------
            // Root chapter
            def Chapter getRootChapter(EObject eObject) {
                if (eObject instanceof EHelpModel) {
                    if (eObject.chapters.size > 0) {
                        return eObject.chapters.get(0)
                    }
                } else {
                    val lastChapter = eObject.parentChapter
                    return eObject.getRootChapterHelper(lastChapter)
                }
            }

            def Chapter getRootChapterHelper(EObject eObject, Chapter lastChapter) {
                var newLastChapter = lastChapter
                if (eObject.eContainer === null) {
                    return newLastChapter
                }
                if (eObject instanceof Chapter) {
                    newLastChapter = eObject as Chapter
                }
                return eObject.eContainer.getRootChapterHelper(newLastChapter)
            }

            // ------------------------------------------------------------------------
            // Parent chapter
            def Chapter getParentChapter(EObject eObject) {
                if (eObject == null || eObject.eContainer == null) {
                    return null
                }
                return eObject.eContainer.getParentChapter(1)
            }

            def private Chapter getParentChapter(EObject eObject, int depth) {
                if (eObject instanceof Chapter) {
                    return eObject as Chapter
                }
                if (eObject.eContainer !== null) {
                    return eObject.eContainer.getParentChapter(depth + 1)
                }
                return null
            }

            // ------------------------------------------------------------------------
            // Build the camel case file name
            def getFileName(Chapter chapter) {
                return chapter.chaperIndex + "_" +
                    chapter.title.camelCase.removeSpecialChars.shortenText(EHelpConsts.maxLegthHtmlFilename)
            }

            // ------------------------------------------------------------------------
            // Build the id for the toc file
            def getHelpId(Chapter chapter) {
                return chapter.title.removeSpecialChars.toLowerCase + ".help"
            }

            // ------------------------------------------------------------------------
            // --             			U T I L I T Y   
            // ------------------------------------------------------------------------
            
            public def getPath(EObject modelElement) {
                val model = modelElement.getModel
                val path = model.configs.filter[e | e instanceof ConfigPath]
                if (path != null && path.size > 0) {
                    return (path.get(0) as ConfigPath).path
                }
                return ""
            }
            
            
            var chapterIndex = 0
            var HashMap<Chapter, Integer> chapterIndexCache = newHashMap

            def resetChapterIndex() {
                // Clear the index cache and the counter
                chapterIndex = 0
                chapterIndexCache.clear
            }

            def getChaperIndex(Chapter chapter) {
                if (!chapterIndexCache.containsKey(chapter)) {
                    // Reserve the current index for this chapter
                    chapterIndexCache.put(chapter, chapterIndex)
                    // For the next run, increment the index
                    chapterIndex++
                }
                return chapterIndexCache.get(chapter)
            }

            def getChapterNumber(Chapter chapter) {
                var returnChapterNumber = chapter.getChapterNumber("")
                if (chapter.parentChapter != null) {
                    returnChapterNumber = returnChapterNumber.toString.substring(0, returnChapterNumber.toString.length-1)
                }
                return returnChapterNumber
            }

            def private String getChapterNumber(Chapter chapter, String chapterNumberPart) {
                if (chapter != null && chapter.eContainer != null && chapter.eContainer instanceof EHelpModel) {
                    val index = 1 + (chapter.eContainer as EHelpModel).chapters.indexOf(chapter)
                    val nextChapterNumberPart = index + '''.''' + chapterNumberPart
                    return chapter.parentChapter.getChapterNumber(nextChapterNumberPart)
                }
                if (chapter.parentChapter == null) {
                    // root chapter, break
                    return chapterNumberPart
                } 
                val index = 1 + chapter.parentChapter.subchapters.indexOf(chapter)
                val nextChapterNumberPart = index + '''.''' + chapterNumberPart
                return chapter.parentChapter.getChapterNumber(nextChapterNumberPart)
            }

            // ------------------------------------------------------------------------
            // Remove HTML code
            def removeHTMLCode(String text) {
                var returnText = ''''''
                var nextCharacter = ''
                var htmlon = false
                for (var int c = 0; c < text.length; c++) {
                    val character = text.substring(c, c + 1)
                    if (c < text.length - 1) {
                        nextCharacter = text.substring(c + 1, c + 2)
                    }

                    if ((character) == "<" && (nextCharacter != "<")) {
                        htmlon = true
                    }

                    if (!htmlon) {
                        returnText += character
                    }

                    if ((character == ">") && (nextCharacter != ">")) {
                        htmlon = false
                    }
                }
                return returnText
            }

            // ------------------------------------------------------------------------
            // Start all new words with a capital letter, all other letters small
            def camelCase(String text) {
                var returnText = ''''''
                var nextCaptial = true
                for (var int c = 0; c < text.length; c++) {
                    val character = text.substring(c, c + 1)
                    if (!character.isSpecialChar) {
                        if (!nextCaptial) {
                            returnText += character.toLowerCase
                        } else {
                            nextCaptial = false
                            returnText += character
                        }
                    } else {
                        nextCaptial = true
                        returnText += character
                    }
                }
                return returnText
            }

            def isSpecialChar(String character) {
                return (!character.equals(character.removeSpecialChars))
            }

            def replaceHTMLSpecialChars(String text) {
                return text.replace("&&", "&amp;").replace("''", "&apos;").replace("<<", "&lt;").replace(">>",
                    "&gt;").replace("\"\"", "&quot;")
//			    
//				return text.replace("&", "&amp;").replace("'", "&apos;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").
//				            replace("\\&amp;", "&").replace("\\&apos;", "'").replace("\\&lt;", "<").replace("\\&gt;", ">").replace("\\&quot;", "\"")
            }

            def removeSpecialChars(String text) {
                return text.replace(" ", "").replace("!", "").replace("@", "").replace("#", "").replace("$", "").
                    replace("%", "").replace("^", "").replace("&", "").replace("*", "").replace("(", "_").replace(")",
                        "_").replace("-", "").replace("+", "").replace("=", "").replace("{", "").replace("}", "").
                    replace("[", "").replace("]", "").replace(":", "").replace("\"", "").replace("'", "").replace(";",
                        "").replace(",", "").replace("<", "").replace(">", "").replace(".", "").replace("/", "_").
                    replace("\\", "").replace("?", "").replace("|", "").replace("~", "").replace("`", "")
            }

            // ------------------------------------------------------------------------
            // Shorten (truncate) a text if it is longer than maxChars
            def shortenText(String text, int maxChars) {
                if (text.length > maxChars) {
                    return text.substring(0, maxChars)
                }
                return text
            }

            // ------------------------------------------------------------------------
            // Return true iff a chapter has subchapters
            def hasSubchapters(Chapter chapter) {
                return (chapter.subchapters.size > 0)
            }

// ------------------------------------------------------------------------
        }
        