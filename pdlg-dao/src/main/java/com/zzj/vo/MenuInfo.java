package com.zzj.vo;

import java.util.List;

public class MenuInfo {
    /**
     * 主键
     */
    private int id;

    /**
     * 名称
     */
    private String label;

    /**
     * 菜单编码
     */
    private String menuCode;

    /**
     * 父节点
     */
    private int parentId;

    /**
     * 节点类型，1文件夹，2页面，3按钮
     */
    private Integer nodeType;

    /**
     * 图标地址
     */
    private String iconUrl;

    /**
     * 页面对应的地址
     */
    private String linkUrl;

    /**
     * 层次
     */
    private Integer level;

    /**
     * 子菜单集合
     */
    List<MenuInfo> children;

    //权限数据回显 点击选中一个角色  如果该角色拥有此菜单
    //操作权限，checked 为true
    private boolean checked;

    public MenuInfo() {
    }

    public MenuInfo(int id, String label, String menuCode, int parentId, Integer nodeType, String iconUrl, String linkUrl, Integer level, List<MenuInfo> children, boolean checked) {
        this.id = id;
        this.label= label;
        this.menuCode = menuCode;
        this.parentId = parentId;
        this.nodeType = nodeType;
        this.iconUrl = iconUrl;
        this.linkUrl = linkUrl;
        this.level = level;
        this.children = children;
        this.checked = checked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<MenuInfo> getChildren() {
        return children;
    }

    public void setChildren(List<MenuInfo> children) {
        this.children = children;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
