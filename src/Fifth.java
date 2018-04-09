import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Fifth {

	protected Shell shlGearMaker;
	private Text M;
	private Text PD;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Fifth window = new Fifth();
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
		shlGearMaker.setSize(410, 300);
		shlGearMaker.setText("Gear Maker");
		
		Label label = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(68, 20, 64, 2);
		
		Label label_1 = new Label(shlGearMaker, SWT.NONE);
		label_1.setToolTipText("Application developed by Harish Banote. Contact on harishbanote96@gmail.com");
		label_1.setText("GEAR MAKER");
		label_1.setFont(SWTResourceManager.getFont("CopprplGoth Bd BT", 14, SWT.NORMAL));
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		label_1.setBounds(138, 10, 133, 24);
		
		Label label_2 = new Label(shlGearMaker, SWT.NONE);
		label_2.setText("Formula");
		label_2.setFont(SWTResourceManager.getFont("Segoe Script", 11, SWT.NORMAL));
		label_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		label_2.setBounds(162, 40, 75, 19);
		
		Composite composite = new Composite(shlGearMaker, SWT.BORDER);
		composite.setToolTipText("Formula to calculate Pitch Diameter.");
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		composite.setBounds(23, 55, 346, 48);
		
		Label lblPd = new Label(composite, SWT.NONE);
		lblPd.setToolTipText("Pitch Diameter.");
		lblPd.setText("PD =");
		lblPd.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblPd.setFont(SWTResourceManager.getFont("Segoe Script", 13, SWT.NORMAL));
		lblPd.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblPd.setBounds(58, 10, 62, 27);
		
		Label lblModule = new Label(composite, SWT.NONE);
		lblModule.setToolTipText("Module = D/T");
		lblModule.setText("25.4 / MODULE");
		lblModule.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblModule.setFont(SWTResourceManager.getFont("Segoe Script", 13, SWT.NORMAL));
		lblModule.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblModule.setBounds(126, 10, 173, 27);
		
		Label label_5 = new Label(shlGearMaker, SWT.NONE);
		label_5.setText("Calculations");
		label_5.setFont(SWTResourceManager.getFont("Segoe Script", 11, SWT.NORMAL));
		label_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		label_5.setBounds(145, 112, 104, 19);
		
		Composite composite_1 = new Composite(shlGearMaker, SWT.BORDER);
		composite_1.setToolTipText("Calculations.");
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		composite_1.setBounds(23, 127, 346, 83);
		
		Label label_7 = new Label(composite_1, SWT.NONE);
		label_7.setText("Module (M) :");
		label_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		label_7.setBounds(64, 10, 76, 15);
		
		M = new Text(composite_1, SWT.BORDER);
		M.setBounds(160, 7, 76, 21);
		
		Label lblPitchDiameter = new Label(composite_1, SWT.NONE);
		lblPitchDiameter.setText("Pitch Diameter :");
		lblPitchDiameter.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblPitchDiameter.setBounds(48, 44, 92, 15);
		
		PD = new Text(composite_1, SWT.BORDER);
		PD.setBounds(160, 41, 76, 21);
		
		Link link = new Link(composite_1, 0);
		link.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Two t =new Two();
				t.open();
			}
		});
		link.setText("<a>find Module?</a>");
		link.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		link.setBounds(242, 10, 76, 15);
		
		Button button = new Button(shlGearMaker, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try
				{
				double n1 = Double.parseDouble(M.getText());
				double sr = 25.4/n1;
				PD.setText(Double.toString(sr));
				}
				catch(NumberFormatException ex)
				{
					//  Exception
				}
			}
		});
		button.setText("Calculate");
		button.setBounds(116, 225, 75, 25);
		
		Button button_1 = new Button(shlGearMaker, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				M.setText("");
				PD.setText("");
			}
		});
		button_1.setText("Clear");
		button_1.setBounds(208, 225, 75, 25);
		
		Label label_9 = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_9.setBounds(267, 20, 64, 2);

	}

}
