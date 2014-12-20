/* 
 * Copyright 2009 IT Mill Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package vaadinTicket;

import com.vaadin.ui.Table;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.Window;
import colorpicker.ColorPicker;


@SuppressWarnings("serial")
public class TableBugApplication extends com.vaadin.Application {
    Window main = new Window("Table Bug Application.");


    @Override
    public void init() {
        setMainWindow(main);
        Table table = new Table();
        table.addContainerProperty("prop1", String.class, "default");
        table.addContainerProperty("prop2", String.class, "default2");
        main.addComponent(table);
        TextArea textArea = new TextArea();
        textArea.setDescription("Description");
        textArea.setRows(10);
        textArea.setColumns(10);
        main.addComponent(textArea);
        main.addComponent(new ColorPicker());

//        for(int i=0; i<1000; ++i){
//            table.removeAllItems();
//            for(int j=0; j<2000; ++j){
//                table.addItem();
//            }
//        }

    }
}
