package com.ead.course.services;

import com.ead.course.models.ModuleModel;

import java.util.Optional;
import java.util.UUID;

public interface LessonService {
    LessonModel save(LessonModel lessonModel);
}
