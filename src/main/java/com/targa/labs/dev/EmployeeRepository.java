/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.targa.labs.dev;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Wayne.Hu
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
