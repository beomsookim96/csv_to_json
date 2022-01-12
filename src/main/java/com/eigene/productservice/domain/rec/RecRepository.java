package com.eigene.productservice.domain.rec;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RecRepository extends JpaRepository<Rec, RecId> {
}
