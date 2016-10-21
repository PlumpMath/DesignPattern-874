package ch02strategy;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Combo;

public class strategy {

	protected Shell shlStoreSystem;
	private Text txtPrice;
	private Text txtAmount;
	private Text txtTotal;
	
	double total = 0.0d;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			strategy window = new strategy();
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
		shlStoreSystem.open();
		shlStoreSystem.layout();
		while (!shlStoreSystem.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlStoreSystem = new Shell();
		shlStoreSystem.setSize(450, 300);
		shlStoreSystem.setText("store system");
		
		Label lbPrice = new Label(shlStoreSystem, SWT.NONE);
		lbPrice.setBounds(10, 10, 92, 23);
		lbPrice.setText("price");
		
		txtPrice = new Text(shlStoreSystem, SWT.BORDER);
		txtPrice.setBounds(117, 7, 173, 23);
		
		Label lbAmount = new Label(shlStoreSystem, SWT.NONE);
		lbAmount.setBounds(10, 39, 61, 17);
		lbAmount.setText("amount");
		
		txtAmount = new Text(shlStoreSystem, SWT.BORDER);
		txtAmount.setBounds(117, 33, 173, 23);
		
		Button btnOK = new Button(shlStoreSystem, SWT.NONE);
		btnOK.setBounds(332, 5, 80, 27);
		btnOK.setText("OK");
		
		Button btnReset = new Button(shlStoreSystem, SWT.NONE);
		btnReset.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnReset.setBounds(332, 34, 80, 27);
		btnReset.setText("reset");
		
		final List listTotal = new List(shlStoreSystem, SWT.BORDER);//final?
		listTotal.setBounds(10, 112, 280, 86);
		
		Label lbTotal = new Label(shlStoreSystem, SWT.NONE);
		lbTotal.setBounds(10, 221, 61, 17);
		lbTotal.setText("Total");
		
		txtTotal = new Text(shlStoreSystem, SWT.BORDER | SWT.READ_ONLY);
		txtTotal.setBounds(90, 202, 200, 50);
		
		Label lbStyle = new Label(shlStoreSystem, SWT.NONE);
		lbStyle.setBounds(10, 75, 61, 17);
		lbStyle.setText("style");
		
		final Combo comboStyle = new Combo(shlStoreSystem, SWT.NONE);
		comboStyle.setItems(new String[] {"normal", "return 100 if 300+", "80%"});
		comboStyle.setBounds(117, 67, 88, 25);
		comboStyle.select(0);
		
		btnOK.addSelectionListener(new SelectionAdapter()
		{
			double totals = 0.0d;
			public void widgetSelected(SelectionEvent arg0){
				
				//CashSuper cSuper = CashFactory.createCashAccept(comboStyle.getText());
				CashContext cc = new CashContext(comboStyle.getText());
				double totals = 0d;
				
				//totals = cSuper.acceptCash(Double.parseDouble(txtPrice.getText()) * Double.parseDouble(txtAmount.getText()));
				totals = cc.getResult(Double.parseDouble(txtPrice.getText()) * Double.parseDouble(txtAmount.getText()));
				
				total = total + totals;
				
				listTotal.add("price:" + txtPrice.getText() + " amount:" + txtAmount.getText()
						+ " " + comboStyle.getText() + " total:" + String.valueOf(totals));
				
				txtTotal.setText(String.valueOf(total));
			}
		});
		

	}
}
