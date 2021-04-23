package runners;

import beans.MainBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 06.09.2010
 * Time: 15:05:51
 * To change this template use File | Settings | File Templates.
 */
public class Run1 {
   public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
            MainBean main = (MainBean) context.getBean("main");
       //System.out.println("main.getComp1().getStr() = " + main.getComp1().getStr());   // should cause NPE with use-default-filters="false"
       System.out.println("main.getBean1().getStr() = " + main.getBean1().getStr());
       System.out.println("main.getInterf1().getStr() = " + main.getInterf1().getStr());
       System.out.println("main.getBean2().getStr() = " + main.getBean2().getStr());
       System.out.println("main.getInterf2().getStr() = " + main.getInterf2().getStr());
       System.out.println("main.getBean3().getStr() = " + main.getBean3().getStr());
       System.out.println("main.getI3().getStr() = " + main.getI3().getStr());
   }
}
