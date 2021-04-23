package com.mycomponents.included_by_filters.annotation_filter;

import utils.MyAnno;

/**
 * Created by IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 06.09.2010
 * Time: 14:55:19
 * To change this template use File | Settings | File Templates.
 */
@MyAnno(attr = "b1")
public class Bean1 {
    public String getStr(){
        return "bean1, annotated with MyAnno";
    }
}
