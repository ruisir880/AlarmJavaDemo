package alarmjavademo;

import org.jdesktop.application.Application;
import org.jdesktop.application.FrameView;

import javax.swing.*;

public class TestForm extends FrameView {
    private JButton fileMenu;
    private JButton alarmBtn;
    private JButton vedioSettingButton;
    private JButton logSettingButton;
    private JButton warnLogButton;
    private JButton operationLogButton;
    private JButton helpButton;
    private JButton quickManageButton;

    public TestForm(Application application) {
        super(application);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
