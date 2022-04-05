package com.jwald.bookmapping.repositories;

import com.jwald.bookmapping.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Review getByReviewId(Long reviewId);
}
