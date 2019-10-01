package com.tensquare.article.dao;

import com.tensquare.article.pojo.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by 16834 on 2019/9/26.
 */
public interface CommentDao extends MongoRepository<Comment, String> {

    public List<Comment> findByArticleid(String articleid);

}
