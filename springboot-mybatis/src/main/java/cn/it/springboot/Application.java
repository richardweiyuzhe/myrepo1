package cn.it.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author Administrator
 *
 */
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		/*SpringApplication.run(Application.class, args);//运行springboot应用，这样会在控制台打印出spring字样的横幅广告*/	
		SpringApplication springApplication = new SpringApplication(Application.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}
}
