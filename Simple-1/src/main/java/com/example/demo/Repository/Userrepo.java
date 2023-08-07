package com.example.demo.Repository;
import com.example.demo.Entity.Userentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Userrepo extends JpaRepository<Userentity,String> {
}