package biz.baijing.singleton.runtimeclass;

import java.io.IOException;

public class RunTimeGo {
    public static void main(String[] args) throws IOException {

        Runtime rt = Runtime.getRuntime();

        long tm = rt.totalMemory();
        System.out.println(tm);


    }
}
