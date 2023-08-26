package biv.com.ead.course.services.impl;

import biv.com.ead.course.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.LessonRepository;


@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    LessonRepository courseRepository;
}
