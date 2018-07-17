package com.girl2.dao;

import com.girl2.entit.Girl2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Girl2Repository extends JpaRepository<Girl2, Integer> {
    List<Girl2> findByAge(Integer age);
}
