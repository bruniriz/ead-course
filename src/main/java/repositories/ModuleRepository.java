package repositories;

import biv.com.ead.course.models.CourseModel;
import biv.com.ead.course.models.ModuleModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ModuleRepository extends JpaRepository<ModuleModel, UUID> {
}
