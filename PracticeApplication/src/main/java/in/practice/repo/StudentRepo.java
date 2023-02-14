package in.practice.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.practice.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Serializable> {

}
