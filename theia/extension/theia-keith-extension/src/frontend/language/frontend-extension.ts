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

import { ContainerModule, interfaces } from 'inversify'
import { KeithContribution} from './keith-contribution'
import { CommandContribution } from '@theia/core/lib/common'
import { LanguageClientContribution } from '@theia/languages/lib/browser'
import { KeithLanguageClientContribution } from './keith-language-client-contribution'
// import { DiagramConfiguration } from 'theia-sprotty/lib'
// import { KeithDiagramConfiguration } from '../keithdiagram/di.config'
// import { DiagramManager, DiagramManagerProvider } from 'theia-sprotty/lib'
// import { KeithDiagramManager } from '../keithdiagram/keith-diagram-manager'
import { BaseWidget, KeybindingContext/*, FrontendApplicationContribution, OpenHandler*/,
    WidgetFactory, bindViewContribution/*, createTreeContainer, TreeWidget */} from '@theia/core/lib/browser'
import { Constants } from '../../common/util'
import { configuration as kgtConfiguration, monarchLanguage as kgtMonarchLanguage} from './kgt-monaco-language'
import { configuration as sctxConfiguration, monarchLanguage as sctxMonarchLanguage } from './sctx-monaco-language';
import { configuration as sclConfiguration, monarchLanguage as sclMonarchLanguage} from './scl-monaco-language'
import { configuration as kextConfiguration, monarchLanguage as kextMonarchLanguage} from './kext-monaco-language'
import { configuration as annoConfiguration, monarchLanguage as annoMonarchLanguage} from './anno-monaco-language'
import { configuration as strlConfiguration, monarchLanguage as strlMonarchLanguage} from './strl-monaco-language'
import { configuration as lusConfiguration, monarchLanguage as lusMonarchLanguage} from './lus-monaco-language'
import { TextWidget } from '../widgets/text-widget'
import { KeithCommandContribution } from './keith-commands'
import { MonacoEditorProvider } from '@theia/monaco/lib/browser/monaco-editor-provider'
import { KeithMonacoEditorProvider } from "../monaco/keith-monaco-editor-provider"
import '../../../src/frontend/widgets/style/index.css'
// import 'sprotty/css/sprotty.css'
// import 'theia-sprotty/css/theia-sprotty.css'
import { ContextMenuCommands } from './dynamic-commands'
// import { ThemeManager } from '../keithdiagram/theme-manager'
// import { DiagramOptionsViewWidgetFactory, DiagramOptionsViewWidget } from '../diagramoptions/diagramoptions-view-widget'
// import { DiagramOptionsViewService } from '../diagramoptions/diagramoptions-view-service'
// import { DiagramOptionsViewContribution } from '../diagramoptions/diagramoptions-view-contribution'
import { KeithKeybindingContext } from './keith-keybinding-context'
import { CompilerWidget } from '../widgets/compiler-widget'

