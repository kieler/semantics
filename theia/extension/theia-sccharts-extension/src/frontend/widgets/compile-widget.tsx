import { ReactWidget } from "@theia/core/lib/browser/widgets/react-widget";
import { injectable } from "inversify";
import { Message } from "@theia/core/lib/browser";
import * as React from "react";
import { Constants, Compilation } from "../../common/constants";

import "../../../src/frontend/widgets/style/compiler-widget.css";
import { SCChartsCommandContribution } from "../language/sccharts-commands";

@injectable()
export class CompileWidget extends ReactWidget {

    systems : Compilation[] = []

    protected render(): React.ReactNode {
        const compilationElements: React.ReactNode[] = [];
        this.systems.forEach(system => {
            compilationElements.push(<option value={system.id} key={system.id}>{system.label}</option>);
        });
        if (compilationElements.length === 0) {
            Constants.compilations.forEach(system => {
                compilationElements.push(<option value={system.id} key={system.id}>{system.label}</option>);
            });
        }
        return <React.Fragment>
            <div id="compilation-panel">
                {this.renderCompileButton()}
                <select id='compilation-list'>
                    {compilationElements}
                </select>
            </div>
            {this.renderShowButtons()}
        </React.Fragment>
    }
    constructor(
        protected readonly commands: SCChartsCommandContribution
    ) {
        super();
        this.id = 'compiler-widget'
        this.title.label = 'Compile'
        this.title.iconClass = 'fa fa-play-circle';
        this.title.closable = true
        this.addClass('compiler-widget') // class for index.css

        this.requestSystemDescribtions()
    }

    onActivateRequest(msg: Message): void {
        this.requestSystemDescribtions()
        super.onActivateRequest(msg);
        this.update()
    }

    renderShowButtons(): React.ReactNode {

        const showButtons: React.ReactNode[] = [];
        var editor = this.commands.editorManager.currentEditor
        if (!editor) {
            return
        }
        var uri = editor.getTargetUri()
        if (!uri) {
            return
        }
        var snapshots = this.commands.resultMap.get(uri.toString())
        if (!snapshots) {
            return
        }
        snapshots.files.forEach((textDocument, index) => {

            showButtons.push(
                <div key={index} id={"showButton" + (index < 10 ? "0" + index : index)} className='show-button'
                    title={textDocument.name}
                    onClick={event => {
                        if (!uri) {
                            return
                        }
                        this.commands.show(uri.toString(), index)
                    }}>
                </div >
            )
        });
        return <div id="showButtonContainer0" className='buttonContainer flexcontainer'>
            {showButtons}
        </div>
    }

    renderCompileButton(): React.ReactNode {
        return <div id='compile-button'
            onClick={event => {
                var selection = document.getElementById("compilation-list") as HTMLSelectElement;
                if (this.systems.length > 0) {
                    this.commands.compile(this.systems[selection.selectedIndex].id)
                } else {
                    this.commands.compile(Constants.compilations[selection.selectedIndex].id)
                }
            }}>
            <div className='fa fa-play-circle'> </div>
        </div>
    }

    onAfterShow() {
        this.update()
    }

    onUpdateRequest(msg: Message): void {
        this.requestSystemDescribtions()
        super.onUpdateRequest(msg)

    }

    requestSystemDescribtions() {
        const editor = this.commands.editorManager.currentEditor
        if (!editor) {
            this.commands.message("Editor is undefined", "error")
            return;
        }
        const uri = editor.editor.uri.toString();
        this.commands.client.languageClient.then(lclient => {
            lclient.sendRequest("sccharts/get_systems", [uri, true]).then((systems : Compilation[]) => {
                this.systems = systems
            })
        })
    }
}