package de.cau.cs.kieler.synccharts.dsl.kits.glue.actions;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.gmf.runtime.notation.Diagram;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
/**
 * do not use
 * @author oba
 *
 */
@Deprecated
public class AddStatesToDiagramCommand extends AbstractCommand implements
        Command {
    // protected TransactionalEditingDomain domain = null;
    protected Diagram diagram = null;
    private State newState = null;

    // private static SyncchartsFactory syncFac = SyncchartsFactory.eINSTANCE;

    public AddStatesToDiagramCommand(Diagram diagram, State newState) {
        this.diagram = diagram;
        this.newState = newState;
        this.isExecutable = true;

    }

    public void execute() {
        if (diagram.getElement() != null) {
            if (diagram.getElement() instanceof Region) {
                Region rootRegion = (Region) diagram.getElement();
                if (!(rootRegion.getInnerStates().isEmpty())) {
                    // EList<State> innerStates = rootRegion.getInnerStates();
                    rootRegion.getInnerStates().add(newState);
                }
            }
        }
    }

    @Override
    protected boolean prepare() {
        return true;
    };

    @Override
    public Command chain(Command command) {
        class ChainedCompoundCommand extends CompoundCommand {
            public ChainedCompoundCommand() {
                super();
            }

            @Override
            public Command chain(Command c) {
                append(c);
                return this;
            }
        }

        CompoundCommand result = new ChainedCompoundCommand();
        result.append(this);
        result.append(command);
        return result;
    }

    public void redo() {
        // nothing

    }
}
