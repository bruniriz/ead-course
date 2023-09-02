package biv.com.ead.course.services;

import biv.com.ead.course.models.ModuleModel;

import java.util.Optional;
import java.util.UUID;

public interface ModuleService {
    void delete(ModuleModel moduleModel);

    ModuleModel save(ModuleModel moduleModel);

    Optional<ModuleModel> findModuleIntoCourses(UUID courseId, UUID moduleId);
}
