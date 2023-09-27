package com.mediaplayerTags.exceptions;

@SuppressWarnings("serial")
public class TagNotFoundException extends RuntimeException {
	
	public TagNotFoundException(String message) {
        super(message);
    }

}
