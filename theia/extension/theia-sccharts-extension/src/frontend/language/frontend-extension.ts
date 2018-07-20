/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License") you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */

import { ContainerModule, interfaces} from 'inversify'
import { CommandContribution, MenuContribution} from '@theia/core/lib/common'
import { SCChartsCommandContribution} from './sccharts-commands'

import '../../../src/frontend/widgets/style/index.css';
import { SCChartsMenuContribution } from './sccharts-menu-contribution';
import { Constants } from '../../common/constants';
import { configuration, monarchLanguage } from './sctx-monaco-language';
import { configuration as configuration2, monarchLanguage as monarchLanguage2} from './lang2-monaco-language';
import { configuration as configuration3, monarchLanguage as monarchLanguage3} from './lang3-monaco-language';
import { configuration as configuration4, monarchLanguage as monarchLanguage4} from './lang4-monaco-language';
import { TextWidget } from '../widgets/text-widget';
import { BaseWidget, KeybindingContribution, KeybindingContext } from '@theia/core/lib/browser';
import { SCChartsLanguageClientContribution } from './sccharts-language-client-contribution';
import { LanguageClientContribution } from '@theia/languages/lib/browser';
import { ContextMenuCommands } from './dynamic-commands';
import { MonacoEditorProvider } from '@theia/monaco/lib/browser/monaco-editor-provider';
import { SCChartsMonacoEditorProvider } from '../monaco/sccharts-monaco-editor-provider';
import { SCChartsKeybindingContext, SCChartsKeybindingContribution } from './sccharts-keybinding-context';

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
        id: Constants.lang2Id,
        aliases: [Constants.lang2Name, Constants.lang2Id],
        extensions: ['.' + Constants.lang2Id],
        mimetypes: ['text/' + Constants.lang2Id]
    })
    monaco.languages.onLanguage(Constants.lang2Id, () => {
        monaco.languages.setLanguageConfiguration(Constants.lang2Id, configuration2)
        monaco.languages.setMonarchTokensProvider(Constants.lang2Id, monarchLanguage2)
    });

    // register kext
    monaco.languages.register({ 
        id: Constants.lang3Id,
        aliases: [Constants.lang3Name, Constants.lang3Id],
        extensions: ['.' + Constants.lang3Id],
        mimetypes: ['text/' + Constants.lang3Id]
    })
    monaco.languages.onLanguage(Constants.lang3Id, () => {
        monaco.languages.setLanguageConfiguration(Constants.lang3Id, configuration3)
        monaco.languages.setMonarchTokensProvider(Constants.lang3Id, monarchLanguage3)
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

    // widgets
    bind(MenuContribution).to(SCChartsMenuContribution).inSingletonScope()
    bind(TextWidget).toSelf().inSingletonScope()

    bind(BaseWidget).toDynamicValue(ctx => ctx.container.get(TextWidget))

    // languages
    bind(SCChartsLanguageClientContribution).toSelf().inSingletonScope()
    bind(LanguageClientContribution).toDynamicValue(ctx => ctx.container.get(SCChartsLanguageClientContribution))
    
    // apparently for command core.save
    bind(ContextMenuCommands).to(ContextMenuCommands).inSingletonScope()
    // needed to open editor
    rebind(MonacoEditorProvider).to(SCChartsMonacoEditorProvider).inSingletonScope()

    // added for keybinding and commands
    bind(CommandContribution).to(SCChartsCommandContribution).inSingletonScope()
    bind(SCChartsKeybindingContext).toSelf()
    bind(KeybindingContext).toDynamicValue(context => context.container.get(SCChartsKeybindingContext));
    bind(KeybindingContribution).to(SCChartsKeybindingContribution)

})