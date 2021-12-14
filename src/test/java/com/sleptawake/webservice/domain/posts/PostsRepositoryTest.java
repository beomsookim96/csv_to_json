package com.sleptawake.webservice.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by KBS.
 * User: KBS
 * Date: 12/14/2021
 * Time: 오후 9:18
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    } // cleanup()

    @Test
    public void saveloadtest() {
        //given
        postsRepository.save(Posts.builder()
                .title("title")
                .content("content")
                .author("kim")
                .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle(),is("title"));
        assertThat(posts.getContent(), is("content"));

    }

}