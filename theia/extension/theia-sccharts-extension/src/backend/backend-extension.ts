/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License") you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */

import { injectable, ContainerModule } from "inversify";
import { BaseLanguageServerContribution, LanguageServerContribution, IConnection } from "@theia/languages/lib/node";
import { createSocketConnection } from 'vscode-ws-jsonrpc/lib/server'
import * as path from 'path';
import * as net from 'net'
import { Constants } from "../common/constants";
import { isWindows, isOSX } from "@theia/core";

const osExtension = isWindows ? '/kieler.exe' : (isOSX ? '.app' : '/kieler')

export default new ContainerModule(bind => {
    bind<LanguageServerContribution>(LanguageServerContribution).to(KeithContribution)
});
// path to language server for product for the different operating systems
export const productLsPath:  string = './../../../../kieler' + osExtension;
// path to language server for local debugging (could also be read from global.process.argv)
export const debugLsPath: string = "./../../../../../../../../Documents/theia-sprotty-test/language-server-archive/semantics2_9_keybindings/kieler/" + osExtension;

function getPort(): number | undefined {
    let arg = process.argv.filter(arg => arg.startsWith('--LSP_PORT='))[0]
    if (!arg) {
        return undefined
    } else {
        return Number.parseInt(arg.substring('--LSP_PORT='.length))
    }
}

function getLsPath(): string | undefined {
    let arg = process.argv.filter(arg => arg.startsWith('--LS_PATH='))[0]
    if (!arg) {
        return undefined
    } else {
        return arg.substring('--LS_PATH='.length)
    }
}

@injectable()
class KeithContribution extends BaseLanguageServerContribution {

    readonly id = Constants.sctxId;
    readonly name = Constants.sctxName;

    start(clientConnection: IConnection): void {
        let socketPort = getPort();
        if (socketPort) {
            const socket = new net.Socket()
            const serverConnection = createSocketConnection(socket, socket, () => {
                socket.destroy()
            });
            this.forward(clientConnection, serverConnection)
            socket.connect(socketPort)
        } else {
            var lsPath = getLsPath()
            if (!lsPath) {
                let arg = process.argv.filter(arg => arg.startsWith('--root-dir='))[0]
                if (!arg) {
                    lsPath = productLsPath
                } else {
                    lsPath = debugLsPath
                }
            }
            var command = path.resolve(__dirname, lsPath);
            console.log("starting ls " + command)
            console.log("Arguments: \n" + global.process.argv + "\n\n")
            console.log("\n\n\nCurrent directory is " + __dirname + " \n\n\n")
            const serverConnection = this.createProcessStreamConnection(command, []);
            this.forward(clientConnection, serverConnection);
            serverConnection.onClose(() => console.log("Connection closed"))
        }
    }

    protected onDidFailSpawnProcess(error: Error): void {
        super.onDidFailSpawnProcess(error);
        console.error("Error starting DSL language server.", error)
    }
}