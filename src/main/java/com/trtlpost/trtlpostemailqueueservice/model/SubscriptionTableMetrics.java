package com.trtlpost.trtlpostemailqueueservice.model;

public interface SubscriptionTableMetrics {
    Long getSmallestId();
    Long getLargestId();
    Integer getNumSubscriptions();
}
