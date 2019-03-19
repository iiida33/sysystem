package com.lps.po;

public class Category {
    private Integer catId;

    private String catName;

    private Integer precatId;

    private Boolean isParent;

    private Integer catOrder;

    @Override
    public String toString() {
        return "Category{" +
                "catId=" + catId +
                ", catName='" + catName + '\'' +
                ", precatId=" + precatId +
                ", isParent=" + isParent +
                ", catOrder=" + catOrder +
                '}';
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    public Integer getPrecatId() {
        return precatId;
    }

    public void setPrecatId(Integer precatId) {
        this.precatId = precatId;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public Integer getCatOrder() {
        return catOrder;
    }

    public void setCatOrder(Integer catOrder) {
        this.catOrder = catOrder;
    }
}