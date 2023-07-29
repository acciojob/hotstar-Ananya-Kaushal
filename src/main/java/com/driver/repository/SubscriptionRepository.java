package com.driver.repository;

import com.driver.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription,Integer> {

}
