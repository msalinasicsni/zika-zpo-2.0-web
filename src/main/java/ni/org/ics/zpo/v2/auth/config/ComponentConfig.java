package ni.org.ics.zpo.v2.auth.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "ni.org.ics.zpo.v2.auth.config", excludeFilters={ @Filter(Configuration.class)} )
public class ComponentConfig {

}