export default new ContainerModule((bind: interfaces.Bind, unbind: interfaces.Unbind, isBound: interfaces.IsBound, rebind: interfaces.Rebind) => {
    // register kgt
    monaco.languages.register({
        id: Constants.kgtId,
        aliases: [Constants.kgtName, Constants.kgtId],
        extensions: ['.' + Constants.kgtId],
        mimetypes: ['text/' + Constants.kgtId]
    })
    monaco.languages.onLanguage(Constants.kgtId, () => {
        monaco.languages.setLanguageConfiguration(Constants.kgtId, kgtConfiguration)
        monaco.languages.setMonarchTokensProvider(Constants.kgtId, kgtMonarchLanguage)
    });

    // register sctx
    monaco.languages.register({
        id: Constants.sctxId,
        aliases: [Constants.sctxName, Constants.sctxId],
        extensions: ['.' + Constants.sctxId],
        mimetypes: ['text/' + Constants.sctxId]
    })
    monaco.languages.onLanguage(Constants.sctxId, () => {
        monaco.languages.setLanguageConfiguration(Constants.sctxId, sctxConfiguration)
        monaco.languages.setMonarchTokensProvider(Constants.sctxId, sctxMonarchLanguage)
    });

    // register scl
    monaco.languages.register({
        id: Constants.sclId,
        aliases: [Constants.sclName, Constants.sclId],
        extensions: ['.' + Constants.sclId],
        mimetypes: ['text/' + Constants.sclId]
    })
    monaco.languages.onLanguage(Constants.sclId, () => {
        monaco.languages.setLanguageConfiguration(Constants.sclId, sclConfiguration)
        monaco.languages.setMonarchTokensProvider(Constants.sclId, sclMonarchLanguage)
    });

    // register kext
    monaco.languages.register({
        id: Constants.kextId,
        aliases: [Constants.kextName, Constants.kextId],
        extensions: ['.' + Constants.kextId],
        mimetypes: ['text/' + Constants.kextId]
    })
    monaco.languages.onLanguage(Constants.kextId, () => {
        monaco.languages.setLanguageConfiguration(Constants.kextId, kextConfiguration)
        monaco.languages.setMonarchTokensProvider(Constants.kextId, kextMonarchLanguage)
    });

    // register anno
    monaco.languages.register({
        id: Constants.annoId,
        aliases: [Constants.annoName, Constants.annoId],
        extensions: ['.' + Constants.annoId],
        mimetypes: ['text/' + Constants.annoId]
    })
    monaco.languages.onLanguage(Constants.annoId, () => {
        monaco.languages.setLanguageConfiguration(Constants.annoId, annoConfiguration)
        monaco.languages.setMonarchTokensProvider(Constants.annoId, annoMonarchLanguage)
    });

    // register esterel
    monaco.languages.register({
        id: Constants.esterelId,
        aliases: [Constants.esterelName, Constants.esterelId],
        extensions: ['.' + Constants.esterelId],
        mimetypes: ['text/' + Constants.esterelId]
    })
    monaco.languages.onLanguage(Constants.esterelId, () => {
        monaco.languages.setLanguageConfiguration(Constants.esterelId, strlConfiguration)
        monaco.languages.setMonarchTokensProvider(Constants.esterelId, strlMonarchLanguage)
    });

    // register lustre
    monaco.languages.register({
        id: Constants.lustreId,
        aliases: [Constants.lustreName, Constants.lustreId],
        extensions: ['.' + Constants.lustreId],
        mimetypes: ['text/' + Constants.lustreId]
    })
    monaco.languages.onLanguage(Constants.lustreId, () => {
        monaco.languages.setLanguageConfiguration(Constants.lustreId, lusConfiguration)
        monaco.languages.setMonarchTokensProvider(Constants.lustreId, lusMonarchLanguage)
    });


    // widgets
    bind(TextWidget).toSelf()
    bind(BaseWidget).toDynamicValue(ctx => ctx.container.get(TextWidget))
    bind(CompilerWidget).toSelf()
    bind(WidgetFactory).toDynamicValue(context => ({
        id: Constants.compilerWidgetId,
        area: "bottom",
        createWidget: () => context.container.get<CompilerWidget>(CompilerWidget)
    })).inSingletonScope()

    bind(CommandContribution).to(KeithCommandContribution)

    // languages
    bind(KeithLanguageClientContribution).toSelf().inSingletonScope()
    bind(LanguageClientContribution).toDynamicValue(ctx => ctx.container.get(KeithLanguageClientContribution))

    // // diagram
    // bind(DiagramConfiguration).to(KeithDiagramConfiguration).inSingletonScope()
    // bind(DiagramManagerProvider).toProvider<DiagramManager>(context => {
    //     return () => {
    //         return new Promise<DiagramManager>((resolve) =>
    //             resolve(context.container.get(KeithDiagramManager))
    //         )
    //     }
    // }).whenTargetNamed('keith-diagram')
    // bind(KeithDiagramManager).toSelf().inSingletonScope()
    // bind(FrontendApplicationContribution).toDynamicValue(context => context.container.get(KeithDiagramManager))
    // bind(OpenHandler).toDynamicValue(context => context.container.get(KeithDiagramManager))
    bind(ContextMenuCommands).to(ContextMenuCommands).inSingletonScope()

    // needed to open editor
    rebind(MonacoEditorProvider).to(KeithMonacoEditorProvider).inSingletonScope()
    // bind(ThemeManager).toSelf().inSingletonScope()

    // // Diagram options bindings
    // bindViewContribution(bind, DiagramOptionsViewContribution);
    // bind(FrontendApplicationContribution).toService(DiagramOptionsViewContribution);

    // bind(DiagramOptionsViewWidgetFactory).toFactory(ctx =>
    //     () => createDiagramOptionsViewWidget(ctx.container)
    // )

    // bind(DiagramOptionsViewService).toSelf().inSingletonScope();
    // bind(WidgetFactory).toDynamicValue(context => context.container.get(DiagramOptionsViewService));

    // added for keybinding and commands
    bind(KeithKeybindingContext).toSelf()
    bind(KeybindingContext).toDynamicValue(context => context.container.get(KeithKeybindingContext));

    bindViewContribution(bind, KeithContribution)
})


// function createDiagramOptionsViewWidget(parent: interfaces.Container): DiagramOptionsViewWidget {
//     const child = createTreeContainer(parent);

//     child.unbind(TreeWidget);
//     child.bind(DiagramOptionsViewWidget).toSelf();

//     return child.get(DiagramOptionsViewWidget);
// }