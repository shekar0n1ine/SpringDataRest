package com.shek.springpractice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shek.springpractice.model.RequestDetail;

public interface RequestDetailRepository extends PagingAndSortingRepository<RequestDetail, String> {

}
