package com.thoughtworks.mstorderservice.Repository;

import com.thoughtworks.mstorderservice.entity.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodRepository extends JpaRepository<Good, Integer> {
}
