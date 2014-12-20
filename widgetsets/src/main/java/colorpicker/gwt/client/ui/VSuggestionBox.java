package colorpicker.gwt.client.ui;

import com.vaadin.terminal.gwt.client.ApplicationConnection;
import com.vaadin.terminal.gwt.client.Paintable;
import com.vaadin.terminal.gwt.client.UIDL;

/**
 * Created by pawel on 20/12/14.
 */
public class VSuggestionBox extends GwtSuggestionBox implements Paintable {

    /**
     * Component identifier in UIDL communications.
     */
    String uidlId;

    /**
     * Reference to the server connection object.
     */
    ApplicationConnection client;



    @Override
    public void updateFromUIDL(UIDL uidl, ApplicationConnection client) {
        // This call should be made first. Ensure correct implementation,
        // and let the containing layout manage caption, etc.
        if (client.updateComponent(this, uidl, true)) {
            return;
        }

        // Save reference to server connection object to be able to send
        // user interaction later
        this.client = client;

        // Save the UIDL identifier for the component
        uidlId = uidl.getId();
    }
}
