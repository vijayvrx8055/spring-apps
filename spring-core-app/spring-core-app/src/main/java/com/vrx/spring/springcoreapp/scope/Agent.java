package com.vrx.spring.springcoreapp.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)

/* singleton - creates only one instance of the object
*  prototype - creates one object per instance
*/
public class Agent {

    @Autowired
    private Policy policy;

    public Agent(){
        System.out.println("Creating Agent");
    }

    public void work(){
        System.out.println("Agent is servicing now...");
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }
}
