package com.typeng.sharing.model;

import java.util.Date;

/**
 * 分类.
 *
 * @author ty-peng
 * @date 2021-03-16 18:55
 */
public class Category {
    /**
     * ID
     */
    private Integer id;

    /**
     * 分类名（英文）
     */
    private String name;

    /**
     * 分类名（中文）
     */
    private String nameCn;

    /**
     * 对应分类路径
     */
    private String path;

    /**
     * 是否在导航栏展示（0：不展示，1：展示）
     */
    private Byte showInNavbar;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 状态（0：失效，1：有效）
     */
    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Byte getShowInNavbar() {
        return showInNavbar;
    }

    public void setShowInNavbar(Byte showInNavbar) {
        this.showInNavbar = showInNavbar;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
