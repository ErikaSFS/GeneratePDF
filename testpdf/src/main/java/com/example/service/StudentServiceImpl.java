package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Student;
import com.example.repo.StudentRepoPDF;

@Service
public class StudentServiceImpl implements StudentService {
    

@Autowired
StudentRepoPDF studentRepo;

@Override
public void addStudent(Student student){
    studentRepo.save(student);
}

@Override
public List<Student> getStudentList() {
    return studentRepo.findAll();
}
}
