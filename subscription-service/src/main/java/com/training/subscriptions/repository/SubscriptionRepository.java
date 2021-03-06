package com.training.subscriptions.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.training.subscriptions.document.SubscriptionDocument;

@Repository
public interface SubscriptionRepository extends MongoRepository<SubscriptionDocument, String> {

	List<SubscriptionDocument> findBySubscriberId(String subscriberId);

	List<SubscriptionDocument> findBySubscriberIdAndBookId(String subscriberId, String bookId);
}
