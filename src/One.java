import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class One {

	protected Shell shlGearMaker;
	private Text N2;
	private Text N1;
	private Text SR;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			One window = new One();
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
		shlGearMaker.setSize(406, 347);
		shlGearMaker.setText("Gear Maker");
		
		Label lblCalculations = new Label(shlGearMaker, SWT.NONE);
		lblCalculations.setText("Calculations");
		lblCalculations.setFont(SWTResourceManager.getFont("Segoe Script", 11, SWT.NORMAL));
		lblCalculations.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		lblCalculations.setBounds(142, 129, 104, 19);
		
		Label lblFormula = new Label(shlGearMaker, SWT.NONE);
		lblFormula.setFont(SWTResourceManager.getFont("Segoe Script", 11, SWT.NORMAL));
		lblFormula.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		lblFormula.setBounds(159, 52, 75, 19);
		lblFormula.setText("Formula");
		
		Label label = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(60, 20, 64, 2);
		
		Label label_1 = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setBounds(260, 20, 64, 2);
		
		Label label_2 = new Label(shlGearMaker, SWT.NONE);
		label_2.setToolTipText("Application developed by Harish Banote. Contact on harishbanote96@gmail.com");
		label_2.setText("GEAR MAKER");
		label_2.setFont(SWTResourceManager.getFont("CopprplGoth Bd BT", 14, SWT.NORMAL));
		label_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		label_2.setBounds(130, 10, 133, 24);
		
		Composite composite = new Composite(shlGearMaker, SWT.BORDER);
		composite.setToolTipText("Formula to calculate Speed ratio.");
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		composite.setBounds(20, 67, 346, 48);
		
		Label lblSpeedRatio = new Label(composite, SWT.NONE);
		lblSpeedRatio.setToolTipText("Ratio of inpute speed relative to output speed. Diametre of outpute gear to inpute gear.");
		lblSpeedRatio.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblSpeedRatio.setFont(SWTResourceManager.getFont("Segoe Script", 13, SWT.NORMAL));
		lblSpeedRatio.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblSpeedRatio.setBounds(57, 10, 135, 27);
		lblSpeedRatio.setText("GEAR RATIO =");
		
		Label lblN = new Label(composite, SWT.NONE);
		lblN.setToolTipText("Ratio to the speed of driven gear to the speed of driver gear.");
		lblN.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblN.setFont(SWTResourceManager.getFont("Segoe Script", 13, SWT.NORMAL));
		lblN.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblN.setBounds(198, 10, 62, 27);
		lblN.setText("N2/N1");
		
		Composite composite_1 = new Composite(shlGearMaker, SWT.BORDER);
		composite_1.setToolTipText("Calculations.");
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		composite_1.setBounds(20, 144, 346, 114);
		
		Label lblSpeedOfDriven = new Label(composite_1, SWT.NONE);
		lblSpeedOfDriven.setBounds(10, 10, 146, 15);
		lblSpeedOfDriven.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblSpeedOfDriven.setText("Speed of driven gear (N2) :");
		
		N1 = new Text(composite_1, SWT.BORDER);
		N1.setBounds(160, 10, 76, 21);
		
		Label lblSpeedOfDriver = new Label(composite_1, SWT.NONE);
		lblSpeedOfDriver.setText("Speed of driver gear (N1) :");
		lblSpeedOfDriver.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblSpeedOfDriver.setBounds(10, 44, 146, 15);
		
		N2 = new Text(composite_1, SWT.BORDER);
		N2.setBounds(160, 41, 76, 21);
		
		Label lblGearRatio = new Label(composite_1, SWT.NONE);
		lblGearRatio.setText("Gear Ratio :");
		lblGearRatio.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblGearRatio.setBounds(86, 77, 68, 15);
		
		SR = new Text(composite_1, SWT.BORDER);
		SR.setBounds(160, 74, 76, 21);
		
		Button btnCa = new Button(shlGearMaker, SWT.NONE);
		btnCa.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try
				{
				double n1 = Double.parseDouble(N1.getText());
				double n2 = Double.parseDouble(N2.getText());
				double sr = n1/n2;
				SR.setText(Double.toString(sr));
				}
				catch(NumberFormatException ex)
				{
					//  Exception
				}
			}
		});
		btnCa.setBounds(113, 273, 75, 25);
		btnCa.setText("Calculate");
		
		Button btnCancle = new Button(shlGearMaker, SWT.NONE);
		btnCancle.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				N1.setText("");
				N2.setText("");
				SR.setText("");
			}
		});
		btnCancle.setText("Clear");
		btnCancle.setBounds(205, 273, 75, 25);

	}
}
