package com.mak;

public class TwitterfeedReader implements SocialFeedReader {

	@Override
	public Message pollForNewMessage() {
			Message m1 = new Message(1, "Twitter", "String", "Hello Buddy","MAK");
			return m1;
	}

}
