package cn.stormbirds.smilodonuser.Service;

import cn.stormbirds.smilodonapi.Service.RpcUserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @ Description cn.stormbirds.smilodonuser.Service
 * @ Author StormBirds
 * @ Email xbaojun@gmail.com
 * @ Date 2019/4/28 16:06
 */

@Service(version = "${user.service.version}")
public class RpcUserServiceImpl implements RpcUserService {
    @Override
    public String getUser(Long id) {
        return "用户 id："+id;
    }
}
