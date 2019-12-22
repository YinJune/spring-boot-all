package com.yjj.redis.web;

import com.alibaba.fastjson.JSONObject;
import com.yjj.redis.entity.KeyValueDto;
import com.yjj.redis.entity.User;
import com.yjj.redis.utils.PropertyUtils;
import com.yjj.redis.utils.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: Yin JunJie
 * @date: 2019/12/21 13:13
 */
@RestController
@RequestMapping("/test/redis")
public class TestRedisController {

    private static Logger logger = LoggerFactory.getLogger(TestRedisController.class);

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    /**
     * RequestParam不能取到body体里的参数
     *
     * @param keyValueDto
     * @return
     */
    @PostMapping("/put/string")
    public String putString(@RequestBody KeyValueDto keyValueDto) {
        logger.info("参数:{}", JSONObject.toJSONString(keyValueDto));
        redisTemplate.opsForValue().set(keyValueDto.getKey(), keyValueDto.getValue());
        String value = (String) redisTemplate.opsForValue().get(keyValueDto.getKey());
//        String stringValue = stringRedisTemplate.opsForValue().get(keyValueDto.getKey());
//        logger.info("value:{},stringValue:{}", value, stringValue);
        return "success";
    }

    @PostMapping("/put/object")
    public String putObject(@RequestBody User user) {
        logger.info("参数user:{}", JSONObject.toJSONString(user));
        redisTemplate.opsForValue().set("user", user);
        User result = (User) redisTemplate.opsForValue().get("user");
        logger.info("和参数中的user是否为同一个:{}",user.equals(result));
        logger.info("result:{}", result);
        logger.info("result:{}", JSONObject.toJSONString(result));
        return "success";
    }


    @PostMapping("/put/hash")
    public String putHash(@RequestBody KeyValueDto keyValueDto) {
        logger.info("参数:{}", JSONObject.toJSONString(keyValueDto));
        redisUtils.hset("hash",keyValueDto.getKey(),keyValueDto.getValue());
        return "success";
    }

    @GetMapping("/get/hash/{key}")
    public String getString(@PathVariable("key")String key) {
        logger.info("参数key:{}", key);
        logger.info("环境：{}", PropertyUtils.getProperty("test.value"));
        String result= (String) redisUtils.hget("hash",key);
        return result;
    }
}
