package de.tu_berlin.cs.tfs.muvitorkit.ui.utils.test;

import java.util.EventObject;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.gef.commands.UnexecutableCommand;

/**
 * This is a delegating command stack, which delegates everything to a
 * exchangeable current CommandStack except event listeners.
 * 
 * <p>
 * Event listeners registered to a <code>DelegatingCommandStack</code> will be
 * informed whenever the currently set <code>CommandStack</code> changes. They
 * will not be registered with the underlying <code>CommandStack</code> but they
 * will be informed about change events of it.
 * 
 */
public class DelegatingCommandStack extends CommandStack implements
		CommandStackListener {
	private static final Object[] EMPTY_OBJECT_ARRAY = new Object[] {};

	/** the current command stack */
	private CommandStack currentCommandStack;

	/**
	 * Returns the current <code>CommandStack</code>.
	 * 
	 * @return the current <code>CommandStack</code>
	 */
	public CommandStack getCurrentCommandStack() {
		return currentCommandStack;
	}

	/**
	 * Sets the current <code>CommandStack</code>.
	 * 
	 * @param stack
	 *            the <code>CommandStack</code> to set
	 */
	@SuppressWarnings("deprecation")
	public void setCurrentCommandStack(final CommandStack stack) {
		if (currentCommandStack == stack) {
			return;
		}

		// remove from old command stack
		if (null != currentCommandStack) {
			currentCommandStack.removeCommandStackListener(this);
		}

		// set new command stack
		currentCommandStack = stack;

		// watch new command stack
		currentCommandStack.addCommandStackListener(this);

		// the command stack changed
		notifyListeners();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.CommandStack#canRedo()
	 */
	@Override
	public boolean canRedo() {
		if (null == currentCommandStack) {
			return false;
		}

		return currentCommandStack.canRedo();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.CommandStack#canUndo()
	 */
	@Override
	public boolean canUndo() {
		if (null == currentCommandStack) {
			return false;
		}

		return currentCommandStack.canUndo();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.CommandStack#dispose()
	 */
	@Override
	public void dispose() {
		if (null != currentCommandStack) {
			currentCommandStack.dispose();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.commands.CommandStack#execute(org.eclipse.gef.commands
	 * .Command)
	 */
	@Override
	public void execute(final Command command) {
		if (null != currentCommandStack) {
			currentCommandStack.execute(command);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.CommandStack#flush()
	 */
	@Override
	public void flush() {
		if (null != currentCommandStack) {
			currentCommandStack.flush();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.CommandStack#getCommands()
	 */
	@Override
	public Object[] getCommands() {
		if (null == currentCommandStack) {
			return EMPTY_OBJECT_ARRAY;
		}

		return currentCommandStack.getCommands();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.CommandStack#getRedoCommand()
	 */
	@Override
	public Command getRedoCommand() {
		if (null == currentCommandStack) {
			return UnexecutableCommand.INSTANCE;
		}

		return currentCommandStack.getRedoCommand();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.CommandStack#getUndoCommand()
	 */
	@Override
	public Command getUndoCommand() {
		if (null == currentCommandStack) {
			return UnexecutableCommand.INSTANCE;
		}

		return currentCommandStack.getUndoCommand();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.CommandStack#getUndoLimit()
	 */
	@Override
	public int getUndoLimit() {
		if (null == currentCommandStack) {
			return -1;
		}

		return currentCommandStack.getUndoLimit();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.CommandStack#isDirty()
	 */
	@Override
	public boolean isDirty() {
		if (null == currentCommandStack) {
			return false;
		}

		return currentCommandStack.isDirty();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.CommandStack#markSaveLocation()
	 */
	@Override
	public void markSaveLocation() {
		if (null != currentCommandStack) {
			currentCommandStack.markSaveLocation();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.CommandStack#redo()
	 */
	@Override
	public void redo() {
		if (null != currentCommandStack) {
			currentCommandStack.redo();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.CommandStack#setUndoLimit(int)
	 */
	@Override
	public void setUndoLimit(final int undoLimit) {
		if (null != currentCommandStack) {
			currentCommandStack.setUndoLimit(undoLimit);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.CommandStack#undo()
	 */
	@Override
	public void undo() {
		if (null != currentCommandStack) {
			currentCommandStack.undo();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DelegatingCommandStack(" + currentCommandStack + ")";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.commands.CommandStackListener#commandStackChanged(java
	 * .util.EventObject)
	 */
	@SuppressWarnings("deprecation")
	public void commandStackChanged(final EventObject event) {
		notifyListeners();
	}
}
