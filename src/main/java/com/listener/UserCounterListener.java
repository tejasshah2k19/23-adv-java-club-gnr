package com.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class UserCounterListener implements HttpSessionListener {

	static int counter = 0;

	public void sessionCreated(HttpSessionEvent arg0) {
		counter++;
		System.out.println("Total User(in) "+counter);
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		counter--;
		System.out.println("Total User(out) "+counter);
		
	}
}
