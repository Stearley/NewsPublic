package com.ippsby.publicnews.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.ippsby.publicnews.model.Pe;
import com.ippsby.publicnews.model.Security;

import java.io.Serializable;
import java.util.Date;

public class NewsDto implements Serializable {
    public NewsDto(long newsId, String annotation, String title, Date publicationDate, Pe pe) {
        this.newsId = newsId;
        this.annotation = annotation;
        this.publicationDate = publicationDate;
        this.title = title;
        this.pe = pe;
    }

    private long newsId;
    private String annotation;
    private Date publicationDate;
    private String title;
    private Pe pe;

    public Pe getPe() {
        return pe;
    }

    public void setPe(Pe pe) {
        this.pe = pe;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getNewsId() {
        return newsId;
    }

    public void setNewsId(long newsId) {
        this.newsId = newsId;
    }
}