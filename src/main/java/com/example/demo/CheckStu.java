package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties(CheckStu.class)
@PropertySource("classpath:stu.yaml")
@ConfigurationProperties(prefix ="stu")
public class CheckStu {
    private int sno;

    @Bean
    public Student student(){
    	Student sd = new Student();
        if(sno == 32201175){
            return new Student(sd.toString());
        } else {
            return new Student("404");
        }
    }

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	

	
    
}
