package com.microsoft.azure.kusto.data.exceptions;

import com.azure.core.exception.AzureException;

public class JsonPropertyMissingException extends AzureException {

    public JsonPropertyMissingException(String message) {
        super(message);
    }
}
