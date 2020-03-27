package com.talaash.entity;

import java.io.Serializable;

public class NavigationBar implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_navigation_bar.nid
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    private Integer nid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_navigation_bar.navtitle
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    private String navtitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_navigation_bar.url
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mj_navigation_bar
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_navigation_bar.nid
     *
     * @return the value of mj_navigation_bar.nid
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    public Integer getNid() {
        return nid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_navigation_bar.nid
     *
     * @param nid the value for mj_navigation_bar.nid
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    public void setNid(Integer nid) {
        this.nid = nid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_navigation_bar.navtitle
     *
     * @return the value of mj_navigation_bar.navtitle
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    public String getNavtitle() {
        return navtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_navigation_bar.navtitle
     *
     * @param navtitle the value for mj_navigation_bar.navtitle
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    public void setNavtitle(String navtitle) {
        this.navtitle = navtitle == null ? null : navtitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_navigation_bar.url
     *
     * @return the value of mj_navigation_bar.url
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_navigation_bar.url
     *
     * @param url the value for mj_navigation_bar.url
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mj_navigation_bar
     *
     * @mbg.generated Thu Mar 26 16:58:15 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nid=").append(nid);
        sb.append(", navtitle=").append(navtitle);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}