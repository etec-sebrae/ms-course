package com.franads.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franads.hrworker.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
