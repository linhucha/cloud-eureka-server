package cloud.eureka.server;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
 * 包      名 ：  cloud.eureka.server
 * 文 件 名 : EurekaServer
 * 描       述: TODO
 * 作        者： lyj
 * 创建时间： 2016年7月30日 下午6:00:23
 * 版         本：2.0
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class EurekaServer {
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServer.class).web(true).run(args);
     
    }
}
