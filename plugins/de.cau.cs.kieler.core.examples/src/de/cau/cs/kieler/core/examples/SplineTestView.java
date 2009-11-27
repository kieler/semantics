package de.cau.cs.kieler.core.examples;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class SplineTestView extends ViewPart {

    public SplineTestView() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void createPartControl(Composite parent) {
        Canvas canvas = new Canvas(parent, SWT.NONE);
        canvas.addPaintListener(new PaintListener() {
            public void paintControl(PaintEvent e) {
              // Do some drawing
              Rectangle rect = ((Canvas) e.widget).getBounds();
              e.gc.setForeground(e.display.getSystemColor(SWT.COLOR_RED));
              e.gc.drawFocus(5, 5, rect.width - 10, rect.height - 10);
              
              Path path = new Path(e.display);
              path.moveTo(20, 20);
              path.cubicTo(40, 0, 60, 80, 100, 40);
              path.cubicTo(120, 20, 160, 20, 200, 40);
              path.cubicTo(220, 80, 140, 80, 150, 150);
              e.gc.drawPath(path);
            }
          });
    }

    @Override
    public void setFocus() {
        // TODO Auto-generated method stub

    }

}
