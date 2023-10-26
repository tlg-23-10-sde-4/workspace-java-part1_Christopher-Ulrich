/*
 * Some header text
 */

package gov.irs;

public class IllegalWageException extends Exception { // Private or Public or public/private (default)?


    public IllegalWageException() {
    }

    public IllegalWageException(String message) {
        super(message);
    }

    public IllegalWageException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalWageException(Throwable cause) {
        super(cause);
    }
}