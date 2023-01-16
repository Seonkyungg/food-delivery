package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;

    public OrderCancelled(Store aggregate){
        super(aggregate);
    }
    public OrderCancelled(){
        super();
    }
}
