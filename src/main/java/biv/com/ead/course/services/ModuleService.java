package biv.com.ead.course.services;

import biv.com.ead.course.models.ModuleModel;

public interface ModuleService {
    void delete(ModuleModel moduleModel);

    ModuleModel save(ModuleModel moduleModel);
}
