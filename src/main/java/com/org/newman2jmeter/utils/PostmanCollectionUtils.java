package com.org.newman2jmeter.utils;

import com.org.newman2jmeter.model.postman.PostmanCollection;
import com.org.newman2jmeter.model.postman.PostmanItem;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostmanCollectionUtils {

    private static void getItem(PostmanItem item, List<PostmanItem> itemList) {
        if (item.getItems().size() == 0 && item.getRequest() != null) {
            itemList.add(item);
        }

        for (PostmanItem i : item.getItems()) {
            getItem(i, itemList);
        }
    }

    public static List<PostmanItem> getItems(PostmanCollection postmanCollection) {
        List<PostmanItem> items = new ArrayList<>();

        for (PostmanItem item : postmanCollection.getItems()) {
            getItem(item, items);
        }
        return items;
    }
}
