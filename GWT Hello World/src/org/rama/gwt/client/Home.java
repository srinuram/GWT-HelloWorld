package org.rama.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {

	Label helloWorldLB = new Label("Hello Rama, This is wonderful World which has given opportunity to learn many new things. Thank you.!");
	MessageForm msgForm = new MessageForm();
	
	@Override
	public void onModuleLoad() {
		RootPanel.get().add(helloWorldLB);
		RootPanel.get().add(msgForm);
	}

}
