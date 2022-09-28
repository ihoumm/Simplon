package com.ibraWaKhait.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ibraWaKhait.model.Review;
import com.ibraWaKhait.service.ReviewService;

public class ReviewController {

	private ReviewService reviewService;

	public ReviewController(ReviewService reviewService) {
		super();
		this.reviewService = reviewService;
	}

	// build create Review REST API
	@PostMapping
	public ResponseEntity<Review> addReview(@RequestBody Review review) {
		return new ResponseEntity<Review>(reviewService.addOrder(review), HttpStatus.CREATED);
	}

	// build get all Review REST API
	@GetMapping
	public List<Review> getAllReviews() {
		return reviewService.getAllReviews();
	}

	// build get Review by id REST API
	// http://localhost:8080/api/review/1
	@GetMapping("{id}")
	public ResponseEntity<Review> getReviewById(@PathVariable("id") long review_id) {
		return new ResponseEntity<Review>(reviewService.getReviewById(review_id), HttpStatus.OK);
	}

	// build update Review REST API
	// http://localhost:8080/api/review/1
	@PutMapping("{id}")
	public ResponseEntity<Review> updateReview(@PathVariable("id") long id, @RequestBody Review review) {
		return new ResponseEntity<Review>(reviewService.updateReview(review, id), HttpStatus.OK);
	}

	// build delete Review REST API
	// http://localhost:8080/api/review/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteReview(@PathVariable("id") long id) {

		// delete Review from DB
		reviewService.deleteReviewById(id);

		return new ResponseEntity<String>("Review deleted successfully!.", HttpStatus.OK);
	}

}
