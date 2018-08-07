import { ReactWidget } from "@theia/core/lib/browser/widgets/react-widget";
import { injectable} from "inversify";
import { Message } from "@theia/core/lib/browser";
import * as React from "react";
import { Constants } from "../../common/constants";

import "../../../src/frontend/widgets/style/compiler-widget.css";
import { SCChartsCommandContribution } from "../language/sccharts-commands";

@injectable()
export class CompileWidget extends ReactWidget {

    protected render(): React.ReactNode {
        const compilationElements: React.ReactNode[] = [];
        Constants.compilations.forEach(compilation => {
            compilationElements.push(<option value={compilation.id} key={compilation.id}>{compilation.name}</option>);
        });
        if (compilationElements.length === 0) {
            compilationElements.push(<option key="NONE" value="NONE">NONE</option>);
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
        this.node.focus()
    }

    onActivateRequest(msg: Message): void {
        super.onActivateRequest(msg);
        this.update()
        this.node.focus()
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
                <div key={index} id={"showButton" + (index < 10? "0" + index : index)} className='show-button'
                title = {textDocument.name} 
                onClick={event => {
                    if (!uri) {
                        return
                    }
                    this.commands.show(uri.toString(), index)
                }}>
            </div >
            )
        });
        return  <div id="showButtonContainer0" className='buttonContainer flexcontainer'> 
            {showButtons}
        </div>
    }

    renderCompileButton() : React.ReactNode {
        return <div id='compile-button'
            onClick={event => {
                var selection = document.getElementById("compilation-list") as HTMLSelectElement;
                this.commands.compile(Constants.compilations[selection.selectedIndex].id)
            }}>
            <div className='fa fa-play-circle'> </div>
        </div>
    }

    onAfterShow() {
        this.update()
    }
}