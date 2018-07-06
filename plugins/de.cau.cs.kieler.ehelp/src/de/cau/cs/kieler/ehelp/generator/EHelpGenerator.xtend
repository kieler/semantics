/**
 * EHelpGenerator generates the toc.xml and html files from EHelpModels.
 * 
 * @author 	Christian Motika
 * @date	10.10.2017
 * 
 */
package de.cau.cs.kieler.ehelp.generator

import com.google.inject.Inject
import de.cau.cs.kieler.ehelp.eHelp.Chapter
import de.cau.cs.kieler.ehelp.eHelp.EHelpModel
import de.cau.cs.kieler.ehelp.eHelp.Images
import de.cau.cs.kieler.ehelp.util.EHelpConsts
import de.cau.cs.kieler.ehelp.util.EHelpUtil
import java.io.File
import java.net.URI
import java.nio.file.Files
import java.nio.file.StandardCopyOption
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.swt.browser.Browser
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.internal.browser.BrowserViewer
import org.eclipse.ui.internal.browser.WebBrowserEditor
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration

import static com.google.common.collect.Sets.newHashSet
import org.eclipse.ui.internal.browser.WebBrowserEditorInput
import de.cau.cs.kieler.ehelp.eHelp.ConfigHome

/**
 * This class generates the toc.xml and html files from EHelpModels.
 */
class EHelpGenerator extends AbstractGenerator implements IOutputConfigurationProvider {

    @Inject
    extension HelpFileGenerator

    @Inject
    extension EHelpUtil

    // ------------------------------------------------------------------------
    /**
     * Main entry for generating toc and html files.
     */
    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

        // If no content, exit here
        if (resource.contents.nullOrEmpty) {
            return
        }

        // Clear HTML files
        clearHTMLFiles

        // Otherwise get the model
        val model = resource.contents.get(0) as EHelpModel

        // If it is an EHelpModel
        if (model instanceof EHelpModel) {

            // Generate the toc file
            if (EHelpConsts.generateContentFile) {
                val tocFileName = EHelpConsts.genFolderName + "/" + EHelpConsts.contentFileName
                fsa.generateFile(tocFileName, model.generateTOC)
            } else {
                // Do this for chapter index creation 
                model.generateTOC
            }

            // For each (main) chapter, generate an html file
            for (chapter : model.chapters) {
                chapter.generateChapterHtml(fsa)
            }

            // Optional keyword index creation
            if (EHelpConsts.generateKeywordFile) {
                val keywordFileName = EHelpConsts.genFolderName + "/" + EHelpConsts.keywordFileName
                fsa.generateFile(keywordFileName, model.generateKeywordXml)
            }

            // Optional context creation
            if (EHelpConsts.generateContextFile) {
                val keywordFileName = EHelpConsts.genFolderName + "/" + EHelpConsts.contextFileName
                fsa.generateFile(keywordFileName, model.generateContextXml)
            }

            // Optional complete help file creation
            if (EHelpConsts.generateCompleteDocumentation) {
                val keywordFileName = EHelpConsts.genFolderName + "/" + EHelpConsts.completeDocumentationFileName
                fsa.generateFile(keywordFileName, model.generateCompleteDocumentation)
            }

            // Clear all images, then copy the used images to the gen folder
            PlatformUI.workbench.display.asyncExec(new Runnable {
                override run() {
                    clearImageFiles
                    model.copyImages
                    model.copyHomeFiles
                }
            })
        }

