package ch21singleton;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;

public class FormToolBox {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FormToolBox window = new FormToolBox();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(226, 300);
		shell.setText("SWT Application");
		
		Button btnTool = new Button(shell, SWT.NONE);
		btnTool.setBounds(10, 24, 80, 27);
		btnTool.setText("tool1");
		
		Button btnTool_1 = new Button(shell, SWT.NONE);
		btnTool_1.setBounds(10, 114, 80, 27);
		btnTool_1.setText("tool2");

	}
}
