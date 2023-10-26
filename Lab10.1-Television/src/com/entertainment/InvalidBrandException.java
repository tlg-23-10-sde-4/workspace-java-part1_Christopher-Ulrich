/*
 * Checked exception because it extends Exception
 */

package com.entertainment;

public class InvalidBrandException extends Exception { // Private or Public or public/private (default)?


    public InvalidBrandException() {
        super();    // This is redundant, but a good reminder that it calls super()
    }

    public InvalidBrandException(String message) {
        super(message);
    }

    public InvalidBrandException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidBrandException(Throwable cause) {
        super(cause);
    }
}