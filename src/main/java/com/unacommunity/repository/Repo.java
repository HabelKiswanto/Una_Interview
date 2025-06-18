package com.unacommunity.repository;

import com.unacommunity.entity.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Assurance, Long> {
}
