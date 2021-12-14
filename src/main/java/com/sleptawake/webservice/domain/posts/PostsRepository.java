package com.sleptawake.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KBS.
 * User: KBS
 * Date: 12/14/2021
 * Time: 오후 8:52
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
