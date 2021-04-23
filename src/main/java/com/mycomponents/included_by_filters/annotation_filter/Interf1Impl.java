package com.mycomponents.included_by_filters.annotation_filter;

import utils.ExcludedAnno;
import utils.MyAnno;
import utils.MyAnno2;

/**
 * Created by IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 06.09.2010
 * Time: 15:00:15
 * To change this template use File | Settings | File Templates.
 */
@MyAnno2(name = "foo")
public class Interf1Impl implements Interf1 {
    public String getStr() {
        return "implementation of Interf1, annotated with MyAnno2";
    }
}
