package by.savitsky.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan(basePackages = "by.savitsky", includeFilters = {
        @ComponentScan.Filter(classes = Service.class), @ComponentScan.Filter(classes = RestController.class) })
public class ComponentScanConfig {

}