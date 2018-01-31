package passionPic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:website/web.properties")
@ComponentScan(value = "passionPic")
public class Config {
}
