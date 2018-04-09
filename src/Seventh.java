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

public class Seventh {

	protected Shell shlGearMaker;
	private Text M;
	private Text D;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Seventh window = new Seventh();
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
		shlGearMaker.setSize(419, 316);
		shlGearMaker.setText("Gear Maker");
		
		Label label = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(72, 20, 64, 2);
		
		Label label_1 = new Label(shlGearMaker, SWT.NONE);
		label_1.setToolTipText("Application developed by Harish Banote. Contact on harishbanote96@gmail.com");
		label_1.setText("GEAR MAKER");
		label_1.setFont(SWTResourceManager.getFont("CopprplGoth Bd BT", 14, SWT.NORMAL));
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		label_1.setBounds(142, 10, 133, 24);
		
		Label label_2 = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_2.setBounds(271, 20, 64, 2);
		
		Label label_3 = new Label(shlGearMaker, SWT.NONE);
		label_3.setText("Formula");
		label_3.setFont(SWTResourceManager.getFont("Segoe Script", 11, SWT.NORMAL));
		label_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		label_3.setBounds(166, 40, 75, 19);
		
		Composite composite = new Composite(shlGearMaker, SWT.BORDER);
		composite.setToolTipText("Formula to calculate Dedendum.");
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		composite.setBounds(27, 55, 346, 48);
		
		Label lblDependum = new Label(composite, SWT.NONE);
		lblDependum.setToolTipText("Dedendum is a pitch circle of a cogwheel to the bottom of the tooth space, Module = D/T.");
		lblDependum.setText("DEDENDUM =");
		lblDependum.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblDependum.setFont(SWTResourceManager.getFont("Segoe Script", 13, SWT.NORMAL));
		lblDependum.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblDependum.setBounds(42, 10, 129, 27);
		
		Label lblModule = new Label(composite, SWT.NONE);
		lblModule.setToolTipText("Module = D/T");
		lblModule.setText("1.4 / MODULE");
		lblModule.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblModule.setFont(SWTResourceManager.getFont("Segoe Script", 13, SWT.NORMAL));
		lblModule.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblModule.setBounds(177, 10, 145, 27);
		
		Label label_6 = new Label(shlGearMaker, SWT.NONE);
		label_6.setText("Calculations");
		label_6.setFont(SWTResourceManager.getFont("Segoe Script", 11, SWT.NORMAL));
		label_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		label_6.setBounds(149, 112, 104, 19);
		
		Button button = new Button(shlGearMaker, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				M.setText("");
				D.setText("");
			}
		});
		button.setText("Clear");
		button.setBounds(212, 225, 75, 25);
		
		Button button_1 = new Button(shlGearMaker, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try
				{
				double n1 = Double.parseDouble(M.getText());
				double sr = 1.4 * n1;
				D.setText(Double.toString(sr));
				}
				catch(NumberFormatException ex)
				{
					//  Exception
				}
			}
		});
		button_1.setText("Calculate");
		button_1.setBounds(120, 225, 75, 25);
		
		Composite composite_1 = new Composite(shlGearMaker, SWT.BORDER);
		composite_1.setToolTipText("Calculations.");
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		composite_1.setBounds(27, 127, 346, 83);
		
		Label label_7 = new Label(composite_1, SWT.NONE);
		label_7.setText("Module (M) :");
		label_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		label_7.setBounds(64, 10, 76, 15);
		
		M = new Text(composite_1, SWT.BORDER);
		M.setBounds(160, 7, 76, 21);
		
		Label lblDedendum = new Label(composite_1, SWT.NONE);
		lblDedendum.setText("Dedendum :");
		lblDedendum.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblDedendum.setBounds(64, 44, 76, 15);
		
		D = new Text(composite_1, SWT.BORDER);
		D.setBounds(160, 41, 76, 21);
		
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

	}

}
