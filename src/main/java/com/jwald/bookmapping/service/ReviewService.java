package com.jwald.bookmapping.service;

import com.jwald.bookmapping.domain.Review;
import com.jwald.bookmapping.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public Review saveOrUpdateABook(Review review) {
        return reviewRepository.save(review);
    }

    public Review findReviewById(Long bookId) {
        return reviewRepository.getByReviewId(bookId);
    }

    public Iterable<Review> findAll() {
        return reviewRepository.findAll();
    }
}
