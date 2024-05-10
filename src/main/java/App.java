import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        boolean resHello = bean1 == bean2;

        System.out.println("Результат сравнения пары бинов HelloWorld: " + resHello);

        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        boolean resCat = beanCat1 == beanCat2;

        System.out.println("Результат сравнения пары бинов Cat: " + resCat);
    }
}