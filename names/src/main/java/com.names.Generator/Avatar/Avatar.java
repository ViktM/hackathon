
package com.names.Generator.Avatar;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Avatar {

    @SerializedName("avatars")
    @Expose
    private List<Avatar_> avatars = null;

    public List<Avatar_> getAvatars() {
        return avatars;
    }

    public void setAvatars(List<Avatar_> avatars) {
        this.avatars = avatars;
    }

}
