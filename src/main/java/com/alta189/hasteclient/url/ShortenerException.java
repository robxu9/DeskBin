package com.alta189.hasteclient.url;

public class ShortenerException extends Exception {
	public ShortenerException(Throwable cause) {
		super(cause);
	}

	public ShortenerException(String message, Throwable cause) {
		super(message, cause);
	}

	public ShortenerException(String message) {
		super(message);
	}
}
