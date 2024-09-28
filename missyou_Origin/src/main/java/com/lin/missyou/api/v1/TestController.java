/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020-03-24 09:08
 */
package com.lin.missyou.api.v1;

import com.lin.missyou.manager.rocketmq.ProducerSchedule;
import com.lin.missyou.model.Order;
import com.lin.missyou.repository.OrderRepository;
import com.lin.missyou.repository.UserCouponRepository;
import com.lin.missyou.sample.ISkill;
import com.lin.missyou.sample.Test;
import com.lin.missyou.sample.hero.Irelia;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserCouponRepository userCouponRepository;

    @Autowired
    private ObjectFactory<ISkill> iSkillObjectFactory;

    @Autowired
    private Test test;

//    @Autowired
//    private ProducerSchedule producerSchedule;


    @GetMapping("/t")
    @Transactional
    public void getTest() {
        Order order = this.orderRepository.findFirstByOrderNo("B3292062362326").get();
        int res = this.orderRepository.updateStatusByOrderNo("B3292062362326", 2);
        System.out.println(res);
    }

//    @GetMapping("/push")
//    public void pushMessageToMQ() throws Exception {
//        producerSchedule.send("TopicTest", "test");
//    }
}
