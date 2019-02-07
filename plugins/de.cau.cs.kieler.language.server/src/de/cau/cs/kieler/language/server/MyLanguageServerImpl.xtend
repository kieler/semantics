/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server

import com.google.inject.Inject
import java.util.concurrent.CompletableFuture
import java.util.function.Function
import org.eclipse.emf.common.util.URI
import org.eclipse.lsp4j.CodeLensOptions
import org.eclipse.lsp4j.CompletionOptions
import org.eclipse.lsp4j.DiagnosticSeverity
import org.eclipse.lsp4j.ExecuteCommandOptions
import org.eclipse.lsp4j.InitializeParams
import org.eclipse.lsp4j.InitializeResult
import org.eclipse.lsp4j.InitializedParams
import org.eclipse.lsp4j.PublishDiagnosticsParams
import org.eclipse.lsp4j.SemanticHighlightingServerCapabilities
import org.eclipse.lsp4j.ServerCapabilities
import org.eclipse.lsp4j.SignatureHelpOptions
import org.eclipse.lsp4j.TextDocumentSyncKind
import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.xtext.ide.server.ICapabilitiesContributor
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.LanguageServerImpl
import org.eclipse.xtext.ide.server.UriExtensions
import org.eclipse.xtext.ide.server.codeActions.ICodeActionService
import org.eclipse.xtext.ide.server.codelens.ICodeLensResolver
import org.eclipse.xtext.ide.server.codelens.ICodeLensService
import org.eclipse.xtext.ide.server.rename.IRenameService
import org.eclipse.xtext.ide.server.semanticHighlight.SemanticHighlightingRegistry
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.Issue
import org.eclipse.lsp4j.Diagnostic
import org.eclipse.lsp4j.Range
import org.eclipse.lsp4j.Position
import static org.eclipse.xtext.diagnostics.Severity.*

/**
 * @author sdo
 *
 */
class MyLanguageServerImpl extends LanguageServerImpl {
    
    @Inject extension UriExtensions
    @Inject extension IResourceServiceProvider.Registry languagesRegistry
    
    @Inject SemanticHighlightingRegistry semanticHighlightingRegistry
    InitializeParams params
    
    LanguageClient client
    CompletableFuture<InitializedParams>  initialized = new CompletableFuture
    
    override CompletableFuture<InitializeResult> initialize(InitializeParams params) {
        if (this.params !== null) {
            throw new IllegalStateException("This language server has already been initialized.")
        }
        val baseDir = params.baseDir
        if (languagesRegistry.extensionToFactoryMap.isEmpty) {
            throw new IllegalStateException("No Xtext languages have been registered. Please make sure you have added the languages's setup class in '/META-INF/services/org.eclipse.xtext.ISetup'")
        }
        this.params = params
        val result = new InitializeResult
        var capabilities = new ServerCapabilities => [
            hoverProvider = true
            definitionProvider = true
            referencesProvider = true
            documentSymbolProvider = true
            workspaceSymbolProvider = true
            
            // check if a language with code lens capability exists
            if (allLanguages.exists[get(ICodeLensService)!==null]) {
                codeLensProvider = new CodeLensOptions => [
                    resolveProvider = allLanguages.exists[get(ICodeLensResolver)!==null]
                ]
            }
            
            // check if a language with code actions capability exists
            codeActionProvider = allLanguages.exists[get(ICodeActionService)!==null] 
            
            signatureHelpProvider = new SignatureHelpOptions(#['(', ','])
            textDocumentSync = TextDocumentSyncKind.Incremental
            completionProvider = new CompletionOptions => [
                resolveProvider = false
                triggerCharacters = #["."]
            ]
            documentFormattingProvider = true
            documentRangeFormattingProvider = true
            documentHighlightProvider = true
            renameProvider = allLanguages.exists[get(IRenameService)!==null]

            val clientCapabilities = params.capabilities;
            // register execute command capability
            if (clientCapabilities?.workspace?.executeCommand !== null) {
                this.commandRegistry.initialize(allLanguages, clientCapabilities, client)
                executeCommandProvider = new ExecuteCommandOptions => [
                    commands = this.commandRegistry.getCommands()
                ]
            }

            semanticHighlightingRegistry.initialize(allLanguages, clientCapabilities, client);
            semanticHighlighting = new SemanticHighlightingServerCapabilities(semanticHighlightingRegistry.allScopes);

        ]
        for (language : allLanguages) {
            language.get(ICapabilitiesContributor)?.contribute(capabilities, params)
        }
        result.capabilities = capabilities
        
        access.addBuildListener(this);
        
        return requestManager.runWrite([
            workspaceManager.initialize(null, null, CancelIndicator.NullImpl)
            return null
        ], []).thenApply [result]
    }
    private def void publishDiagnostics(URI uri, Iterable<? extends Issue> issues) {
        initialized.thenAccept([
            val diagnostics = new PublishDiagnosticsParams => [
                it.uri = toUriString(uri)
                it.diagnostics = issues.filter[severity !== IGNORE].map[toDiagnostic].toList
            ]
            client.publishDiagnostics(diagnostics)
        ])
    }

    private def Diagnostic toDiagnostic(Issue issue) {
        new Diagnostic => [
            code = issue.code
            severity = switch issue.severity {
                case ERROR: DiagnosticSeverity.Error
                case WARNING: DiagnosticSeverity.Warning
                case INFO: DiagnosticSeverity.Information
                default: DiagnosticSeverity.Hint
            }
            message = issue.message
            val lineNumber = (issue.lineNumber ?: 1) - 1
            val column = (issue.column ?: 1) - 1
            val length = (issue.length ?: 0)
            range = new Range(
                new Position(lineNumber, column),
                new Position(lineNumber, column + length)
            )
        ]
    }
    
    private def Iterable<? extends IResourceServiceProvider> getAllLanguages() {
        this.languagesRegistry.extensionToFactoryMap.keySet.toList.sort.map[ext|
            val synthUri = URI.createURI("synth:///file."+ext)
            return synthUri.resourceServiceProvider
        ].toSet
    } 
    
    ILanguageServerAccess access = new ILanguageServerAccess () {
        
        override <T> doRead(String uri, Function<Context, T> function) {
                requestManager.runRead [ cancelIndicator |
                    workspaceManager.doRead(uri.toUri) [ document, resource |
                        val ctx = new Context(resource, document, workspaceManager.isDocumentOpen(resource.URI), cancelIndicator)
                        return function.apply(ctx)
                    ]
                ]
        }
        
        override addBuildListener(IBuildListener listener) {
            workspaceManager.addBuildListener(listener)
        }
        
        
        override getLanguageClient() {
            client
        }
        
    }
    
    override connect(LanguageClient client) {
        this.client = client
    }
}