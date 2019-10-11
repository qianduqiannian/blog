package com.xzg.po;

public class Soul {
    private  Integer id;
    private  String title;
    private String hits;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHits() {
        return hits;
    }

    public void setHits(String hits) {
        this.hits = hits;
    }

    @Override
    public String toString() {
        return "Soul{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", hits='" + hits + '\'' +
                '}';
    }
}
