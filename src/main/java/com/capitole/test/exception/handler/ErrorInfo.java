package com.capitole.test.exception.handler;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(includeFieldNames = true)
@Builder
public class ErrorInfo {
    private String path;
    private String method;
    private String date;
    private String message;
}
