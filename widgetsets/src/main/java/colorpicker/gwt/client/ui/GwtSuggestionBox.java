package colorpicker.gwt.client.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.vaadin.terminal.gwt.client.ui.VTextArea;

/**
 * Created by pawel on 20/12/14.
 */
public class GwtSuggestionBox extends Composite {

    public GwtSuggestionBox() {
        super();

        VerticalPanel panel = new VerticalPanel();

        panel.add(new VTextArea());

        initWidget(panel);


    }
}
