package com.example.twolee.chatbot.ReviewWrite;

import java.util.List;

public interface ReviewListener {
    void runListener(List<Review> reviewList, List<String> review_uidList);
}
