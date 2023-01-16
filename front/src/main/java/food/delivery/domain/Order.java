package food.delivery.domain;

import food.delivery.domain.Ordered;
import food.delivery.domain.OrderCancelled;
import food.delivery.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String userid;
    
    
    
    
    
    private String storeid;
    
    
    
    
    
    private String menuid;

    @PostPersist
    public void onPostPersist(){


        Ordered ordered = new Ordered(this);
        ordered.publishAfterCommit();



        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();

    }
    @PreUpdate
    public void onPreUpdate(){
    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = FrontApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
