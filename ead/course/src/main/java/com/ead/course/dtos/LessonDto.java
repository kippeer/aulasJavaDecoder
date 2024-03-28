package com.ead.course.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LessonDto {
    @NotBlank
    private String title;
    @NotBlank
    private String videoUrl;

    private String description;

}
