import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;

public class About {

	protected Shell shlGearMaker;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			About window = new About();
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
		shlGearMaker.setSize(425, 278);
		shlGearMaker.setText("Gear Maker");
		
		ScrolledForm scrldfrmGearMaker = formToolkit.createScrolledForm(shlGearMaker);
		scrldfrmGearMaker.setToolTipText("Application developed by Harish Banote. Contact on harishbanote96@gmail.com");
		scrldfrmGearMaker.setBounds(178, 89, 221, 139);
		scrldfrmGearMaker.setText("Gear Maker");
		
		Label lblHelpsToFind = new Label(scrldfrmGearMaker.getBody(), SWT.NONE);
		lblHelpsToFind.setText("Helps to find difficult calculations");
		lblHelpsToFind.setBounds(10, 0, 215, 15);
		formToolkit.adapt(lblHelpsToFind, true, true);
		
		Label lblToReduceThe = new Label(scrldfrmGearMaker.getBody(), SWT.NONE);
		lblToReduceThe.setText("to reduce the time requied to make");
		lblToReduceThe.setBounds(10, 21, 215, 15);
		formToolkit.adapt(lblToReduceThe, true, true);
		
		Label lblAnyTypeOf = new Label(scrldfrmGearMaker.getBody(), SWT.NONE);
		lblAnyTypeOf.setText("any type of a gear by using this you");
		lblAnyTypeOf.setBounds(10, 42, 215, 15);
		formToolkit.adapt(lblAnyTypeOf, true, true);
		
		Label lblCanEasilyMake = new Label(scrldfrmGearMaker.getBody(), SWT.NONE);
		lblCanEasilyMake.setText("can easily make any gears.");
		lblCanEasilyMake.setBounds(10, 64, 145, 15);
		formToolkit.adapt(lblCanEasilyMake, true, true);
		
		Label lblContactEmail = new Label(shlGearMaker, SWT.NONE);
		lblContactEmail.setText("Contact : harishbanote96@gmail.com");
		lblContactEmail.setBounds(178, 54, 221, 15);
		formToolkit.adapt(lblContactEmail, true, true);
		
		Label label_5 = new Label(shlGearMaker, SWT.NONE);
		label_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BORDER));
		label_5.setText("Version 1.0.0.0");
		label_5.setBounds(178, 31, 83, 15);
		formToolkit.adapt(label_5, true, true);
		
		Label lblGearMaker = new Label(shlGearMaker, SWT.NONE);
		lblGearMaker.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		lblGearMaker.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		lblGearMaker.setText("Gear Maker");
		lblGearMaker.setBounds(178, 10, 67, 15);
		formToolkit.adapt(lblGearMaker, true, true);
		
		Composite composite = new Composite(shlGearMaker, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		composite.setBounds(10, 10, 162, 219);
		formToolkit.adapt(composite);
		formToolkit.paintBordersFor(composite);
		
		Label lblG = new Label(composite, SWT.NONE);
		lblG.setFont(SWTResourceManager.getFont("Segoe Script", 92, SWT.BOLD));
		lblG.setBounds(-13, -49, 216, 165);
		formToolkit.adapt(lblG, true, true);
		lblG.setText("G");
		
		Label lblM = new Label(composite, SWT.NONE);
		lblM.setText("M");
		lblM.setFont(SWTResourceManager.getFont("Segoe Script", 92, SWT.BOLD));
		lblM.setBounds(34, 107, 128, 140);
		formToolkit.adapt(lblM, true, true);

	}
}
