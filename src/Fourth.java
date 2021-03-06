import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Fourth {

	protected Shell shlGearMaker;
	private Text T;
	private Text M;
	private Text DOW;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Fourth window = new Fourth();
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
		shlGearMaker.setSize(450, 330);
		shlGearMaker.setText("Gear Maker");
		
		Label label_5 = new Label(shlGearMaker, SWT.NONE);
		label_5.setText("Formula");
		label_5.setFont(SWTResourceManager.getFont("Segoe Script", 11, SWT.NORMAL));
		label_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		label_5.setBounds(181, 40, 75, 19);
		
		Label label = new Label(shlGearMaker, SWT.NONE);
		label.setToolTipText("Application developed by Harish Banote. Contact on harishbanote96@gmail.com");
		label.setText("GEAR MAKER");
		label.setFont(SWTResourceManager.getFont("CopprplGoth Bd BT", 14, SWT.NORMAL));
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		label.setBounds(157, 10, 133, 24);
		
		Label label_1 = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setBounds(87, 20, 64, 2);
		
		Label label_2 = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_2.setBounds(287, 20, 64, 2);
		
		Composite composite = new Composite(shlGearMaker, SWT.BORDER);
		composite.setToolTipText("Formula to calculate Diameter of wheel.");
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		composite.setBounds(42, 55, 346, 48);
		
		Label lblDow = new Label(composite, SWT.NONE);
		lblDow.setToolTipText("Diameter of wheel");
		lblDow.setText("DOW =");
		lblDow.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblDow.setFont(SWTResourceManager.getFont("Segoe Script", 13, SWT.NORMAL));
		lblDow.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblDow.setBounds(58, 10, 62, 27);
		
		Label lblt = new Label(composite, SWT.NONE);
		lblt.setToolTipText("T = No. of teeth, Module = D/T");
		lblt.setText("(T + 2) * MODULE");
		lblt.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblt.setFont(SWTResourceManager.getFont("Segoe Script", 13, SWT.NORMAL));
		lblt.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblt.setBounds(126, 10, 173, 27);
		
		Label label_3 = new Label(shlGearMaker, SWT.NONE);
		label_3.setText("Calculations");
		label_3.setFont(SWTResourceManager.getFont("Segoe Script", 11, SWT.NORMAL));
		label_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		label_3.setBounds(164, 112, 104, 19);
		
		Button button = new Button(shlGearMaker, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try
				{
				double n1 = Double.parseDouble(T.getText());
				double n2 = Double.parseDouble(M.getText());
				double sr = (n1 + 2) * n2;
				DOW.setText(Double.toString(sr));
				}
				catch(NumberFormatException ex)
				{
					//  Exception
				}
			}
		});
		button.setText("Calculate");
		button.setBounds(135, 256, 75, 25);
		
		Button button_1 = new Button(shlGearMaker, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				T.setText("");
				M.setText("");
				DOW.setText("");
			}
		});
		button_1.setText("Clear");
		button_1.setBounds(227, 256, 75, 25);
		
		Composite composite_1 = new Composite(shlGearMaker, SWT.BORDER);
		composite_1.setToolTipText("Calculations.");
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		composite_1.setBounds(42, 127, 346, 114);
		
		Label lblNoOfTeeth = new Label(composite_1, SWT.NONE);
		lblNoOfTeeth.setText("No. of teeth (T) :");
		lblNoOfTeeth.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblNoOfTeeth.setBounds(44, 13, 96, 15);
		
		T = new Text(composite_1, SWT.BORDER);
		T.setBounds(160, 10, 76, 21);
		
		Label lblModulem = new Label(composite_1, SWT.NONE);
		lblModulem.setText("Module (M) :");
		lblModulem.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblModulem.setBounds(64, 44, 76, 15);
		
		M = new Text(composite_1, SWT.BORDER);
		M.setBounds(160, 41, 76, 21);
		
		Label lblDiameterOfWheel = new Label(composite_1, SWT.NONE);
		lblDiameterOfWheel.setText("Diameter of wheel :");
		lblDiameterOfWheel.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblDiameterOfWheel.setBounds(29, 77, 107, 15);
		
		DOW = new Text(composite_1, SWT.BORDER);
		DOW.setBounds(160, 74, 76, 21);
		
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
		link.setBounds(242, 44, 76, 15);

	}

}
