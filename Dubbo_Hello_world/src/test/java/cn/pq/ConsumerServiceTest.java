package cn.pq;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.pq.service.ProviderService;

public class ConsumerServiceTest {  
	  
    /** 
     * @author linbingwen 
     * @since  2015年8月26日  
     * @param args     
     */  
    public static void main(String[] args) {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "applicationConsumer.xml" });  
          
        context.start();  
        ProviderService providerService = (ProviderService) context.getBean("providerService");  
  
        System.out.println(providerService.sayHello("潘强jiafei"));  
        System.out.println("Press any key to exit.");    
        try {  
            System.in.read();  
        } catch (IOException e) {         
            e.printStackTrace();  
        }    
  
    }  
  
}  
