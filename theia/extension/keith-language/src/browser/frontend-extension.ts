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
import { LanguageRegister } from '../common'
import { configuration as kgtConfiguration, monarchLanguage as kgtMonarchLanguage} from './kgt-monaco-language'
import { configuration as sctxConfiguration, monarchLanguage as sctxMonarchLanguage } from './sctx-monaco-language';
import { configuration as sclConfiguration, monarchLanguage as sclMonarchLanguage} from './scl-monaco-language'
import { configuration as kextConfiguration, monarchLanguage as kextMonarchLanguage} from './kext-monaco-language'
import { configuration as annoConfiguration, monarchLanguage as annoMonarchLanguage} from './anno-monaco-language'
import { configuration as strlConfiguration, monarchLanguage as strlMonarchLanguage} from './strl-monaco-language'
import { configuration as lusConfiguration, monarchLanguage as lusMonarchLanguage} from './lus-monaco-language'

export default new ContainerModule((bind: interfaces.Bind, unbind: interfaces.Unbind, isBound: interfaces.IsBound, rebind: interfaces.Rebind) => {
    // register kgt
    monaco.languages.register({
        id: LanguageRegister.kgtId,
        aliases: [LanguageRegister.kgtName, LanguageRegister.kgtId],
        extensions: ['.' + LanguageRegister.kgtId],
        mimetypes: ['text/' + LanguageRegister.kgtId]
    })
    monaco.languages.onLanguage(LanguageRegister.kgtId, () => {
        monaco.languages.setLanguageConfiguration(LanguageRegister.kgtId, kgtConfiguration)
        monaco.languages.setMonarchTokensProvider(LanguageRegister.kgtId, kgtMonarchLanguage)
    });

    // register sctx
    monaco.languages.register({
        id: LanguageRegister.sctxId,
        aliases: [LanguageRegister.sctxName, LanguageRegister.sctxId],
        extensions: ['.' + LanguageRegister.sctxId],
        mimetypes: ['text/' + LanguageRegister.sctxId]
    })
    monaco.languages.onLanguage(LanguageRegister.sctxId, () => {
        monaco.languages.setLanguageConfiguration(LanguageRegister.sctxId, sctxConfiguration)
        monaco.languages.setMonarchTokensProvider(LanguageRegister.sctxId, sctxMonarchLanguage)
    });

    // register scl
    monaco.languages.register({
        id: LanguageRegister.sclId,
        aliases: [LanguageRegister.sclName, LanguageRegister.sclId],
        extensions: ['.' + LanguageRegister.sclId],
        mimetypes: ['text/' + LanguageRegister.sclId]
    })
    monaco.languages.onLanguage(LanguageRegister.sclId, () => {
        monaco.languages.setLanguageConfiguration(LanguageRegister.sclId, sclConfiguration)
        monaco.languages.setMonarchTokensProvider(LanguageRegister.sclId, sclMonarchLanguage)
    });

    // register kext
    monaco.languages.register({
        id: LanguageRegister.kextId,
        aliases: [LanguageRegister.kextName, LanguageRegister.kextId],
        extensions: ['.' + LanguageRegister.kextId],
        mimetypes: ['text/' + LanguageRegister.kextId]
    })
    monaco.languages.onLanguage(LanguageRegister.kextId, () => {
        monaco.languages.setLanguageConfiguration(LanguageRegister.kextId, kextConfiguration)
        monaco.languages.setMonarchTokensProvider(LanguageRegister.kextId, kextMonarchLanguage)
    });

    // register anno
    monaco.languages.register({
        id: LanguageRegister.annoId,
        aliases: [LanguageRegister.annoName, LanguageRegister.annoId],
        extensions: ['.' + LanguageRegister.annoId],
        mimetypes: ['text/' + LanguageRegister.annoId]
    })
    monaco.languages.onLanguage(LanguageRegister.annoId, () => {
        monaco.languages.setLanguageConfiguration(LanguageRegister.annoId, annoConfiguration)
        monaco.languages.setMonarchTokensProvider(LanguageRegister.annoId, annoMonarchLanguage)
    });

    // register esterel
    monaco.languages.register({
        id: LanguageRegister.esterelId,
        aliases: [LanguageRegister.esterelName, LanguageRegister.esterelId],
        extensions: ['.' + LanguageRegister.esterelId],
        mimetypes: ['text/' + LanguageRegister.esterelId]
    })
    monaco.languages.onLanguage(LanguageRegister.esterelId, () => {
        monaco.languages.setLanguageConfiguration(LanguageRegister.esterelId, strlConfiguration)
        monaco.languages.setMonarchTokensProvider(LanguageRegister.esterelId, strlMonarchLanguage)
    });

    // register lustre
    monaco.languages.register({
        id: LanguageRegister.lustreId,
        aliases: [LanguageRegister.lustreName, LanguageRegister.lustreId],
        extensions: ['.' + LanguageRegister.lustreId],
        mimetypes: ['text/' + LanguageRegister.lustreId]
    })
    monaco.languages.onLanguage(LanguageRegister.lustreId, () => {
        monaco.languages.setLanguageConfiguration(LanguageRegister.lustreId, lusConfiguration)
        monaco.languages.setMonarchTokensProvider(LanguageRegister.lustreId, lusMonarchLanguage)
    });

    rebind(MonacoEditorProvider).to(KeithMonacoEditorProvider).inSingletonScope()
})