package com.mediaplayerTags;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.mediaplayerTags.exceptions.RecordNotFoundException;

class RecordNotFoundExceptionTest {
	
    @Test
    void testDefaultConstructor() {
        RecordNotFoundException exception = new RecordNotFoundException();
        assertEquals(null, exception.getMessage());
    }

    @Test
    void testParameterizedConstructor() {
        String errorMessage = "Record not found";
        RecordNotFoundException exception = new RecordNotFoundException(errorMessage);
        assertEquals(errorMessage, exception.getMessage());
    }
}