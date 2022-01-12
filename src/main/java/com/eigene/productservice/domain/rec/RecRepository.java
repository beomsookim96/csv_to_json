package com.eigene.productservice.domain.rec;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RecRepository extends JpaRepository<Rec, RecId> {

        @Query(value = "SELECT * from rec WHERE target_item_id = :target_id ORDER BY rec.rank desc", nativeQuery = true)
        public List<Rec> get(@Param("target_id")String target_id);
}
