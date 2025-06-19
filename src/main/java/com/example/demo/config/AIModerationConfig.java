package com.example.demo.config;

public class AIModerationConfig {
	private boolean usernameCheck = false;
	private boolean messageCheck = false;
	private boolean announcementCheck = false;
	
	public boolean isUsernameCheck() {
		return usernameCheck;
	}
	
	public void setUsernameCheck(boolean usernameCheck) {
		this.usernameCheck = usernameCheck;
	}
	
	public boolean isMessageCheck() {
		return messageCheck;
	}
	
	public void setMessageCheck(boolean messageCheck) {
		this.messageCheck = messageCheck;
	}
	
	public boolean isAnnouncementCheck() {
		return announcementCheck;
	}
	
	public void setAnnouncementCheck(boolean announcementCheck) {
		this.announcementCheck = announcementCheck;
	}

}
