package de.cau.cs.kieler.sccharts.klighd

class SCChartsDiagramSynthesisTransitions {
/*     def KEdge translateTransition(Transition t) {
        return t.createEdge().putToLookUpWith(t) => [ edge |
            edge.source = t.sourceState.node;
            edge.target = t.targetState.node;
            edge.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
            if (USE_ADAPTIVEZOOM.booleanValue) edge.lowerVisibilityScaleBound = 0.11f;
            edge.addSpline(2) => [
                // isImmediate2 consideres conditional nodes and normal terminations w/o a trigger
                if (t.isImmediate2) {
                    it.lineStyle = LineStyle::CUSTOM;
                    it.lineStyle.dashPattern.clear;
                    it.lineStyle.dashPattern += TRANSITION_DASH_PATTERN;
                }
                it.addArrowDecorator() => [
                    var offset = 0
                    if (t.history == HistoryType::SHALLOW) {
                        it.parent.addShallowHistoryDecorator();
                        (it.placementData as KDecoratorPlacementData).absolute = -17.0f;
                        offset = -15
                    }
                    if (t.history == HistoryType::DEEP) {
                        it.parent.addDeepHistoryDecorator();
                        (it.placementData as KDecoratorPlacementData).absolute = -17.0f;
                        offset = -15
                    }
                    if (t.deferred) {
                        it.parent.addDeferredDecorator(offset);
                        (it.placementData as KDecoratorPlacementData).absolute = -11.0f + offset;
                    }
                ];
                // it.lineCap = LineCap::CAP_ROUND;
                switch (t.type) {
                    case TransitionType::STRONGABORT:
                        it.addStrongAbortionDecorator
                    case TransitionType::TERMINATION:
                        it.addNormalTerminationDecorator()
                };
            ];
            if (SHOW_LABELS.booleanValue) {
                scopeProvider.parent = t.sourceState;

                // For serialization set these flags to false to ommit them in the transition label
                val tCopy = t.copy
                tCopy.setDeferred(false)
                tCopy.setHistory(HistoryType::RESET)
                tCopy.setImmediate(false)
                tCopy.annotations.clear // do not serialize copied annotations
                var label = tCopy.serialize as String
//                 label = label + tCopy.trigger.serialize as String//serializer.serialize(tCopy)

                label = label.replace("'", "")

                // break labels if they are annotated
                if (t.getAnnotation(ANNOTATION_LABELBREAK) != null) {
                    label = label.replace(";", ";\n")
                }

                // Override if a Label is set for a transition
                if (!t.label.nullOrEmpty) {
                    label = t.label
                }
                if (t.sourceState.outgoingTransitions.size > 1) {
                    label = t.sourceState.outgoingTransitions.indexOf(t) + 1 + ": " + label.trim.replace("'", "");
                }
                if (!label.nullOrEmpty) {
                    t.createLabel(edge).putToLookUpWith(t).configureCenterEdgeLabel(
                        " " + label,
                        11,
                        KlighdConstants::DEFAULT_FONT_NAME
                    ) => [
                        it.setLayoutOption(LayoutOptions.FONT_SIZE, 13);
                        if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.5f;
                        it.KRendering.setFontBold(true)
                    ]
                }
            }
        ]
    }

    // -------------------------------------------------------------------------
    // Different renderings for different transition types
    def KRendering addStrongAbortionDecorator(KPolyline line) {
        return line.addEllipse() => [
            it.lineWidth = 1;
            it.background = "red".color
            if (PAPER_BW.booleanValue || globalBWOption) {
                it.background = "gray".color
            }
            it.setDecoratorPlacementData(10, 10, 4, 0, false);
        ];
    }

    def KRendering addDeferredDecorator(KContainerRendering line, float offset) {
        return line.addEllipse() => [
            it.lineWidth = 1;
            it.background = "red".color
            if (PAPER_BW.booleanValue || globalBWOption) {
                it.background = "gray".color
            }
            it.setDecoratorPlacementData(10, 10, -4 + offset, 1, false);
        ];
    }

    def KPolygon addNormalTerminationDecorator(KPolyline line) {
        return line.drawTriangle() => [
            it.lineWidth = 1;
            it.background = "green".color
            if (PAPER_BW.booleanValue || globalBWOption) {
                it.background = "gray".color
            }
            it.setDecoratorPlacementData(11, 11, 5, 0, true);
        ];
    }

    def KRendering addShallowHistoryDecorator(KContainerRendering line) {
        return line.addEllipse() => [
            it.lineWidth = 0;
            it.setForeground(DARKGRAY.copy)
            it.background = DARKGRAY.copy
            it.setDecoratorPlacementData(16, 16, -6, 1, false);
            it.addPolyline(1) => [
                it.lineWidth = 2;
                it.points += createKPosition(LEFT, 5, 0, TOP, 4, 0);
                it.points += createKPosition(LEFT, 5, 0, BOTTOM, 4, 0);
                it.points += createKPosition(LEFT, 5, 0, TOP, 0, 0.5f);
                it.points += createKPosition(RIGHT, 5, 0, TOP, 0, 0.5f);
                it.points += createKPosition(RIGHT, 5, 0, BOTTOM, 4, 0);
                it.points += createKPosition(RIGHT, 5, 0, TOP, 4, 0);
                it.setForeground("white".color);
            ];
        ];
    }

    def KRendering addDeepHistoryDecorator(KContainerRendering line) {
        return line.addEllipse() => [
            it.lineWidth = 0;
            it.setForeground(DARKGRAY.copy)
            it.background = DARKGRAY.copy
            it.setDecoratorPlacementData(16, 16, -6, 1, false);
            it.addPolyline(1) => [
                it.lineWidth = 2;
                it.points += createKPosition(LEFT, 3, 0, TOP, 4, 0);
                it.points += createKPosition(LEFT, 3, 0, BOTTOM, 4, 0);
                it.points += createKPosition(LEFT, 3, 0, TOP, 0, 0.5f);
                it.points += createKPosition(RIGHT, 7, 0, TOP, 0, 0.5f);
                it.points += createKPosition(RIGHT, 7, 0, BOTTOM, 4, 0);
                it.points += createKPosition(RIGHT, 7, 0, TOP, 4, 0);
                it.setForeground("white".color);
            ];
            it.addText("*") => [
                it.setForeground("white".color)
                it.setPointPlacementData(createKPosition(LEFT, 10, 0, TOP, 0, 0), H_LEFT, V_TOP, 6, 0, 0, 0)
            ]
        ];
    }
*/	
}