package com.task.shopCart.dto.dtoconfiguration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ResponseVO<T> {

    private String statusCode;

    private String message;

    private T result;
}
