package ru.hogwarts.school2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school2.model.Faculty;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty,Long> {

    Collection<Faculty> findAllByColor(String colorFilter);

    Collection<Faculty> findFacultiesByNameIgnoreCaseOrColorIgnoreCase(String name, String color);

}
