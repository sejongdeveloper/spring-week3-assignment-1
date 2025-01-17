package com.codesoom.assignment.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ErrorResponseTest {

    @Test
    void getMessage() {
        String errorMessage = "error";
        ErrorResponse response = new ErrorResponse(errorMessage);
        assertThat(response.getMessage()).isEqualTo(errorMessage);
    }
}
