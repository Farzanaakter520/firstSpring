package org.isdb.first.repository;

import java.util.Collection;
import java.util.List;

import org.isdb.first.dao.ClassTeacherDTO;
import org.isdb.first.dao.ClassTeacherProjection;
import org.isdb.first.dao.ClassTeacherRecord;
import org.isdb.first.model.StudentClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface StudentClassRepository extends JpaRepository<StudentClass, Integer> {

    @Query("SELECT sc.name AS className, sc.classTeacher.name AS classTeacherName, sc.roomNumber AS roomNumber, sc.classTeacher.email AS ClassTeacherEmail FROM StudentClass sc ")
    List<ClassTeacherProjection> getAllClassTeacher();

     @Query("SELECT new org.isdb.first.dao.ClassTeacherDTO(sc.name, sc.classTeacher.name, sc.roomNumber, sc.classTeacher.email) FROM StudentClass sc")
     List<ClassTeacherDTO> fetchAllClassTeacherDTOs();

     @Query("SELECT new org.isdb.first.dao.ClassTeacherRecord(sc.name, sc.classTeacher.name, sc.roomNumber, sc.classTeacher.email) FROM StudentClass sc")
     List<ClassTeacherRecord> fetchAllClassTeacherRecords();

     @Query(value = "SELECT tc.NAME AS className, tt.NAME AS classTeacherName, tc.ROOM_NUMBER AS roomNumber, tt.EMAIL AS teacherEmail FROM T_CLASS tc JOIN T_TEACHER tt ON tt.ID = tc.CLASS_TEACHER", nativeQuery = true)
     List<ClassTeacherProjection>  fetchAllClassTeacher();


 
    





}
