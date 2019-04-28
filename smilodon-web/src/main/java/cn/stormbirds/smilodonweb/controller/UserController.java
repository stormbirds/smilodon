package cn.stormbirds.smilodonweb.controller;

import cn.stormbirds.smilodonapi.Service.RpcUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Description cn.stormbirds.smilodonweb.controller
 * @ Author StormBirds
 * @ Email xbaojun@gmail.com
 * @ Date 2019/4/28 15:49
 */


@RestController
public class UserController {

    @Reference(version = "1.0.0")
    private RpcUserService rpcUserService;

    @ResponseBody
    @RequestMapping(value = "/getuser")
    public String getUser(@RequestParam Long id){
        return rpcUserService.getUser(id);
    }
}
