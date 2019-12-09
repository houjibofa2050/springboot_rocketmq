package cn.itcast.controller;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: fuguowen
 * @date: 2019-12-09 11:02
 * @email: fuguowen@fantaike.ai
 */
@RestController
public class SendMessageController {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @RequestMapping("/send")
    public void sendMessage(){
        rocketMQTemplate.convertAndSend("springboot-mq","hello springboot rocketmq222");
    }
}
