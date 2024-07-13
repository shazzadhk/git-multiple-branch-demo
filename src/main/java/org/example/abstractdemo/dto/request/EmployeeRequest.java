package org.example.abstractdemo.dto.request;

import lombok.Builder;

@Builder
public record EmployeeRequest(
        String name,
        String companyName,
        int age,
        double salary
) {
}
