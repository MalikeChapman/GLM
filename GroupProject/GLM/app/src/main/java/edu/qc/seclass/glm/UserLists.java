package edu.qc.seclass.glm;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseClassName;
import com.parse.ParseObject;

import org.json.JSONArray;

@ParseClassName("UserLists")
public class UserLists extends ParseObject {
    public static final String KEY_LIST_NAME = "listname";
    public static final String KEY_LIST_SIZE = "listsize";
    public static final String KEY_LIST_OBJECTS = "listobjects";

    public String getKeyListName() {
        return getString(KEY_LIST_NAME);
    }

    public String getKeyListSize() {
        return getString(KEY_LIST_SIZE);
    }

    public  String getKeyListObjects() {
        return getString(KEY_LIST_OBJECTS);
    }

    public void setKeyListName(String listname){put(KEY_LIST_NAME, listname);}
    public void set(int listSize){put(KEY_LIST_SIZE, listSize);}
    public void set(JSONArray array){put(KEY_LIST_OBJECTS, array);}
}
