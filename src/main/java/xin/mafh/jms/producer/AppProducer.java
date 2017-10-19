package xin.mafh.jms.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppProducer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:producer.xml");
        ProducerService producerService = applicationContext.getBean(ProducerService.class);
        for (int i = 0; i < 100; i++) {
            producerService.sendMessage("test"+i);
        }
        applicationContext.close();
    }
}
