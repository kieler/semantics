/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License") you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */

import { ContainerModule, interfaces} from 'inversify'
import { CommandContribution, MenuContribution} from '@theia/core/lib/common'
import { KeithCommandContribution} from './keith-commands'

import '../../../src/frontend/widgets/style/index.css';
import { KeithMenuContribution } from './keith-menu-contribution';
import { Constants } from '../../common/constants';
import { configuration, monarchLanguage } from './sctx-monaco-language';
import { configuration as configuration2, monarchLanguage as monarchLanguage2} from './scl-monaco-language';
import { configuration as configuration3, monarchLanguage as monarchLanguage3} from './kext-monaco-language';
import { configuration as configuration4, monarchLanguage as monarchLanguage4} from './anno-monaco-language';
import { configuration as configuration5, monarchLanguage as monarchLanguage5} from './strl-monaco-language';
import { configuration as configuration6, monarchLanguage as monarchLanguage6} from './lus-monaco-language';
import { TextWidget } from '../widgets/text-widget';
import { BaseWidget, KeybindingContribution, KeybindingContext, WidgetFactory} from '@theia/core/lib/browser';
import { KeithLanguageClientContribution } from './keith-language-client-contribution';
import { LanguageClientContribution } from '@theia/languages/lib/browser';
import { MonacoEditorProvider } from '@theia/monaco/lib/browser/monaco-editor-provider';
import { KeithMonacoEditorProvider } from '../monaco/keith-monaco-editor-provider';
import { KeithKeybindingContext, KeithKeybindingContribution } from './keith-keybinding-context';
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
    bind(MenuContribution).to(KeithMenuContribution).inSingletonScope()
    bind(TextWidget).toSelf().inSingletonScope()
    bind(BaseWidget).toDynamicValue(ctx => ctx.container.get(TextWidget))
    bind(CompilerWidget).toSelf().inSingletonScope()
    bind(WidgetFactory).toDynamicValue(context => ({
        id: Constants.compilerWidgetId,
        createWidget: () => context.container.get<CompilerWidget>(CompilerWidget)
    }));

    // languages
    bind(KeithLanguageClientContribution).toSelf().inSingletonScope()
    bind(LanguageClientContribution).toDynamicValue(ctx => ctx.container.get(KeithLanguageClientContribution))
    
    // needed to open editor
    rebind(MonacoEditorProvider).to(KeithMonacoEditorProvider).inSingletonScope()

    // added for keybinding and commands
    bind(CommandContribution).to(KeithCommandContribution).inSingletonScope()
    bind(KeithKeybindingContext).toSelf()
    bind(KeybindingContext).toDynamicValue(context => context.container.get(KeithKeybindingContext));
    bind(KeybindingContribution).to(KeithKeybindingContribution)

})