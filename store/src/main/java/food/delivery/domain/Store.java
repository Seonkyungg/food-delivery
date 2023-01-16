package food.delivery.domain;

import food.delivery.domain.OrderCancelled;
import food.delivery.domain.OrderAccepted;
import food.delivery.domain.CookStarted;
import food.delivery.domain.CookFinished;
import food.delivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Store_table")
@Data

public class Store  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderid;
    
    
    
    
    
    private String userid;
    
    
    
    
    
    private String menuid;

    @PostPersist
    public void onPostPersist(){


        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();



        OrderAccepted orderAccepted = new OrderAccepted(this);
        orderAccepted.publishAfterCommit();



        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();



        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();

    }

    public static StoreRepository repository(){
        StoreRepository storeRepository = StoreApplication.applicationContext.getBean(StoreRepository.class);
        return storeRepository;
    }




    public static void orderNotify(Ordered ordered){

        /** Example 1:  new item 
        Store store = new Store();
        repository().save(store);

        */

        /** Example 2:  finding and process
        
        repository().findById(ordered.get???()).ifPresent(store->{
            
            store // do something
            repository().save(store);


         });
        */

        
    }
    public static void cancelNotify(OrderCancelled orderCancelled){

        /** Example 1:  new item 
        Store store = new Store();
        repository().save(store);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(store->{
            
            store // do something
            repository().save(store);


         });
        */

        
    }


}
