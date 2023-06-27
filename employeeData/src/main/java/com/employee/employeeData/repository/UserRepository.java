package com.employee.employeeData.repository;

import com.employee.employeeData.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository

public interface UserRepository extends JpaRepository <UserData,Long>{


}
