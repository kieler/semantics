import { injectable } from "inversify";
import { Message } from "@phosphor/messaging";
import { BaseWidget } from "@theia/core/lib/browser";
import PerfectScrollbar from "perfect-scrollbar";
import { MaybePromise } from "@theia/core";
import { Disposable } from "@theia/languages/lib/common";

@injectable()
export class TextWidget extends BaseWidget {

    constructor(
        protected readonly titleLabel: string,
        protected readonly ccode: string,
        protected readonly widgetId: string
    ) {
        super();
        this.title.label = titleLabel
        this.title.closable = true
        this.id = widgetId
        this.addClass('text_widget') // class for index.css
        this.node.innerHTML = "<div>" + ccode + "</div>"
        //this.node.appendChild(new Node())
        this.setHidden(false)
        this.node.focus()
    }

    onActivateRequest(msg: Message): void {
        super.onActivateRequest(msg);
        (async () => {
            const container = await this.getScrollContainer();
            container.style.overflow = 'hidden';
            this.scrollBar = new PerfectScrollbar(container);

            this.toDispose.push(Disposable.create(async () => {
                if (this.scrollBar) {
                    this.scrollBar.destroy();
                    this.scrollBar = undefined;
                }
                // tslint:disable-next-line:no-null-keyword
                container.style.overflow = null;
            }));
        })();
        // this.select.textContent = "Test"
        // this.node.innerHTML = this.returnString
        //var number = this.fileSystem.getCurrentUserHome.toString()
        //var item = this.workspace.textDocuments.pop.name.toString()
        //noe.innerText = "TEst: " + this.workspace.textDocuments.entries.length
        /* var node2 = new HTMLElement()
        node2.innerText = "Hello"//number
        var node3 = new HTMLElement()
        node3.innerText = "world"//item */
        //print("\n\n\nURHKSFD\n\n\n")
        //this.node.appendChild(noe)
        /* this.node.appendChild(node2)
        this.node.appendChild(node3) */
        this.node.focus()
    }

    protected getScrollContainer(): MaybePromise<HTMLElement> {
        return this.node;
    }
}