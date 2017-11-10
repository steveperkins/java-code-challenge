package com.i3.codechallenge.exception;

public class NotImplementedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NotImplementedException() {
		super("Not implemented");
	}

	public NotImplementedException(String message, Throwable arg1, boolean arg2, boolean arg3) {
		super(message, arg1, arg2, arg3);
	}

	public NotImplementedException(String message, Throwable arg1) {
		super(message, arg1);
	}

	public NotImplementedException(String message) {
		super(message);
	}

	public NotImplementedException(Throwable arg0) {
		super(arg0);
	}

}
