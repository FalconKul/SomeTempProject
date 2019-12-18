package spring.basic.HelloSpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.basic.HelloSpringAnnotation.bean.GreetingService;
import spring.basic.HelloSpringAnnotation.bean.MyComponent;
import spring.basic.HelloSpringAnnotation.config.AppConfiguration;
import spring.basic.HelloSpringAnnotation.lang.Language;

/**
 * Main App
 *
 */
public class App {
    public static void main(String[] args) {
        // Create a context to read configuration in AppConfiguration, start appication
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        // Using Language
        Language lang = (Language) context.getBean("language");
        
        System.out.println("Bean Language: " + lang);
        System.out.println("Call lang.getBye(): " + lang.getBye());
        System.out.println();
        
        // Using GreetingService
        GreetingService service = (GreetingService)context.getBean("greetingService");
        service.sayGreeting();
        System.out.println();
        
        // Using MyComponent
        MyComponent component = (MyComponent) context.getBean("myComponent");
        component.showAppInfo();
    }
}