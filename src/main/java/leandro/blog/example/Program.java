package leandro.blog.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Program {
    public static void main ( String[]args)
    {
        SpringApplication.run(Program.class, args);
    }
}
