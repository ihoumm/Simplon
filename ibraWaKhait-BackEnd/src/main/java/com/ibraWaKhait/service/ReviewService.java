package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.Review;

public interface ReviewService {
	
	Review addOrder(Review review);
	
	List<Review> getAllReviews();
	
	Review getReviewById(long id);
	
	Review updateReview(Review review, long id);

	void deleteReviewById(long id);
	
}
