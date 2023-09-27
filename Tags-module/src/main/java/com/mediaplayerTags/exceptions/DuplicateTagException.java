package com.mediaplayerTags.exceptions;

@SuppressWarnings("serial")
public class DuplicateTagException extends RuntimeException{
	public DuplicateTagException(String message) {
        super(message);
    }
}
