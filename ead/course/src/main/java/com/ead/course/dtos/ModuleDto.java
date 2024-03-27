package com.ead.course.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ModuleDto {
    @NotBlank
    private String title;
    @NotBlank
    private String description;

}
