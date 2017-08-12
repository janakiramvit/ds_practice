package inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpulipati on 8/9/17.
 */

public class inheritanceTest extends abstractClass {

    public static void main(String args[]){

        System.out.println("** parent object assigned to parent reference variable");
        parent p = new parent();
        p.m1();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.get(1);

        System.out.println("** child object assigned to child reference variable");
        child c = new child();
        c.m1();
        c.m2();

        System.out.println("** child object assigned to parent reference variable");
        parent pc = new child();
        pc.m1();

    }

    @Override
    void m4() {

    }

    @Override
    public void m3() {

    }
}
