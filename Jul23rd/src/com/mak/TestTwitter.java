package com.mak;

public class TestTwitter {
	public static void main(String[] args) {
		TwitterfeedReader t = new TwitterfeedReader();
		Message m = t.pollForNewMessage();
		System.out.println("From Twitter Class");
		System.out.println(m.getMessageId()+"\t"+m.getMessageSource()+"\t"+m.getMessageType()+"\t"+m.getMessage()+"\t"+m.getSender());

		System.out.println();
		FaceBookReader f = new FaceBookReader();
		m = f.pollForNewMessage();
		System.out.println("From FaceBook Class");
		System.out.println(m.getMessageId()+"\t"+m.getMessageSource()+"\t"+m.getMessageType()+"\t"+m.getMessage()+"\t"+m.getSender());
	}
}
