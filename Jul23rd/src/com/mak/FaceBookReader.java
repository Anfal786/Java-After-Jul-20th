package com.mak;

public class FaceBookReader implements SocialFeedReader{

	@Override
	public Message pollForNewMessage() {
		Message m1 = new Message(1, "FaceBook", "String", "Hello Buddy","KAM");
		return m1;	
	}

}
