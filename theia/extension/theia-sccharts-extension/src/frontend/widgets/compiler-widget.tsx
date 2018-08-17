import { ReactWidget } from "@theia/core/lib/browser/widgets/react-widget";
import { injectable, LazyServiceIdentifer, inject } from "inversify";
import { Message } from "@theia/core/lib/browser";
import * as React from "react";
import { Constants } from "../../common/constants";

import "../../../src/frontend/widgets/style/compiler-widget.css";
import { KeithContribution } from "../language/keith-contribution";

@injectable()
export class CompilerWidget extends ReactWidget {
    
    render(): React.ReactNode {
        const compilationElements: React.ReactNode[] = [];
        this.commands.systems.forEach(system => {
            compilationElements.push(<option value={system.id} key={system.id}>{system.label}</option>);
        });
        if (compilationElements.length === 0) {
            compilationElements.push(<option value="NONE" key="NONE">NONE</option>);
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
        @inject(new LazyServiceIdentifer(() => KeithContribution)) protected readonly commands: KeithContribution
    ) {
        super();
        this.id = Constants.compilerWidgetId
        this.title.label = 'Compile'
        this.title.iconClass = 'fa fa-play-circle';
        this.title.closable = true
        this.addClass(Constants.compilerWidgetId) // class for index.css
        this.node.draggable = false
    }

    onActivateRequest(msg: Message): void {
        super.onActivateRequest(msg);
        this.update()
    }

    renderShowButtons(): React.ReactNode {

        const showButtons: React.ReactNode[] = [];
        var editor = this.commands.editorManager.currentEditor
        if (!editor) {
            return
        }
        var uri = editor.editor.uri
        if (!uri) {
            return
        }
        var snapshots = this.commands.resultMap.get(uri.toString())
        if (!snapshots) {
            return
        }
        snapshots.files.forEach((snapshot, index) => {

            showButtons.push(
                <div key={index} id={"showButton" + (index < 10 ? "0" + index : index)} className={'show-button'.concat((snapshot.errors.length > 0) ? ' error' : 
                    (snapshot.warnings.length > 0) ? ' warn' : (snapshot.infos.length > 0 ) ? ' info' : '')}
                    title={snapshot.name}
                    onClick={event => {
                        if (!uri) {
                            return
                        }
                        this.commands.show(uri.toString(), index)
                    }}>
                    {snapshot.snapshotIndex == 0 ? snapshot.name : ""}
                </div >
            )
        });
        return <div id="showButtonContainer0" className='buttonContainer'>
            {showButtons}
        </div>
    }

    renderCompileButton(): React.ReactNode {
        return <div id='compile-button'
            onClick={event => {
                var selection = document.getElementById("compilation-list") as HTMLSelectElement;
                if (this.commands.systems.length > 0) {
                    this.commands.compile(this.commands.systems[selection.selectedIndex].id)
                } else {
                    this.commands.compile(Constants.compilations[selection.selectedIndex].id)
                }
            }}>
            <div className='fa fa-play-circle'> </div>
        </div>
    }

    onUpdateRequest(msg: Message): void {
        this.commands.requestSystemDescribtions().then(() => {
            super.onUpdateRequest(msg)
            this.render()
        })
    }
}