package com.store.Masa.aStore.repositories;
import com.store.Masa.aStore.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface AdminRepository extends JpaRepository<Admin, Long>  {
    Admin findById(long adminId);
}




