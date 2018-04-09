import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Two {

	protected Shell shlGearMaker;
	private Text D;
	private Text T;
	private Text M;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Two window = new Two();
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
		shlGearMaker.setSize(429, 357);
		shlGearMaker.setText("Gear Maker");
		
		Label label_9 = new Label(shlGearMaker, SWT.NONE);
		label_9.setText("Calculations");
		label_9.setFont(SWTResourceManager.getFont("Segoe Script", 11, SWT.NORMAL));
		label_9.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		label_9.setBounds(157, 136, 104, 19);
		
		Label label = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(72, 20, 64, 2);
		
		Label label_1 = new Label(shlGearMaker, SWT.NONE);
		label_1.setToolTipText("Application developed by Harish Banote. Contact on harishbanote96@gmail.com");
		label_1.setText("GEAR MAKER");
		label_1.setFont(SWTResourceManager.getFont("CopprplGoth Bd BT", 14, SWT.NORMAL));
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		label_1.setBounds(142, 10, 133, 24);
		
		Label label_2 = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_2.setBounds(272, 20, 64, 2);
		
		Label label_3 = new Label(shlGearMaker, SWT.NONE);
		label_3.setText("Formula");
		label_3.setFont(SWTResourceManager.getFont("Segoe Script", 11, SWT.NORMAL));
		label_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		label_3.setBounds(174, 51, 75, 19);
		
		Composite composite = new Composite(shlGearMaker, SWT.BORDER);
		composite.setToolTipText("Formula to calculate Module.");
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		composite.setBounds(35, 66, 346, 48);
		
		Label lblModule = new Label(composite, SWT.NONE);
		lblModule.setToolTipText("Module is the ratio to the diameter of wheel to no. of teeth.");
		lblModule.setText("MODULE =");
		lblModule.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblModule.setFont(SWTResourceManager.getFont("Segoe Script", 13, SWT.NORMAL));
		lblModule.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblModule.setBounds(96, 10, 98, 27);
		
		Label lblDt = new Label(composite, SWT.NONE);
		lblDt.setToolTipText("Module is the ratio to the diameter of wheel to no. of teeth.");
		lblDt.setText("D/T");
		lblDt.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblDt.setFont(SWTResourceManager.getFont("Segoe Script", 13, SWT.NORMAL));
		lblDt.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblDt.setBounds(200, 10, 62, 27);
		
		Composite composite_1 = new Composite(shlGearMaker, SWT.BORDER);
		composite_1.setToolTipText("Calculations.");
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		composite_1.setBounds(35, 151, 346, 114);
		
		Label lblDiameterOfWheel = new Label(composite_1, SWT.NONE);
		lblDiameterOfWheel.setText("Diameter of wheel (D) :");
		lblDiameterOfWheel.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblDiameterOfWheel.setBounds(10, 13, 130, 15);
		
		D = new Text(composite_1, SWT.BORDER);
		D.setBounds(160, 10, 76, 21);
		
		Label lblNoOfTeeth = new Label(composite_1, SWT.NONE);
		lblNoOfTeeth.setText("No. of teeth (T) :");
		lblNoOfTeeth.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblNoOfTeeth.setBounds(44, 44, 96, 15);
		
		T = new Text(composite_1, SWT.BORDER);
		T.setBounds(160, 41, 76, 21);
		
		Label lblModule_1 = new Label(composite_1, SWT.NONE);
		lblModule_1.setText("Module :");
		lblModule_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblModule_1.setBounds(86, 77, 55, 15);
		
		M = new Text(composite_1, SWT.BORDER);
		M.setBounds(160, 74, 76, 21);
		
		Button button = new Button(shlGearMaker, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try
				{
				double n1 = Double.parseDouble(D.getText());
				double n2 = Double.parseDouble(T.getText());
				double sr = n1/n2;
				M.setText(Double.toString(sr));
				}
				catch(NumberFormatException ex)
				{
					//  Exception
				}
			}
		});
		button.setText("Calculate");
		button.setBounds(128, 280, 75, 25);
		
		Button button_1 = new Button(shlGearMaker, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				D.setText("");
				T.setText("");
				M.setText("");
			}
		});
		button_1.setText("Clear");
		button_1.setBounds(220, 280, 75, 25);

	}

}
