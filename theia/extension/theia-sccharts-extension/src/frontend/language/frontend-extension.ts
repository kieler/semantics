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

import { ContainerModule, interfaces} from 'inversify'
import { KeithContribution} from './keith-contribution'

import '../../../src/frontend/widgets/style/index.css';
import { Constants } from '../../common/util';
import { configuration, monarchLanguage } from './sctx-monaco-language';
import { configuration as configuration2, monarchLanguage as monarchLanguage2} from './scl-monaco-language';
import { configuration as configuration3, monarchLanguage as monarchLanguage3} from './kext-monaco-language';
import { configuration as configuration4, monarchLanguage as monarchLanguage4} from './anno-monaco-language';
import { configuration as configuration5, monarchLanguage as monarchLanguage5} from './strl-monaco-language';
import { configuration as configuration6, monarchLanguage as monarchLanguage6} from './lus-monaco-language';
import { TextWidget } from '../widgets/text-widget';
import { BaseWidget, KeybindingContext, WidgetFactory, bindViewContribution } from '@theia/core/lib/browser';
import { KeithLanguageClientContribution } from './keith-language-client-contribution';
import { LanguageClientContribution } from '@theia/languages/lib/browser';
import { MonacoEditorProvider } from '@theia/monaco/lib/browser/monaco-editor-provider';
import { KeithMonacoEditorProvider } from '../monaco/keith-monaco-editor-provider';
import { KeithKeybindingContext } from './keith-keybinding-context';
import { CompilerWidget } from '../widgets/compiler-widget';

export default new ContainerModule((bind: interfaces.Bind, unbind: interfaces.Unbind, isBound: interfaces.IsBound, rebind: interfaces.Rebind) => {

    // register sctx
    monaco.languages.register({
        id: Constants.sctxId,
        aliases: [Constants.sctxName, Constants.sctxId],
        extensions: ['.' + Constants.sctxId],
        mimetypes: ['text/' + Constants.sctxId]
    })
    monaco.languages.onLanguage(Constants.sctxId, () => {
        monaco.languages.setLanguageConfiguration(Constants.sctxId, configuration)
        monaco.languages.setMonarchTokensProvider(Constants.sctxId, monarchLanguage)
    });

    // register scl
    monaco.languages.register({ 
        id: Constants.sclId,
        aliases: [Constants.sclName, Constants.sclId],
        extensions: ['.' + Constants.sclId],
        mimetypes: ['text/' + Constants.sclId]
    })
    monaco.languages.onLanguage(Constants.sclId, () => {
        monaco.languages.setLanguageConfiguration(Constants.sclId, configuration2)
        monaco.languages.setMonarchTokensProvider(Constants.sclId, monarchLanguage2)
    });

    // register kext
    monaco.languages.register({ 
        id: Constants.kextId,
        aliases: [Constants.kextName, Constants.kextId],
        extensions: ['.' + Constants.kextId],
        mimetypes: ['text/' + Constants.kextId]
    })
    monaco.languages.onLanguage(Constants.kextId, () => {
        monaco.languages.setLanguageConfiguration(Constants.kextId, configuration3)
        monaco.languages.setMonarchTokensProvider(Constants.kextId, monarchLanguage3)
    });

    // register anno
    monaco.languages.register({ 
        id: Constants.annoId,
        aliases: [Constants.annoName, Constants.annoId],
        extensions: ['.' + Constants.annoId],
        mimetypes: ['text/' + Constants.annoId]
    })
    monaco.languages.onLanguage(Constants.annoId, () => {
        monaco.languages.setLanguageConfiguration(Constants.annoId, configuration4)
        monaco.languages.setMonarchTokensProvider(Constants.annoId, monarchLanguage4)
    });

    // register esterel
    monaco.languages.register({ 
        id: Constants.esterelId,
        aliases: [Constants.esterelName, Constants.esterelId],
        extensions: ['.' + Constants.esterelId],
        mimetypes: ['text/' + Constants.esterelId]
    })
    monaco.languages.onLanguage(Constants.esterelId, () => {
        monaco.languages.setLanguageConfiguration(Constants.esterelId, configuration5)
        monaco.languages.setMonarchTokensProvider(Constants.esterelId, monarchLanguage5)
    });

    // register lustre
    monaco.languages.register({ 
        id: Constants.lustreId,
        aliases: [Constants.lustreName, Constants.lustreId],
        extensions: ['.' + Constants.lustreId],
        mimetypes: ['text/' + Constants.lustreId]
    })
    monaco.languages.onLanguage(Constants.lustreId, () => {
        monaco.languages.setLanguageConfiguration(Constants.lustreId, configuration6)
        monaco.languages.setMonarchTokensProvider(Constants.lustreId, monarchLanguage6)
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

    // languages
    bind(KeithLanguageClientContribution).toSelf().inSingletonScope()
    bind(LanguageClientContribution).toDynamicValue(ctx => ctx.container.get(KeithLanguageClientContribution))
    
    // needed to open editor
    rebind(MonacoEditorProvider).to(KeithMonacoEditorProvider).inSingletonScope()

    // added for keybinding and commands
    bind(KeithKeybindingContext).toSelf()
    bind(KeybindingContext).toDynamicValue(context => context.container.get(KeithKeybindingContext));

    bindViewContribution(bind, KeithContribution)
})