        // Refresh all opened webbrowsers
        model.refreshAllWebBrowsers
    }

    // ------------------------------------------------------------------------
    /**
     * Go thru all opened webbrowsers and refresh them. Use the first one to display
     * the content of chapter depending on the cursor position in the editor. If no
     * browser is opened then open one.
     */
    def void refreshAllWebBrowsers(EObject root) {
        PlatformUI.workbench.display.asyncExec(
            new Runnable {
                override run() {

                    // Find out which is the current edited chapter in active editor
                    val chapter = EHelpUtil.getCurrentModelElement(root).getParentChapter
                    val chapterFileName = chapter.getFileName

                    var Browser lastWebbrowser = null

                    // Refresh all editors + bringToTop the one with the chapter
                    val editorRefs = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().
                        editorReferences;
                    var foundOpenedEditor = false

                    for (editorRef : editorRefs) {
                        println("-" + editorRef.id + " [" + editorRef.partName + "]")
                        if (editorRef.id.equals("org.eclipse.ui.browser.editor")) {
                            val editor = editorRef.getEditor(true)
                            val WebBrowserEditor browserEditor = editor as WebBrowserEditor
                            try { // HACK: using reflection to gain accessibility
                                val browserClass = browserEditor.getClass();
                                val browserField = browserClass.getDeclaredField("webBrowser");
                                browserField.setAccessible(true);
                                val browserObject = browserField.get(browserEditor);
                                if (browserObject != null && browserObject instanceof BrowserViewer) {
                                    val browserViewer = (browserObject as BrowserViewer).getBrowser();
                                    browserViewer.refresh
                                    lastWebbrowser = browserViewer
                                }
                            } catch (Exception e) {
                            }

                            if (editorRef.partName.endsWith(chapterFileName + "." + EHelpConsts.htmlFileExtension)) {
                                foundOpenedEditor = true
                                // BringToTop
                                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().bringToTop(editor);
                            }
                        }
                    }

                    if (!foundOpenedEditor) {
                        // If no editor found, open it
                        // file:///D:/workspaces/runtime-EclipseXtext/MyCCCToolHelpProject/src-gen/HelpContent/6_ApplicationWindows.html
                        // file:///X:/eclipsews/runtime-EclipseXtext/MyCCCToolHelpProject/src-gen/HelpContent/0_Installation.html
                        // TODO: find out workspace location on disc
                        val baseDir = EHelpUtil.getCurrentWorkspaceLocationString();
                        val website = "file:///" + baseDir + "/" + EHelpConsts.genFolderBase + "/" +
                            EHelpConsts.genFolderName + "/" + chapterFileName + "." + EHelpConsts.htmlFileExtension
                        val URI websiteUri = new URI(website)
                        if (lastWebbrowser !== null) {
                            lastWebbrowser.setUrl(website, null, null);
                        } else {
                            if (EHelpConsts.autoOpenWebbrowser) {
                                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(
                                    new WebBrowserEditorInput(websiteUri.toURL()),
                                    WebBrowserEditor.WEB_BROWSER_EDITOR_ID);
                                }
                            }

                        }

                        PlatformUI.workbench.display.asyncExec(
                            new Runnable {
                                override run() {
                                    Thread.sleep(600);
                                    // lastWebbrowser.setFocus
                                    val xtextEditor = EHelpUtil.xtextEditor
                                    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().bringToTop(
                                        xtextEditor);
                                    xtextEditor.setFocus
                                }
                            });

                    }
                });
        }

        // ------------------------------------------------------------------------
        /**
         * Clear all images in the gen folder.
         */
        def void clearImageFiles() {
            val baseDir = EHelpUtil.getCurrentWorkspaceLocationString() + "/" + EHelpConsts.genFolderBase + "/" +
                EHelpConsts.genFolderName + "/" + EHelpConsts.imageSubFolderName;
            val dir = new File(baseDir)

            if (dir.exists) {
                for (File file : dir.listFiles()) {
                    if (!file.isDirectory()) {
                        if (file.name.endsWith("." + EHelpConsts.imageFileEnding)) {
                            file.delete();
                        }
                    }
                }
            } else {
                dir.mkdir
            }
        }

        /**
         * Clear all html files in the gen folder.
         */
        def void clearHTMLFiles() {
            val baseDir = EHelpUtil.getCurrentWorkspaceLocationString() + "/" + EHelpConsts.genFolderBase + "/" +
                EHelpConsts.genFolderName;
            val dir = new File(baseDir)

            if (dir.exists) {
                for (File file : dir.listFiles()) {
                    if (!file.isDirectory()) {
                        if (file.name.endsWith("." + EHelpConsts.htmlFileExtension)) {
                            file.delete();
                        }
                    }
                }
            } else {
                dir.mkdir
            }
        }

        // ------------------------------------------------------------------------
        /**
         * Collect all image tags and copy the according image files to the GEN_FOLDER_BASE folder
         */
        def void copyImages(EHelpModel model) {
            val imagesList = model.eAllContents.filter(Images);

            val projectFolder = EHelpUtil.getCurrentWorkspaceLocationString()

            val destFolder = EHelpUtil.getCurrentWorkspaceLocationString() + "/" + EHelpConsts.genFolderBase + "/" +
                EHelpConsts.genFolderName + "/" + EHelpConsts.imageSubFolderName;

            for (images : imagesList.toList) {
                for (image : images.images) {
                    val src = new File(projectFolder + "/" + image)
                    val dst = new File(destFolder + "/" + image)
                    if (src.exists) {
                        Files.copy(src.toPath, dst.toPath, StandardCopyOption.REPLACE_EXISTING);
                        println(" copied " + dst.toString)
                    } else {
                        // NOOP 
                    }
                }
            }

            EHelpUtil.refreshWorkspaces
        }

        // ------------------------------------------------------------------------
        /**
         * Collect all files tagged as config home to the GEN_FOLDER_BASE folder
         */
        def void copyHomeFiles(EHelpModel model) {
            val projectFolder = EHelpUtil.getCurrentWorkspaceLocationString()

            val destFolder = EHelpUtil.getCurrentWorkspaceLocationString() + "/" + EHelpConsts.genFolderBase + "/" +
                EHelpConsts.genFolderName;

            for (file : model.configs.filter[e|e instanceof ConfigHome].toList) {
                val src = new File(projectFolder + "/" + (file as ConfigHome).file)
                val dst = new File(destFolder + "/" + (file as ConfigHome).file)
                if (src.exists) {
                    Files.copy(src.toPath, dst.toPath, StandardCopyOption.REPLACE_EXISTING);
                    println(" copied " + dst.toString)
                } else {
                    // NOOP 
                }
            }

            EHelpUtil.refreshWorkspaces
        }

        // ------------------------------------------------------------------------
        /**
         * For a (main) chapter c, generate a file name and do this recursively for each
         * subchapter of c.
         */
        def void generateChapterHtml(Chapter chapter, IFileSystemAccess2 fsa) {
            var chapterFileName = EHelpConsts.genFolderName + "/" + chapter.fileName + "." +
                EHelpConsts.htmlFileExtension
            fsa.generateFile(chapterFileName, chapter.generateChapterHtml)

            if (chapter.hasSubchapters) {
                for (subchapter : chapter.subchapters) {
                    subchapter.generateChapterHtml(fsa)
                }
            }
        }

        // ------------------------------------------------------------------------
        /**
         * Configure the output folder for the IOutputConfigurationProvider interface.
         */
        override getOutputConfigurations() {
            val defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
            defaultOutput.setDescription("Output Folder");
            defaultOutput.setOutputDirectory("./" + EHelpConsts.genFolderBase);
            defaultOutput.setOverrideExistingResources(true);
            defaultOutput.setCreateOutputDirectory(true);
            defaultOutput.setCleanUpDerivedResources(true);
            defaultOutput.setSetDerivedProperty(true);
            defaultOutput.setKeepLocalHistory(true);
            return newHashSet(defaultOutput);
        }

// ------------------------------------------------------------------------
    }
    