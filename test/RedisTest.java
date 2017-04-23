import com.hb.dao.redis.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/*.xml"})
public class RedisTest {
    @Resource(name = "redisDaoImpl")
    private RedisDao redisDaoImpl;

    /**
     * 设值取值
     * @throws Exception
     */
    @Test
    public void getNum() throws Exception {
        Jedis jedis = redisDaoImpl.getJedis();
        jedis.set("num", "999");
        String num = jedis.get("num");
        assertEquals(num,"999");
    }
}
