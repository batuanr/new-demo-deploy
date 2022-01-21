package com.example.isharelife.repository.post;

import com.example.isharelife.model.post.Posting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostingRepository extends JpaRepository<Posting,Long> {
    Iterable<Posting> findPostingsByContentContainingAndAndPostingStatusTypeId(String content,Long id);
}
