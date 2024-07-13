package org.example.abstractdemo.dto.response;

import lombok.Builder;

@Builder
public record EmployeeResponse(
        Integer id,
        String name,
        String companyName,
        int age,
        double salary
) {
}
