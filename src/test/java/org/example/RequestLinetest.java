package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RequestLinetest {

    @Test
    void create() {
        RequestLine requestLine = new RequestLine("GET /calculate?operand1=11&operator=*operand2=55 HtTP/1.1");

        assertThat(requestLine).isNotNull();
        assertThat(requestLine).isEqualTo(new RequestLine("GET", "/calculate", "operand1=11&operator=*operand2=55"));
    }
}
