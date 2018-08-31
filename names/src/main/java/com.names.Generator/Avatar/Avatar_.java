
package com.names.Generator.Avatar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Avatar_ {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("theme")
    @Expose
    private String theme;
    @SerializedName("url")
    @Expose
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
