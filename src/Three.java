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

public class Three {

	protected Shell shlGearMaker;
	private Text N;
	private Text M;
	private Text PCD;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Three window = new Three();
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
		shlGearMaker.setSize(450, 339);
		shlGearMaker.setText("Gear Maker");
		
		Label label_8 = new Label(shlGearMaker, SWT.NONE);
		label_8.setText("Calculations");
		label_8.setFont(SWTResourceManager.getFont("Segoe Script", 11, SWT.NORMAL));
		label_8.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		label_8.setBounds(166, 109, 104, 19);
		
		Label label_4 = new Label(shlGearMaker, SWT.NONE);
		label_4.setText("Formula");
		label_4.setFont(SWTResourceManager.getFont("Segoe Script", 11, SWT.NORMAL));
		label_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		label_4.setBounds(183, 40, 75, 19);
		
		Composite composite = new Composite(shlGearMaker, SWT.BORDER);
		composite.setToolTipText("Formula to calculate Pitch Circle Diameter.");
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		composite.setBounds(44, 55, 346, 48);
		
		Label lblPcd = new Label(composite, SWT.NONE);
		lblPcd.setBounds(81, 10, 62, 27);
		lblPcd.setToolTipText("Pitch Circle Diameter.");
		lblPcd.setText("PCD =");
		lblPcd.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblPcd.setFont(SWTResourceManager.getFont("Segoe Script", 13, SWT.NORMAL));
		lblPcd.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		
		Label label_1 = new Label(composite, SWT.NONE);
		label_1.setBounds(147, 10, 127, 27);
		label_1.setToolTipText("T = No. of teeth, Module = D/T");
		label_1.setText("T * MODULE");
		label_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		label_1.setFont(SWTResourceManager.getFont("Segoe Script", 13, SWT.NORMAL));
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		
		Label label = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(80, 20, 64, 2);
		
		Label label_2 = new Label(shlGearMaker, SWT.NONE);
		label_2.setToolTipText("Application developed by Harish Banote. Contact on harishbanote96@gmail.com");
		label_2.setText("GEAR MAKER");
		label_2.setFont(SWTResourceManager.getFont("CopprplGoth Bd BT", 14, SWT.NORMAL));
		label_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		label_2.setBounds(150, 10, 133, 24);
		
		Label label_3 = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_3.setBounds(280, 20, 64, 2);
		
		Composite composite_1 = new Composite(shlGearMaker, SWT.BORDER);
		composite_1.setToolTipText("Calculations.");
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		composite_1.setBounds(44, 124, 346, 114);
		
		Label lblNoOfTeeth = new Label(composite_1, SWT.NONE);
		lblNoOfTeeth.setText("No. of teeth (N) :");
		lblNoOfTeeth.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblNoOfTeeth.setBounds(53, 13, 101, 15);
		
		N = new Text(composite_1, SWT.BORDER);
		N.setBounds(160, 10, 76, 21);
		
		Label lblModulem = new Label(composite_1, SWT.NONE);
		lblModulem.setText("Module(M) :");
		lblModulem.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblModulem.setBounds(73, 44, 68, 15);
		
		M = new Text(composite_1, SWT.BORDER);
		M.setBounds(160, 41, 76, 21);
		
		Label lblPcd_1 = new Label(composite_1, SWT.NONE);
		lblPcd_1.setText("PCD  :");
		lblPcd_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblPcd_1.setBounds(109, 77, 32, 15);
		
		PCD = new Text(composite_1, SWT.BORDER);
		PCD.setBounds(160, 74, 76, 21);
		
		Link link = new Link(composite_1, SWT.NONE);
		link.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Two t = new Two();
				t.open();
			}
		});
		link.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		link.setBounds(242, 44, 76, 15);
		link.setText("<a>find Module?</a>");
		
		Button button = new Button(shlGearMaker, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try
				{
				double n1 = Double.parseDouble(N.getText());
				double n2 = Double.parseDouble(M.getText());
				double sr = n1*n2;
				PCD.setText(Double.toString(sr));
				}
				catch(NumberFormatException ex)
				{
					//  Exception
				}
			}
		});
		button.setText("Calculate");
		button.setBounds(137, 253, 75, 25);
		
		Button button_1 = new Button(shlGearMaker, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				N.setText("");
				M.setText("");
				PCD.setText("");
			}
		});
		button_1.setText("Clear");
		button_1.setBounds(229, 253, 75, 25);

	}
}
