// included in the main frontend-extension
// import { ContainerModule, interfaces } from 'inversify';
// import { DiagramOptionsViewService } from './diagramoptions-view-service';
// import { DiagramOptionsViewContribution } from './diagramoptions-view-contribution';
// import { WidgetFactory } from '@theia/core/lib/browser/widget-manager';
// import { FrontendApplicationContribution, createTreeContainer, TreeWidget, bindViewContribution } from '@theia/core/lib/browser';
// import { DiagramOptionsViewWidgetFactory, DiagramOptionsViewWidget } from './diagramoptions-view-widget';

// export default new ContainerModule(bind => {
//     bind(DiagramOptionsViewWidgetFactory).toFactory(ctx =>
//         () => createDiagramOptionsViewWidget(ctx.container)
//     );

//     bind(DiagramOptionsViewService).toSelf().inSingletonScope();
//     bind(WidgetFactory).toDynamicValue(context => context.container.get(DiagramOptionsViewService));

//     bindViewContribution(bind, DiagramOptionsViewContribution);
//     bind(FrontendApplicationContribution).toService(DiagramOptionsViewContribution);
// });

// function createDiagramOptionsViewWidget(parent: interfaces.Container): DiagramOptionsViewWidget {
//     const child = createTreeContainer(parent);

//     child.unbind(TreeWidget);
//     child.bind(DiagramOptionsViewWidget).toSelf();

//     return child.get(DiagramOptionsViewWidget);
// }