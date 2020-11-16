package calculator;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Calculadora {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(307, 417);
		shell.setText("SWT Application");
		
		Button btnNum7 = new Button(shell, SWT.NONE);
		btnNum7.setBounds(22, 41, 43, 25);
		btnNum7.setText("7");
		
		Button btnNum9 = new Button(shell, SWT.NONE);
		btnNum9.setText("9");
		btnNum9.setBounds(153, 41, 43, 25);
		
		Button btnNum8 = new Button(shell, SWT.NONE);
		btnNum8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNum8.setText("8");
		btnNum8.setBounds(87, 41, 43, 25);
		
		Button btnNum4 = new Button(shell, SWT.NONE);
		btnNum4.setText("4");
		btnNum4.setBounds(22, 87, 43, 25);
		
		Button btnNum5 = new Button(shell, SWT.NONE);
		btnNum5.setText("5");
		btnNum5.setBounds(87, 87, 43, 25);
		
		Button btnNum6 = new Button(shell, SWT.NONE);
		btnNum6.setText("6");
		btnNum6.setBounds(153, 87, 43, 25);
		
		Button btnNum1 = new Button(shell, SWT.NONE);
		btnNum1.setText("1");
		btnNum1.setBounds(22, 131, 43, 25);
		
		Button btnNum2 = new Button(shell, SWT.NONE);
		btnNum2.setText("2");
		btnNum2.setBounds(87, 131, 43, 25);
		
		Button btnNum3 = new Button(shell, SWT.NONE);
		btnNum3.setText("3");
		btnNum3.setBounds(153, 131, 43, 25);
		
		Button btnNum0 = new Button(shell, SWT.NONE);
		btnNum0.setText("0");
		btnNum0.setBounds(22, 175, 43, 25);
		
		Button btnOp = new Button(shell, SWT.NONE);
		btnOp.setText("=");
		btnOp.setBounds(87, 175, 109, 25);
		
		Button button_6_3 = new Button(shell, SWT.NONE);
		button_6_3.setText("/");
		button_6_3.setBounds(214, 41, 43, 25);
		
		Button button_6_4 = new Button(shell, SWT.NONE);
		button_6_4.setText("*");
		button_6_4.setBounds(214, 87, 43, 25);
		
		Button button_6_5 = new Button(shell, SWT.NONE);
		button_6_5.setText("+");
		button_6_5.setBounds(214, 131, 43, 25);
		
		Button button_6_6 = new Button(shell, SWT.NONE);
		button_6_6.setText("-");
		button_6_6.setBounds(214, 175, 43, 25);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
