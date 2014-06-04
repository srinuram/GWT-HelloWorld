package org.rama.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MessageForm extends Composite {

	private static MessageFormUiBinder uiBinder = GWT
			.create(MessageFormUiBinder.class);

	interface MessageFormUiBinder extends UiBinder<Widget, MessageForm> {
	}

	public MessageForm() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
