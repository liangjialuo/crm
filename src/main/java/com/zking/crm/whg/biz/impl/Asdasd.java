package com.zking.crm.whg.biz.impl;

import com.zking.crm.base.model.Function;
import com.zking.crm.whg.biz.aaaaa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Asdasd implements aaaaa {

    @Override
    public List<Function> list(Function function) {
        System.out.println("123123123");
        return null;
    }


    public static void main(String[] strings) {
        int[] d = new int[]{1, 8, 9, 1, 6, 1, 8, 8, 9};

        int[] s = new int[]{1, 5, 6, 2, 7, 2, 9, 4};

        for (int i = 1; i < s.length; i++) {
            for (int j = 0; j < s.length - i; j++) {
                if (s[j] > d[j + 1]) {
                    int tmp;
                    tmp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            System.out.print("=");
        }
    }
}
