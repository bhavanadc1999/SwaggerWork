package com.swagger.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swagger.Entity.swagger;

public interface SwaggerRepository extends JpaRepository<swagger, Integer> {

}
