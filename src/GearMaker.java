import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.custom.ScrolledComposite;

public class GearMaker {

	protected Shell shlGearMaker;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GearMaker window = new GearMaker();
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
		shlGearMaker.setSize(394, 281);
		shlGearMaker.setText("Gear Maker");
		
		Label lblGearMaker = new Label(shlGearMaker, SWT.NONE);
		lblGearMaker.setToolTipText("Application developed by Harish Banote. Contact on harishbanote96@gmail.com");
		lblGearMaker.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblGearMaker.setFont(SWTResourceManager.getFont("CopprplGoth Bd BT", 14, SWT.NORMAL));
		lblGearMaker.setBounds(124, 10, 133, 24);
		lblGearMaker.setText("GEAR MAKER");
		
		Button btnNewButton = new Button(shlGearMaker, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				About a = new About();
				a.open();
			}
		});
		btnNewButton.setBounds(98, 198, 75, 25);
		btnNewButton.setText("About");
		
		Button btnNewButton_1 = new Button(shlGearMaker, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Help h = new Help();
				h.open();
			}
		});
		btnNewButton_1.setBounds(211, 198, 75, 25);
		btnNewButton_1.setText("help");
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(shlGearMaker, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setBounds(41, 65, 302, 112);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		Composite composite = new Composite(scrolledComposite, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		
		Link link = new Link(composite, SWT.NONE);
		link.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		link.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				One o  = new One();
			//	shlGearMaker.close();
				o.open();
			}
		});
		link.setBounds(28, 10, 127, 15);
		link.setText("<a>Gear ratio</a>");
		
		Link link_1 = new Link(composite, SWT.NONE);
		link_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Two t  = new Two();
				//shlGearMaker.close();
				t.open();
			}
		});
		link_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		link_1.setBounds(28, 31, 127, 15);
		link_1.setText("<a>Module</a>");
		
		Link link_2 = new Link(composite, SWT.NONE);
		link_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Three t = new Three();
			//	shlGearMaker.close();
				t.open();
			}
		});
		link_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		link_2.setBounds(28, 52, 127, 15);
		link_2.setText("<a>Pitch Circle Diameter</a>");
		
		Link link_4 = new Link(composite, SWT.NONE);
		link_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Fifth f = new Fifth();
				//	shlGearMaker.close();
					f.open();
				
			}
		});
		link_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		link_4.setBounds(28, 94, 127, 15);
		link_4.setText("<a>Pitch Diameter</a>");
		
		Link link_5 = new Link(composite, SWT.NONE);
		link_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Sixth s= new Sixth();
				//	shlGearMaker.close();
					s.open();
			}
		});
		link_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		link_5.setBounds(28, 115, 127, 15);
		link_5.setText("<a>No. of Teeth</a>");
		
		Link link_6 = new Link(composite, SWT.NONE);
		link_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Seventh se = new Seventh();
				//	shlGearMaker.close();
					se.open();
			}
		});
		link_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		link_6.setBounds(28, 136, 127, 15);
		link_6.setText("<a>Dedendum</a>");
		
		Link link_3 = new Link(composite, SWT.NONE);
		link_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Fourth f = new Fourth();
				//shlGearMaker.close();
				f.open();
			}
		});
		link_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		link_3.setBounds(28, 73, 152, 15);
		link_3.setText("<a>Diameter of wheel</a>");
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblNewLabel.setBounds(10, 10, 9, 15);
		lblNewLabel.setText("1.");
		
		Label label = new Label(composite, SWT.NONE);
		label.setText("2.");
		label.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		label.setBounds(10, 31, 9, 15);
		
		Label label_1 = new Label(composite, SWT.NONE);
		label_1.setText("3.");
		label_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		label_1.setBounds(10, 52, 9, 15);
		
		Label label_2 = new Label(composite, SWT.NONE);
		label_2.setText("4.");
		label_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		label_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		label_2.setBounds(10, 73, 9, 15);
		
		Label label_3 = new Label(composite, SWT.NONE);
		label_3.setText("5.");
		label_3.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		label_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		label_3.setBounds(10, 94, 9, 15);
		
		Label label_4 = new Label(composite, SWT.NONE);
		label_4.setText("6.");
		label_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		label_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		label_4.setBounds(10, 115, 9, 15);
		
		Label label_5 = new Label(composite, SWT.NONE);
		label_5.setText("7.");
		label_5.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		label_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		label_5.setBounds(10, 136, 9, 15);
		scrolledComposite.setContent(composite);
		scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
		Label lblNewLabel_1 = new Label(shlGearMaker, SWT.NONE);
		lblNewLabel_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblNewLabel_1.setBounds(41, 44, 302, 15);
		lblNewLabel_1.setText("Select any field to calculate there respectives.");
		
		Label label_6 = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_6.setBounds(54, 20, 64, 2);
		
		Label label_7 = new Label(shlGearMaker, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_7.setBounds(256, 20, 64, 2);

	}
}
