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
import { ContextMenuCommands } from './dynamic-commands';
import { KeithLanguageClientContribution } from './keith-language-client-contribution';
import { LanguageClientContribution } from '@theia/languages/lib/browser';
import { RegistrationContribution, LanguageDescription, monarchLanguage, MyMonarchLanguage, configuration } from './registration-contribution';
import { CommandContribution } from '@theia/core';
import { LanguageRegister } from '../common';

export default new ContainerModule((bind: interfaces.Bind, unbind: interfaces.Unbind, isBound: interfaces.IsBound, rebind: interfaces.Rebind) => {
    let languageDescriptions: LanguageDescription[] = []
    // register kgt
    monaco.languages.register({
        id: LanguageRegister.kgtId,
        aliases: [LanguageRegister.kgtName, LanguageRegister.kgtId],
        extensions: ['.' + LanguageRegister.kgtId],
        mimetypes: ['text/' + LanguageRegister.kgtId]
    })

    // register sctx
    monaco.languages.register({
        id: LanguageRegister.sctxId,
        aliases: [LanguageRegister.sctxName, LanguageRegister.sctxId],
        extensions: ['.' + LanguageRegister.sctxId],
        mimetypes: ['text/' + LanguageRegister.sctxId]
    })

    // register scl
    monaco.languages.register({
        id: LanguageRegister.sclId,
        aliases: [LanguageRegister.sclName, LanguageRegister.sclId],
        extensions: ['.' + LanguageRegister.sclId],
        mimetypes: ['text/' + LanguageRegister.sclId]
    })

    // // register kext
    monaco.languages.register({
        id: LanguageRegister.kextId,
        aliases: [LanguageRegister.kextName, LanguageRegister.kextId],
        extensions: ['.' + LanguageRegister.kextId],
        mimetypes: ['text/' + LanguageRegister.kextId]
    })

    // // register anno
    monaco.languages.register({
        id: LanguageRegister.annoId,
        aliases: [LanguageRegister.annoName, LanguageRegister.annoId],
        extensions: ['.' + LanguageRegister.annoId],
        mimetypes: ['text/' + LanguageRegister.annoId]
    })

    // // register esterel
    monaco.languages.register({
        id: LanguageRegister.esterelId,
        aliases: [LanguageRegister.esterelName, LanguageRegister.esterelId],
        extensions: ['.' + LanguageRegister.esterelId],
        mimetypes: ['text/' + LanguageRegister.esterelId]
    })

    // // register lustre
    monaco.languages.register({
        id: LanguageRegister.lustreId,
        aliases: [LanguageRegister.lustreName, LanguageRegister.lustreId],
        extensions: ['.' + LanguageRegister.lustreId],
        mimetypes: ['text/' + LanguageRegister.lustreId]
    })

    bind(LanguageClientContribution).toDynamicValue(ctx => ctx.container.get(KeithLanguageClientContribution))
    bind(ContextMenuCommands).to(ContextMenuCommands).inSingletonScope()

    bind(KeithLanguageClientContribution).toSelf().inSingletonScope()
    bind(CommandContribution).toDynamicValue(ctx => {
        const returnValue = ctx.container.get(RegistrationContribution)
        returnValue.client.languageClient.then(lClient => {
            lClient.sendRequest("keith/registration/get-languages").then((languages: LanguageDescription[]) => {
                languages.forEach((language: LanguageDescription) => {
                    console.log("Registered " + language.name)
                    let mLanguage = monarchLanguage as MyMonarchLanguage
                    mLanguage.keywords = language.keywords
                    monaco.languages.setLanguageConfiguration(language.id, configuration)
                    monaco.languages.setMonarchTokensProvider(language.id, mLanguage)
                    returnValue.client.patterns.push("**/*." + language.id)
                    returnValue.client.documentSelectors.push(language.id)
                    languageDescriptions.push(language)
                })
            })
        }).catch(() => {
            throw new Error("Failed registration")
        })
        return returnValue
    })
    languageDescriptions.forEach((language: LanguageDescription) => {
        monaco.languages.register({
            id: language.id,
            aliases: [language.name, language.id],
            extensions: ['.' + language.id],
            mimetypes: ['text/' + language.id]
        })
    })
    bind(RegistrationContribution).toSelf().inSingletonScope()
    rebind(MonacoEditorProvider).to(KeithMonacoEditorProvider).inSingletonScope()
})