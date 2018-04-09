import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Help {

	protected Shell shlGearMaker;
	private Text txtGearMakerIs;
	private Text txtGearedDecivesCan;
	private Text txtWhichMeshWith;
	private Text txtAGearOr;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Help window = new Help();
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
		shlGearMaker.setToolTipText("Gear Maker");
		shlGearMaker.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		shlGearMaker.setSize(441, 299);
		shlGearMaker.setText("Gear Maker");
		
		Label label = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(87, 20, 64, 2);
		
		Label label_1 = new Label(shlGearMaker, SWT.NONE);
		label_1.setToolTipText("Application developed by Harish Banote. Contact on harishbanote96@gmail.com");
		label_1.setText("GEAR MAKER");
		label_1.setFont(SWTResourceManager.getFont("CopprplGoth Bd BT", 14, SWT.NORMAL));
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		label_1.setBounds(157, 10, 133, 24);
		
		Label label_2 = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_2.setBounds(287, 20, 64, 2);
		
		Button btnNewButton = new Button(shlGearMaker, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlGearMaker.close();
			}
		});
		btnNewButton.setBounds(174, 206, 75, 25);
		btnNewButton.setText("OK");
		
		Label lblDescription = new Label(shlGearMaker, SWT.NONE);
		lblDescription.setFont(SWTResourceManager.getFont("Segoe Script", 10, SWT.BOLD | SWT.ITALIC));
		lblDescription.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblDescription.setBounds(174, 47, 88, 15);
		lblDescription.setText("Description");
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(shlGearMaker, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setBounds(30, 68, 362, 123);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		Composite composite = new Composite(scrolledComposite, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION_TEXT));
		
		txtGearedDecivesCan = new Text(composite, SWT.NONE);
		txtGearedDecivesCan.setText("Geared decives can change the speed, torque, and direction of power source.");
		txtGearedDecivesCan.setBounds(10, 91, 417, 21);
		
		txtWhichMeshWith = new Text(composite, SWT.NONE);
		txtWhichMeshWith.setText("which mesh with another toothed part to transimt torque.");
		txtWhichMeshWith.setBounds(10, 64, 320, 21);
		
		txtGearMakerIs = new Text(composite, SWT.NONE);
		txtGearMakerIs.setBounds(10, 10, 194, 21);
		txtGearMakerIs.setText("Gear Maker is a tool to create gear,");
		
		txtAGearOr = new Text(composite, SWT.NONE);
		txtAGearOr.setText("A gear or coqwheel is a rotating machine part having cut teeth or cogs");
		txtAGearOr.setBounds(10, 37, 383, 21);
		scrolledComposite.setContent(composite);
		scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

	}
}
