package com.ead.course.services;

import com.ead.course.models.LessonModel;
import com.ead.course.models.ModuleModel;

import java.util.Optional;
import java.util.UUID;

public interface LessonService {
    LessonModel save(LessonModel lessonModel);

    Optional<LessonModel> findLessonIntoModule(UUID lessonId, UUID moduleId);

    void delete(LessonModel lessonModel);

    List<LessonModel> findAllByModule(UUID moduleId);
}
