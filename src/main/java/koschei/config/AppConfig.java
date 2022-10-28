package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean(name = "island")
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Egg6 getEgg6(Needle7 needle) {
        return new Egg6(needle);
    }

    @Bean
    public static Needle7 needle7(Deth8 deth8) {
        Needle7 needle7 = new Needle7();
        needle7.setDeth(deth8);
        return needle7;
    }

    @Bean
    public static Deth8 getDeth8() {
        return new Deth8();
    }


}
