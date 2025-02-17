package by.savitsky.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ PropertiesConfig.class, ComponentScanConfig.class })
public class GlobalConfig {

}
