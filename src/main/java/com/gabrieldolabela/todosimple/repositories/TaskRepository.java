package com.gabrieldolabela.todosimple.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrieldolabela.todosimple.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
    
    List<Task> findByUserId(Long id);

    // @Query("SELECT t FROM Task t WHERE t.user.id = :user_id")
    // List<Task> findByUser_Id(@Param("user_id") Long user_id);
}
