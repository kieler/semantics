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
import { MonacoEditorProvider } from '@theia/monaco/lib/browser/monaco-editor-provider'
import { KeithMonacoEditorProvider } from "./keith-monaco-editor-provider"
import { Constants } from './utils'
import { configuration as kgtConfiguration, monarchLanguage as kgtMonarchLanguage} from './kgt-monaco-language'
import { configuration as sctxConfiguration, monarchLanguage as sctxMonarchLanguage } from './sctx-monaco-language';
import { configuration as sclConfiguration, monarchLanguage as sclMonarchLanguage} from './scl-monaco-language'
import { configuration as kextConfiguration, monarchLanguage as kextMonarchLanguage} from './kext-monaco-language'
import { configuration as annoConfiguration, monarchLanguage as annoMonarchLanguage} from './anno-monaco-language'
import { configuration as strlConfiguration, monarchLanguage as strlMonarchLanguage} from './strl-monaco-language'
import { configuration as lusConfiguration, monarchLanguage as lusMonarchLanguage} from './lus-monaco-language'
import { KeithLanguageClientContribution } from './keith-language-client-contribution';
import { LanguageClientContribution } from '@theia/languages/lib/browser';

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

    rebind(MonacoEditorProvider).to(KeithMonacoEditorProvider).inSingletonScope()
    // languages
    bind(KeithLanguageClientContribution).toSelf().inSingletonScope()
    bind(LanguageClientContribution).toDynamicValue(ctx => ctx.container.get(KeithLanguageClientContribution))

})