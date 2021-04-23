package beans;

import com.mycomponents.excluded_filters.Bean5;
import com.mycomponents.excluded_filters.Bean6;
import com.mycomponents.included_by_filters.aspectj_filter.Bean2;
import com.mycomponents.included_by_filters.aspectj_filter.Interf2;
import com.mycomponents.components.Compo1;
import com.mycomponents.included_by_filters.annotation_filter.Bean1;
import com.mycomponents.included_by_filters.annotation_filter.Interf1;
import com.mycomponents.included_by_filters.assignable_filters.Bean3;
import com.mycomponents.included_by_filters.assignable_filters.Bean3Child;
import com.mycomponents.included_by_filters.assignable_filters.Interf3Impl;
import com.mycomponents.included_by_filters.regex_filter.Bean4;

/**
 * Created by IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 06.09.2010
 * Time: 15:01:46
 * To change this template use File | Settings | File Templates.
 */
public class MainBean {

    /* 1 */
    private Bean1 bean1;


    public void setBean1(Bean1 bean1) {
        this.bean1 = bean1;
    }
    public Bean1 getBean1() {
        return bean1;
    }

    /* 2 */
    private Interf1 interf1;
    public void setInterf1(Interf1 interf1) {
        this.interf1 = interf1;
    }
    public Interf1 getInterf1() {
        return interf1;
    }

    /* 0 */
    private Compo1 comp1;
    public void setComp1(Compo1 comp1) {
        this.comp1 = comp1;
    }
    public Compo1 getComp1() {
        return comp1;
    }

    /* 3 */
    private Bean2 bean2;


    public void setBean2(Bean2 bean2) {
        this.bean2 = bean2;
    }
    public Bean2 getBean2() {
        return bean2;
    }

    /* 4 */
    private Interf2 interf2;

    public Interf2 getInterf2() {
        return interf2;
    }

    public void setInterf2(Interf2 interf2) {
        this.interf2 = interf2;
    }

    /* 5 */
    private Bean3 bean3;

    public Bean3 getBean3() {
        return bean3;
    }

    public void setBean3(Bean3 bean3) {
        this.bean3 = bean3;
    }
    /* 6 */
    private Interf3Impl i3;

    public Interf3Impl getI3() {
        return i3;
    }

    public void setI3(Interf3Impl i3) {
        this.i3 = i3;
    }

    /* 7 */
    private Bean4 bean4;

    public Bean4 getBean4() {
        return bean4;
    }

    public void setBean4(Bean4 bean4) {
        this.bean4 = bean4;
    }
    /* 8 */
    private Bean3Child b3child;

    public Bean3Child getB3child() {
        return b3child;
    }

    public void setB3child(Bean3Child b3child) {
        this.b3child = b3child;
    }

    /* to exclude */
    private Bean5 bean5;

    public Bean5 getBean5() {
        return bean5;
    }

    public void setBean5(Bean5 bean5) {
        this.bean5 = bean5;
    }
    private Bean6 bean6;

    public Bean6 getBean6() {
        return bean6;
    }

    public void setBean6(Bean6 bean6) {
        this.bean6 = bean6;
    }
}
