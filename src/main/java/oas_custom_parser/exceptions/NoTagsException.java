package oas_custom_parser.exceptions;

import java.io.Serial;

public class NoTagsException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public NoTagsException() {
        super("No tags defined.");
    }
}