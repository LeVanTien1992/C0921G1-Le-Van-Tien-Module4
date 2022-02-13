package com.example.tich_hop_ajax_cho_ung_dung_blog.dto;

public class BlogDto {
    private Integer id;
    private String topic;
    private String author;

    public BlogDto() {
    }

    public BlogDto(Integer id, String topic, String author) {
        this.id = id;
        this.topic = topic;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
