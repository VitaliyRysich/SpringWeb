package com.vitalii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.vitalii")
public class JavaConfig {

    //for java config
/*
    @Bean
    public MessageProvider provider(){
        return new SimpleMessageProvider();
    }

    @Bean
    public MessageRenderer renderer(@Autowired MessageProvider provider){
        return new SimpleMessageRenderer(provider);
    }
*/

}
