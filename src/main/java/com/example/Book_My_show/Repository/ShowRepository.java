package com.example.Book_My_show.Repository;

import com.example.Book_My_show.Entity.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {


}