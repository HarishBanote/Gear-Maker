import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Sixth {

	protected Shell shlGearMaker;
	private Text PCD;
	private Text M;
	private Text NOT;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Sixth window = new Sixth();
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
		shlGearMaker.open();
		shlGearMaker.layout();
		while (!shlGearMaker.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlGearMaker = new Shell();
		shlGearMaker.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		shlGearMaker.setSize(411, 332);
		shlGearMaker.setText("Gear Maker");
		
		Label label = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(58, 20, 64, 2);
		
		Label label_1 = new Label(shlGearMaker, SWT.NONE);
		label_1.setToolTipText("Application developed by Harish Banote. Contact on harishbanote96@gmail.com");
		label_1.setText("GEAR MAKER");
		label_1.setFont(SWTResourceManager.getFont("CopprplGoth Bd BT", 14, SWT.NORMAL));
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		label_1.setBounds(128, 10, 133, 24);
		
		Label label_2 = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_2.setBounds(258, 20, 64, 2);
		
		Label label_3 = new Label(shlGearMaker, SWT.NONE);
		label_3.setText("Formula");
		label_3.setFont(SWTResourceManager.getFont("Segoe Script", 11, SWT.NORMAL));
		label_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		label_3.setBounds(160, 51, 75, 19);
		
		Composite composite = new Composite(shlGearMaker, SWT.BORDER);
		composite.setToolTipText("Formula to calculate No. of teeth.");
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		composite.setBounds(21, 66, 346, 48);
		
		Label lblNot = new Label(composite, SWT.NONE);
		lblNot.setToolTipText("Number of teeth.");
		lblNot.setText("NOT =");
		lblNot.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblNot.setFont(SWTResourceManager.getFont("Segoe Script", 13, SWT.NORMAL));
		lblNot.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblNot.setBounds(82, 10, 66, 27);
		
		Label lblPdcmodule = new Label(composite, SWT.NONE);
		lblPdcmodule.setToolTipText("PCD = T * MODULE, Module = D/T.");
		lblPdcmodule.setText("PCD/MODULE");
		lblPdcmodule.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblPdcmodule.setFont(SWTResourceManager.getFont("Segoe Script", 13, SWT.NORMAL));
		lblPdcmodule.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblPdcmodule.setBounds(150, 10, 132, 27);
		
		Label label_6 = new Label(shlGearMaker, SWT.NONE);
		label_6.setText("Calculations");
		label_6.setFont(SWTResourceManager.getFont("Segoe Script", 11, SWT.NORMAL));
		label_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		label_6.setBounds(143, 120, 104, 19);
		
		Composite composite_1 = new Composite(shlGearMaker, SWT.BORDER);
		composite_1.setToolTipText("Calculations.");
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		composite_1.setBounds(21, 135, 346, 114);
		
		Label lblPcdd = new Label(composite_1, SWT.NONE);
		lblPcdd.setText("Pitch Circle Diameter (PCD) :");
		lblPcdd.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblPcdd.setBounds(10, 13, 159, 15);
		
		PCD = new Text(composite_1, SWT.BORDER);
		PCD.setBounds(175, 10, 76, 21);
		
		Label lblModulem = new Label(composite_1, SWT.NONE);
		lblModulem.setText("Module (M) :");
		lblModulem.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblModulem.setBounds(86, 46, 76, 15);
		
		M = new Text(composite_1, SWT.BORDER);
		M.setBounds(175, 43, 76, 21);
		
		Label lblNoOfTeethnot = new Label(composite_1, SWT.NONE);
		lblNoOfTeethnot.setText("No. of teeth(NOT) :");
		lblNoOfTeethnot.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblNoOfTeethnot.setBounds(55, 77, 101, 15);
		
		NOT = new Text(composite_1, SWT.BORDER);
		NOT.setBounds(175, 74, 76, 21);
		
		Link link = new Link(composite_1, 0);
		link.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Two t = new Two();
				t.open();
			}
		});
		link.setText("<a>find Module?</a>");
		link.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		link.setBounds(257, 46, 76, 15);
		
		Link link_1 = new Link(composite_1, 0);
		link_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Three t = new Three();
				t.open();
			}
		});
		link_1.setText("<a>find PCD?</a>");
		link_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		link_1.setBounds(257, 13, 76, 15);
		
		Button button = new Button(shlGearMaker, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try
				{
				double n1 = Double.parseDouble(PCD.getText());
				double n2 = Double.parseDouble(M.getText());
				double sr = n1/n2;
				NOT.setText(Double.toString(sr));
				}
				catch(NumberFormatException ex)
				{
					//  Exception
				}
			}
		});
		button.setText("Calculate");
		button.setBounds(116, 258, 75, 25);
		
		Button button_1 = new Button(shlGearMaker, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				PCD.setText("");
				M.setText("");
				NOT.setText("");
			}
		});
		button_1.setText("Clear");
		button_1.setBounds(208, 258, 75, 25);

	}

}
