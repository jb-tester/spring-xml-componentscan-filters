package com.mycomponents.components;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 06.09.2010
 * Time: 15:22:31
 * To change this template use File | Settings | File Templates.
 */
@Component(value = "comp1")
public class Compo1 {
    public String getStr(){
        return "comp1 Component";
    }
}
