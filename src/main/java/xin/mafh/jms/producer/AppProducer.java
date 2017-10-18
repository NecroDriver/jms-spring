package xin.mafh.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration({"classpath:producer.xml"})
public class AppProducer {
    @Autowired
    public static ProducerService producerService;
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            producerService.sendMessage("test"+i);
        }
    }
}
