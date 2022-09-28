package com.ibraWaKhait.service.implementation;

import java.util.List;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.Review;
import com.ibraWaKhait.repository.ReviewRepository;
import com.ibraWaKhait.service.ReviewService;

public class ReviewServiceImplementation implements ReviewService {
	
	private ReviewRepository reviewRepository;

	@Override
	public Review addOrder(Review review) {
		// TODO Auto-generated method stub
		return this.reviewRepository.save(review);
	}

	@Override
	public List<Review> getAllReviews() {
		// TODO Auto-generated method stub
		return reviewRepository.findAll();
	}

	@Override
	public Review getReviewById(long id) {
		// TODO Auto-generated method stub
		return this.reviewRepository.findById(id).get();
	}

	@Override
	public Review updateReview(Review review, long id) {
		
		Review existingReview = reviewRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("invoiceRepository", "id", id));
		
		existingReview.setReview_id(review.getReview_id());
		existingReview.setStars(review.getStars());
		existingReview.setTitle(review.getTitle());
		existingReview.setStatus(review.getStatus());
		existingReview.setBody(review.getBody());
		existingReview.setInserted_at(review.getInserted_at());
		existingReview.setUpdated_at(review.getUpdated_at());
		existingReview.setProduct(review.getProduct());
		
		reviewRepository.save(existingReview);
		
		return existingReview;
	}

	@Override
	public void deleteReviewById(long id) {
		this.reviewRepository.deleteById(id);
		
	}

}
