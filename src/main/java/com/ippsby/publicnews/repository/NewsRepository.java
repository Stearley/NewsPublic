package com.ippsby.publicnews.repository;

import com.ippsby.publicnews.model.NewsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<NewsModel,Long> {

}
