package org.rama.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.sun.java.swing.plaf.windows.resources.windows;

public class Home implements EntryPoint {

	Label helloWorldLB = new Label("Hello Rama, This is wonderful World which has given opportunity to learn many new things. Thank you.!");
	MessageForm msgForm = new MessageForm();
	Button button = new Button("New Button in GWT");
	
	@Override
	public void onModuleLoad() {
		RootPanel.get().add(helloWorldLB);
		RootPanel.get().add(msgForm);
		RootPanel.get().add(button);
		
		button.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Button is Clicked");
				
			}
		});
	}

}
