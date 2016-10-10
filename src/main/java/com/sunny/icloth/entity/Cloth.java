package com.sunny.icloth.entity;

import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author feng yanli
 * @time 2016/10/9 17:06
 */
@Table(name = "t_cloth")
@Entity
public class Cloth {
    @Id
    private Integer id;

    @Column(name = "cloth_name")
    private String clothName;

    private Integer type;

    private String season;

    private String color;

    @Column(name = "image_path")
    private String imagePath;

    // 创建时间
    @Column(name = "created_time")
    private Date createdTime;

    // 最近修改时间
    @Column(name = "last_modified_time")
    private Date lastModifiedTime;

    @Transient
    private String typeNameStr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClothName() {
        return clothName;
    }

    public void setClothName(String clothName) {
        this.clothName = clothName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTypeNameStr() {
        return typeNameStr;
    }

    public void setTypeNameStr(String typeNameStr) {
        this.typeNameStr = typeNameStr;
    }
}
