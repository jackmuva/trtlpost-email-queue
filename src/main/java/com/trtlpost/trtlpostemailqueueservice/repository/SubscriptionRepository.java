package com.trtlpost.trtlpostemailqueueservice.repository;

import com.trtlpost.trtlpostemailqueueservice.model.Subscription;
import com.trtlpost.trtlpostemailqueueservice.model.SubscriptionTableMetrics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    @Query(value = "SELECT MIN(subscription_id) AS smallestId, " +
            "MAX(subscription_id) AS largestId, " +
            "COUNT(subscription_id) AS numSubscription " +
            "FROM subscription", nativeQuery = true)
    SubscriptionTableMetrics findSubscriptionMetrics();
}
