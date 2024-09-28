/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020-03-29 15:01
 */
package com.lin.missyou;

import org.junit.Test;
import org.springframework.beans.BeanUtils;

import java.util.Calendar;

public class DateTimeTest {
    @Test
    public void TestDateTimeAddSeconds() {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = (Calendar)calendar.clone();
        System.out.println(calendar.getTime());
        calendar.add(Calendar.SECOND, 3600);
        System.out.println(calendar.getTime());
        System.out.println(calendar1.getTime());
    }
}
