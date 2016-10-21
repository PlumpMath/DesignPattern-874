package ch21singleton;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;

public class Form1 {

	protected Shell shell;
	private FormToolBox ftb;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Form1 window = new Form1();
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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		ToolBar toolBar = new ToolBar(shell, SWT.FLAT | SWT.RIGHT);
		toolBar.setBounds(0, 0, 424, 22);
		
		
		Button button1 = new Button(shell, SWT.NONE);
		button1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				OpenToolbox();
			}
		});
		button1.setBounds(0, 28, 80, 27);
		button1.setText("Button1");
		
		Button button2 = new Button(shell, SWT.NONE);
		button2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				OpenToolbox();
			}
		});
		button2.setBounds(100, 28, 80, 27);
		button2.setText("Button2");

	}
	
	public void OpenToolbox() {
		if (ftb == null || ftb.shell.isDisposed()) {
			ftb = new FormToolBox();
			ftb.open();
		}
	}
}
