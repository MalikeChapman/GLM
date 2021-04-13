package edu.qc.seclass.glm;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;

import java.util.ArrayList;
import java.util.List;
@ParseClassName("Item")
public class Item extends ParseObject {
    public static final String KEY_ITEM_NAME = "itemName";
    public static final String KEY_ITEM_CHECK = "itemCheck";
    public static final String KEY_ITEM_TYPE = "itemType";


    public String getKeyItemName(){return getString(KEY_ITEM_NAME);}
    public void setKeyItemName(String itemName){put(KEY_ITEM_NAME, itemName);}
    public String getKeyItemCheck(){return getString(KEY_ITEM_CHECK);}
    public void setKeyItemCheck(String itemCheck){put(KEY_ITEM_CHECK, itemCheck);}
    public String getKeyItemType(){return getString(KEY_ITEM_TYPE);}
    public void setKeyItemType(String itemType){put(KEY_ITEM_TYPE, itemType);}








}
